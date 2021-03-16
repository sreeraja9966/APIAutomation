package sampleAPI;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import modelClasess.BaseClass;
import modelClasess.CashDeposit;
import modelClasess.CashDepositDetailsModel;
import modelClasess.HeaderModel;
import modelClasess.VerifyCredentialsModel;
import modelClasess.VerifyUser;

public class LoginAPI extends BaseClass{
	CashDeposit cashDeposit;
	
	
    List<CashDeposit> cashDepositList = null;
    Map<String, CashDeposit> cashDepositMap = new HashMap<String, CashDeposit>();
	/*
	 * public void loginTest() { RestAssured.baseURI = "http://172.16.0.39:7070";
	 * RequestSpecification request = RestAssured.given(); JSONObject requestParams
	 * = new JSONObject(); request.header("Content-Type", "application/json");
	 * request.header("userId","LogInUser");
	 * request.header("parentBank","BankCode");
	 * request.header("parentBranch","BranchCode");
	 * request.header("usermultiCurrency", "Y"); request.header("bankmultiCurrency",
	 * "Y"); request.header("todaysDate", ""); request.header("branchmultiCurrency",
	 * "Y"); request.header("transCode", "LogOutAllUsr"); map.put("bankCode",
	 * "804"); map.put("userId", "13"); request.body(requestParams + ""); Response
	 * response = null; try { response =
	 * request.post("/GlobalController/authenticate/verifyUser");
	 * System.out.println(response.getStatusCode()); String
	 * r=response.getBody().asString(); System.out.println(r);
	 * //Assert.assertEquals(r.contains("Successfully verified user."),true);
	 * JsonPath jsonPathEvaluator = response.jsonPath();
	 * 
	 * System.out.println( jsonPathEvaluator.get("statusDes"));
	 * Assert.assertEquals("User is Valid & Not LoggedIn",jsonPathEvaluator.get(
	 * "statusDes").equals("Successfully verified user."), true); } catch (Error e)
	 * { System.out.println("User is NotValid or LoggedIn"); } } public void
	 * getAccDetails() { RestAssured.baseURI = "http://172.16.0.39:7070";
	 * RequestSpecification request = RestAssured.given(); JSONObject requestParams
	 * = new JSONObject(); request.header("Content-Type", "application/json");
	 * request.header("userId","1"); request.header("parentBank","804");
	 * request.header("parentBranch","2"); request.header("usermultiCurrency", "Y");
	 * request.header("bankmultiCurrency", "Y"); request.header("todaysDate",
	 * "2021/04/10"); request.header("branchmultiCurrency", "Y");
	 * request.header("transCode", "TransfCredit"); // map.put("accNumber",
	 * "840001600210000290");
	 * 
	 * request.body(requestParams + ""); Response response = null; try { response =
	 * request.queryParam("accNumber",
	 * "804000200130012632").get("/GlobalController/account/details");
	 * System.out.println(response.getStatusCode()); String
	 * r=response.getBody().asString(); System.out.println(r);
	 * //Assert.assertEquals(r.contains("Successfully verified user."),true);
	 * JsonPath jsonPathEvaluator = response.jsonPath(); System.out.println(
	 * jsonPathEvaluator.get("details.customer.status")); System.out.println(
	 * jsonPathEvaluator.get("details.account.status")); // System.out.println(
	 * jsonPathEvaluator.get("details.")); } catch (Error e) {
	 * System.out.println("User is NotValid or LoggedIn"); } }
	 */
	public void cashDep(String token) {
		RestAssured.baseURI = baseUrl;
		RequestSpecification request = RestAssured.given();

		Map<String, Object> map = new LinkedHashMap<String, Object>();
		File file = new File("D:\\API automation\\apiAutomation\\resource\\x.json");
		CashDeposit cashDeposit = new CashDeposit();
		CashDepositDetailsModel cashDepositDetailsModel = new CashDepositDetailsModel();
		// request.header("Content-Type", "application/json");
		HeaderModel headerModel = new HeaderModel();
		Map<String, Object> headerMap = headerModel.modelSetup();
		headerMap.put("transCode", "CashDeposite");

		/*
		 * map.put("accType", ""); map.put("transAmt", "100"); map.put("transType",
		 * "D"); map.put("status", "E"); map.put("transFlag", "ACCOUNT_TO_USER");
		 * map.put("transCode", "CashDeposite"); map.put("detailModels",
		 * Arrays.asList(new LinkedHashMap<String, Object>() { { put("depositor", "A");
		 * put("accNo", "804000200130012632"); put("currency", "INR"); put("instrDate",
		 * "2021/04/10"); put("crdr", "C"); put("remark", "By Cash"); put("transMode",
		 * "CashDeposite"); put("transAmt", "100.00"); put("accType", "SB");
		 * put("cashAmount", "100.00"); } }));
		 */
		CashDeposit cash=test("", "");
		cashDeposit.setAccType("");
		cashDeposit.setTransAmt(cash.getTransAmt());
		cashDeposit.setTransType(cash.getTransType());
		cashDeposit.setStatus(cash.getStatus());
		cashDeposit.setTransFlag(cash.getTransFlag());
		cashDeposit.setTransCode(cash.getTransCode());
		List<CashDepositDetailsModel> details = new ArrayList<CashDepositDetailsModel>();
		for(CashDepositDetailsModel cashModel:cash.getDetailModels()) {
			cashDepositDetailsModel.setDepositor(cashModel.getDepositor());
			cashDepositDetailsModel.setCurrency(cashModel.getCurrency());
			cashDepositDetailsModel.setInstrDate(cashModel.getInstrDate());
			cashDepositDetailsModel.setCrdr(cashModel.getCrdr());
			cashDepositDetailsModel.setRemark(cashModel.getRemark());
			cashDepositDetailsModel.setTransMode(cashModel.getTransMode());
			cashDepositDetailsModel.setAccNo(cashModel.getAccNo());
			cashDepositDetailsModel.setTransAmt(cashModel.getTransAmt());
			cashDepositDetailsModel.setAccType(cashModel.getAccType());
			cashDepositDetailsModel.setCashAmount(cashModel.getCashAmount());
		}
		

		details.add(cashDepositDetailsModel);
		cashDeposit.setDetailModels(details);
		
		
		
		/*
		 * cashDeposit.setRebate(""); cashDeposit.setRebatePenaltyModel("");
		 */
		
		try { // given().body
				// Response response = (Response)
				// given().when().body(file).when().post("/GlobalController/transactionEntry").then().statusCode(200);
			headerMap.put("Authorization",token);
			headerMap.put("user-context", "67FE923B30C0C1786322804A8820FF93E169935FE45E6AC8B2F766C8F25231F6211FF00D8780913BE0E7897C54B9D8BC8603");
			
			Response response = (Response) given().log().all().

					when().headers(headerMap).body(cashDeposit).

					post("/GlobalController/transactionEntry").

					then().extract().response();

			// response = request.post("/GlobalController/transactionEntry");
			System.out.println(response.getStatusCode());
			// Assert.assertEquals(r.contains("Successfully verified user."),true);
			JsonPath jsonPathEvaluator = response.jsonPath();
			String vouchNo=jsonPathEvaluator.get("details.voucherNo")+"";
			System.out.println(jsonPathEvaluator);
			System.out.println(jsonPathEvaluator.get("statusDes"));
			System.out.println(vouchNo);

//       System.out.println( jsonPathEvaluator.get("details."));
		} catch (Error e) {
			System.out.println("User is NotValid or LoggedIn");
		}
	}

