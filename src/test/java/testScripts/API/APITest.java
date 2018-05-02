package testScripts.API;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import com.jayway.restassured.specification.RequestSpecification;
import data.FormsiteData;
import org.testng.Assert;
import org.testng.annotations.Test;
import ECNUntil.APIUntil;

public class APITest{
    private static final String RESULT_XMLPATH = "fs_response.results.result.metas.meta[0]";
    private static final String FIRSTNAME_XMLPATH = "fs_response.results.result.items.item[0]";
    private static final String LASTNAME_XMLPATH = "fs_response.results.result.items.item[1]";
    private static final String STREETADDRESS_XMLPATH = "fs_response.results.result.items.item[2]";
    private static final String ADDRESSLINE2_XMLPATH = "fs_response.results.result.items.item[3]";
    private static final String CITY_XMLPATH = "fs_response.results.result.items.item[4]";
    private static final String STATE_XMLPATH = "fs_response.results.result.items.item[5]";
    private static final String ZIPCODE_XMLPATH = "fs_response.results.result.items.item[6]";
    private static final String PHONENUMBER_XMLPATH = "fs_response.results.result.items.item[7]";
    private static final String EMAILADDRESS_XMLPATH = "fs_response.results.result.items.item[8]";
    private static final String DATEOFDEMO_XMLPATH = "fs_response.results.result.items.item[9]";

    @Test
    public static void verifyFormsiteResponse() {
        RestAssured.baseURI = "https://fs28.formsite.com/api/users/ecnvietnam/forms";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/form1/results?fs_api_key=Qm8nO3h6auh7&fs_limit=1");
        ResponseBody body = response.getBody();
        Assert.assertEquals(APIUntil.getDataFromXMLPath(body, RESULT_XMLPATH), FormsiteData.RESULTSTATUS);
        Assert.assertEquals(APIUntil.getDataFromXMLPath(body, FIRSTNAME_XMLPATH), FormsiteData.FIRSTNAME);
        Assert.assertEquals(APIUntil.getDataFromXMLPath(body, LASTNAME_XMLPATH), FormsiteData.LASTNAME);
        Assert.assertEquals(APIUntil.getDataFromXMLPath(body, STREETADDRESS_XMLPATH), FormsiteData.STREETADDRESS);
        Assert.assertEquals(APIUntil.getDataFromXMLPath(body, ADDRESSLINE2_XMLPATH), FormsiteData.ADDRESSLINE2);
        Assert.assertEquals(APIUntil.getDataFromXMLPath(body, CITY_XMLPATH), FormsiteData.CITY);
        Assert.assertEquals(APIUntil.getDataFromXMLPath(body, STATE_XMLPATH), FormsiteData.STATE);
        Assert.assertEquals(APIUntil.getDataFromXMLPath(body, ZIPCODE_XMLPATH), FormsiteData.ZIPCODE);
        Assert.assertEquals(APIUntil.getDataFromXMLPath(body, PHONENUMBER_XMLPATH), FormsiteData.PHONENUMBER);
        Assert.assertEquals(APIUntil.getDataFromXMLPath(body, EMAILADDRESS_XMLPATH), FormsiteData.EMAILADDRESS);
        Assert.assertEquals(APIUntil.getDataFromXMLPath(body, DATEOFDEMO_XMLPATH), FormsiteData.DATEOFDEMO);
        System.out.println("API Testing is PASSED!");
    }

}
