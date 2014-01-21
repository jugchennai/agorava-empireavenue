package org.agorava.empireavenue.cdi.test.testcase;

import org.agorava.empireavenue.cdi.test.EmpireAvenueTestDeploy;
import org.agorava.empireavenue.model.Lists;
import org.agorava.empireavenue.response.ListsResponse;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Karthikeyan Annamalai  
 * @since 0.7.0
 */
@RunWith(Arquillian.class)
public class ListsTest extends EmpireAvenueTestDeploy {

    private static String ticker="RMH";
    private static int page=2;
    private static Integer maxresults=101;

    @Test
    public void authorizationUrlTest() {
        assertTrue(service.getAuthorizationUrl().startsWith("https"));
    }


    @Test
    public void listInfoTest() {
        ListsResponse listsResponse = listsService.getListInfo();
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }
    @Test
    public void listInfoTestWithTicker() {
        ListsResponse listsResponse = listsService.getListInfo(ticker);
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }



    //"friends","watch","recommend_buy","private","favourite"


    @Test
    public void friendsListMembersTest() {
        ListsResponse listsResponse = listsService.getListMembersInfo("friends");
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void watchListMembersTest() {
        ListsResponse listsResponse = listsService.getListMembersInfo("watch");
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void recommend_buyListMembersTest() {
        ListsResponse listsResponse = listsService.getListMembersInfo("recommend_buy");
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void getPrivateListMembersTest() {
        ListsResponse listsResponse = listsService.getListMembersInfo("private");
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void favouriteListMembersTest() {
        ListsResponse listsResponse = listsService.getListMembersInfo("favourite");
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }



    @Test
    public void friendsListMembersTestWithPage() {
        ListsResponse listsResponse = listsService.getListMembersInfo("friends",page);
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void watchListMembersTestWithPage() {
        ListsResponse listsResponse = listsService.getListMembersInfo("watch",page);
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void recommendBuyListMembersTestWithPage() {
        ListsResponse listsResponse = listsService.getListMembersInfo("recommend_buy",page);
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void privateListMembersTestWithPage() {
        ListsResponse listsResponse = listsService.getListMembersInfo("private",page);
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void favouriteListMembersTestWithPage() {
        ListsResponse listsResponse = listsService.getListMembersInfo("favourite",page);
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }


    @Test
    public void friendsListMembersTestWithPageAndTicker() {
        ListsResponse listsResponse = listsService.getListMembersInfo("friends",ticker,page);
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void watchListMembersTestWithPageAndTicker() {
        ListsResponse listsResponse = listsService.getListMembersInfo("watch",ticker,page);
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void recommendBuyListMembersTestWithPageAndTicker() {
        ListsResponse listsResponse = listsService.getListMembersInfo("recommend_buy",ticker,page);
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void privateListMembersTestWithPageAndTicker() {
        ListsResponse listsResponse = listsService.getListMembersInfo("private",ticker,page);
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void favouriteListMembersTestWithPageAndTicker() {
        ListsResponse listsResponse = listsService.getListMembersInfo("favourite",ticker,page);
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }


    @Test
    public void listedUsersTest() {
        ListsResponse listsResponse = listsService.getListedUsers();
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }


    @Test
    public void listedUsersTestWithPageLimit() {
        ListsResponse listsResponse = listsService.getListedUsers(page);
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void listedUsersTestWithTicker() {
        ListsResponse listsResponse = listsService.getListedUsers(ticker);
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }

    @Test
    public void listedUsersTestWithPageLimitAndTicket() {
        ListsResponse listsResponse = listsService.getListedUsers(ticker,page);
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getAllListInfo());
        assertTrue(listsResponse.getAllListInfo().size() > 0);
        for (Lists list : listsResponse.getAllListInfo())
            System.out.println(list.toString());
        System.out.println("--------------------------------------");
    }


    @Test
    public void addListTest() {
        ListsResponse listsResponse = listsService.addToList(ticker, "friends");
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getListInfo());

        System.out.println(" ::::::::: The List Type ID   :" + listsResponse.getListInfo().getListTypeId());
        System.out.println(" ::::::::: Maximum users      :" +listsResponse.getListInfo().getMaxUsers());
        System.out.println(" ::::::::: User Count         :" +listsResponse.getListInfo().getUserCount());
   }


    @Test
    public void removeFromListTest() {
        ListsResponse listsResponse = listsService.removeFromList(ticker, "friends");
        assertNotNull(listsResponse);
        assertNotNull(listsResponse.getListInfo());

        System.out.println(" ::::::::: The List Type ID   :" + listsResponse.getListInfo().getListTypeId());
        System.out.println(" ::::::::: Maximum users      :" +listsResponse.getListInfo().getMaxUsers());
        System.out.println(" ::::::::: User Count         :" +listsResponse.getListInfo().getUserCount());
    }
}