	public static void main(String[] args) {
		LoginAPI a = new LoginAPI();
		a.verifyCredentials();
	//a.cashDep(	"Bearer 017E6975E1FCAEB604A2C8E0A27884CE55C70DC093984230AFDAAC2169266FDE2E4FB8B71E433DB3927293D8F537320FB40F27C4EB26FA00F9FF5D8D25ED4D34D41A6A27F4FE770D41FFAD28CA3B661C18958D00425CD45243F4ED2D9B045FCC014E433C40AAA78579F323A90D4D4F4333099FDAEE517F0DE2656895E489B6F98FC5D550F6B6720D70F328990A9292AC862B0E6A61CD2F2F52E708EE951E054E51081237327E637AB167B34C5A3A2612191962C2AA025DEE933FE0927336DD843F4D8957D811D240921F020BDA03B5CA3A3F3E3CC015B0D40EAFB3D63ECF1F5040A814FFE6B6252059E1703A5FA125305686C76E2D6EE409C11EFA05B3EB40B24451165E52A1107C05E39B9EED6B43CF4DE6A6C16A1F4CCB4C4C8D6BDB893652AEC42E296B9E8C23EF65CDB2DA64495BACF1FF01DD725A541F3F7A4217AE735BCFD6FCAA75855C3AA12F4511011CAA07211F432E28A268A9EDEFE96A8BC8052F6629D3DFF5E89B86D7F3C58C566A1EF0DF08");
	}
	 public CashDeposit test(String scenario,String path) {
	        
	        try {
	            Reader reader = new FileReader("D:\\API automation\\apiAutomation\\resource\\x.json");
	            /*
	             * ObjectMapper mapper = new ObjectMapper(); byte[] jsonMap; jsonMap = mapper.writeValueAsBytes(reader);
	             */
	            //lienDataList = gson.fromJson(reader, List.class);
	            
	            Type typeOfObjectsList = new TypeToken<ArrayList<CashDeposit>>() {
	            }.getType();
	            
	            cashDepositList = new Gson().fromJson(reader, typeOfObjectsList);
	            
	            //  lienDataList = mapper.readValue(reader, List.class);
	            for (CashDeposit data : cashDepositList) {
	            	cashDepositMap.put(data.getScenario(), data);
	                //if (scenario.equalsIgnoreCase(data.getScenario())) {
	                    
	                    cashDeposit = data;
	                    
	              //  }
	            }
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return cashDeposit;
	    }
	 
	 public String  verifyCredentials() {
		 VerifyCredentialsModel verifyCred=new VerifyCredentialsModel();
		 String saltValue=verifyUser();
		 JsonPath jsonPathEvaluator =null;
		if("Invalid User".equalsIgnoreCase(saltValue)) {
			
		}
		else {
		 RestAssured.baseURI = baseUrl;
			RequestSpecification request = RestAssured.given();

			Map<String, Object> map = new LinkedHashMap<String, Object>();
			//File file = new File("D:\\API automation\\apiAutomation\\resource\\x.json");
			HeaderModel headerModel = new HeaderModel();
			Map<String, Object> headerMap = headerModel.modelSetup();
			headerMap.put("transCode", "CashDeposite");
			verifyCred.setBankCode("804");
			verifyCred.setUserId("1");
			verifyCred.setDigest(saltValue+"/cDa64d3s9x4FDVYlmh/2edHYOLdutC");
			Response response = request.

					when().headers(headerMap).body(verifyCred).

					post("/GlobalController/authenticate/verifyCredentials").

					then().extract().response();
			System.out.println(response.getBody().prettyPrint()+"111111");
System.out.println(response.jsonPath().getJsonObject("details.currentLoginTime").toString()+"222222222222");
			 jsonPathEvaluator = response.jsonPath();
			response.getBody().prettyPrint();
			System.out.println(jsonPathEvaluator.get("details.user-context"));
			System.out.println(jsonPathEvaluator.get("details.token"));
			System.out.println(jsonPathEvaluator.get("details"));
			
		}
		return jsonPathEvaluator.get("details.token");
	 }
	 public String verifyUser() {
		 VerifyUser verifyUser=new VerifyUser();
		 RestAssured.baseURI = baseUrl;
			RequestSpecification request = RestAssured.given();

			Map<String, Object> map = new LinkedHashMap<String, Object>();
			File file = new File("D:\\API automation\\apiAutomation\\resource\\x.json");
			HeaderModel headerModel = new HeaderModel();
			Map<String, Object> headerMap = headerModel.modelSetup();
			headerMap.put("transCode", "BOSS");
			verifyUser.setBankCode("804");
			verifyUser.setUserId("1");
			Response response = (Response) given().

					when().headers(headerMap).body(verifyUser).

					post("/GlobalController/authenticate/verifyUser").

					then().extract().response();
			JsonPath jsonPathEvaluator = response.jsonPath();
	
			System.out.println(jsonPathEvaluator.get("statusDes"));
			if("Successfully verified user.".equalsIgnoreCase(jsonPathEvaluator.get("statusDes")+"")) {
				String saltValue=jsonPathEvaluator.get("details.saltValue")+"";
				System.out.println(jsonPathEvaluator.get("details"));
				return saltValue;
			}
			else {
				return "Invalid User";
			}
	 }
	 
}
