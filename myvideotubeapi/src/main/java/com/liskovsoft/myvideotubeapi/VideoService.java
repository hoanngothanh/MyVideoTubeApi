package com.liskovsoft.myvideotubeapi;

import io.reactivex.Observable;
import java.util.List;

public interface VideoService {
    List<Video> getSearch(String searchText);
    List<Video> getNextSearch();
    Observable<List<Video>> getSearchObserve(String searchText);

    List<Video> getSubscriptions();
    List<Video> getNextSubscriptions();

    Observable<List<Video>> getSubscriptionsObserve();
    Observable<List<Video>> getHistoryObserve();
    Observable<List<Video>> getRecommendedObserve();
}
