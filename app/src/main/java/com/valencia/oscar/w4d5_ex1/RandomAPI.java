package com.valencia.oscar.w4d5_ex1;

import com.valencia.oscar.w4d5_ex1.model.UserResponse;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RandomAPI {
    String BASE_URL = "https://randomuser.me/";

    @GET("api")
    Call<UserResponse> getRandomUser();

    @GET("api")
    Observable<UserResponse>getRandomUserObservable();

    // when you have an api that replies faster than you can consume it use Flowable

}
