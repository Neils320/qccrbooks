/*
 * Copyright (C) 2015 Drakeet <drakeet.me@gmail.com>
 *
 * This file is part of Meizhi
 *
 * Meizhi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Meizhi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Meizhi.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.qccr.books.app.user.meizhi.http;


import com.qccr.books.app.user.meizhi.modle.MeizhiData;
import com.qccr.books.app.user.meizhi.modle.VideoData;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by drakeet on 8/9/15.
 */
public interface GankApi {

    @GET("data/福利/" + MeiZhiFactory.MeiZhiSize + "/{page}")
    Observable<MeizhiData> getMeizhiData(@Path("page") int page);

//    @GET("/day/{year}/{month}/{day}")
//    Observable<GankData> getGankData(
//            @Path("year") int year,
//            @Path("month") int month,
//            @Path("day") int day);
//
@GET("data/休息视频/" + MeiZhiFactory.MeiZhiSize + "/{page}")
Observable<VideoData> getVideoData(@Path("page") int page);

}