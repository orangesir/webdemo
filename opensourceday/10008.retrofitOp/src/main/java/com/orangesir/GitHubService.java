package com.orangesir;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

/**
 * xxxxservice
 *
 * @title title
 * @autor zhangweid
 * @date 17-12-22
 * @since 1.0.0
 */
public interface GitHubService {
    @GET("/")
    Call<List<User>> listRepos();
}
