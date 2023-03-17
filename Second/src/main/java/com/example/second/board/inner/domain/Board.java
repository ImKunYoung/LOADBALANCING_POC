package com.example.second.board.inner.domain;

import com.example.second.board.inner.domain.vo.Apartment;
import com.example.second.board.inner.domain.vo.Status;
import com.example.second.board.inner.dto.post.DeleteRequest;
import com.example.second.board.inner.dto.post.FindRequest;
import com.example.second.board.inner.dto.post.PutRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.example.second.board.inner.service.exception.*;

/**
 * Board 클래스는 게시판을 나타내는 도메인 클래스입니다.
 * 게시판은 제목, 포스트 목록, 상태, 아파트 정보를 갖습니다.
 * 포스트를 추가, 조회, 수정, 삭제하는 기능을 제공합니다.
 * 또한 포스트를 최신순으로 정렬하여 조회하거나, 특정 키워드로 검색할 수 있습니다.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name = "boardAggregate")
@Slf4j
public class Board extends BaseTime implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private Set<Post> posts  = new HashSet<>();

    /*TODO: - INIT PLEASE*/
    @Enumerated(value = EnumType.STRING)
    private Status status;

    @Embedded
    private Apartment apartmentV;


    /**
     * 포스트 추가됨
     *
     * @param post : 포스트
     * @author : IMKUNYOUNG
     */
    public void addPost(Post post) {
        this.posts.add(post);
    }


    /**
     * 마지막 포스트 가져옴
     *
     * @return post
     * @author : IMKUNYOUNG
     */
    public Post getLastPost() {
        return this.posts.stream()
                .max(Comparator.comparing(Post::getId))
                .orElseThrow(NotPostException::new);
    }


    /**
     * 포스트 조회됨
     *
     * @param findRequest : 조회 요청을 위한 DTO
     * @return post
     * @author : IMKUNYOUNG
     */
    public Post findPost(FindRequest findRequest) {
        return this.findPost(findRequest.getPost().getId());
    }


    /**
     * 포스트 수정됨
     *
     * @param putRequest : 수정 요청을 위한 DTO
     * @return post
     * @author : IMKUNYOUNG
     */
    public Post updatePost(PutRequest putRequest) {
        Post post = this.findPost(putRequest.getPost().getId());
        return post.updatePost(putRequest);
    }


    /**
     * 포스트 삭제됨
     *
     * @param deleteRequest : 삭제 요청을 위한 DTO
     * @author : IMKUNYOUNG
     */
    public void deletePost(DeleteRequest deleteRequest) {
        Post post = this.findPost(deleteRequest.getPost().getId());
        post.checkAuthor(deleteRequest.getPost().getAuthor().getId());
        this.posts.remove(post);
    }


    /**
     * 포스트 조회됨
     *
     * @param id : 포스트 아이디
     * @return post
     * @author : IMKUNYOUNG
     */
    private Post findPost(long id) {
        return this.posts.stream()
                .filter(post -> post.getId().equals(id))
                .findFirst()
                .orElseThrow(NotPostException::new);
    }


    /**
     * 포스트 목록 조회됨
     *
     * @return list
     * @author : IMKUNYOUNG
     */
    public List<Post> getPostOrderById() {
        return this.posts
                .stream()
                .sorted(Comparator.comparing(Post::getId).reversed())
                .toList();
    }


    /**
     * 포스트 검색됨
     *
     * @param keyword : 검색 키워드
     * @return list
     * @author : IMKUNYOUNG
     */
    public List<Post> searchPosts(String keyword) {
        return this.posts.stream()
                .filter(post -> post.getTitle().contains(keyword) || post.getContent().contains(keyword))
                .sorted(Comparator.comparing(Post::getId).reversed())
                .toList();
    }


    /**
     * 게시판 삭제됨
     *
     * @param status : 게시판 상태 요청값 객체
     */
    public void setDeletedStatus(Status status) {
        this.status = status;
    }
}
