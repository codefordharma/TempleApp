package example.TempleApp.JSON_API;

import example.TempleApp.classes.Result;
import example.TempleApp.classes.assets.AllAssetsResult;
import example.TempleApp.classes.assets.AssetsResult;
import example.TempleApp.classes.dmy.AllDMYResult;
import example.TempleApp.classes.dmy.DMYResult;
import example.TempleApp.classes.donation.AllDonationResult;
import example.TempleApp.classes.donation.DonationResult;
import example.TempleApp.classes.fd.AllFDResult;
import example.TempleApp.classes.fd.FDResult;
import example.TempleApp.classes.ie.AllIEResult;
import example.TempleApp.classes.ie.IEResult;
import example.TempleApp.classes.mwb.AllMWBResult;
import example.TempleApp.classes.mwb.MWBResult;
import example.TempleApp.classes.pooja.AllPoojaResult;
import example.TempleApp.classes.pooja.PoojaResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    String BASE_URL = "https://script.google.com/macros/s/AKfycbxu17kBRMvZrTVq_eMbyrkprR1CyixdglcnnTO7nkSS/";

    /**
     *
     * @param sheet
     * @param action
     * @param date
     * @param type
     * @param billno
     * @param name
     * @param address
     * @param amount
     * @param remarks
     * @return
     */
    @GET("dev")
    Call<Result> insertPooja(
            @Query("sheet") String sheet,       // sheet = "pooja"
            @Query("action") String action,     // action = "insert"
            @Query("date") Integer date,
            @Query("type") String type,
            @Query("billno") Integer billno,
            @Query("name") String name,
            @Query("address") String address,
            @Query("amount") Integer amount,
            @Query("remarks") String remarks
    );

    /**
     *
     * @param sheet
     * @param action
     * @param date
     * @param type
     * @param billno
     * @param name
     * @param address
     * @param amount
     * @param remarks
     * @return
     */
    Call<Result> updatePooja(
            @Query("sheet") String sheet,       // sheet = "pooja"
            @Query("action") String action,     // action = "update"
            @Query("date") Integer date,
            @Query("type") String type,
            @Query("billno") Integer billno,
            @Query("name") String name,
            @Query("address") String address,
            @Query("amount") Integer amount,
            @Query("remarks") String remarks
    );

    /**
     *
     * @param sheet
     * @param action
     * @param billno
     * @return
     */
    Call<Result> deletePooja(
            @Query("sheet") String sheet,       // sheet = "pooja"
            @Query("action") String action,     // action = "delete"
            @Query("billno") Integer billno
    );

    /**
     *
     * @param sheet
     * @param action
     * @param billno
     * @return
     */
    Call<PoojaResult> getPooja(
            @Query("sheet") String sheet,       // sheet = "pooja"
            @Query("action") String action,     // action = "billno"
            @Query("billno") Integer billno
    );

    /**
     *
     * @param sheet
     * @param action
     * @return
     */
    Call<AllPoojaResult> getAllPooja(
            @Query("sheet") String sheet,       // sheet = "pooja"
            @Query("action") String action      // action = "readall"
    );

    /**
     *
     * @param sheet
     * @param action
     * @param date
     * @param type
     * @param billno
     * @param name
     * @param address
     * @param amount
     * @param remarks
     * @return
     */
    @GET("dev")
    Call<Result> insertDonation(
            @Query("sheet") String sheet,       // sheet = "donation"
            @Query("action") String action,     // action = "insert"
            @Query("date") Integer date,
            @Query("type") String type,
            @Query("billno") Integer billno,
            @Query("name") String name,
            @Query("address") String address,
            @Query("amount") Integer amount,
            @Query("remarks") String remarks
    );

    /**
     *
     * @param sheet
     * @param action
     * @param date
     * @param type
     * @param billno
     * @param name
     * @param address
     * @param amount
     * @param remarks
     * @return
     */
    Call<Result> updateDonation(
            @Query("sheet") String sheet,       // sheet = "donation"
            @Query("action") String action,     // action = "update"
            @Query("date") Integer date,
            @Query("type") String type,
            @Query("billno") Integer billno,
            @Query("name") String name,
            @Query("address") String address,
            @Query("amount") Integer amount,
            @Query("remarks") String remarks
    );

    /**
     *
     * @param sheet
     * @param action
     * @param billno
     * @return
     */
    Call<Result> deleteDonation(
            @Query("sheet") String sheet,       // sheet = "donation"
            @Query("action") String action,     // action = "delete"
            @Query("billno") Integer billno
    );

    /**
     *
     * @param sheet
     * @param action
     * @param Integer
     * @return
     */
    Call<DonationResult> getDonation(
            @Query("sheet") String sheet,       // sheet = "donation"
            @Query("action") String action,     // action = "billno"
            @Query("billno") String Integer
    );

    /**
     *
     * @param sheet
     * @param action
     * @return
     */
    Call<AllDonationResult> getAllDonation(
            @Query("sheet") String sheet,       // sheet = "donation"
            @Query("action") String action      // action = "readall"
    );

    /**
     *
     * @param sheet
     * @param action
     * @param type
     * @param date
     * @param poojatype
     * @param billno
     * @param name
     * @param address
     * @param amount
     * @param remarks
     * @return
     */
    @GET("dev")
    Call<Result> insertDMY(
            @Query("sheet") String sheet,       // sheet = "dmy"
            @Query("action") String action,     // action = "insert"
            @Query("type") String type,
            @Query("date") Integer date,
            @Query("poojatype") String poojatype,
            @Query("billno") Integer billno,
            @Query("name") String name,
            @Query("address") String address,
            @Query("amount") Integer amount,
            @Query("remarks") String remarks
    );

    /**
     *
     * @param sheet
     * @param action
     * @param type
     * @param date
     * @param poojatype
     * @param billno
     * @param name
     * @param address
     * @param amount
     * @param remarks
     * @return
     */
    Call<Result> updateDMY(
            @Query("sheet") String sheet,       // sheet = "dmy"
            @Query("action") String action,     // action = "update"
            @Query("type") String type,
            @Query("date") Integer date,
            @Query("poojatype") String poojatype,
            @Query("billno") Integer billno,
            @Query("name") String name,
            @Query("address") String address,
            @Query("amount") Integer amount,
            @Query("remarks") String remarks
    );

    /**
     *
     * @param sheet
     * @param action
     * @param billno
     * @return
     */
    Call<Result> deleteDMY(
            @Query("sheet") String sheet,       // sheet = "dmy"
            @Query("action") String action,     // action = "delete"
            @Query("billno") Integer billno
    );

    /**
     *
     * @param sheet
     * @param action
     * @param billno
     * @return
     */
    Call<DMYResult> getDMY(
            @Query("sheet") String sheet,       // sheet = "dmy"
            @Query("action") String action,     // action = "billno"
            @Query("billno") Integer billno
    );

    /**
     *
     * @param sheet
     * @param action
     * @return
     */
    Call<AllDMYResult> getAllDMY(
            @Query("sheet") String sheet,       // sheet = "dmy"
            @Query("action") String action      // action = "readall"
    );

    /**
     *
     * @param sheet
     * @param action
     * @param date
     * @param type
     * @param amount
     * @param remarks
     * @param id
     * @return
     */
    @GET("dev")
    Call<Result> insertIE(
            @Query("sheet") String sheet,       // sheet = "ie"
            @Query("action") String action,     // action = "insert"
            @Query("date") Integer date,
            @Query("type") String type,
            @Query("amount") Integer amount,
            @Query("remarks") String remarks,
            @Query("id") Integer id
    );

    /**
     *
     * @param sheet
     * @param action
     * @param date
     * @param type
     * @param amount
     * @param remarks
     * @param id
     * @return
     */
    Call<Result> updateIE(
            @Query("sheet") String sheet,       // sheet = "ie"
            @Query("action") String action,     // action = "update"
            @Query("date") Integer date,
            @Query("type") String type,
            @Query("amount") Integer amount,
            @Query("remarks") String remarks,
            @Query("id") Integer id
    );

    /**
     *
     * @param sheet
     * @param action
     * @param id
     * @return
     */
    Call<Result> deleteIE(
            @Query("sheet") String sheet,       // sheet = "ie"
            @Query("action") String action,     // action = "delete"
            @Query("id") Integer id
    );

    /**
     *
     * @param sheet
     * @param action
     * @param id
     * @return
     */
    Call<IEResult> getIE(
            @Query("sheet") String sheet,       // sheet = "ie"
            @Query("action") String action,     // action = "id"
            @Query("id") Integer id
    );

    /**
     *
     * @param sheet
     * @param action
     * @return
     */
    Call<AllIEResult> getAllIE(
            @Query("sheet") String sheet,       // sheet = "ie"
            @Query("action") String action      // action = "readall"
    );

    /**
     *
     * @param sheet
     * @param action
     * @param type
     * @param innertype
     * @param amount
     * @param remarks
     * @param id
     * @param date
     * @return
     */
    @GET("dev")
    Call<Result> insertMWB(
            @Query("sheet") String sheet,       // sheet = "mwb"
            @Query("action") String action,     // action = "insert"
            @Query("type") String type,
            @Query("innertype") String innertype,
            @Query("amount") Integer amount,
            @Query("remarks") String remarks,
            @Query("id") Integer id,
            @Query("date") Integer date
    );

    /**
     *
     * @param sheet
     * @param action
     * @param type
     * @param innertype
     * @param amount
     * @param remarks
     * @param id
     * @param date
     * @return
     */
    Call<Result> updateMWB(
            @Query("sheet") String sheet,       // sheet = "mwb"
            @Query("action") String action,     // action = "update"
            @Query("type") String type,
            @Query("innertype") String innertype,
            @Query("amount") Integer amount,
            @Query("remarks") String remarks,
            @Query("id") Integer id,
            @Query("date") Integer date
    );

    /**
     *
     * @param sheet
     * @param action
     * @param id
     * @return
     */
    Call<Result> deleteMWB(
            @Query("sheet") String sheet,       // sheet = "mwb"
            @Query("action") String action,     // action = "delete"
            @Query("id") Integer id
    );

    /**
     *
     * @param sheet
     * @param action
     * @param id
     * @return
     */
    Call<MWBResult> getMWB(
            @Query("sheet") String sheet,       // sheet = "mwb"
            @Query("action") String action,     // action = "id"
            @Query("id") Integer id
    );

    /**
     *
     * @param sheet
     * @param action
     * @return
     */
    Call<AllMWBResult> getAllMWB(
            @Query("sheet") String sheet,       // sheet = "mwb"
            @Query("action") String action      // action = "readall"
    );

    /**
     *
     * @param sheet
     * @param action
     * @param type
     * @param amount
     * @param remarks
     * @param id
     * @return
     */
    @GET("dev")
    Call<Result> insertAsset(
            @Query("sheet") String sheet,       // sheet = "assets"
            @Query("action") String action,     // action = "insert"
            @Query("type") String type,
            @Query("amount") Integer amount,
            @Query("remarks") String remarks,
            @Query("id") Integer id
    );

    /**
     *
     * @param sheet
     * @param action
     * @param type
     * @param amount
     * @param remarks
     * @param id
     * @return
     */
    Call<Result> updateAsset(
            @Query("sheet") String sheet,       // sheet = "assets"
            @Query("action") String action,     // action = "update"
            @Query("type") String type,
            @Query("amount") Integer amount,
            @Query("remarks") String remarks,
            @Query("id") Integer id
    );

    /**
     *
     * @param sheet
     * @param action
     * @param id
     * @return
     */
    Call<Result> deleteAsset(
            @Query("sheet") String sheet,       // sheet = "assets"
            @Query("action") String action,     // action = "delete"
            @Query("id") Integer id
    );

    /**
     *
     * @param sheet
     * @param action
     * @param id
     * @return
     */
    Call<AssetsResult> getAsset(
            @Query("sheet") String sheet,       // sheet = "assets"
            @Query("action") String action,     // action = "id"
            @Query("id") Integer id
    );

    /**
     *
     * @param sheet
     * @param action
     * @return
     */
    Call<AllAssetsResult> getAllAssets(
            @Query("sheet") String sheet,       // sheet = "assets"
            @Query("action") String action      // action = "readall"
    );

    /**
     *
     * @param sheet
     * @param action
     * @param date
     * @param bank
     * @param fdno
     * @param maturitydate
     * @param amount
     * @param value
     * @param name
     * @return
     */
    @GET("dev")
    Call<Result> insertFD(
            @Query("sheet") String sheet,       // sheet = "fd"
            @Query("action") String action,     // action = "insert"
            @Query("date") Integer date,
            @Query("bank") String bank,
            @Query("fdno") String fdno,
            @Query("maturitydate") Integer maturitydate,
            @Query("amount") Integer amount,
            @Query("value") Integer value,
            @Query("name") String name
    );

    /**
     *
     * @param sheet
     * @param action
     * @param date
     * @param bank
     * @param fdno
     * @param maturitydate
     * @param amount
     * @param value
     * @param name
     * @return
     */
    Call<Result> updateFD(
            @Query("sheet") String sheet,       // sheet = "fd"
            @Query("action") String action,     // action = "update"
            @Query("date") Integer date,
            @Query("bank") String bank,
            @Query("fdno") String fdno,
            @Query("maturitydate") Integer maturitydate,
            @Query("amount") Integer amount,
            @Query("value") Integer value,
            @Query("name") String name
    );

    /**
     *
     * @param sheet
     * @param action
     * @param fdno
     * @return
     */
    Call<Result> deleteFD(
            @Query("sheet") String sheet,       // sheet = "fd"
            @Query("action") String action,     // action = "delete"
            @Query("fdno") String fdno
    );

    /**
     *
     * @param sheet
     * @param action
     * @param fdno
     * @return
     */
    Call<FDResult> getFD(
            @Query("sheet") String sheet,       // sheet = "fd"
            @Query("action") String action,     // action = "fdno"
            @Query("fdno") String fdno
    );

    /**
     *
     * @param sheet
     * @param action
     * @return
     */
    Call<AllFDResult> getAllFD(
            @Query("sheet") String sheet,       // sheet = "fd"
            @Query("action") String action      // action = "readall"
    );
}