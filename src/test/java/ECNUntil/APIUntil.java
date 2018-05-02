package ECNUntil;

import com.jayway.restassured.response.ResponseBody;

public class APIUntil {
    public static String getDataFromXMLPath(ResponseBody responseBody, String xmlPath) {
        return responseBody.xmlPath().getString(xmlPath);
    }
}
