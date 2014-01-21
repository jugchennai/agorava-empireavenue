package org.agorava.empireavenue.impl;

import org.agorava.EmpireAvenueBaseService;
import org.agorava.empireavenue.EmpireAvenue;
import org.agorava.empireavenue.response.ListsResponse;
import org.agorava.empireavenue.service.ListsService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Karthikeyan Annamalai  
 * @since 0.7.0
 */
@EmpireAvenue
public class ListsServiceImpl extends EmpireAvenueBaseService implements ListsService {

    @Override
    public ListsResponse getListInfo() {
        return getService().get(buildAbsoluteUri(LISTS_GET), ListsResponse.class);
    }

    @Override
    public ListsResponse getListInfo(String ticker) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        return getService().post(buildAbsoluteUri(LISTS_GET), data, ListsResponse.class);

    }

    @Override
    public ListsResponse getListMembersInfo(String listTypeId) {
        Map<String, Object> data = new HashMap<>();
        data.put("list_type_id", listTypeId);
        return getService().post(buildAbsoluteUri(LISTS_MEMBERS), data, ListsResponse.class);

    }

    @Override
    public ListsResponse getListMembersInfo(String listTypeId, int page) {
        Map<String, Object> data = new HashMap<>();
        data.put("list_type_id", listTypeId);
        data.put("page", page);
        return getService().post(buildAbsoluteUri(LISTS_MEMBERS), data, ListsResponse.class);
    }

    @Override
    public ListsResponse getListMembersInfo(String listTypeId, String ticker, int page) {
        Map<String, Object> data = new HashMap<>();
        data.put("list_type_id", listTypeId);
        data.put("ticker", ticker);
        data.put("page", page);
        return getService().post(buildAbsoluteUri(LISTS_MEMBERS), data, ListsResponse.class);

    }

    @Override
    public ListsResponse getListedUsers() {
        return getService().get(buildAbsoluteUri(LISTS_LISTEDBY), ListsResponse.class);
    }

    @Override
    public ListsResponse getListedUsers(int page) {
        Map<String, Object> data = new HashMap<>();
        data.put("page", page);
        return getService().post(buildAbsoluteUri(LISTS_LISTEDBY), data, ListsResponse.class);

    }

    @Override
    public ListsResponse getListedUsers(String ticker) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        return getService().post(buildAbsoluteUri(LISTS_LISTEDBY), data, ListsResponse.class);

    }

    @Override
    public ListsResponse getListedUsers(String ticker, int page) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        data.put("page", page);
        return getService().post(buildAbsoluteUri(LISTS_LISTEDBY), data, ListsResponse.class);
    }

    @Override
    public ListsResponse getRecommendedUsers() {
        return getService().get(buildAbsoluteUri(LISTS_RECOMMENDEDBY), ListsResponse.class);
    }

    @Override
    public ListsResponse getRecommendedUsers(int page) {
        Map<String, Object> data = new HashMap<>();
        data.put("page", page);
        return getService().post(buildAbsoluteUri(LISTS_RECOMMENDEDBY), data, ListsResponse.class);
    }

    @Override
    public ListsResponse getRecommendedUsers(String ticker) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        return getService().post(buildAbsoluteUri(LISTS_RECOMMENDEDBY), data, ListsResponse.class);

    }

    @Override
    public ListsResponse getRecommendedUsers(String ticker, int page) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        data.put("page", page);
        return getService().post(buildAbsoluteUri(LISTS_RECOMMENDEDBY), data, ListsResponse.class);
    }


    @Override
    public ListsResponse addToList(String ticker, String list) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        data.put("list", list);
        return getService().post(buildAbsoluteUri(LISTS_ADD), data, ListsResponse.class);
    }


    @Override
    public ListsResponse removeFromList(String ticker, String list) {
        Map<String, Object> data = new HashMap<>();
        data.put("ticker", ticker);
        data.put("list", list);
        return getService().post(buildAbsoluteUri(LISTS_REMOVE), data, ListsResponse.class);

    }
}
