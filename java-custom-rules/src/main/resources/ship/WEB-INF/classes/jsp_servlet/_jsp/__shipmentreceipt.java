package jsp_servlet._jsp;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fedex.fsm.ship.web.modules.pickupDropoff.PickupDropoffData;
import com.fedex.fsm.ship.web.modules.psd.MPSRowData;
import com.fedex.fsm.ship.web.modules.to.GroupShipData;
import com.fedex.fsm.ship.web.modules.specialServices.SpecialServicesDisplay;
import com.fedex.fsm.ship.web.modules.specialServices.SSData;
import com.fedex.fsm.ship.common.constants.*;
import com.fedex.fsm.ship.common.vo.user.FSMPrivilege;
import com.fedex.fsm.ship.web.outbound.ShipActionForm;
import com.fedex.fsm.ship.web.label.LabelDisplay;
import com.fedex.fsm.ship.web.label.LabelData;
import com.fedex.fsm.ship.web.modules.psd.PSDData;
import com.fedex.fsm.ship.web.modules.returnOptions.ReturnOptionsData;
import com.fedex.fsm.ship.web.modules.billing.BillingData;
import com.fedex.fsm.ship.web.modules.billing.BillingTypeAdapter;
import com.fedex.fsm.ship.web.modules.AddressData;
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.common.constants.AppConstants;
import com.fedex.fsm.ship.web.modules.rating.RatingData;
import com.fedex.fsm.ship.web.util.WebUtils;
import com.fedex.fsm.ship.web.util.WebShipEnvironment;
import java.util.Locale;
import java.util.*;
import org.apache.struts.util.MessageResources;
import org.apache.struts.util.LabelValueBean;
import org.apache.struts.Globals;
import com.fedex.fsm.ship.web.component.TextField;
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.web.util.LoggerFactory;
import com.fedex.fsm.ship.web.util.ApplicationPropertyLoader;
import org.apache.struts.Globals;
import org.apache.struts.util.MessageResources;
import com.fedex.fsm.ship.web.util.WebUtils;
import com.fedex.fsm.ship.web.outbound.*;
import com.fedex.fsm.ship.web.modules.completeShip.*;
import com.fedex.fsm.ship.web.modules.specialServices.*;
import com.fedex.fsm.ship.web.modules.psd.*;
import com.fedex.fsm.ship.web.util.*;
import com.fedex.fsm.ship.web.util.ajax.JSONSimulator;
import com.fedex.fsm.ship.web.modules.ContactData;
import com.fedex.fsm.ship.web.decouple.DecoupleState;
import com.fedex.fsm.ship.common.vo.user.prefs.pkg.PackagePreferencesVO;
import com.fedex.fsm.ship.common.vo.user.privileges.pkg.SpecialServicesPrivilegesVO;
import com.fedex.fsm.ship.common.vo.user.PackageReferencePreferencesVO;
import com.fedex.fsm.ship.common.vo.CustomsDocumentType;
import java.util.*;
import com.fedex.fsm.ship.web.entryExit.*;
import com.fedex.fsm.ship.web.returns.ReturnsFlowContext;
import com.fedex.fsm.ship.web.component.country.CountryUtils;
import com.fedex.fsm.ship.web.displayRules.DisplayRules;
import com.fedex.fsm.ship.web.component.country.Country;
import com.fedex.fsm.ship.web.modules.pickupDropoff.PickupDropoffUtil;
import com.fedex.fsm.ship.common.vo.user.AccountVO;
import com.fedex.fsm.ship.web.modules.billing.BillingAccountInfo;
import com.fedex.framework.encode.commonslang.HTMLEncoder;
import com.fedex.fsm.ship.common.vo.NotificationType;
import com.fedex.fsm.ship.web.util.WebAnalytics;
import com.fedex.fsm.ship.web.displayRules.WebAnalyticsSelector;
import com.fedex.fsm.ship.web.decouple.DecoupleState;

public final class __shipmentreceipt extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

    private static void _releaseTags(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag t) {
        while (t != null) {
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, t);
            if(t instanceof javax.servlet.jsp.tagext.Tag) {
                javax.servlet.jsp.tagext.Tag tmp = (javax.servlet.jsp.tagext.Tag)t;
                t = ((javax.servlet.jsp.tagext.Tag) t).getParent();
                try {
                    tmp.release();
                } catch(java.lang.Exception ignore) {}
            }
            else {
                t = ((javax.servlet.jsp.tagext.SimpleTag)t).getParent();
            }
        }
    }

    public boolean _isStale(){
        boolean _stale = _staticIsStale((weblogic.servlet.jsp.StaleChecker) getServletConfig().getServletContext());
        return _stale;
    }

    public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
        if (sci.isResourceStale("/jsp/ShipmentReceipt.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/ModuleCommonInclude.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/WebAnalyticsFooter.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/WebCacheInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        return false;
    }
    private weblogic.servlet.jsp.ExpressionInterceptor _jsp_expressionInterceptor = weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.getNonOperExpressionInterceptor();

    private static boolean _WL_ENCODED_BYTES_OK = true;
    private static final java.lang.String _WL_ORIGINAL_ENCODING = "utf-8".intern();

    private static byte[] _getBytes(java.lang.String block){
        try {
            return block.getBytes(_WL_ORIGINAL_ENCODING);
        } catch (java.io.UnsupportedEncodingException u){
            _WL_ENCODED_BYTES_OK = false;
        }
        return null;
    }

    private static java.lang.String  _wl_block0 ="\r\n";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\r\n\r\n";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n\r\n";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\r\n\r\n\r\n";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private static java.lang.String  _wl_block4 ="\r\n<head>\r\n";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private static java.lang.String  _wl_block5 ="\r\n\r\n<script>\r\nvar webCacheTimeStamp = \"";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private static java.lang.String  _wl_block6 ="\";\r\n</script>";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private static java.lang.String  _wl_block7 =" \r\n";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private static java.lang.String  _wl_block8 =" \r\n\r\n";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

    private static java.lang.String  _wl_block9 =" \r\n\r\n\r\n";
    private final static byte[]  _wl_block9Bytes = _getBytes( _wl_block9 );

    private static java.lang.String  _wl_block10 ="\r\n<script type=\"text/javascript\" charset=\"utf-8\">\r\n\r\n\t\r\n\tvar _isSPEnabled = ";
    private final static byte[]  _wl_block10Bytes = _getBytes( _wl_block10 );

    private static java.lang.String  _wl_block11 =";\r\n\tvar _isReturnsSPEnabled = ";
    private final static byte[]  _wl_block11Bytes = _getBytes( _wl_block11 );

    private static java.lang.String  _wl_block12 =";\r\n\tvar isRegionalServiceTypes = ";
    private final static byte[]  _wl_block12Bytes = _getBytes( _wl_block12 );

    private static java.lang.String  _wl_block13 =";\r\n\tvar isRegionalPackageTypes = ";
    private final static byte[]  _wl_block13Bytes = _getBytes( _wl_block13 );

    private static java.lang.String  _wl_block14 =";\r\n\tvar _isDomestic = ";
    private final static byte[]  _wl_block14Bytes = _getBytes( _wl_block14 );

    private static java.lang.String  _wl_block15 =";\r\n\tvar _isDomesticAllowed = ";
    private final static byte[]  _wl_block15Bytes = _getBytes( _wl_block15 );

    private static java.lang.String  _wl_block16 =";\r\n\tvar _isDomesticReturnsSupported = ";
    private final static byte[]  _wl_block16Bytes = _getBytes( _wl_block16 );

    private static java.lang.String  _wl_block17 =";\r\n\tvar _isDomesticShippingSupported = ";
    private final static byte[]  _wl_block17Bytes = _getBytes( _wl_block17 );

    private static java.lang.String  _wl_block18 =";\t\r\n\tvar _isSameCategoryPackageRefreshNeeded = ";
    private final static byte[]  _wl_block18Bytes = _getBytes( _wl_block18 );

    private static java.lang.String  _wl_block19 =";\t\r\n\tvar _isShowAlcoholService = ";
    private final static byte[]  _wl_block19Bytes = _getBytes( _wl_block19 );

    private static java.lang.String  _wl_block20 =";\r\n\tvar _localeURL = \"";
    private final static byte[]  _wl_block20Bytes = _getBytes( _wl_block20 );

    private static java.lang.String  _wl_block21 ="\";\r\n\tvar _isPackageContentsAvailable=";
    private final static byte[]  _wl_block21Bytes = _getBytes( _wl_block21 );

    private static java.lang.String  _wl_block22 =";\r\n\tvar _isReturnOnly = ";
    private final static byte[]  _wl_block22Bytes = _getBytes( _wl_block22 );

    private static java.lang.String  _wl_block23 =";\r\n\tvar _isFromEMEA = \"";
    private final static byte[]  _wl_block23Bytes = _getBytes( _wl_block23 );

    private static java.lang.String  _wl_block24 ="\";\r\n\tvar _originCountryCd = \"";
    private final static byte[]  _wl_block24Bytes = _getBytes( _wl_block24 );

    private static java.lang.String  _wl_block25 ="\";\r\n\tvar fromCountryCode = \"";
    private final static byte[]  _wl_block25Bytes = _getBytes( _wl_block25 );

    private static java.lang.String  _wl_block26 ="\";\r\n\tvar debugStatements = \"\"; ";
    private final static byte[]  _wl_block26Bytes = _getBytes( _wl_block26 );

    private static java.lang.String  _wl_block27 ="\t\r\n//\tvar i18n_select = \"";
    private final static byte[]  _wl_block27Bytes = _getBytes( _wl_block27 );

    private static java.lang.String  _wl_block28 ="\";\r\n//\tvar i18n_addressResults = \"";
    private final static byte[]  _wl_block28Bytes = _getBytes( _wl_block28 );

    private static java.lang.String  _wl_block29 ="\";\r\n//\tvar i18n_commercial = \"";
    private final static byte[]  _wl_block29Bytes = _getBytes( _wl_block29 );

    private static java.lang.String  _wl_block30 ="\";\r\n//\tvar i18n_residential = \"";
    private final static byte[]  _wl_block30Bytes = _getBytes( _wl_block30 );

    private static java.lang.String  _wl_block31 ="\";\r\n//\tvar i18n_useAddressEntered = \"";
    private final static byte[]  _wl_block31Bytes = _getBytes( _wl_block31 );

    private static java.lang.String  _wl_block32 ="\";\r\n//\tvar enteredAddressRolloverHelp = \"";
    private final static byte[]  _wl_block32Bytes = _getBytes( _wl_block32 );

    private static java.lang.String  _wl_block33 ="\";\r\n\tvar isReturnEnabled = ";
    private final static byte[]  _wl_block33Bytes = _getBytes( _wl_block33 );

    private static java.lang.String  _wl_block34 =";\r\n\tvar isSaveAsDefaultDiaChbxChecked = ";
    private final static byte[]  _wl_block34Bytes = _getBytes( _wl_block34 );

    private static java.lang.String  _wl_block35 =";\r\n\tvar isSaveAsDefaultCodChbxChecked = ";
    private final static byte[]  _wl_block35Bytes = _getBytes( _wl_block35 );

    private static java.lang.String  _wl_block36 =";\r\n\r\n\tvar i18n_select = \"";
    private final static byte[]  _wl_block36Bytes = _getBytes( _wl_block36 );

    private static java.lang.String  _wl_block37 ="\";\r\n\tvar i18n_addressResults=\"";
    private final static byte[]  _wl_block37Bytes = _getBytes( _wl_block37 );

    private static java.lang.String  _wl_block38 ="\";\r\n\tvar i18n_useAddressEntered =\"";
    private final static byte[]  _wl_block38Bytes = _getBytes( _wl_block38 );

    private static java.lang.String  _wl_block39 ="\";\r\n\tvar i18n_commercial =\"";
    private final static byte[]  _wl_block39Bytes = _getBytes( _wl_block39 );

    private static java.lang.String  _wl_block40 ="\";\r\n\tvar i18n_residential =\"";
    private final static byte[]  _wl_block40Bytes = _getBytes( _wl_block40 );

    private static java.lang.String  _wl_block41 ="\";\r\n\tvar enteredAddressRolloverHelp =\"";
    private final static byte[]  _wl_block41Bytes = _getBytes( _wl_block41 );

    private static java.lang.String  _wl_block42 ="\";\r\n\r\n\r\n\t//DTD3300: GDE3 Code Added\r\n\tvar globalDisplayRules={};\r\n\tglobalDisplayRules.isCustomsModuleAvailable=";
    private final static byte[]  _wl_block42Bytes = _getBytes( _wl_block42 );

    private static java.lang.String  _wl_block43 =";\r\n\tglobalDisplayRules.isPackageContentsAvailable=";
    private final static byte[]  _wl_block43Bytes = _getBytes( _wl_block43 );

    private static java.lang.String  _wl_block44 =";\r\n\r\n\tglobalDisplayRules.isUSDomestic = ";
    private final static byte[]  _wl_block44Bytes = _getBytes( _wl_block44 );

    private static java.lang.String  _wl_block45 =";\r\n\tglobalDisplayRules.isCADomestic = ";
    private final static byte[]  _wl_block45Bytes = _getBytes( _wl_block45 );

    private static java.lang.String  _wl_block46 =";\r\n\tglobalDisplayRules.isIndiaDomestic = ";
    private final static byte[]  _wl_block46Bytes = _getBytes( _wl_block46 );

    private static java.lang.String  _wl_block47 =";\r\n\tglobalDisplayRules.isUAEDomestic = ";
    private final static byte[]  _wl_block47Bytes = _getBytes( _wl_block47 );

    private static java.lang.String  _wl_block48 =";\r\n    globalDisplayRules.isDomestic = ";
    private final static byte[]  _wl_block48Bytes = _getBytes( _wl_block48 );

    private static java.lang.String  _wl_block49 =";\r\n    globalDisplayRules.isUKDomestic = ";
    private final static byte[]  _wl_block49Bytes = _getBytes( _wl_block49 );

    private static java.lang.String  _wl_block50 =";\r\n    globalDisplayRules.isDomesticAllowed = ";
    private final static byte[]  _wl_block50Bytes = _getBytes( _wl_block50 );

    private static java.lang.String  _wl_block51 =";\r\n\r\n//\tvar txtGroundSpecificSS = \"";
    private final static byte[]  _wl_block51Bytes = _getBytes( _wl_block51 );

    private static java.lang.String  _wl_block52 ="\";\r\n//\tvar txtGroundSpecificSSRollOverHelp = \"";
    private final static byte[]  _wl_block52Bytes = _getBytes( _wl_block52 );

    private static java.lang.String  _wl_block53 ="\";\r\n//\tvar txtHomeDeliverySpecificSS = \"";
    private final static byte[]  _wl_block53Bytes = _getBytes( _wl_block53 );

    private static java.lang.String  _wl_block54 ="\";\r\n//\tvar txtHomeDeliverySpecificSSRolloverHelp = \"";
    private final static byte[]  _wl_block54Bytes = _getBytes( _wl_block54 );

    private static java.lang.String  _wl_block55 ="\";\r\n\tvar txtGroundSpecificSS =\"";
    private final static byte[]  _wl_block55Bytes = _getBytes( _wl_block55 );

    private static java.lang.String  _wl_block56 ="\";\r\n\tvar txtGroundSpecificSSRollOverHelp =\"";
    private final static byte[]  _wl_block56Bytes = _getBytes( _wl_block56 );

    private static java.lang.String  _wl_block57 ="\";\r\n\tvar txtHomeDeliverySpecificSS =\"";
    private final static byte[]  _wl_block57Bytes = _getBytes( _wl_block57 );

    private static java.lang.String  _wl_block58 ="\";\r\n\tvar txtHomeDeliverySpecificSSRolloverHelp =\"";
    private final static byte[]  _wl_block58Bytes = _getBytes( _wl_block58 );

    private static java.lang.String  _wl_block59 ="\";\r\n\r\n\tvar isPostalCheckEnabled = ";
    private final static byte[]  _wl_block59Bytes = _getBytes( _wl_block59 );

    private static java.lang.String  _wl_block60 =" ;\r\n\tvar isAddressCheckEnabled = ";
    private final static byte[]  _wl_block60Bytes = _getBytes( _wl_block60 );

    private static java.lang.String  _wl_block61 =" ;\r\n\tvar isMandatoryAddressCheckEnabled = ";
    private final static byte[]  _wl_block61Bytes = _getBytes( _wl_block61 );

    private static java.lang.String  _wl_block62 =" ;\r\n\t\r\n\t// ITG # 163023 - File:inetAppConfig.properties, Key:LACANSplitEnabled\r\n\t// As part of cleanup isLACANSplitEnabled() is no longer exists in DecoupleState.java\r\n\tvar meterNumber = \"";
    private final static byte[]  _wl_block62Bytes = _getBytes( _wl_block62 );

    private static java.lang.String  _wl_block63 ="\";\r\n\tvar gticSuggestedDocumentsURL = \"";
    private final static byte[]  _wl_block63Bytes = _getBytes( _wl_block63 );

    private static java.lang.String  _wl_block64 ="\";\r\n\tvar isIRDEmailLableShipmentAllowed = \"";
    private final static byte[]  _wl_block64Bytes = _getBytes( _wl_block64 );

    private static java.lang.String  _wl_block65 ="\";\t\r\n\r\n\tvar isImportShipmentAllowed = \"";
    private final static byte[]  _wl_block65Bytes = _getBytes( _wl_block65 );

    private static java.lang.String  _wl_block66 ="\";\r\n\t\r\n\t//ITG 149885, LAC Columbia\r\n\tvar isAvailableCityListRefreshEnabled = ";
    private final static byte[]  _wl_block66Bytes = _getBytes( _wl_block66 );

    private static java.lang.String  _wl_block67 =";\r\n\tvar _isGDE4UKEnabled = ";
    private final static byte[]  _wl_block67Bytes = _getBytes( _wl_block67 );

    private static java.lang.String  _wl_block68 =";\r\n\tvar _isSMARRTZEnabled = ";
    private final static byte[]  _wl_block68Bytes = _getBytes( _wl_block68 );

    private static java.lang.String  _wl_block69 =";\r\n\tvar _isSMARRTZAlertEnabled = ";
    private final static byte[]  _wl_block69Bytes = _getBytes( _wl_block69 );

    private static java.lang.String  _wl_block70 =";\r\n\tvar _isNIAGARAEnabled = ";
    private final static byte[]  _wl_block70Bytes = _getBytes( _wl_block70 );

    private static java.lang.String  _wl_block71 =";\r\n\tvar isColumbiaPostalCodeMockEnabled = ";
    private final static byte[]  _wl_block71Bytes = _getBytes( _wl_block71 );

    private static java.lang.String  _wl_block72 =";\r\n\tvar _isIrdApacEnabled = ";
    private final static byte[]  _wl_block72Bytes = _getBytes( _wl_block72 );

    private static java.lang.String  _wl_block73 =";\r\n\t// Jan 2016 CL - ITG-169590 and ID-1485584\r\n    var _isEDNForSmartPostEnabled=";
    private final static byte[]  _wl_block73Bytes = _getBytes( _wl_block73 );

    private static java.lang.String  _wl_block74 =";\r\n\t// Jan 2015 CL, ITG 155652 and ID 1340471\r\n\t//  To validate eventId when adding/updating the commodity\r\n\tvar commodityEventId = \"\"; \r\n\t//  To save existing commodities data for temporary usage\r\n\tvar productsAsStringTemp = \"\";\r\n\t//  To get number of product prohibits\r\n\tvar numberOfProductProhibits = 0;\t\r\n\t\r\n\t//Fix for defect#319288, to validate prohibits\r\n\tvar isProhibit = false;\r\n\tvar _isLACSouthMiamiEnabled=";
    private final static byte[]  _wl_block74Bytes = _getBytes( _wl_block74 );

    private static java.lang.String  _wl_block75 =";\r\n\t//Jul 2016 CL - ITG 159201 ETD Enhancements - ID 1485809\r\n\tvar _isETDDGHazmatEnabled = ";
    private final static byte[]  _wl_block75Bytes = _getBytes( _wl_block75 );

    private static java.lang.String  _wl_block76 =";\r\n\tvar _isETDEnhancementEnabled = ";
    private final static byte[]  _wl_block76Bytes = _getBytes( _wl_block76 );

    private static java.lang.String  _wl_block77 =";\r\n\t// Jul 2018 CL - ITG-180129 OnSite2.3 - ID:112428\r\n\tvar _isOnsitePackageHandlingRestrictionEnabled = ";
    private final static byte[]  _wl_block77Bytes = _getBytes( _wl_block77 );

    private static java.lang.String  _wl_block78 =";\r\n\t//Jan 2017 CL - 177016 Sec II Lithium Battery Identification 1529522\r\n\tvar _isExpLitBatCellsAllowed = ";
    private final static byte[]  _wl_block78Bytes = _getBytes( _wl_block78 );

    private static java.lang.String  _wl_block79 =";\r\n\t\r\n\t// JUL17CL - ITG 176640 - Niagara 2.0 Phase 2\r\n\tvar _isBrokerSelect = ";
    private final static byte[]  _wl_block79Bytes = _getBytes( _wl_block79 );

    private static java.lang.String  _wl_block80 =";\r\n\tvar _isIGCAccountEnabled= ";
    private final static byte[]  _wl_block80Bytes = _getBytes( _wl_block80 );

    private static java.lang.String  _wl_block81 =";\r\n\tvar _isExcludeFromConsolidationChecked= ";
    private final static byte[]  _wl_block81Bytes = _getBytes( _wl_block81 );

    private static java.lang.String  _wl_block82 =";\r\n\tvar _isNIAGARAPhase2Enabled = ";
    private final static byte[]  _wl_block82Bytes = _getBytes( _wl_block82 );

    private static java.lang.String  _wl_block83 =";\r\n\tvar _isNonETDLabelAndIntraEUEnabled = ";
    private final static byte[]  _wl_block83Bytes = _getBytes( _wl_block83 );

    private static java.lang.String  _wl_block84 =";\r\n\tvar psdDispObj = ";
    private final static byte[]  _wl_block84Bytes = _getBytes( _wl_block84 );

    private static java.lang.String  _wl_block85 =";\r\n\t// Jan18CL - ITG 163016 Freight 2020\r\n\tvar _isFreight2020Enabled = ";
    private final static byte[]  _wl_block85Bytes = _getBytes( _wl_block85 );

    private static java.lang.String  _wl_block86 =";\r\n\tvar _freight2020MaxTotalHandlingUnits= ";
    private final static byte[]  _wl_block86Bytes = _getBytes( _wl_block86 );

    private static java.lang.String  _wl_block87 =";\r\n\r\n\t// Jan19CL - ITG 171804 - Allow an Admin to restrict shipping to the Central Address Book\r\n\tvar _isAddressBookRestricted = ";
    private final static byte[]  _wl_block87Bytes = _getBytes( _wl_block87 );

    private static java.lang.String  _wl_block88 =";\r\n\tconsole.log(_isAddressBookRestricted);\r\n\tvar clearAllFields = ";
    private final static byte[]  _wl_block88Bytes = _getBytes( _wl_block88 );

    private static java.lang.String  _wl_block89 =";\r\n\tvar _cabOutboundFlag = ";
    private final static byte[]  _wl_block89Bytes = _getBytes( _wl_block89 );

    private static java.lang.String  _wl_block90 =";\r\n\tvar _cabReturnFlag = ";
    private final static byte[]  _wl_block90Bytes = _getBytes( _wl_block90 );

    private static java.lang.String  _wl_block91 =";\r\n\tvar _isReturnImport= ";
    private final static byte[]  _wl_block91Bytes = _getBytes( _wl_block91 );

    private static java.lang.String  _wl_block92 =";\r\n\t\r\n\t// Jan19CL - ITG 171800 - Allow Option for Billing Defaults not to change\r\n\tvar _isBillToRestrictedFlag = ";
    private final static byte[]  _wl_block92Bytes = _getBytes( _wl_block92 );

    private static java.lang.String  _wl_block93 =";\r\n\tconsole.log(_isBillToRestrictedFlag);\r\n\tvar _isDutyBillToRestrictedFlag = ";
    private final static byte[]  _wl_block93Bytes = _getBytes( _wl_block93 );

    private static java.lang.String  _wl_block94 =";\r\n\tconsole.log(_isDutyBillToRestrictedFlag);\r\n\tvar _billingRestrictedFlag = ";
    private final static byte[]  _wl_block94Bytes = _getBytes( _wl_block94 );

    private static java.lang.String  _wl_block95 =";\r\n\tvar _isSafariOnMAC = ";
    private final static byte[]  _wl_block95Bytes = _getBytes( _wl_block95 );

    private static java.lang.String  _wl_block96 =";\r\n\t\r\n\t//\r\n</script>\r\n\r\n\r\n\r\n";
    private final static byte[]  _wl_block96Bytes = _getBytes( _wl_block96 );

    private static java.lang.String  _wl_block97 ="\r\n\r\n\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n\t<title>";
    private final static byte[]  _wl_block97Bytes = _getBytes( _wl_block97 );

    private static java.lang.String  _wl_block98 ="</title>\r\n\t\r\n\t<link rel=\"stylesheet\" type=\"text/css\"\r\n\t\thref=\"";
    private final static byte[]  _wl_block98Bytes = _getBytes( _wl_block98 );

    private static java.lang.String  _wl_block99 ="/css/fsm_label";
    private final static byte[]  _wl_block99Bytes = _getBytes( _wl_block99 );

    private static java.lang.String  _wl_block100 =".css\">\r\n\t<link rel=\"stylesheet\" type=\"text/css\"\r\n\t\thref=\"";
    private final static byte[]  _wl_block100Bytes = _getBytes( _wl_block100 );

    private static java.lang.String  _wl_block101 ="/css/fsm_common";
    private final static byte[]  _wl_block101Bytes = _getBytes( _wl_block101 );

    private static java.lang.String  _wl_block102 =".css\">\r\n\t<link rel=\"stylesheet\" type=\"text/css\" \r\n\t\thref=\"";
    private final static byte[]  _wl_block102Bytes = _getBytes( _wl_block102 );

    private static java.lang.String  _wl_block103 ="/css/fsm_labelprint";
    private final static byte[]  _wl_block103Bytes = _getBytes( _wl_block103 );

    private static java.lang.String  _wl_block104 =".css\" media=\"print\"> \t \t\t\r\n\t\t\r\n    <script type=\"text/javascript\" charset=\"utf-8\">\t    \t\r\n\t    function setLoadStatus() {\r\n\t    \tsetDomain(\"fedex.com\");\r\n\t\t    var needIFrameLoadStatus = \"";
    private final static byte[]  _wl_block104Bytes = _getBytes( _wl_block104 );

    private static java.lang.String  _wl_block105 ="\";\t\t   \r\n\t\t    if (window.opener != null) {\r\n\t\t       \topener.document.shipActionForm.printButton.disabled = false;\r\n\t\t    } else {\r\n\t\t      \tparent.disableEnablePrintButton(\"false\"); \t\t\t\r\n\t\t\t}\t    \r\n\t\t   \t\t\r\n\t\t    if (needIFrameLoadStatus == \'true\') {\r\n\t     \t\tparent.readyToPrint(\"checkbox.receipt\");\t    \t\t\r\n\t    \t}  \t\t\t\t\t\t\t\t\r\n\t    }\r\n\t    \r\n\t    function setDomain(newDomain) {\r\n\t\t\tvar isDomainSet = false;\r\n\t\t\tvar message = \"Current domain=\";\r\n\t\t\ttry\r\n\t\t\t{\r\n\t\t\t\tmessage += document.domain;\r\n\t\t    \tdocument.domain=newDomain;\r\n\t\t    \tisDomainSet = true;\r\n\t\t    }\r\n\t\t    catch( x) {\r\n\t\t    \tmessage += x.message;\r\n\t\t    \ttry {\r\n\t\t    \t\tnetscape.security.PrivilegeManager.enablePrivilege(\"UniversalBrowserAccess\");\r\n\t\t  \t\t\tisDomainSet = true;\r\n\t\t  \t\t}\r\n\t\t  \t\tcatch( x) {\r\n\t\t  \t\t\tmessage += \" and \"+x.message;\r\n\t\t  \t\t}\r\n\t\t  \t}\r\n\t\t\tif (isDomainSet == false) {\r\n\t\t\t //\talert(\"Domain was not set to \"+newDomain+\" bec \"+message);\r\n\t\t\t}\r\n\t\t\treturn isDomainSet;\r\n\t\t}\r\n    </script>  \r\n    ";
    private final static byte[]  _wl_block105Bytes = _getBytes( _wl_block105 );

    private static java.lang.String  _wl_block106 =" \r\n\t<meta name=\"wsstitle\" id=\"wsstitle\" content=\"receipt\">\r\n\t<meta name=\"wssmlc\" id=\"wssmlc\" content=\"/";
    private final static byte[]  _wl_block106Bytes = _getBytes( _wl_block106 );

    private static java.lang.String  _wl_block107 ="/";
    private final static byte[]  _wl_block107Bytes = _getBytes( _wl_block107 );

    private static java.lang.String  _wl_block108 ="/fedex/inet\">\r\n</head>\r\n\r\n<body onload=\"JavaScript:setLoadStatus();\">\r\n\t";
    private final static byte[]  _wl_block108Bytes = _getBytes( _wl_block108 );

    private static java.lang.String  _wl_block109 ="\r\n\r\n\t\t\r\n\t<div id=\"shipReceipt\" style=\"font-family:Arial;\tfont-size:8pt;\">&nbsp;\t \r\n\t\t";
    private final static byte[]  _wl_block109Bytes = _getBytes( _wl_block109 );

    private static java.lang.String  _wl_block110 ="\t\t\r\n\t\t<div id=\"image1\" style=\"float:left;\tmargin-left:13px; margin-right:13px;\">\r\n\t\t\t<div><img src=\"";
    private final static byte[]  _wl_block110Bytes = _getBytes( _wl_block110 );

    private static java.lang.String  _wl_block111 ="/images/en/fedex_logo.gif\" id=\"fedex.logo\" alt=\"\"/></div>\t\t\r\n\t\t</div>\t\t\r\n\t\t<div class=\"recieptHeader\">";
    private final static byte[]  _wl_block111Bytes = _getBytes( _wl_block111 );

    private static java.lang.String  _wl_block112 =" </div> </br> ";
    private final static byte[]  _wl_block112Bytes = _getBytes( _wl_block112 );

    private static java.lang.String  _wl_block113 =" </br> ";
    private final static byte[]  _wl_block113Bytes = _getBytes( _wl_block113 );

    private static java.lang.String  _wl_block114 ="\r\n\t\t";
    private final static byte[]  _wl_block114Bytes = _getBytes( _wl_block114 );

    private static java.lang.String  _wl_block115 ="\t\t\r\n\t\t\t<div id=\"nameHeader\" style=\"width: 672px;\">\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block115Bytes = _getBytes( _wl_block115 );

    private static java.lang.String  _wl_block116 =" \r\n\t\t\t\t\t<div id=\"caption1\" style=\"width: 400px; float:left; padding-left:10px;\"><b>";
    private final static byte[]  _wl_block116Bytes = _getBytes( _wl_block116 );

    private static java.lang.String  _wl_block117 ="</b></div>\r\n\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div> \r\n\t\t\t\t\t<div id=\"caption2\" ";
    private final static byte[]  _wl_block117Bytes = _getBytes( _wl_block117 );

    private static java.lang.String  _wl_block118 =" style=\"width: 400px; float:left; padding-left:10px;\" ";
    private final static byte[]  _wl_block118Bytes = _getBytes( _wl_block118 );

    private static java.lang.String  _wl_block119 =" >&nbsp;<b>";
    private final static byte[]  _wl_block119Bytes = _getBytes( _wl_block119 );

    private static java.lang.String  _wl_block120 ="</b></div>\t\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block120Bytes = _getBytes( _wl_block120 );

    private static java.lang.String  _wl_block121 ="\r\n\t\t\t</div>\r\n\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t<div id=\"nameHeader\">\r\n\t\t\t\t<div id=\"nameHeader1\"  style=\"width: 400px; float:left; padding-left:10px;\"><b>";
    private final static byte[]  _wl_block121Bytes = _getBytes( _wl_block121 );

    private static java.lang.String  _wl_block122 ="</b></div>\r\n\t\t\t\t";
    private final static byte[]  _wl_block122Bytes = _getBytes( _wl_block122 );

    private static java.lang.String  _wl_block123 ="\t\t\t\t\t\r\n\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div> \r\n\t\t\t\t\t<div id=\"nameHeader3\" style=\"\">&nbsp;<b>";
    private final static byte[]  _wl_block123Bytes = _getBytes( _wl_block123 );

    private static java.lang.String  _wl_block124 ="</b></div>\t\t\t\t\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block124Bytes = _getBytes( _wl_block124 );

    private static java.lang.String  _wl_block125 ="\t\r\n\t\t\t</div>\r\n\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t";
    private final static byte[]  _wl_block125Bytes = _getBytes( _wl_block125 );

    private static java.lang.String  _wl_block126 ="\r\n\t\t\t\t<div id=\"addressArea1\">\t\t\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<div id=\"shipTo\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;<b>";
    private final static byte[]  _wl_block126Bytes = _getBytes( _wl_block126 );

    private static java.lang.String  _wl_block127 ="</b></div>\r\n\t\t\t\t\t\t<div id=\"shipFrom\" style=\"width: 200px; float:left;\">&nbsp;<b>";
    private final static byte[]  _wl_block127Bytes = _getBytes( _wl_block127 );

    private static java.lang.String  _wl_block128 ="</b></div>\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block128Bytes = _getBytes( _wl_block128 );

    private static java.lang.String  _wl_block129 ="\r\n\t\t\t\t\t\t\t<div id=\"shipHal\" style=\"width: 200px; float:left;\">&nbsp;<b>";
    private final static byte[]  _wl_block129Bytes = _getBytes( _wl_block129 );

    private static java.lang.String  _wl_block130 =":</b></div>\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block130Bytes = _getBytes( _wl_block130 );

    private static java.lang.String  _wl_block131 ="\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block131Bytes = _getBytes( _wl_block131 );

    private static java.lang.String  _wl_block132 =" \r\n\t\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div> \r\n\t\t\t\t\t\t\t<div id=\"shipTo1\" style=\"width: 200px; float:left; padding-left:20px;\">&nbsp;<b>";
    private final static byte[]  _wl_block132Bytes = _getBytes( _wl_block132 );

    private static java.lang.String  _wl_block133 ="</b></div>\r\n\t\t\t\t\t\t\t<div id=\"shipFrom1\" style=\"width: 200px; float:left;\">&nbsp;<b>";
    private final static byte[]  _wl_block133Bytes = _getBytes( _wl_block133 );

    private static java.lang.String  _wl_block134 ="\t\t\t\t\t\t\r\n\t\t\t\t\t</div>\t\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block134Bytes = _getBytes( _wl_block134 );

    private static java.lang.String  _wl_block135 =" \r\n\t\t\t\t\t\t\t<div id=\"toContactname\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block135Bytes = _getBytes( _wl_block135 );

    private static java.lang.String  _wl_block136 ="</div>\r\n\t\t\t\t\t\t\t<div id=\"fromContactname\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block136Bytes = _getBytes( _wl_block136 );

    private static java.lang.String  _wl_block137 ="</div>\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block137Bytes = _getBytes( _wl_block137 );

    private static java.lang.String  _wl_block138 ="</div>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<div id=\"fromContactname\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block138Bytes = _getBytes( _wl_block138 );

    private static java.lang.String  _wl_block139 ="</div>\r\n\t\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div> \r\n\t\t\t\t\t\t\t<div id=\"toContactname\" style=\"width: 200px; float:left; padding-left:20px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block139Bytes = _getBytes( _wl_block139 );

    private static java.lang.String  _wl_block140 ="</div>\t\t\t\t\t\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block140Bytes = _getBytes( _wl_block140 );

    private static java.lang.String  _wl_block141 ="\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block141Bytes = _getBytes( _wl_block141 );

    private static java.lang.String  _wl_block142 =" \r\n\t\t\t\t\t\t\t<div id=\"toCompanyName\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block142Bytes = _getBytes( _wl_block142 );

    private static java.lang.String  _wl_block143 ="</div>\r\n\t\t\t\t\t\t\t<div id=\"fromCompanyName\" style=\"width: 200px; float:left; \">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block143Bytes = _getBytes( _wl_block143 );

    private static java.lang.String  _wl_block144 ="</div>\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block144Bytes = _getBytes( _wl_block144 );

    private static java.lang.String  _wl_block145 ="\r\n\t\t\t\t\t\t\t\t<div id=\"halLocationName\" style=\"width: 200px; float:left; \">&nbsp;\r\n\t\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block145Bytes = _getBytes( _wl_block145 );

    private static java.lang.String  _wl_block146 ="\r\n\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block146Bytes = _getBytes( _wl_block146 );

    private static java.lang.String  _wl_block147 ="</div>\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<div id=\"fromCompanyName\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block147Bytes = _getBytes( _wl_block147 );

    private static java.lang.String  _wl_block148 ="</div>\r\n\t\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div> \t\t\r\n\t\t\t\t\t\t\t<div id=\"toCompanyName\" style=\"width: 200px; float:left; padding-left:20px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block148Bytes = _getBytes( _wl_block148 );

    private static java.lang.String  _wl_block149 ="</div>\r\n\t\t\t\t\t\t\t<div id=\"fromCompanyName\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block149Bytes = _getBytes( _wl_block149 );

    private static java.lang.String  _wl_block150 ="</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block150Bytes = _getBytes( _wl_block150 );

    private static java.lang.String  _wl_block151 ="\r\n\t\t\t\t\t</div>\t\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\t\t\t\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block151Bytes = _getBytes( _wl_block151 );

    private static java.lang.String  _wl_block152 =" \r\n\t\t\t\t\t\t\t<div id=\"toAddressLine1\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block152Bytes = _getBytes( _wl_block152 );

    private static java.lang.String  _wl_block153 ="</div>\r\n\t\t\t\t\t\t\t<div id=\"fromAddressLine1\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block153Bytes = _getBytes( _wl_block153 );

    private static java.lang.String  _wl_block154 ="\r\n\t\t\t\t\t\t\t\t<div id=\"halAddressLine1\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block154Bytes = _getBytes( _wl_block154 );

    private static java.lang.String  _wl_block155 ="\t</div>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<div id=\"fromAddressLine1\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block155Bytes = _getBytes( _wl_block155 );

    private static java.lang.String  _wl_block156 =" </div>\r\n\t\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div> \r\n\t\t\t\t\t\t\t<div id=\"toAddressLine1\" style=\"width: 200px; float:left; padding-left:20px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block156Bytes = _getBytes( _wl_block156 );

    private static java.lang.String  _wl_block157 ="</div>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block157Bytes = _getBytes( _wl_block157 );

    private static java.lang.String  _wl_block158 =" \r\n\t\t\t\t\t\t\t<div id=\"toAddressLine2\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block158Bytes = _getBytes( _wl_block158 );

    private static java.lang.String  _wl_block159 ="</div>\r\n\t\t\t\t\t\t\t<div id=\"fromAddressLine2\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block159Bytes = _getBytes( _wl_block159 );

    private static java.lang.String  _wl_block160 ="\r\n\t\t\t\t\t\t\t\t<div id=\"halAddressLine2\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block160Bytes = _getBytes( _wl_block160 );

    private static java.lang.String  _wl_block161 ="\t\t\t\t\t\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block161Bytes = _getBytes( _wl_block161 );

    private static java.lang.String  _wl_block162 ="\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div id=\"fromAddressLine2\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block162Bytes = _getBytes( _wl_block162 );

    private static java.lang.String  _wl_block163 ="\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div> \r\n\t\t\t\t\t\t\t<div id=\"toAddressLine2\" style=\"width: 200px; float:left; padding-left:20px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block163Bytes = _getBytes( _wl_block163 );

    private static java.lang.String  _wl_block164 ="</div>\t\t\t\t\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block164Bytes = _getBytes( _wl_block164 );

    private static java.lang.String  _wl_block165 =" \r\n\t\t\t\t\t\t\t<div id=\"toCity\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block165Bytes = _getBytes( _wl_block165 );

    private static java.lang.String  _wl_block166 =",&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block166Bytes = _getBytes( _wl_block166 );

    private static java.lang.String  _wl_block167 ="</div>\r\n\t\t\t\t\t\t\t<div id=\"fromCity\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block167Bytes = _getBytes( _wl_block167 );

    private static java.lang.String  _wl_block168 ="\r\n\t\t\t\t\t\t\t\t<div id=\"halCity\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block168Bytes = _getBytes( _wl_block168 );

    private static java.lang.String  _wl_block169 =",&nbsp;\r\n\t\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block169Bytes = _getBytes( _wl_block169 );

    private static java.lang.String  _wl_block170 ="\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div id=\"fromCity\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block170Bytes = _getBytes( _wl_block170 );

    private static java.lang.String  _wl_block171 ="\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div> \r\n\t\t\t\t\t\t\t<div id=\"toCity\" style=\"width: 200px; float:left; padding-left:20px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block171Bytes = _getBytes( _wl_block171 );

    private static java.lang.String  _wl_block172 =" \r\n\t\t\t\t\t\t\t<div id=\"toZipPostalCode\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block172Bytes = _getBytes( _wl_block172 );

    private static java.lang.String  _wl_block173 ="</div>\r\n\t\t\t\t\t\t\t<div id=\"fromZipPostalCode\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block173Bytes = _getBytes( _wl_block173 );

    private static java.lang.String  _wl_block174 ="\r\n\t\t\t\t\t\t\t\t<div id=\"halZipPostalCode\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block174Bytes = _getBytes( _wl_block174 );

    private static java.lang.String  _wl_block175 ="\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div id=\"fromZipPostalCode\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block175Bytes = _getBytes( _wl_block175 );

    private static java.lang.String  _wl_block176 ="\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div> \r\n\t\t\t\t\t\t\t<div id=\"toZipPostalCode\" style=\"width: 200px; float:left; padding-left:20px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block176Bytes = _getBytes( _wl_block176 );

    private static java.lang.String  _wl_block177 =" \r\n\t\t\t\t\t\t\t<div id=\"toCountryCode\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block177Bytes = _getBytes( _wl_block177 );

    private static java.lang.String  _wl_block178 ="</div>\r\n\t\t\t\t\t\t\t<div id=\"fromCountryCode\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block178Bytes = _getBytes( _wl_block178 );

    private static java.lang.String  _wl_block179 ="\r\n\t\t\t\t\t\t\t\t<div id=\"halCountryCode\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block179Bytes = _getBytes( _wl_block179 );

    private static java.lang.String  _wl_block180 ="\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<div id=\"fromCountryCode\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block180Bytes = _getBytes( _wl_block180 );

    private static java.lang.String  _wl_block181 =" </div>\r\n\t\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div> \t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<div id=\"toCountryCode\" style=\"width: 200px; float:left; padding-left:20px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block181Bytes = _getBytes( _wl_block181 );

    private static java.lang.String  _wl_block182 ="</div>\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block182Bytes = _getBytes( _wl_block182 );

    private static java.lang.String  _wl_block183 =" \r\n\t\t\t\t\t\t\t<div id=\"toPhoneNumber\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block183Bytes = _getBytes( _wl_block183 );

    private static java.lang.String  _wl_block184 ="&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block184Bytes = _getBytes( _wl_block184 );

    private static java.lang.String  _wl_block185 ="</div>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<div id=\"fromPhoneNumber\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block185Bytes = _getBytes( _wl_block185 );

    private static java.lang.String  _wl_block186 ="</div>\t\r\n\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block186Bytes = _getBytes( _wl_block186 );

    private static java.lang.String  _wl_block187 ="</div>\r\n\t\t\t\t\t\t\t<div id=\"fromPhoneNumber\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block187Bytes = _getBytes( _wl_block187 );

    private static java.lang.String  _wl_block188 ="  </div>\r\n\r\n\t\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div> \r\n\t\t\t\t\t\t\t<div id=\"toPhoneNumber\" style=\"width: 200px; float:left; padding-left:20px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block188Bytes = _getBytes( _wl_block188 );

    private static java.lang.String  _wl_block189 ="</div>\t\t\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block189Bytes = _getBytes( _wl_block189 );

    private static java.lang.String  _wl_block190 =" \r\n\t\t\t\t\t\t\t<div id=\"toTaxIDOREORI\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp; \r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block190Bytes = _getBytes( _wl_block190 );

    private static java.lang.String  _wl_block191 ="</div>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<div id=\"fromTaxIDOREORI\" style=\"width: 200px; float:left;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block191Bytes = _getBytes( _wl_block191 );

    private static java.lang.String  _wl_block192 ="</div>\t \r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block192Bytes = _getBytes( _wl_block192 );

    private static java.lang.String  _wl_block193 ="\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t\t<div>\r\n\t\t\t\t\t\t<div style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block193Bytes = _getBytes( _wl_block193 );

    private static java.lang.String  _wl_block194 =" \r\n\t\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div> \r\n\t\t\t\t\t\t\t<div style=\"\">&nbsp;</div>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block194Bytes = _getBytes( _wl_block194 );

    private static java.lang.String  _wl_block195 ="\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\t\r\n\t\t\t";
    private final static byte[]  _wl_block195Bytes = _getBytes( _wl_block195 );

    private static java.lang.String  _wl_block196 ="\r\n\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t";
    private final static byte[]  _wl_block196Bytes = _getBytes( _wl_block196 );

    private static java.lang.String  _wl_block197 ="\t\t\r\n\t\t\t\t<div id=\"addressArea2\">\r\n\t\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t\t<div id=\"shipTo\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;<b>";
    private final static byte[]  _wl_block197Bytes = _getBytes( _wl_block197 );

    private static java.lang.String  _wl_block198 ="</b></div>\r\n\t\t\t\t\t\t<div id=\"shipFrom\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;<b>";
    private final static byte[]  _wl_block198Bytes = _getBytes( _wl_block198 );

    private static java.lang.String  _wl_block199 ="</b></div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t\t<div id=\"groupName\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block199Bytes = _getBytes( _wl_block199 );

    private static java.lang.String  _wl_block200 ="</div>\r\n\t\t\t\t\t\t<div id=\"fromContactname\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block200Bytes = _getBytes( _wl_block200 );

    private static java.lang.String  _wl_block201 ="</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t\t<div id=\"groupNickName\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block201Bytes = _getBytes( _wl_block201 );

    private static java.lang.String  _wl_block202 ="</div>\r\n\t\t\t\t\t\t<div id=\"fromCompanyName\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block202Bytes = _getBytes( _wl_block202 );

    private static java.lang.String  _wl_block203 ="</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t\t<div id=\"groupDescription\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block203Bytes = _getBytes( _wl_block203 );

    private static java.lang.String  _wl_block204 ="</div>\t\t\r\n\t\t\t\t\t\t<div id=\"fromAddressLine1\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block204Bytes = _getBytes( _wl_block204 );

    private static java.lang.String  _wl_block205 ="</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t\t<div id=\"fromAddressBlank\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;</div>\t\r\n\t\t\t\t\t\t<div id=\"fromAddressLine2\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block205Bytes = _getBytes( _wl_block205 );

    private static java.lang.String  _wl_block206 ="</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t\t<div id=\"fromCountryBlank\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;</div>\r\n\t\t\t\t\t\t<div id=\"fromCountryCode\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block206Bytes = _getBytes( _wl_block206 );

    private static java.lang.String  _wl_block207 ="</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t\t<div id=\"fromPhoneNumberBlank\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;</div>\r\n\t\t\t\t\t\t<div id=\"fromPhoneNumber\" style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block207Bytes = _getBytes( _wl_block207 );

    private static java.lang.String  _wl_block208 ="</div>\t\t\t\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t\t<div style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;</div>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div style=\"width: 200px; float:left; padding-left:10px;\">&nbsp;</div>\t\t\t\t\t\t\t\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\r\n\t\t\t";
    private final static byte[]  _wl_block208Bytes = _getBytes( _wl_block208 );

    private static java.lang.String  _wl_block209 ="\r\n\t\t\t\r\n\t\t\t\t\t\t\r\n\t\t\t<div style=\"clear:both;\"></div>\t\t\t\t\r\n\t\t\t";
    private final static byte[]  _wl_block209Bytes = _getBytes( _wl_block209 );

    private static java.lang.String  _wl_block210 ="\r\n\t\t\t<div id=\"shippingInfoArea1\">\r\n\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t<div id=\"shipinfo1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t<b>";
    private final static byte[]  _wl_block210Bytes = _getBytes( _wl_block210 );

    private static java.lang.String  _wl_block211 ="</b></div>\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block211Bytes = _getBytes( _wl_block211 );

    private static java.lang.String  _wl_block212 =" \r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t\t<div id=\"shipinfo3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t<b>";
    private final static byte[]  _wl_block212Bytes = _getBytes( _wl_block212 );

    private static java.lang.String  _wl_block213 ="</b>\r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block213Bytes = _getBytes( _wl_block213 );

    private static java.lang.String  _wl_block214 ="\r\n\t\t\t\t</div>\r\n\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block214Bytes = _getBytes( _wl_block214 );

    private static java.lang.String  _wl_block215 =" \r\n\t\t\t\t\t\t<div id=\"track1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block215Bytes = _getBytes( _wl_block215 );

    private static java.lang.String  _wl_block216 ="&nbsp;";
    private final static byte[]  _wl_block216Bytes = _getBytes( _wl_block216 );

    private static java.lang.String  _wl_block217 =" \r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block217Bytes = _getBytes( _wl_block217 );

    private static java.lang.String  _wl_block218 ="\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block218Bytes = _getBytes( _wl_block218 );

    private static java.lang.String  _wl_block219 ="</div>\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t\t<div id=\"track3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block219Bytes = _getBytes( _wl_block219 );

    private static java.lang.String  _wl_block220 ="</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block220Bytes = _getBytes( _wl_block220 );

    private static java.lang.String  _wl_block221 ="\r\n\t\t\t\t</div>\r\n\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t   \t";
    private final static byte[]  _wl_block221Bytes = _getBytes( _wl_block221 );

    private static java.lang.String  _wl_block222 ="\r\n\t\t\t\t   \t<div id=\"shipdt1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block222Bytes = _getBytes( _wl_block222 );

    private static java.lang.String  _wl_block223 ="\r\n\t\t\t\t\t</div>\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block223Bytes = _getBytes( _wl_block223 );

    private static java.lang.String  _wl_block224 ="\r\n\t\t\t\t\t\t<div id=\"shipdt1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block224Bytes = _getBytes( _wl_block224 );

    private static java.lang.String  _wl_block225 ="\r\n\t\t\t\t\t\t</div>\t\r\n\t\t\t\t\t    \t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t    ";
    private final static byte[]  _wl_block225Bytes = _getBytes( _wl_block225 );

    private static java.lang.String  _wl_block226 ="\r\n\t\t\t\t\t    <div id=\"shipdt1\" ";
    private final static byte[]  _wl_block226Bytes = _getBytes( _wl_block226 );

    private static java.lang.String  _wl_block227 =" style=\"width: 400px;float:left;padding-left:10px;\" ";
    private final static byte[]  _wl_block227Bytes = _getBytes( _wl_block227 );

    private static java.lang.String  _wl_block228 =" >&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block228Bytes = _getBytes( _wl_block228 );

    private static java.lang.String  _wl_block229 ="\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block229Bytes = _getBytes( _wl_block229 );

    private static java.lang.String  _wl_block230 ="\r\n\t\t\t\t</div>\t\t\t\t\t\r\n\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t<div style=\"width: 672px;\">\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block230Bytes = _getBytes( _wl_block230 );

    private static java.lang.String  _wl_block231 ="\r\n\t\t\t\t\t\t<div id=\"estimate1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block231Bytes = _getBytes( _wl_block231 );

    private static java.lang.String  _wl_block232 ="&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block232Bytes = _getBytes( _wl_block232 );

    private static java.lang.String  _wl_block233 ="\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block233Bytes = _getBytes( _wl_block233 );

    private static java.lang.String  _wl_block234 ="\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block234Bytes = _getBytes( _wl_block234 );

    private static java.lang.String  _wl_block235 ="\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block235Bytes = _getBytes( _wl_block235 );

    private static java.lang.String  _wl_block236 =" \r\n\t\t\t\t\t\t<div id=\"estimate2\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block236Bytes = _getBytes( _wl_block236 );

    private static java.lang.String  _wl_block237 ="\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block237Bytes = _getBytes( _wl_block237 );

    private static java.lang.String  _wl_block238 ="\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block238Bytes = _getBytes( _wl_block238 );

    private static java.lang.String  _wl_block239 ="\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t\t<div id=\"estimate3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block239Bytes = _getBytes( _wl_block239 );

    private static java.lang.String  _wl_block240 ="\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block240Bytes = _getBytes( _wl_block240 );

    private static java.lang.String  _wl_block241 ="\r\n\t\t\t\t</div>\r\n\r\n\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t<div style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block241Bytes = _getBytes( _wl_block241 );

    private static java.lang.String  _wl_block242 =" \r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div> \r\n\t\t\t\t\t\t<div style=\"\">&nbsp;</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block242Bytes = _getBytes( _wl_block242 );

    private static java.lang.String  _wl_block243 ="\r\n\t\t\t\t</div>\t\t\t\t\r\n\t\t\t</div>\t\r\n\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\r\n\t\t\t";
    private final static byte[]  _wl_block243Bytes = _getBytes( _wl_block243 );

    private static java.lang.String  _wl_block244 ="\r\n\t\t\t<div id=\"packageInfoArea1\">\r\n\t\t\t\t<div style=\"width: 672px;\">\t\r\n\t\t\t\t\t<div id=\"packinfo1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t<b>";
    private final static byte[]  _wl_block244Bytes = _getBytes( _wl_block244 );

    private static java.lang.String  _wl_block245 ="</b>\r\n\t\t\t\t\t</div>\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block245Bytes = _getBytes( _wl_block245 );

    private static java.lang.String  _wl_block246 =" \r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t\t<div id=\"packinfo3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t<b>";
    private final static byte[]  _wl_block246Bytes = _getBytes( _wl_block246 );

    private static java.lang.String  _wl_block247 ="</b>\r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block247Bytes = _getBytes( _wl_block247 );

    private static java.lang.String  _wl_block248 ="\r\n\t\t\t\t</div>\t\t\t\t\r\n\t\t\t\t<div style=\"clear:both;\"></div>\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block248Bytes = _getBytes( _wl_block248 );

    private static java.lang.String  _wl_block249 ="\r\n\t\t\t\t\t\t<div style=\"width: 672px;\">\t\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block249Bytes = _getBytes( _wl_block249 );

    private static java.lang.String  _wl_block250 ="\r\n\t\t\t\t\t\t\t<div id=\"returnLabelType1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block250Bytes = _getBytes( _wl_block250 );

    private static java.lang.String  _wl_block251 =":&nbsp;";
    private final static byte[]  _wl_block251Bytes = _getBytes( _wl_block251 );

    private static java.lang.String  _wl_block252 ="\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div id=\"returnEmailAddress1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block252Bytes = _getBytes( _wl_block252 );

    private static java.lang.String  _wl_block253 ="\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block253Bytes = _getBytes( _wl_block253 );

    private static java.lang.String  _wl_block254 ="\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block254Bytes = _getBytes( _wl_block254 );

    private static java.lang.String  _wl_block255 ="\t\t\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block255Bytes = _getBytes( _wl_block255 );

    private static java.lang.String  _wl_block256 ="\r\n\t\t\t\t ";
    private final static byte[]  _wl_block256Bytes = _getBytes( _wl_block256 );

    private static java.lang.String  _wl_block257 ="\r\n\t\t\t\t <div style=\"width: 672px;\">\r\n\t\t\t\t ";
    private final static byte[]  _wl_block257Bytes = _getBytes( _wl_block257 );

    private static java.lang.String  _wl_block258 ="\r\n\t\t\t\t\t<div id=\"pricingOption\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block258Bytes = _getBytes( _wl_block258 );

    private static java.lang.String  _wl_block259 ="\r\n\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t<div id=\"returnLabelType3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block259Bytes = _getBytes( _wl_block259 );

    private static java.lang.String  _wl_block260 ="\r\n\t\t\t\t\t</div>\t\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\t\t\t\t\t\r\n\t\t\t\t\t<div id=\"srvtyp1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block260Bytes = _getBytes( _wl_block260 );

    private static java.lang.String  _wl_block261 ="\r\n\t\t\t\t\t</div>\t\t\r\n\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t<div id=\"pricingOptionReturn\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block261Bytes = _getBytes( _wl_block261 );

    private static java.lang.String  _wl_block262 ="\r\n\t\t\t\t\t</div>\r\n\t\t\t\t";
    private final static byte[]  _wl_block262Bytes = _getBytes( _wl_block262 );

    private static java.lang.String  _wl_block263 ="\t\r\n\t\t\t\t\t<div id=\"srvtyp1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block263Bytes = _getBytes( _wl_block263 );

    private static java.lang.String  _wl_block264 ="\t\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\t\r\n\t\t\t\t\t<div id=\"pkgType1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block264Bytes = _getBytes( _wl_block264 );

    private static java.lang.String  _wl_block265 ="\r\n\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t<div id=\"srvtyp3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block265Bytes = _getBytes( _wl_block265 );

    private static java.lang.String  _wl_block266 ="\r\n\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t</div>\r\n\t\t\t\t";
    private final static byte[]  _wl_block266Bytes = _getBytes( _wl_block266 );

    private static java.lang.String  _wl_block267 ="\t\t\r\n\t\t\t\t<div style=\"clear:both;\"></div>\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block267Bytes = _getBytes( _wl_block267 );

    private static java.lang.String  _wl_block268 ="\r\n\t\t\t\t\t<div style=\"width: 672px;\">\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block268Bytes = _getBytes( _wl_block268 );

    private static java.lang.String  _wl_block269 ="\r\n\t\t\t\t\t\t\t<div id=\"pricingOption\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block269Bytes = _getBytes( _wl_block269 );

    private static java.lang.String  _wl_block270 ="\r\n\t\t\t\t\t\t\t</div>\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block270Bytes = _getBytes( _wl_block270 );

    private static java.lang.String  _wl_block271 ="\r\n\t\t\t\t\t\t<div id=\"srvtyp1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block271Bytes = _getBytes( _wl_block271 );

    private static java.lang.String  _wl_block272 ="\r\n\t\t\t\t\t\t</div>\t\r\n\t\t\t\t\t</div>\t\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block272Bytes = _getBytes( _wl_block272 );

    private static java.lang.String  _wl_block273 ="\r\n\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block273Bytes = _getBytes( _wl_block273 );

    private static java.lang.String  _wl_block274 ="\r\n\t\t\t\t\t\t<div id=\"pkgType1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block274Bytes = _getBytes( _wl_block274 );

    private static java.lang.String  _wl_block275 ="\r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block275Bytes = _getBytes( _wl_block275 );

    private static java.lang.String  _wl_block276 ="\t\t\t\t\t\t \r\n\t\t\t\t\t\t<div id=\"noPkg1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block276Bytes = _getBytes( _wl_block276 );

    private static java.lang.String  _wl_block277 =" \r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block277Bytes = _getBytes( _wl_block277 );

    private static java.lang.String  _wl_block278 ="\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div id=\"pkgType3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block278Bytes = _getBytes( _wl_block278 );

    private static java.lang.String  _wl_block279 ="\r\n\t\t\t\t\t\t\t<div id=\"noPkg1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block279Bytes = _getBytes( _wl_block279 );

    private static java.lang.String  _wl_block280 =" \r\n\t\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block280Bytes = _getBytes( _wl_block280 );

    private static java.lang.String  _wl_block281 ="\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block281Bytes = _getBytes( _wl_block281 );

    private static java.lang.String  _wl_block282 ="\r\n\t\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block282Bytes = _getBytes( _wl_block282 );

    private static java.lang.String  _wl_block283 ="\t\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block283Bytes = _getBytes( _wl_block283 );

    private static java.lang.String  _wl_block284 ="\r\n\t\t\t\t\t\t\t<div id=\"noPkg11\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block284Bytes = _getBytes( _wl_block284 );

    private static java.lang.String  _wl_block285 ="\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t\t\t\t<div id=\"noPkg1\"2 style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block285Bytes = _getBytes( _wl_block285 );

    private static java.lang.String  _wl_block286 ="\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div style=\"clear:both;\"></div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<div id=\"noPkg13\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block286Bytes = _getBytes( _wl_block286 );

    private static java.lang.String  _wl_block287 ="\r\n\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block287Bytes = _getBytes( _wl_block287 );

    private static java.lang.String  _wl_block288 ="\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block288Bytes = _getBytes( _wl_block288 );

    private static java.lang.String  _wl_block289 =" \r\n\t\t\t\t\t\t<div id=\"totwgt1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block289Bytes = _getBytes( _wl_block289 );

    private static java.lang.String  _wl_block290 =" \r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t\t<div id=\"nopkg3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block290Bytes = _getBytes( _wl_block290 );

    private static java.lang.String  _wl_block291 ="\r\n\t\t\t\t</div>\t\r\n\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t";
    private final static byte[]  _wl_block291Bytes = _getBytes( _wl_block291 );

    private static java.lang.String  _wl_block292 ="\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block292Bytes = _getBytes( _wl_block292 );

    private static java.lang.String  _wl_block293 =" \r\n\t\t\t\t\t\t<div style=\"width: 672px;\">\t\r\n\t\t\t\t\t\t\t<div id=\"rma1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;&nbsp;";
    private final static byte[]  _wl_block293Bytes = _getBytes( _wl_block293 );

    private static java.lang.String  _wl_block294 ="</div>\r\n\t\t\t\t\t\t</div>\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block294Bytes = _getBytes( _wl_block294 );

    private static java.lang.String  _wl_block295 ="\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block295Bytes = _getBytes( _wl_block295 );

    private static java.lang.String  _wl_block296 ="\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block296Bytes = _getBytes( _wl_block296 );

    private static java.lang.String  _wl_block297 =" \t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t<div style=\"width: 672px;\">\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block297Bytes = _getBytes( _wl_block297 );

    private static java.lang.String  _wl_block298 ="\r\n\t\t\t\t\t\t<div id=\"delvalue1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;&nbsp;";
    private final static byte[]  _wl_block298Bytes = _getBytes( _wl_block298 );

    private static java.lang.String  _wl_block299 ="\r\n\t\t\t\t\t\t</div>\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block299Bytes = _getBytes( _wl_block299 );

    private static java.lang.String  _wl_block300 ="\t\t\t\t\r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t\t<div id=\"rma3\" style=\"\">&nbsp;&nbsp;";
    private final static byte[]  _wl_block300Bytes = _getBytes( _wl_block300 );

    private static java.lang.String  _wl_block301 ="</div>\t\t\t\t\t\t\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t";
    private final static byte[]  _wl_block301Bytes = _getBytes( _wl_block301 );

    private static java.lang.String  _wl_block302 ="\r\n\t\t\t\t<div style=\"width: 672px;\">\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block302Bytes = _getBytes( _wl_block302 );

    private static java.lang.String  _wl_block303 ="\t\t\t\t\r\n\t\t\t\t\t\t<div id=\"totwgt1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block303Bytes = _getBytes( _wl_block303 );

    private static java.lang.String  _wl_block304 ="\r\n\t\t\t\t\t\t\t&nbsp; ";
    private final static byte[]  _wl_block304Bytes = _getBytes( _wl_block304 );

    private static java.lang.String  _wl_block305 =" \r\n\t\t\t\t\t\t<div id=\"spcSev1\" style=\"width: 395px;float:left;padding-left:15px;\">\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block305Bytes = _getBytes( _wl_block305 );

    private static java.lang.String  _wl_block306 ="\r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div style=\"width:1px; height:24px; background:#000; float:left;\"></div>\t\r\n\t\t\t\t\t\t<div id=\"totwgt3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block306Bytes = _getBytes( _wl_block306 );

    private static java.lang.String  _wl_block307 ="\r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block307Bytes = _getBytes( _wl_block307 );

    private static java.lang.String  _wl_block308 ="\t\t\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block308Bytes = _getBytes( _wl_block308 );

    private static java.lang.String  _wl_block309 ="\r\n\t\t\t\t\t\t<div id=\"delvalue1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block309Bytes = _getBytes( _wl_block309 );

    private static java.lang.String  _wl_block310 ="&nbsp; ";
    private final static byte[]  _wl_block310Bytes = _getBytes( _wl_block310 );

    private static java.lang.String  _wl_block311 ="\r\n\t\t\t\t\t\t</div>\t\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block311Bytes = _getBytes( _wl_block311 );

    private static java.lang.String  _wl_block312 ="\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block312Bytes = _getBytes( _wl_block312 );

    private static java.lang.String  _wl_block313 =" \r\n\t\t\t\t\t\t<div id=\"pickupStatus1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block313Bytes = _getBytes( _wl_block313 );

    private static java.lang.String  _wl_block314 ="\r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block314Bytes = _getBytes( _wl_block314 );

    private static java.lang.String  _wl_block315 ="\t\t\r\n\t\t\t\t\t\t<div id=\"delvalue3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block315Bytes = _getBytes( _wl_block315 );

    private static java.lang.String  _wl_block316 ="\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block316Bytes = _getBytes( _wl_block316 );

    private static java.lang.String  _wl_block317 ="\r\n\t\t\t\t</div>\r\n\t\t\t\t";
    private final static byte[]  _wl_block317Bytes = _getBytes( _wl_block317 );

    private static java.lang.String  _wl_block318 ="\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block318Bytes = _getBytes( _wl_block318 );

    private static java.lang.String  _wl_block319 =" \r\n\t\t\t\t\t\t\t<div id=\"pickupDate1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block319Bytes = _getBytes( _wl_block319 );

    private static java.lang.String  _wl_block320 ="\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block320Bytes = _getBytes( _wl_block320 );

    private static java.lang.String  _wl_block321 ="\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\r\n\t\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block321Bytes = _getBytes( _wl_block321 );

    private static java.lang.String  _wl_block322 =" \r\n\t\t\t\t\t\t\t<div id=\"confirmationNo1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block322Bytes = _getBytes( _wl_block322 );

    private static java.lang.String  _wl_block323 ="\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block323Bytes = _getBytes( _wl_block323 );

    private static java.lang.String  _wl_block324 ="\r\n\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block324Bytes = _getBytes( _wl_block324 );

    private static java.lang.String  _wl_block325 =" \r\n\t\t\t\t\t\t\t<div id=\"confirmationNo1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block325Bytes = _getBytes( _wl_block325 );

    private static java.lang.String  _wl_block326 ="\r\n\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\t\r\n\t\t\t\t\t\t\t<div id=\"confirmationNo3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block326Bytes = _getBytes( _wl_block326 );

    private static java.lang.String  _wl_block327 =":&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block327Bytes = _getBytes( _wl_block327 );

    private static java.lang.String  _wl_block328 ="\r\n\t\t\t\t\t</div>\t\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block328Bytes = _getBytes( _wl_block328 );

    private static java.lang.String  _wl_block329 ="\r\n\t\t\t\t\r\n\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block329Bytes = _getBytes( _wl_block329 );

    private static java.lang.String  _wl_block330 ="\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block330Bytes = _getBytes( _wl_block330 );

    private static java.lang.String  _wl_block331 =" \r\n\t\t\t\t\t\t<div id=\"spcSev1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;&nbsp;</div>\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\t\r\n\t\t\t\t\t\t<div id=\"spcSev3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block331Bytes = _getBytes( _wl_block331 );

    private static java.lang.String  _wl_block332 =" \r\n\t\t\t\t\t\t<div id=\"pickupStatus1\" style=\"width: 500px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block332Bytes = _getBytes( _wl_block332 );

    private static java.lang.String  _wl_block333 ="\t\t\t\t\r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block333Bytes = _getBytes( _wl_block333 );

    private static java.lang.String  _wl_block334 =" \r\n\t\t\t\t\t\t<div id=\"pickupStatus1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;&nbsp;</div>\r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t\t<div id=\"pickupStatus3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block334Bytes = _getBytes( _wl_block334 );

    private static java.lang.String  _wl_block335 =":&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block335Bytes = _getBytes( _wl_block335 );

    private static java.lang.String  _wl_block336 ="\t\t\t\t\t\r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block336Bytes = _getBytes( _wl_block336 );

    private static java.lang.String  _wl_block337 ="\r\n\t\t\t\t\t\r\n\t\t\t\t</div>\t\t\t\t\r\n\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t<div style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block337Bytes = _getBytes( _wl_block337 );

    private static java.lang.String  _wl_block338 ="\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\r\n\t\t\t";
    private final static byte[]  _wl_block338Bytes = _getBytes( _wl_block338 );

    private static java.lang.String  _wl_block339 ="\r\n\t\t\t<div id=\"billingInfoArea1\">\t\r\n\t\t\t\t<div style=\"width: 672px;\">\t\t\t\r\n\t\t\t\t\t<div id=\"billinfo1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t<b>";
    private final static byte[]  _wl_block339Bytes = _getBytes( _wl_block339 );

    private static java.lang.String  _wl_block340 =" \r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t\t<div id=\"billinfo3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t<b>";
    private final static byte[]  _wl_block340Bytes = _getBytes( _wl_block340 );

    private static java.lang.String  _wl_block341 ="\r\n\t\t\t\t</div>\r\n\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block341Bytes = _getBytes( _wl_block341 );

    private static java.lang.String  _wl_block342 =" \r\n\t\t\t\t\t\t<div id=\"billTrans1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block342Bytes = _getBytes( _wl_block342 );

    private static java.lang.String  _wl_block343 =" \r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t\t<div id=\"billTrans3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block343Bytes = _getBytes( _wl_block343 );

    private static java.lang.String  _wl_block344 ="\r\n\t\t\t\t\t\r\n\t\t\t\t</div>\r\n\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block344Bytes = _getBytes( _wl_block344 );

    private static java.lang.String  _wl_block345 =" \r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block345Bytes = _getBytes( _wl_block345 );

    private static java.lang.String  _wl_block346 =" \r\n\t\t\t\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t\t\t\t<div id=\"billDutiesTaxes1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block346Bytes = _getBytes( _wl_block346 );

    private static java.lang.String  _wl_block347 ="\r\n\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block347Bytes = _getBytes( _wl_block347 );

    private static java.lang.String  _wl_block348 ="\r\n\t\t\t\t\t\t<div style=\"width: 672px;\">\t \r\n\t\t\t\t\t\t\t<div id=\"billDutiesTaxes1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block348Bytes = _getBytes( _wl_block348 );

    private static java.lang.String  _wl_block349 ="\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t\t\t<div id=\"billDutiesTaxes3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block349Bytes = _getBytes( _wl_block349 );

    private static java.lang.String  _wl_block350 =" \r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block350Bytes = _getBytes( _wl_block350 );

    private static java.lang.String  _wl_block351 ="\t\r\n\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t";
    private final static byte[]  _wl_block351Bytes = _getBytes( _wl_block351 );

    private static java.lang.String  _wl_block352 ="\r\n\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block352Bytes = _getBytes( _wl_block352 );

    private static java.lang.String  _wl_block353 =" \r\n\t\t\t\t\t\t<div id=\"ref1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block353Bytes = _getBytes( _wl_block353 );

    private static java.lang.String  _wl_block354 =":&nbsp;\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block354Bytes = _getBytes( _wl_block354 );

    private static java.lang.String  _wl_block355 ="\r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t\t<div id=\"ref3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block355Bytes = _getBytes( _wl_block355 );

    private static java.lang.String  _wl_block356 ="\r\n\t\t\t\t</div>\r\n\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t";
    private final static byte[]  _wl_block356Bytes = _getBytes( _wl_block356 );

    private static java.lang.String  _wl_block357 =" \r\n\t\t\t\t\t\t<div id=\"poNum1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block357Bytes = _getBytes( _wl_block357 );

    private static java.lang.String  _wl_block358 ="\r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t\t<div id=\"poNum3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block358Bytes = _getBytes( _wl_block358 );

    private static java.lang.String  _wl_block359 =" \r\n\t\t\t\t\t\t<div id=\"invoice1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block359Bytes = _getBytes( _wl_block359 );

    private static java.lang.String  _wl_block360 ="\r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t\t<div id=\"invoice3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block360Bytes = _getBytes( _wl_block360 );

    private static java.lang.String  _wl_block361 =" \r\n\t\t\t\t\t\t<div id=\"deptno1\" style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block361Bytes = _getBytes( _wl_block361 );

    private static java.lang.String  _wl_block362 ="\r\n\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div style=\"width:1px; height:20px; background:#000; float:left;\"></div>\r\n\t\t\t\t\t\t<div id=\"deptno3\" style=\"\">&nbsp;\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block362Bytes = _getBytes( _wl_block362 );

    private static java.lang.String  _wl_block363 ="\r\n\t\t\t\t</div>\r\n\t\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t\t<div style=\"width: 672px;\">\r\n\t\t\t\t\t<div style=\"width: 400px;float:left;padding-left:10px;\">&nbsp;</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block363Bytes = _getBytes( _wl_block363 );

    private static java.lang.String  _wl_block364 ="\r\n\t\t\t\t</div>\r\n\t\t\t</div>\t\r\n\t\t\t<div style=\"clear:both;\"></div>\r\n\t\t\t";
    private final static byte[]  _wl_block364Bytes = _getBytes( _wl_block364 );

    private static java.lang.String  _wl_block365 ="\t\r\n\t\t\t<br><br>\t\t\r\n\t\t\t<div id=\"image2\" style=\"float:left;margin-left:13px;margin-right:13px;\">\t\t\r\n\t\t\t\t<div><input type=\"text\" name=\"thankYou\" value=\'";
    private final static byte[]  _wl_block365Bytes = _getBytes( _wl_block365 );

    private static java.lang.String  _wl_block366 ="\' readonly \r\n\t\t\t\t\tstyle=\"background: #cccccc;border: 1px solid #ccc;\tcolor: #660099;\tfont-family:Arial,Helvetica,Verdana,sans-serif;\tfont-size:12px;\tfont-weight: bold;height: 30px;\tpadding-top: 5px;padding-bottom: 5px;padding-left: 10px; width: 672px;\" maxlength=\"100\" id=\"thankYou\" size=\"70\" aria-labelledby=\"thankYou\"></div>\r\n\t\t\t</div>\t\r\n\t\t\t<div style=\"clear:both;\"></div>\t\t\t\t\t\r\n\t\t\t<div style=\"float:left;margin-left:13px;margin-right:13px;\">\r\n\t\t\t\t<div><strong>";
    private final static byte[]  _wl_block366Bytes = _getBytes( _wl_block366 );

    private static java.lang.String  _wl_block367 ="</strong></div>\r\n\t\t\t\t<div style=\"font-family:Arial;\tfont-size:6pt;\">";
    private final static byte[]  _wl_block367Bytes = _getBytes( _wl_block367 );

    private static java.lang.String  _wl_block368 ="</div>\r\n\t\t\t\t<div style=\"font-family:Arial;\tfont-size:6pt;\">";
    private final static byte[]  _wl_block368Bytes = _getBytes( _wl_block368 );

    private static java.lang.String  _wl_block369 ="</div>\r\n\t\t\t</div>\t\t\r\n\t";
    private final static byte[]  _wl_block369Bytes = _getBytes( _wl_block369 );

    private static java.lang.String  _wl_block370 ="\r\n    \t";
    private final static byte[]  _wl_block370Bytes = _getBytes( _wl_block370 );

    private static java.lang.String  _wl_block371 ="\r\n\t";
    private final static byte[]  _wl_block371Bytes = _getBytes( _wl_block371 );

    private static java.lang.String  _wl_block372 ="  \r\n    \r\n</div>\r\n";
    private final static byte[]  _wl_block372Bytes = _getBytes( _wl_block372 );

    private static java.lang.String  _wl_block373 ="\r\n</body>\r\n";
    private final static byte[]  _wl_block373Bytes = _getBytes( _wl_block373 );

    static private weblogic.jsp.internal.jsp.JspFunctionMapper _jspx_fnmap = weblogic.jsp.internal.jsp.JspFunctionMapper.getInstance();

    protected void _jspInit() {
        _jsp_expressionInterceptor = weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.getExpressionInterceptor(getServletConfig());
    }

    public void _jspService(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) 
    throws javax.servlet.ServletException, java.io.IOException {

        javax.servlet.ServletConfig config = getServletConfig();
        javax.servlet.ServletContext application = config.getServletContext();
        javax.servlet.jsp.tagext.JspTag _activeTag = null;
        java.lang.Object page = this;
        javax.servlet.jsp.PageContext pageContext = javax.servlet.jsp.JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true , 8192 , true );
        response.setHeader("Content-Type", "text/html; charset=utf-8");
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter)out;
        _bw.setInitCharacterEncoding(_WL_ORIGINAL_ENCODING, _WL_ENCODED_BYTES_OK);
        javax.servlet.jsp.JspWriter _originalOut = out;
        javax.servlet.http.HttpSession session = request.getSession( true );
        try {;
            response.setContentType("text/html; charset=utf-8");
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block2Bytes, _wl_block2);
 
	UserProfileAdapter userProfileAdapter = WebUtils.getUserProfileAdapter(request);
	String contextPath = request.getContextPath(); 
	String isWSSRequired = (String)request.getParameter("WSSReq");  

            _bw.write(_wl_block3Bytes, _wl_block3);
             org.apache.struts.taglib.html.HtmlTag __tag0 = null ;
            int __result__tag0 = 0 ;

            if (__tag0 == null ){
                __tag0 = new  org.apache.struts.taglib.html.HtmlTag ();
                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag0);
            }
            __tag0.setPageContext(pageContext);
            __tag0.setParent(null);
            _activeTag=__tag0;
            __result__tag0 = __tag0.doStartTag();

            if (__result__tag0!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag0== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.html.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                }
                do {
                    _bw.write(_wl_block4Bytes, _wl_block4);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block1Bytes, _wl_block1);

	
	String webCachePolicy = ApplicationPropertyLoader.getInstance().getProperty("WEBCache");
	String webCacheTimeStamp = ApplicationPropertyLoader.getInstance().getProperty("WEBCacheTimeStamp");
	webCacheTimeStamp = ((WebConstants.Y.equals(webCachePolicy) && !webCacheTimeStamp.startsWith("@")) ? "_"+webCacheTimeStamp : "");
	if(webCacheTimeStamp==null){
		webCacheTimeStamp="";
	}
	//System.out.println("webCacheTimeStamp= " + webCacheTimeStamp);
	LoggerFactory.getLogger().debug(
	        "webCacheTimeStamp= " + webCacheTimeStamp);

                    _bw.write(_wl_block5Bytes, _wl_block5);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block6Bytes, _wl_block6);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block1Bytes, _wl_block1);

	MessageResources resources = (MessageResources) application.getAttribute(Globals.MESSAGES_KEY);
	MessageResources references = (MessageResources) application.getAttribute("ref");
	WebShipEnvironment webShipEnvironment = WebUtils.getWebShipEnvironment(request);
	Locale locale = webShipEnvironment.getLocale();
	String localLanguage = locale.getLanguage();
	String helpText = resources.getMessage(locale, "text.help");
	String editText = resources.getMessage(locale, "text.edit");
	String hideText = resources.getMessage(locale, "text.hide");
	String closeText = resources.getMessage(locale, "text.close");
	String enterOrSelectText = resources.getMessage(locale, "text.enterOrSelect");
	String selectText = resources.getMessage(locale, "text.pleaseSelect");
	String originCountryCd = webShipEnvironment.getOriginCountry();
	boolean isSPEnabled = webShipEnvironment.isSmartPostAllowedForShipping();
	boolean isReturnsSPEnabled = webShipEnvironment.isSmartPostAllowedForReturns();
	ShipActionForm form = (ShipActionForm) request.getAttribute("shipActionForm");
	if(form.getBillingData()!=null && form.getBillingData().getTransportationChargesBillingAccountInfo()!=null){
		form.getBillingData().getTransportationChargesBillingAccountInfo().truncateAccountNumber();
	}
	if(form.getBillingData()!=null && form.getBillingData().getDutiesAndTaxesBillingAccountInfo()!=null){
		form.getBillingData().getDutiesAndTaxesBillingAccountInfo().truncateAccountNumber();
	}
	//create flow context - cast it as appropriate in page jsps (returns.jsp, outboundship.jsp etc)	
	ShipPageType currentShipPageType = (ShipPageType) request.getAttribute(WebConstants.CURRENT_PAGE_TYPE);
	ShipFlowContext flowContext = null;
	ShipActionForm outboundForm = (ShipActionForm)request.getAttribute(CompressDecompressFilter.DECOMPRESSED_OUTBOUND_SHIP_ACTION_FORM);
	if(ShipPageType.RETURNS_PAGE == currentShipPageType || ShipPageType.RETURNS_PRODUCTS_PAGE == currentShipPageType || (ShipPageType.FREIGHT_SHIPMENT_DETAILS ==  currentShipPageType && form.isReturnShipmentBoolean())) {
	flowContext = new ReturnsFlowContext(outboundForm, form, request, response, resources, currentShipPageType);
	} else {
	flowContext = new ShipFlowContext(form, request, response, resources, currentShipPageType);
	flowContext.setOutboundActionForm(outboundForm);
	}
	DisplayRules displayRules = flowContext.getDisplayRules();
	boolean isInternational = displayRules.isInternationalShipment();
	
	boolean isImportShipment = form.isImportShipmentBoolean();
	
	boolean isReturnShipment = form.isReturnShipmentBoolean();
	boolean isReturnShipmentAllowed = flowContext.isReturnShipmentAllowed();
	boolean isReturnOnly = form.isReturnOnlyBoolean();
	boolean isReturnsEnabled = displayRules.isReturnsEnabled(isReturnShipmentAllowed);
	boolean isReturnEnabled = WebUtils.getUserProfileAdapter(request).isReturnPrivilegeEnabled();
	boolean isReturnOnlyPrivilegeEnabled = WebUtils.getUserProfileAdapter(request).isReturnOnlyPrivilegeEnabled();
	
	// Jan19CL - ITG 171804 - Allow an Admin to restrict shipping to the Central Address Book
	// Revering ITG-hardcoding flags to false

	boolean isAddressBookRestricted = false;
	boolean isClearAllFields = form.getToData().isClearAllFields();
	boolean isFromCabRecordSelected = form.getFromData().isCabRecordSelected();
	boolean isToCabRecordSelected = form.getToData().isCabRecordSelected();
	boolean cabOutboundFlag = isAddressBookRestricted && isToCabRecordSelected 
							&& !isClearAllFields && !(isReturnShipment || isImportShipment);
	boolean cabReturnFlag = isAddressBookRestricted && isFromCabRecordSelected 
							&& !isClearAllFields && (isReturnShipment || isImportShipment);
	
	// Jan19CL - ITG 171800 - Allow Option for Billing Defaults not to change
	// Jan19CL - ITG 171800 - Reverting ITG- hardcoding flags to false

	boolean isBillToRestrictedFlag = false;
	boolean isDutyBillToRestrictedFlag = false;
			
	boolean billingRestrictedFlag = isBillToRestrictedFlag || isDutyBillToRestrictedFlag;
	
	SpecialServicesPrivilegesVO splServicesPrivilege = webShipEnvironment.getPrivileges().getSpecialServicesPrivileges(isImportShipment?false:isReturnShipment);
	CompleteShipData completeShipData = form.getCompleteShipData();
	String dynamicModuleNumber = completeShipData.getDynamicModuleNumber();
	boolean isPackageContentsAvailable = displayRules.isPackageContentsAvailable();
	SSData ssData = form.getSsData();
	PSDData psdData = form.getPsdData();
	String fromCountryCode = form.getFromData().getAddressData().getCountryCode();
	Boolean displaySmartPostAccountAlert = form.getPsdDisplay().getDisplaySmartPostAlert(); 
	boolean displaySmartPostAccAlert = displaySmartPostAccountAlert.booleanValue();
	String toCountryCode = form.getToData().getAddressData().getCountryCode();
	String pickupOption = form.getPickupDropoffData().getPickupTypeCode();
	if (fromCountryCode != null)
		fromCountryCode = fromCountryCode.trim();
	if (toCountryCode != null)
		toCountryCode = toCountryCode.trim();
	ContactData toData = form.getToData();
	String toCountryName = form.getToDisplay().getCountryName();
	String fromCountryName = form.getFromDisplay().getCountryName();
	String psdServiceType = psdData.getServiceType();
	String totalWeight = psdData.getTotalWeight();
	boolean isIntraEUShipment = CountryUtils.isIntraEuropeanUnion(fromCountryCode,toCountryCode);
	boolean arePackagesIdentical = psdData.arePackagesIdenticalBoolean(); 
	int numOfPkgs;
	try {
		numOfPkgs = Integer.parseInt(psdData.getNumberOfPackages());
	} catch (NumberFormatException e) {
		numOfPkgs = 0;
	} 
	String numberOfPkgs = psdData.getNumberOfPackages();
	if (numberOfPkgs == null || numberOfPkgs.isEmpty() || numberOfPkgs.equals("0") || numberOfPkgs.equals("1")) {
		totalWeight = psdData.getMpsRowDataList(0).getWeight();
	}
	String totalCarriageValue = psdData.getTotalCarriageValue();

	boolean isUSDomestic = displayRules.isUSDomesticShipment();
	boolean isCADomestic = displayRules.isCanadaDomesticShipment();
	boolean isUAEDomestic = displayRules.isUAEDomesticShipment();
	boolean isIndiaDomestic = displayRules.isIndiaDomesticShipment();
    boolean isDomestic = displayRules.isDomesticShipment();
    boolean isUKDomestic = displayRules.isUKDomesticShipment();
    boolean isDomesticAllowed = displayRules.isDomesticAllowed();
    boolean isDomesticReturnsSupported = displayRules.isReturnsDomesticAllowed(fromCountryCode, isReturnShipmentAllowed, WebUtils.getUserProfileAdapter(request).getActiveAccount());
    boolean isDomesticShippingSupported = displayRules.isDomesticShippingSupported(fromCountryCode, WebUtils.getUserProfileAdapter(request).getActiveAccount());
    boolean isSameServiceCategoryPackageRefreshNeeded = displayRules.isSameServiceCategoryPackageRefreshRequired();//Mostly for GDE countries 
    
	boolean isProducts = false;
	if (!form.getCommodityData().isDocumentShippingBoolean())
		isProducts = true;
	// Consult the master copy billing account off of the user profile to avoid any modificataion (account number truncation)
	// of the one off of the ShipActionForm that would prevent the user profile adapter from being unable to link the selected
	// account to an AccountVO
	boolean isShowAlcoholService = false;
	if(!WebUtils.isNumber(form.getBillingData().getSelectedBillTransportationIndex())) {
		isShowAlcoholService = displayRules.isShowAlcoholService(WebUtils.getUserProfileAdapter(request), 
				((BillingAccountInfo) WebUtils.getUserProfileAdapter(request).getBillingAccountInfoList().get(0)),
				flowContext.isImportShipment()?false:flowContext.isReturnShipment()); // default account
	}else {
		isShowAlcoholService = displayRules.isShowAlcoholService(WebUtils.getUserProfileAdapter(request), 
				((BillingAccountInfo) WebUtils.getUserProfileAdapter(request).getBillingAccountInfoList().get(Integer.parseInt(form.getBillingData().getSelectedBillTransportationIndex())-1)),
				flowContext.isImportShipment()?false:flowContext.isReturnShipment());
	}
	
	boolean saturdayDelivery = ssData.isSaturdayDeliveryBoolean();
	boolean cod = ssData.isCODBoolean();	
	boolean dia = ssData.isDIABoolean();
	boolean isHal = ssData.isHALBoolean();
	boolean isAlcohol = ssData.getAlcohol().booleanValue();
	String nonStandardPack = psdData.getNonStandardPack();
	String signatureType = ssData.getSignatureType();
	boolean isResidential = toData.getAddressData().isResidentialBoolean();
	boolean dangerousGoods = ssData.isDangerousGoodsBoolean();
	boolean isOrmd = ssData.isORMDBoolean();
	boolean isSqe = ssData.isSmallQuantityExceptionBoolean();
	boolean isLiBattery = ssData.isLithiumBatteryBoolean();
	boolean isGdryIce = ssData.isGDryIceBoolean();
	boolean isHazmat = ssData.isHazMatBoolean();
	boolean isInsidePickup = ssData.isInsidePickup();
	boolean isInsideDelivery = ssData.isInsideDelivery();
	boolean holidayDelivery = ssData.isHolidayDeliveryBoolean();
	boolean specialDelivery = ssData.isSpecialDeliveryBoolean();
	boolean sundayDelivery = ssData.isSundayDeliveryBoolean();
	String wtUnitOfMeasure = psdData.getWeightUnitOfMeasure();
	boolean isFice = ssData.isFice();
	boolean isItar = ssData.isItar();
	String itarExemptionNumber = ssData.getItarExemptionNumber();
	boolean isICE = ssData.isDryIceBoolean();
	boolean isBrokerSelect = ssData.isBrokerSelect();
	boolean isEveningHomeDelivery = ssData.isEveningHomeDelivery();
	boolean isDateCertainHomeDelivery = ssData.isDateCertainHomeDelivery();
	boolean isAppointmentHomeDelivery = ssData.isAppointmentHomeDelivery(); 
	boolean isSaveAsDefaultDiaChbxChecked = ssData.getDiaData().isSaveDefaultDiaAddressCheckboxBoolean();
	boolean isSaveAsDefaultCodChbxChecked =  ssData.getCodData().isSaveDefaultCodAddressCheckboxBoolean();
	String dangerousGoodsType="";
	List mpsRDL = psdData.getMpsRowDataList();
	if (mpsRDL!=null) {
		MPSRowData rowData = null;
		for (Iterator iter=mpsRDL.iterator(); iter.hasNext();) { 
	rowData = (MPSRowData) iter.next();
	if (rowData != null && !WebUtils.isEmptyString(rowData.getDangerousGoodsType()) ) {
		dangerousGoodsType = rowData.getDangerousGoodsType();
		break;
	}
		}
	}
	PackagePreferencesVO preferencesVO = webShipEnvironment.getPreferences();
	//Temp
	boolean documentProfileEnabled = preferencesVO.isDocumentProfileDisplayEnabled();
	PackageReferencePreferencesVO refPref = preferencesVO.getReferencePreferences();
	boolean isYourReferenceReminderEnabled = refPref.getYourReference().isReminder();
	boolean isPoEnabled = refPref.getPurchaseOrder().isReminder();
	boolean isInvoiceEnabled = refPref.getInvoiceNumber().isReminder();
	boolean isDeptEnabled = refPref.getDepartmentNumber().isReminder();
	boolean isAlwaysDisplayAdditionalCustomsDoc = preferencesVO.isAlwaysDisplayAdditionalCustomsDoc();
	boolean defaultNotificationMode = webShipEnvironment.getPreferences().isAlwaysShowFusionExpanded();
	boolean isAlwaysShowAdditionalRecipients = preferencesVO.isAlwaysShowAdditionalRecipents();
	boolean isAlwaysShowFusionMessage = preferencesVO.isAlwaysShowFusionMessage();
	String carriageCurrencyCode = psdData.getDeclaredValueCurrencyCode();
	String weightUnitOfMeasure = psdData.getWeightUnitOfMeasure();
	String weightUnitOfMeasureDescription = (weightUnitOfMeasure.equals("LBS")) ? resources.getMessage(locale,
	        "text.lbs") : resources.getMessage(locale, "text.kgs");
	boolean isSedAllowed = form.getSedDisplay().isSedAllowedBoolean();
	boolean isCAExportAllowed = form.getCaExportDisplay().isCAExportAllowedBoolean();
	boolean isAlwaysShowSpecialServicesExpanded = preferencesVO.isAlwaysShowSpecialServicesExpanded();
	//boolean isSaturdayDeliveryOptionsReminder = preferencesVO.isSaturdayDeliveryOptionsReminder();
	boolean isAllowSaturdayReturnDelivery = preferencesVO.isAllowSaturdayReturnDelivery(); //July '14
	boolean isGround = ServiceTypeAdapter.getServiceTypeAdapter(psdServiceType).isGround();
	boolean isFreight = ServiceTypeAdapter.getServiceTypeAdapter(psdServiceType).isFreight();
	boolean isSmartPost = ServiceTypeAdapter.getServiceTypeAdapter(psdServiceType).isSmartPost();
	boolean isLargeSmartPostShipper = webShipEnvironment.isLargeSmartPostShipper();
	boolean isDeliveryConfirmationRequired = webShipEnvironment.isDeliveryConfirmationRequired(); 
	boolean isShipmentFromWSED = form.isShipmentFromWSEDBoolean();
	boolean isDisplayInsightOptions = preferencesVO.isDisplayInsightOptions();
	String b13aOption = preferencesVO.getDefaultB13ADeclarationTypeCode();
	String b13aExemptionNumber = preferencesVO.getB13AExemptionNumber();
	//Defect #53577: Replacing - boolean isGroupShip = form.getToDisplay().isGroupShip();
	Boolean bObject = Boolean.valueOf(form.getGroupShip());
	boolean isGroupShip = bObject.booleanValue();
	
	// to determine if the from country code is EMEA country code
	boolean isFromEMEA = CountryUtils.isEmea(fromCountryCode);
	
	String purchaseOrderValidationTypeCode = form.getBillingData().getReferenceData().getPurchaseOrderValidationTypeCode();
	String departmentNumberPasskeyValidationTypeCode = form.getBillingData().getReferenceData().getDepartmentNumberValidationTypeCode();	         
	String invoiceNumberPasskeyValidationTypeCode = form.getBillingData().getReferenceData().getInvoiceNumberValidationTypeCode();
	String YourReferencePasskeyValidationTypeCode = form.getBillingData().getReferenceData().getYourReferenceValidationTypeCode();
	boolean isSenderPickup = preferencesVO.getDefaultSenderFusionNotificationVO().isPickupNotification();
	boolean isOther1Pickup = preferencesVO.getDefaultOther1FusionNotificationVO().isPickupNotification();
	boolean isOther2Pickup = preferencesVO.getDefaultOther2FusionNotificationVO().isPickupNotification();
	
	String createCommercialInvoiceProforma = "";
	if (CustomsDocumentType.GENERIC_COMMERCIAL_INVOICE.equals(preferencesVO.getDefaultDocumentCreationType())) {
		createCommercialInvoiceProforma = WebConstants.COMMERCIAL_INVOICE;
	} else if (CustomsDocumentType.GENERIC_PROFORMA_INVOICE.equals(preferencesVO.getDefaultDocumentCreationType())) {
		createCommercialInvoiceProforma = WebConstants.PROFORMA_INVOICE;
	}
 	
	boolean isSenderShip = preferencesVO.getDefaultSenderFusionNotificationVO().isShipmentNotification();
	boolean isSenderException = preferencesVO.getDefaultSenderFusionNotificationVO().isExceptionNotification();
	boolean isSenderDelivery = preferencesVO.getDefaultSenderFusionNotificationVO().isDeliveryNotification();
	boolean isSenderEstimatedDelivery = preferencesVO.getDefaultSenderFusionNotificationVO().isEstimatedDeliveryNotification();
	boolean isOther1Ship = preferencesVO.getDefaultOther1FusionNotificationVO().isShipmentNotification();
	boolean isOther1Exception = preferencesVO.getDefaultOther1FusionNotificationVO().isExceptionNotification();
	boolean isOther1Delivery = preferencesVO.getDefaultOther1FusionNotificationVO().isDeliveryNotification();
	boolean isOther1EstimatedDelivery = preferencesVO.getDefaultOther1FusionNotificationVO().isEstimatedDeliveryNotification();
	boolean isOther2Ship = preferencesVO.getDefaultOther2FusionNotificationVO().isShipmentNotification();
	boolean isOther2Exception = preferencesVO.getDefaultOther2FusionNotificationVO().isExceptionNotification();
	boolean isOther2Delivery = preferencesVO.getDefaultOther2FusionNotificationVO().isDeliveryNotification();
	boolean isOther2EstimatedDelivery = preferencesVO.getDefaultOther2FusionNotificationVO().isEstimatedDeliveryNotification();
	boolean isNRIBIEnabled = webShipEnvironment.isNRIBIEnabled();
	boolean isNRIBIMarkedAsDisabled = webShipEnvironment.isNRIBIMarkedAsDisabled();
	String nRIBIFlag = webShipEnvironment.getNRIBIFlag();
	boolean isBrokerChecked = preferencesVO.isAlwaysUseBrokerSelectOption();
	
	NotificationType nt = preferencesVO.getDefaultSenderFusionNotificationVO().getFormatType();
	String formatType = "";
	if(nt!=null){ 
		 formatType = nt.getCode();
	}
	
	String senderLanguage = preferencesVO.getDefaultSenderFusionNotificationVO()
	        .getFusionNotificationLanguageCountryCode();
	String other1Language = preferencesVO.getDefaultOther1FusionNotificationVO()
	        .getFusionNotificationLanguageCountryCode();
	String other2Language = preferencesVO.getDefaultOther2FusionNotificationVO()
	        .getFusionNotificationLanguageCountryCode();

	boolean isNonLoggedInUser = webShipEnvironment.getUserIdentity().isNonLoggedInUser();
	boolean isPasskeyUser = webShipEnvironment.getUserIdentity().isPasskeyUser();
	boolean isFclUser = webShipEnvironment.isFclUser();
	boolean isCompanyLetterheadImage = preferencesVO.getApplicationPreferences().isCompanyLetterheadUsed();
	boolean isSignatureImage = preferencesVO.getApplicationPreferences().isUploadedSignatureUsed();
	String extraNbrCopies = "" + preferencesVO.getNumberOfExtraCopies();
	String shipFromProfile = form.getCompleteShipData().getShipFromShipmentProfile();
	String shipFromPending = form.getCompleteShipData().getShipFromPendingShipment();
	String dataFromDatabase = ((WebConstants.Y.equals(shipFromProfile) || WebConstants.Y.equals(shipFromPending)) ? WebConstants.Y : WebConstants.N);

	boolean isUSOrCAOrigin = false;
	if(CountryUtils.isUSOrigin(webShipEnvironment.getOriginCountry()) || CountryUtils.isCAOrigin(webShipEnvironment.getOriginCountry()))
		isUSOrCAOrigin = true;	
	String defaultPTCode = PickupDropoffUtil.getDefaultPickupType(preferencesVO).getCode();
	
	String browserType = request.getHeader ( "User-Agent" );
	boolean isSafari = false;
	boolean isOpera = false;
	boolean isFirefox = false;
	boolean isChrome = false;
	boolean isIE = false;
	boolean isSafariOnMAC = false;
	int OSIndex = 0;
	int browserIndex = 0;
	if (browserType != null){
	    browserIndex = browserType.indexOf("Safari");
	    if (browserIndex >= 0){
	    	isSafari = true;
	    }
	    browserIndex = browserType.indexOf("Opera");
	    if (browserIndex >= 0) {
	        isOpera = true;
	    }
	    browserIndex = browserType.indexOf("Firefox");
	    if (browserIndex >= 0) {
	        isFirefox = true;
	    }
	    browserIndex = browserType.indexOf("Chrome");
	    if (browserIndex >= 0) {
	        isChrome = true;
	    }
	    browserIndex = browserType.indexOf("MSIE");
	    if (browserIndex >= 0) {
	        isIE = true;
	    }
	    OSIndex = browserType.indexOf("Mac");
	    if(isSafari && (OSIndex > 0) && (!(browserType.indexOf("Chrome") > 0))){
	    	isSafariOnMAC = true;
	    }
	}
	boolean postalCheckEnabledForUSandCA = displayRules.isCust03PostalCheckEnabledForUSandCA();
	boolean postalCheckEnabledForROW = displayRules.isCust03PostalCheckEnabledForROW();
		
	boolean isPostalCheckEnabled = false;
	if((postalCheckEnabledForUSandCA && ( toCountryCode.equalsIgnoreCase("US") || toCountryCode.equalsIgnoreCase("CA") ))  ||
				(postalCheckEnabledForROW &&  !( toCountryCode.equalsIgnoreCase("US") || toCountryCode.equalsIgnoreCase("CA")))){
				isPostalCheckEnabled = true;
	}
	
	//To Show TOggler or Not - MANUAL Address Checking
	boolean isAddressCheckEnabled =  displayRules.isCust03AddressCheckEnabled(toCountryCode);
	
	//To Do AUTO Address Checking 
	boolean isMandatoryAddressCheckEnabled = displayRules.isCust03MandatoryAddressCheckEnabled(fromCountryCode,toCountryCode);
	boolean isPickupDropOffSuppressed = ( form.isReturnShipmentBoolean() && isInternational ) && !( isLargeSmartPostShipper && isSmartPost);
	
	String meterNumber = WebUtils.getUserProfileAdapter(request).getMeterNumber();

	String gticSuggestedDocumentsURL  = ApplicationPropertyLoader.getInstance().getProperty("GTIC_SUGGESTED_DOCS_URL");
	boolean isIRDEmailLableShipmentAllowed = displayRules.isIRDEmailLableShipmentAllowed();
	
	boolean isImportShipmentAllowed = displayRules.isImportShipmentAllowed();

	// ITG 149885: LAC Columbia Postal Code Project, July '14
	boolean isAvailableCityListRefreshEnabled = DecoupleState.INSTANCE.isAvailableCityListRefreshEnabled();
	boolean isColumbiaPostalCodeMockEnabled = DecoupleState.INSTANCE.isColumbiaPostalCodeMockEnabled();
	boolean isReasonForReturn = preferencesVO.isDisplayReturnReason(); 
	//boolean isReasonForReturn =true;
	
	HTMLEncoder htmlEncoderAltNames = new HTMLEncoder();
	
	// Jan 2015 CL - ITG-155772 and ID-1257810
	String yourReferenceLabel = htmlEncoderAltNames.encode(WebUtils.getRenameReferencesObject(request,resources).getYourReferenceLabel());
	String poNumberLabel = htmlEncoderAltNames.encode(WebUtils.getRenameReferencesObject(request,resources).getPoNumberLabel());
	String invoiceNumberLabel = htmlEncoderAltNames.encode(WebUtils.getRenameReferencesObject(request,resources).getInvoiceNumberLabel());
	String deptNumberLabel = htmlEncoderAltNames.encode(WebUtils.getRenameReferencesObject(request,resources).getDeptNumberLabel());
	boolean isGDE4UKEnabled = DecoupleState.INSTANCE.isGDE4UKEnabled();
	boolean isSMARRTZEnabled = DecoupleState.INSTANCE.isSMARRTZEnabled();
	boolean isSMARRTZAlertEnabled = DecoupleState.INSTANCE.isSMARRTZAlertEnabled();
	boolean isLACSouthMiamiEnabled= DecoupleState.INSTANCE.isLACSouthMiamiEnabled();
	boolean isNIAGARAEnabled = DecoupleState.INSTANCE.isNIAGARAEnabled();
	// Jan 2016 CL - ITG-169590 and ID-1485584
	boolean isEDNForSmartPostEnabled = DecoupleState.INSTANCE
	        .isEDNForSmartPostEnabled();
	//Jul 2016 CL - ITG 159201 ETD Enhancements - ID 1485809
	boolean isETDDGHazmatEnabled = DecoupleState.INSTANCE.isETDDGHazmatEnabled();
	boolean isETDEnhancementEnabled = DecoupleState.INSTANCE.isETDEnhancementEnabled();
	// Jul 2018 CL - ITG-180129 OnSite2.3 - ID:112428
	boolean isOnsitePackageHandlingRestrictionEnabled = DecoupleState.INSTANCE.isPackageHandlingRestrictionEnabled();
	//Jan 2017 CL - 177016 Sec II Lithium Battery Identification - 1537132
	//Jan 2017 CL - 177016 Sec II Lithium Battery Identification - 1537132
	boolean isExpressLithiumBatteryAllowed=DecoupleState.INSTANCE.isExpressLithiumBatteryAllowed();
	// JUL17CL - ITG 176640 - Niagara 2.0 Phase 2
    boolean isNIAGARAPhase2Enabled = DecoupleState.INSTANCE.isNIAGARAPhase2Enabled();
    boolean isNonETDLabelAndIntraEUEnabled = DecoupleState.INSTANCE.isNonETDLabelAndIntraEUEnabled();
    // Jan18CL - ITG 163016 Freight 2020
	boolean isFreight2020Enabled=DecoupleState.INSTANCE.isFreight2020Enabled();
  	String freight2020MaxTotalHandlingUnits = DecoupleState.INSTANCE.getMaxTotalHandlingUnits();

                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block7Bytes, _wl_block7);
                    _bw.write(_wl_block7Bytes, _wl_block7);
                    _bw.write(_wl_block7Bytes, _wl_block7);
                    _bw.write(_wl_block7Bytes, _wl_block7);
                    _bw.write(_wl_block7Bytes, _wl_block7);
                    _bw.write(_wl_block8Bytes, _wl_block8);
                    _bw.write(_wl_block7Bytes, _wl_block7);
                    _bw.write(_wl_block7Bytes, _wl_block7);
                    _bw.write(_wl_block7Bytes, _wl_block7);
                    _bw.write(_wl_block9Bytes, _wl_block9);
                    _bw.write(_wl_block10Bytes, _wl_block10);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( isSPEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block11Bytes, _wl_block11);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( isReturnsSPEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block12Bytes, _wl_block12);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( displayRules.isRegionalServiceTypes() ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block13Bytes, _wl_block13);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( displayRules.isRegionalPackageTypes() ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block14Bytes, _wl_block14);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isDomestic), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block15Bytes, _wl_block15);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isDomesticAllowed ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block16Bytes, _wl_block16);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isDomesticReturnsSupported ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block17Bytes, _wl_block17);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isDomesticShippingSupported), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block18Bytes, _wl_block18);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSameServiceCategoryPackageRefreshNeeded), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block19Bytes, _wl_block19);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isShowAlcoholService ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block20Bytes, _wl_block20);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(locale.toString()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block21Bytes, _wl_block21);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPackageContentsAvailable ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block22Bytes, _wl_block22);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isReturnOnly ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block23Bytes, _wl_block23);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFromEMEA), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block24Bytes, _wl_block24);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(originCountryCd), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block25Bytes, _wl_block25);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag1 = null ;
                    int __result__tag1 = 0 ;

                    if (__tag1 == null ){
                        __tag1 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag1);
                    }
                    __tag1.setPageContext(pageContext);
                    __tag1.setParent(__tag0);
                    __tag1.setValue(fromCountryCode
);
                    _activeTag=__tag1;
                    __result__tag1 = __tag1.doStartTag();

                    if (__result__tag1!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag1== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag1.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag1);
                        return;
                    }
                    _activeTag=__tag1.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag1);
                    __tag1.release();
                    _bw.write(_wl_block26Bytes, _wl_block26);
                    _bw.write(_wl_block27Bytes, _wl_block27);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtSelect}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block28Bytes, _wl_block28);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtAddressResults}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block29Bytes, _wl_block29);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtCommercial}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block30Bytes, _wl_block30);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtResidential}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block31Bytes, _wl_block31);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtUseAddressEntered}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block32Bytes, _wl_block32);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${enteredAddressRolloverHelp}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block33Bytes, _wl_block33);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isReturnEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block34Bytes, _wl_block34);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSaveAsDefaultDiaChbxChecked), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block35Bytes, _wl_block35);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSaveAsDefaultCodChbxChecked), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block36Bytes, _wl_block36);

                    if (_jsp__tag2(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block37Bytes, _wl_block37);

                    if (_jsp__tag3(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block38Bytes, _wl_block38);

                    if (_jsp__tag4(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block39Bytes, _wl_block39);

                    if (_jsp__tag5(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block40Bytes, _wl_block40);

                    if (_jsp__tag6(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block41Bytes, _wl_block41);

                    if (_jsp__tag7(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block42Bytes, _wl_block42);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isCustomsModuleAvailable()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block43Bytes, _wl_block43);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isPackageContentsAvailable()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block44Bytes, _wl_block44);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isUSDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block45Bytes, _wl_block45);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isCanadaDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block46Bytes, _wl_block46);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isIndiaDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block47Bytes, _wl_block47);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isUAEDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block48Bytes, _wl_block48);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block49Bytes, _wl_block49);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isUKDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block50Bytes, _wl_block50);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isDomesticAllowed()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block51Bytes, _wl_block51);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtGroundSpecificSS}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block52Bytes, _wl_block52);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtGroundSpecificSSRollOverHelp}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block53Bytes, _wl_block53);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtHomeDeliverySpecificSS}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block54Bytes, _wl_block54);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtHomeDeliverySpecificSSRolloverHelp}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block55Bytes, _wl_block55);

                    if (_jsp__tag8(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block56Bytes, _wl_block56);

                    if (_jsp__tag9(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block57Bytes, _wl_block57);

                    if (_jsp__tag10(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block58Bytes, _wl_block58);

                    if (_jsp__tag11(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block59Bytes, _wl_block59);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPostalCheckEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block60Bytes, _wl_block60);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isAddressCheckEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block61Bytes, _wl_block61);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isMandatoryAddressCheckEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block62Bytes, _wl_block62);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(meterNumber), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block63Bytes, _wl_block63);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(gticSuggestedDocumentsURL), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block64Bytes, _wl_block64);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isIRDEmailLableShipmentAllowed), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block65Bytes, _wl_block65);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isImportShipmentAllowed), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block66Bytes, _wl_block66);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isAvailableCityListRefreshEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block67Bytes, _wl_block67);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isGDE4UKEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block68Bytes, _wl_block68);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSMARRTZEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block69Bytes, _wl_block69);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSMARRTZAlertEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block70Bytes, _wl_block70);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isNIAGARAEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block71Bytes, _wl_block71);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isColumbiaPostalCodeMockEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block72Bytes, _wl_block72);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(DecoupleState.INSTANCE.isIRDAPACShippingAllowed()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block73Bytes, _wl_block73);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isEDNForSmartPostEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block74Bytes, _wl_block74);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isLACSouthMiamiEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block75Bytes, _wl_block75);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isETDDGHazmatEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block76Bytes, _wl_block76);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isETDEnhancementEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block77Bytes, _wl_block77);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isOnsitePackageHandlingRestrictionEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block78Bytes, _wl_block78);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isExpressLithiumBatteryAllowed ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block79Bytes, _wl_block79);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isBrokerSelect), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block80Bytes, _wl_block80);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(form.getSsData().isIntlGrdConsolidationAcctBoolean()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block81Bytes, _wl_block81);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(form.getSsData().isExcludeFromConsolidationBoolean()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block82Bytes, _wl_block82);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isNIAGARAPhase2Enabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block83Bytes, _wl_block83);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isNonETDLabelAndIntraEUEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block84Bytes, _wl_block84);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(JSONSimulator.toJSONString(form.getPsdDisplay())), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block85Bytes, _wl_block85);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020Enabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block86Bytes, _wl_block86);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(freight2020MaxTotalHandlingUnits), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block87Bytes, _wl_block87);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isAddressBookRestricted), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block88Bytes, _wl_block88);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isClearAllFields), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block89Bytes, _wl_block89);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(cabOutboundFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block90Bytes, _wl_block90);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(cabReturnFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block91Bytes, _wl_block91);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isReturnShipment || isImportShipment ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block92Bytes, _wl_block92);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isBillToRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block93Bytes, _wl_block93);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isDutyBillToRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block94Bytes, _wl_block94);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(billingRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block95Bytes, _wl_block95);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSafariOnMAC), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block96Bytes, _wl_block96);
                    _bw.write(_wl_block97Bytes, _wl_block97);

                    if (_jsp__tag12(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block98Bytes, _wl_block98);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block99Bytes, _wl_block99);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block100Bytes, _wl_block100);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block101Bytes, _wl_block101);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block102Bytes, _wl_block102);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block103Bytes, _wl_block103);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block104Bytes, _wl_block104);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag13 = null ;
                    int __result__tag13 = 0 ;

                    if (__tag13 == null ){
                        __tag13 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag13);
                    }
                    __tag13.setPageContext(pageContext);
                    __tag13.setParent(__tag0);
                    __tag13.setValue(request.getParameter("needIFrameLoadStatus")
);
                    _activeTag=__tag13;
                    __result__tag13 = __tag13.doStartTag();

                    if (__result__tag13!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag13== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag13.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag13);
                        return;
                    }
                    _activeTag=__tag13.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag13);
                    __tag13.release();
                    _bw.write(_wl_block105Bytes, _wl_block105);

       	ShipActionForm shipActionForm = (ShipActionForm)request.getAttribute("shipActionForm");  
    	ShipActionForm outboundShipActionForm = (ShipActionForm)request.getAttribute("outboundShipActionForm");
    	PSDData psdDataOutbound = null;
    	SSData ssDataOutbound = null;
    	PickupDropoffData pickupDropoffDataOutbound = null;
    	BillingData billingDataOutbound = null;
    	AddressData toAddressDataOutbound = null;    	
    	AddressData fromAddressDataOutbound = null;
    	GroupShipData groupShipDataOutbound = null;
    	LabelDisplay labelDisplayOutbound = null;
    	LabelData labelDataOutbound = null;
    	RatingData ratingDataOutbound = null;
    	ReturnOptionsData returnOptionsData = shipActionForm.getReturnOptionsData();;
    	
    	//PSDData psdData = shipActionForm.getPsdData();
    	//SSData ssData = shipActionForm.getSsData();
    	PickupDropoffData pickUpDropOffData = shipActionForm.getPickupDropoffData();
    	BillingData billingData = shipActionForm.getBillingData();
    	AddressData toAddressData = shipActionForm.getToData().getAddressData();  
    	AddressData fromAddressData = shipActionForm.getFromData().getAddressData();
    	LabelDisplay labelDisplay = shipActionForm.getLabelDisplay();
    	LabelData labelData = shipActionForm.getLabelData();
    	String isShipmentProfile = form.getCompleteShipData().getReviewShipmentProfilesFlg();
    	
    	String nonStandardPackagingOutbound = "";
    	String totalCarriageValueOutbound = "";
    	String specialServicesOutbound = "";
    	
    	String billTransToOutbound = "";
    	String billDutiesAndTaxesToOutbound = "";
    	String trackingNumbersOutbound = "";
    	String noOfPackagesOutbound = "";
    	String nonStandardPackaging = psdData.getNonStandardPack();    	
    	//String totalCarriageValue = psdData.getTotalCarriageValue();
    	//Defect Fix - 425559
    	String returnLabelTypeForShipmentReceipt = psdData.getReturnLabelTypeForShipmentReceipt();
    	if(returnLabelTypeForShipmentReceipt.equals(WebConstants.RETURN_LABEL_TYPE_PRINT_FOR_SHIPMENT_RECEIPT)){
			returnLabelTypeForShipmentReceipt =  resources.getMessage(locale,"text.returnLabelType.print");
    	}else if(returnLabelTypeForShipmentReceipt.equals(WebConstants.RETURN_LABEL_TYPE_EMAIL_FOR_SHIPMENT_RECEIPT)){
    		returnLabelTypeForShipmentReceipt =  resources.getMessage(locale,"text.returnLabelType.emaillabel");
    	}
    	String specialServices = "";    	
    	String pickUpDropOffType = "";
    	String specialServiceType ="";
    	String pickUpDropOffTypeCode = "";  
    	
    	specialServiceType = ssData.getCodDiaServiceType();
    	pickUpDropOffTypeCode = pickUpDropOffData.getPickupTypeCode();   
    	String pickupConfNumber = labelData.getPickupConfirmationNumber(); 

		if ("2".equals(pickUpDropOffTypeCode)) {
			if (pickupConfNumber!=null && pickupConfNumber.trim().length() > 0)
				pickUpDropOffType = resources.getMessage(locale,"text.pickupConfNumber") + ":" + pickupConfNumber;
			else 
				pickUpDropOffType = resources.getMessage(locale,"text.label.pickUpSchedule");
		} else if ("3".equals(pickUpDropOffTypeCode) || "5".equals(pickUpDropOffTypeCode)) {
	    	pickUpDropOffType = resources.getMessage(locale,"pickup.dropoff.info");
		} else if ("1".equals(pickUpDropOffTypeCode)) {
			if (isFromEMEA) {
				pickUpDropOffType = resources.getMessage(locale,"pickup.useAlreadyScheduled.info.EMEA");
			} else {
				pickUpDropOffType = resources.getMessage(locale,"pickup.useAlreadyScheduled.info");
			}	
		}			
    	BillingTypeAdapter billTransToAdapter = billingData.getTransportationChargesBillingAccountInfo().getBillingTypeAdapter();
		String billTransTo = "";
    	if(billTransToAdapter != null){
    		//Get resource file for billTransTo - Translation issue
    		if (billTransToAdapter.isRecipient()){
    			billTransTo = resources.getMessage(locale,"billingModule.payTypeRecipient");
    		}else if (billTransToAdapter.isThirdParty()){
    			billTransTo = resources.getMessage(locale,"billingModule.payTypeThirdParty");
    		}else if (billTransToAdapter.isCollect()){
    			billTransTo = resources.getMessage(locale,"billingModule.payTypeCollect");
    		}else {
    			billTransTo = (billingData.getTransportationChargesBillingAccountInfo()!= null)? billingData.getTransportationChargesBillingAccountInfo().getAccountDisplayName() : "";	
    		}
    	}
    	BillingTypeAdapter billDTAdapter = billingData.getDutiesAndTaxesBillingAccountInfo().getBillingTypeAdapter();
   		String billDutiesAndTaxesTo = "";
		if(billDTAdapter != null){
	    	//Get resource file for billDutiesAndTaxesTo - Translation issue
	    	if (billDTAdapter.isRecipient()){
	    		billDutiesAndTaxesTo = resources.getMessage(locale,"billingModule.payTypeRecipient");
	    	}else if (billDTAdapter.isThirdParty()){
	    		billDutiesAndTaxesTo = resources.getMessage(locale,"billingModule.payTypeThirdParty");
	    	}else if (billDTAdapter.isCollect()){
	    		billDutiesAndTaxesTo = resources.getMessage(locale,"billingModule.payTypeCollect");
	    	} else {
	    		billDutiesAndTaxesTo = (billingData.getDutiesAndTaxesBillingAccountInfo() != null) ? billingData.getDutiesAndTaxesBillingAccountInfo().getAccountDisplayName() : "";
    		}
    	}
    	String trackingNumbers = "";  
    	String noOfPackages = "";    	
    	//String totalWeight = "";
    	String totalWeightOutbound = "";
    	String declaredValue = "";
    	String declaredValueOutbound = "";
    	String decimalWeight = "";
    	String decimalCarriageValue = "";
    	String noOfSkids = "";
    	String totalNoOfPieces = "";
    	String bookingConfNumber = "";
    	String packageTypeDescription = "";
    	String serviceTypeDescription = "";
    	  	
    	List noOfPackagesList = new ArrayList();
		boolean isSmartPostShipment = false;
		boolean isOutboundSmartPostShipment=false; 
		
		String toCompanyNameData = null;
		String fromCompanyNameData = null;
		//C3PO July13
		boolean isFedExOneRateShippingEnabled = displayRules.isFedExOneRateShippingEnabled(WebUtils.getUserProfileAdapter(request));
		String pricingOptionValue = WebConstants.EMPTY_STRING;
		String outboundPricingOptionValue = WebConstants.EMPTY_STRING;
		String outBoundWeightUnitOfMeasure = WebConstants.EMPTY_STRING;
		if(psdData.isFedExPricingOptionAllowed()){
			pricingOptionValue = psdData.isFedExOneRate() ? resources.getMessage(locale, WebConstants.TEXT_FEDEX_ONE_RATE) : resources.getMessage(locale, WebConstants.TEXT_FEDEX_STANDARD_RATE);
		}
    	if (psdData != null) {
    		noOfPackagesList = psdData.getMpsRowDataList();	    	
    		isSmartPostShipment = psdData.getServiceTypeAdapter().isSmartPost();  
    		
	    	if (psdData.isMpsandPackagesNonIdentical()) {
	    		int noOfPackagesInt = 0;
	    		int totalPiecesNr = 0;
	    		for (int k=1; k<noOfPackagesList.size(); k++) {
	    			if (((MPSRowData)noOfPackagesList.get(k)).getQuantity() != null && !(((MPSRowData)noOfPackagesList.get(k)).getQuantity().equals(""))) {
	    				noOfPackagesInt = noOfPackagesInt + Integer.parseInt(((MPSRowData)noOfPackagesList.get(k)).getQuantity());
	    			}	
	            	if (isFreight) {
		    			if (!(WebUtils.isEmptyString(((MPSRowData)noOfPackagesList.get(k)).getTotalPiecesPerSkid()))
		    					&& !(WebUtils.isEmptyString(((MPSRowData)noOfPackagesList.get(k)).getQuantity()))) {
		    				totalPiecesNr = totalPiecesNr + (Integer.parseInt(((MPSRowData)noOfPackagesList.get(k)).getTotalPiecesPerSkid()) * (Integer.parseInt(((MPSRowData)noOfPackagesList.get(k)).getQuantity())));
			    		}	    		
	            	}
		    	}
		    	noOfPackages = String.valueOf(noOfPackagesInt);
	        	if (isFreight) {
		    		totalNoOfPieces = String.valueOf(totalPiecesNr);
		    	}
	    	} else {
	    		noOfPackages = psdData.getNumberOfPackages();
				if (isFreight & psdData.getMpsRowDataList()!=null && psdData.getMpsRowDataList().size()>0) {
					//For SPS - read the total pieces per skid
					MPSRowData mpsRowData = (MPSRowData)psdData.getMpsRowDataList().get(0);
		    		totalNoOfPieces = mpsRowData.getTotalPiecesPerSkid();
		    	}	    		  
	    	}
	    	packageTypeDescription = psdData.getPackageTypeDescription(locale, resources, displayRules);
	    	serviceTypeDescription = psdData.getServiceTypeDescription(locale, resources, displayRules);
	    	//UNIT OF MEASURE
	    	if ("".equals(psdData.getWeightUnitOfMeasure()) || null == psdData.getWeightUnitOfMeasure()) {
	    		if (toAddressData.getCountryCode().equals (fromAddressData.getCountryCode()) && toAddressData.getCountryCode().equals(CountryConstants.UNITEDSTATES_COUNTRY_CODE))
	    			psdData.setWeightUnitOfMeasure(WebConstants.DEFAULT_WEIGHT_OF_MEASURE_LBS);
	    		else if (toAddressData.getCountryCode().equals (fromAddressData.getCountryCode()) && toAddressData.getCountryCode().equals(CountryConstants.CANADA_COUNTRY_CODE))
	    			psdData.setWeightUnitOfMeasure(WebConstants.DEFAULT_WEIGHT_OF_MEASURE_KGS);
	    	}
	    	
	    	//TOTAL WEIGHT
	    	if(psdData.isFedExOneRate()){
	    		totalWeight	= WebConstants.EMPTY_STRING;
			}else if (null != psdData.getTotalWeight() && (!psdData.getTotalWeight().equals(""))) {
		    		totalWeight = psdData.getTotalWeight();
		    		if (totalWeight.indexOf(".") != -1) {
		    			decimalWeight = totalWeight.substring((totalWeight.indexOf(".")+1), totalWeight.length());
		    			if (decimalWeight.equals("0") || decimalWeight.equals("00")) {
		    				totalWeight = totalWeight.substring(0,totalWeight.indexOf("."));	    			
		    			}
		    		}	    		
	    		}
	    	//DECLARED VALUE
	    	if (null != totalCarriageValue && (!totalCarriageValue.equals(""))) {
	    		if (totalCarriageValue.indexOf(".") != -1) {
	    			decimalCarriageValue = totalCarriageValue.substring((totalCarriageValue.indexOf(".")+1), totalCarriageValue.length());
	    			if (decimalCarriageValue.equals("0") || decimalCarriageValue.equals("00")) {
	    				totalCarriageValue = totalCarriageValue.substring(0,totalCarriageValue.indexOf("."))+".00";	    			
	    			}
	    		}
	    		totalCarriageValue = WebUtils.getTwoDecimalPlaceValueAsString(totalCarriageValue, 2);	
	    	}
    	}
    	
    		if(toAddressData!=null && toAddressData.getCompanyName() != null){
    			toCompanyNameData = toAddressData.getCompanyName().trim();
   			}
	        if (toCompanyNameData == null || WebConstants.ENTER_OR_SELECT.equalsIgnoreCase(toCompanyNameData)) {
		    toCompanyNameData = "";
	        }
	        
	        if(fromAddressData!= null && fromAddressData.getCompanyName() != null){
	            fromCompanyNameData = fromAddressData.getCompanyName().trim();
	        }
	        if (fromCompanyNameData == null || WebConstants.ENTER_OR_SELECT.equalsIgnoreCase(fromCompanyNameData)) {
	        fromCompanyNameData = "";
	        }
	        
    	if (!toAddressData.getResidential().equals("false") && toAddressData.getResidential() != null && !ssData.isHALBoolean()) {
    		specialServices = specialServices + ssData.getSpecialServices(locale, resources);
    		if(specialServices.length() > 0) {
    			specialServices = specialServices + ", ";
    		}
    		specialServices = specialServices + resources.getMessage(locale,"text.toResidential");
    	} else {
    	       if(CountryConstants.INDIA_COUNTRY_CODE.equalsIgnoreCase(locale.getCountry())){
    	            specialServices = specialServices + ssData.getSpecialServices(locale, resources);  
    	       }
    	       else{
    	       specialServices = ssData.getSpecialServices(locale, resources);
    	       }    		
    	}      
    	
	    if ("cod".equals(specialServiceType)) {		
	    	if (specialServices.length() > 0) {
    			specialServices = specialServices + ", ";
    		}
				specialServices = specialServices + resources.getMessage(locale,"text.label.COD");
		} else if ("codDia".equals(specialServiceType)) {
			if (specialServices.length() > 0) {
    			specialServices = specialServices + ", ";
    		}
	    	specialServices = specialServices + resources.getMessage(locale,"text.label.codDia");
		} else if ("dia".equals(specialServiceType)) {
			if (specialServices.length() > 0) {
    			specialServices = specialServices + ", ";
    		}
		     specialServices = specialServices + resources.getMessage(locale,"text.label.DIA");
		}  

    	if (nonStandardPackaging != null && !nonStandardPackaging.equals("")) {
    		if (specialServices.length() > 0) {
    			specialServices = specialServices + ", ";
    		}
    		specialServices = specialServices + nonStandardPackaging;
    	}
    	
    	//Tracking Numbers 
		if (labelDisplay.getIsGroupShipment().equals(AppConstants.YES)){
			//Note: Returns doesnt have group shipment
    		for (int i=0; i<labelDisplay.getLabelDataList().size(); i++) {
	    		trackingNumbers = trackingNumbers + ((LabelData)labelDisplay.getLabelDataList().get(i)).getTrackingNumber() + ", ";
	    	}
	    	trackingNumbers = trackingNumbers.substring(0, trackingNumbers.lastIndexOf(","));
    	} else if (labelData.getMpsShipment().equals(AppConstants.YES) && (!labelDisplay.isMobileShipment())) {
   			trackingNumbers = ((LabelData)labelDisplay.getLabelDataList().get(0)).getMasterTrackingNumber(); // might need to add code for pending shipments where there can be more than one MPS shipments.
    		//If its a outbound + returns , the above line reads the outbound tracking numbers. 
    		//	and returns tracking numbers are read seperately .  
    	} else if((!labelDisplay.isMobileShipment())){
    		trackingNumbers = ((LabelData)labelDisplay.getLabelDataList().get(0)).getTrackingNumber();
    	}else if(labelDisplay.isMobileShipment()){ 
    			LabelValueBean tmpLblData = (LabelValueBean)labelDisplay.getMobileConfirmationTrackingNumbers().get(0);
    			trackingNumbers = tmpLblData.getValue(); 
    	}
    	    	   	
    	if (isFreight) {
        	noOfSkids = noOfPackages;
        	if (totalNoOfPieces.equals("")) { //If its not already read.
        		totalNoOfPieces = psdData.getTotalPiecesOnSkids();
        	}
        	bookingConfNumber = psdData.getBookingConfirmationNumber();    	       		
    	}
				
    	String outboundNetChargeAmountWithCurrencyCode = "";
    	if (outboundShipActionForm != null) {
    		psdDataOutbound = outboundShipActionForm.getPsdData();
    		ssDataOutbound = outboundShipActionForm.getSsData();
    		pickupDropoffDataOutbound = outboundShipActionForm.getPickupDropoffData();
    		billingDataOutbound = outboundShipActionForm.getBillingData();
    		toAddressDataOutbound = outboundShipActionForm.getToData().getAddressData();
    		fromAddressDataOutbound = outboundShipActionForm.getFromData().getAddressData();
    		groupShipDataOutbound = outboundShipActionForm.getGroupShipData();
    		labelDisplayOutbound = outboundShipActionForm.getLabelDisplay();
    		labelDataOutbound = outboundShipActionForm.getLabelData();
    		ratingDataOutbound = outboundShipActionForm.getRatingData();
    		
    		
    		nonStandardPackagingOutbound = psdDataOutbound.getNonStandardPack();
    		totalCarriageValueOutbound = psdDataOutbound.getTotalCarriageValue();
    		isOutboundSmartPostShipment = psdDataOutbound.getServiceTypeAdapter().isSmartPost();
    		
    		BillingTypeAdapter billTTOutboundAdapter = billingDataOutbound.getTransportationChargesBillingAccountInfo().getBillingTypeAdapter();
    		billTransToOutbound = "";
    		//C3PO July 13
    		if(psdDataOutbound.isFedExPricingOptionAllowed()){
    			outboundPricingOptionValue = psdDataOutbound.isFedExOneRate() ? resources.getMessage(locale, WebConstants.TEXT_FEDEX_ONE_RATE): resources.getMessage(locale, WebConstants.TEXT_FEDEX_STANDARD_RATE);
			}
			
    		if(billTTOutboundAdapter != null) {
	    		//Get resource file for billTransToOutbound - Translation issue
	    		if (billTTOutboundAdapter.isRecipient()){
	    			billTransToOutbound = resources.getMessage(locale,"text.emailNotificationRecipient");
	        	}else if (billTTOutboundAdapter.isThirdParty()){
	        		billTransToOutbound = resources.getMessage(locale,"billingModule.payTypeThirdParty");
	        	}else if (billTTOutboundAdapter.isCollect()){
	        		billTransToOutbound = resources.getMessage(locale,"billingModule.payTypeCollect");
	        	}else{
	        		billTransToOutbound =  (billingDataOutbound.getTransportationChargesBillingAccountInfo() != null) ? billingDataOutbound.getTransportationChargesBillingAccountInfo().getAccountDisplayName() : "";	
	        	}
    		}	
    		BillingTypeAdapter billDTOutboundAdapter = billingDataOutbound.getDutiesAndTaxesBillingAccountInfo().getBillingTypeAdapter();
    		billDutiesAndTaxesToOutbound = "";

			
    		if(billDTOutboundAdapter != null) {
	    		//Get resource file for billTransToOutbound - Translation issue
	    		if (billDTOutboundAdapter.isRecipient()){
	    			billDutiesAndTaxesToOutbound = resources.getMessage(locale,"text.emailNotificationRecipient");
	        	}else if (billDTOutboundAdapter.isThirdParty()){
	        		billDutiesAndTaxesToOutbound = resources.getMessage(locale,"billingModule.payTypeThirdParty");
	        	}else if (billDTOutboundAdapter.isCollect()){
	        		billDutiesAndTaxesToOutbound = resources.getMessage(locale,"billingModule.payTypeCollect");
	        	}else{
	        		billDutiesAndTaxesToOutbound =  (billingDataOutbound.getDutiesAndTaxesBillingAccountInfo() != null) ? billingDataOutbound.getDutiesAndTaxesBillingAccountInfo().getAccountDisplayName() : "";	
	        	}
    		}		
    		if (!toAddressDataOutbound.getResidential().equals("false") && toAddressDataOutbound.getResidential() != null) {
				specialServicesOutbound = specialServicesOutbound + ssDataOutbound.getSpecialServices(locale, resources);
				specialServicesOutbound = specialServicesOutbound + ", ";
				specialServicesOutbound = specialServicesOutbound + resources.getMessage(locale,"text.toResidential");
	    	} else
	    		specialServicesOutbound = ssDataOutbound.getSpecialServices(locale, resources);
	    		
	    	List noOfPackagesListOutbound = new ArrayList();
    		if (psdDataOutbound != null) {
    			noOfPackagesListOutbound = psdDataOutbound.getMpsRowDataList();
    			if (psdDataOutbound.isMpsandPackagesNonIdentical()) {
		    		int noOfPackagesIntOutbound = 0;
		    		int totalPiecesNr = 0;
		    		for (int k=1; k<noOfPackagesListOutbound.size(); k++) {    		
		    			if (((MPSRowData)noOfPackagesListOutbound.get(k)).getQuantity() != null && !(((MPSRowData)noOfPackagesListOutbound.get(k)).getQuantity().equals(""))) {
			    			noOfPackagesIntOutbound = noOfPackagesIntOutbound + Integer.parseInt(((MPSRowData)noOfPackagesListOutbound.get(k)).getQuantity());		    			
			    		}
		            	if (isFreight) {
			    			if (((MPSRowData)noOfPackagesListOutbound.get(k)).getTotalPiecesPerSkid() != null && !(((MPSRowData)noOfPackagesListOutbound.get(k)).getTotalPiecesPerSkid().equals(""))) {
			    				totalPiecesNr = totalPiecesNr + (Integer.parseInt(((MPSRowData)noOfPackagesListOutbound.get(k)).getTotalPiecesPerSkid()) * (Integer.parseInt(((MPSRowData)noOfPackagesListOutbound.get(k)).getQuantity())));
				    		}
		            	}
		    		}
			    	noOfPackagesOutbound = String.valueOf(noOfPackagesIntOutbound);		    	
		        	if (isFreight)
				    	totalNoOfPieces = String.valueOf(totalPiecesNr);
			    	
		    	} else {
		    		noOfPackagesOutbound = psdDataOutbound.getNumberOfPackages();		    					    		
					if (isFreight) {					
						if (psdData.getMpsRowDataList()!=null && psdData.getMpsRowDataList().size()>0) {
							//For SPS - read the total pieces per skid
							MPSRowData mpsRowData = (MPSRowData)psdData.getMpsRowDataList().get(0);
				    		totalNoOfPieces = mpsRowData.getTotalPiecesPerSkid();
			    		} else {
				    		totalNoOfPieces = psdDataOutbound.getTotalPiecesOnSkids();
			    		} 
			    	}			    		
		    	}
		    	//UNIT OF MEASURE
		    	if ("".equals(psdDataOutbound.getWeightUnitOfMeasure()) || null == psdDataOutbound.getWeightUnitOfMeasure()) {
		    		if (toAddressDataOutbound.getCountryCode().equals (fromAddressDataOutbound.getCountryCode()) && toAddressDataOutbound.getCountryCode().equals(CountryConstants.UNITEDSTATES_COUNTRY_CODE))
		    			psdDataOutbound.setWeightUnitOfMeasure(WebConstants.DEFAULT_WEIGHT_OF_MEASURE_LBS);
		    		else if (toAddressDataOutbound.getCountryCode().equals (fromAddressDataOutbound.getCountryCode()) && toAddressDataOutbound.getCountryCode().equals(CountryConstants.CANADA_COUNTRY_CODE))
		    			psdDataOutbound.setWeightUnitOfMeasure(WebConstants.DEFAULT_WEIGHT_OF_MEASURE_KGS);
		    	}
		    	
		    	//TOTAL WEIGHT
		    	//C3PO July 13
		    	if(psdDataOutbound.isFedExOneRate()){
					totalWeightOutbound	= WebConstants.EMPTY_STRING;
				}else if (null != psdData.getTotalWeight() && (!psdData.getTotalWeight().equals(""))) {
			    		totalWeightOutbound 		= psdDataOutbound.getTotalWeight();
			    		outBoundWeightUnitOfMeasure = psdDataOutbound.getWeightUnitOfMeasure();
			    		if (totalWeight.indexOf(".") != -1) {
			    			String decimal = totalWeightOutbound.substring((totalWeightOutbound.indexOf(".")+1), totalWeightOutbound.length());
			    			if (decimal.equals("0") || decimal.equals("00")) {
			    				totalWeightOutbound = totalWeightOutbound.substring(0,totalWeightOutbound.indexOf("."));	    			
			    			}
			    		}	
			    	}
		    	//DECLARED VALUE
		    	if (null != totalCarriageValueOutbound && (!totalCarriageValueOutbound.equals(""))) {
		    		if (totalCarriageValueOutbound.indexOf(".") != -1) {
		    			String decimal = totalCarriageValueOutbound.substring((totalCarriageValueOutbound.indexOf(".")+1), totalCarriageValueOutbound.length());
		    			if (decimal.equals("0") || decimal.equals("00")) {
		    				totalCarriageValueOutbound = totalCarriageValueOutbound.substring(0,totalCarriageValueOutbound.indexOf("."))+".00";	    			
		    			}
		    		}	
		    	}
		    	totalCarriageValue = WebUtils.getTwoDecimalPlaceValueAsString(totalCarriageValue, 2);
    		}
    		
    		if (nonStandardPackagingOutbound != null && !nonStandardPackagingOutbound.equals("")) {
	    		specialServicesOutbound = specialServicesOutbound + ", ";
	    		specialServicesOutbound = specialServicesOutbound + nonStandardPackagingOutbound;
    		}
    	
        	if (isFreight) {
            	noOfSkids = noOfPackagesOutbound;
            	bookingConfNumber = psdDataOutbound.getBookingConfirmationNumber();    		
        	}    		
    	
    		//Assign the tracking numbers read before ... as outbound tracking numbers. 
    		trackingNumbersOutbound = trackingNumbers;
    	
 		   	//Now, read the returns tracking numbers and set it to trackingNumbers variable.
    		List returnsLabelDataList = new ArrayList();
    		if (labelDisplay.getIsPrint().equalsIgnoreCase("Y")) {
    			for (int i=0; i<labelDisplay.getLabelDataList().size(); i++) {
    				LabelData tmpLblData = (LabelData)labelDisplay.getLabelDataList().get(i);
    				if (tmpLblData.getIsReturnsLabel()!=null && tmpLblData.getIsReturnsLabel().equalsIgnoreCase("Y")){
    					returnsLabelDataList.add(tmpLblData);
    				}
    			}  
    			if(returnsLabelDataList.size() != 0) {
   					if (labelDataOutbound.getMpsShipment().equals(AppConstants.YES)) {	   			
   	 					trackingNumbers = ((LabelData)returnsLabelDataList.get(0)).getMasterTrackingNumber(); 
    				} else {
    					trackingNumbers = ((LabelData)returnsLabelDataList.get(0)).getTrackingNumber();
    				}
    			}
	    	} else { //For email, express tag and ground call tag
	    		for (int i=0; i<labelDisplay.getConfirmationTrackingNumbers().size(); i++) {
	    			LabelValueBean tmpLblData = (LabelValueBean)labelDisplay.getConfirmationTrackingNumbers().get(i);
    				returnsLabelDataList.add(tmpLblData.getValue());
	    		}
	    		if(returnsLabelDataList.size() != 0) {   			
    				trackingNumbers = returnsLabelDataList.get(0).toString(); 
	    		}
	    	}
    		String outboundNetChargeAmount = WebUtils.getTwoDecimalPlaceValueAsString(outboundShipActionForm.getLabelDisplay().getNetChargeAmount(), 2);
    		String outboundNetChargeCurrencyCode = outboundShipActionForm.getLabelDisplay().getCurrencyCode();
    		
    		if(outboundNetChargeCurrencyCode != null){
    			outboundNetChargeAmountWithCurrencyCode = outboundNetChargeAmount.concat(" ").concat(outboundNetChargeCurrencyCode);
    		}else{
    			outboundNetChargeAmountWithCurrencyCode = outboundNetChargeAmount;
    		}
	    }
   
 	//WebShipEnvironment webShipEnvironment = WebUtils.getWebShipEnvironment(request);
	//Locale locale = webShipEnvironment.getLocale();
   	
	MessageResources staticResources = MessageResources.getMessageResources("resource.fsm_staticLists");
	String netChargeAmount = WebUtils.getTwoDecimalPlaceValueAsString(shipActionForm.getLabelDisplay().getNetChargeAmount(), 2);
	String netChargeCurrencyCode = shipActionForm.getLabelDisplay().getCurrencyCode();
	String netChargeAmountWithCurrencyCode = "";
	if(netChargeCurrencyCode != null){
		netChargeAmountWithCurrencyCode = netChargeAmount.concat(" ").concat(netChargeCurrencyCode);
	}else{
		netChargeAmountWithCurrencyCode = netChargeAmount;
	}
	
   //	String pkgType = psdDataOutbound.getPackageType();
   	//String pkgTypeData =   staticResources.getMessage(locale, "packageType:"+ pkgType);

    
                    _bw.write(_wl_block106Bytes, _wl_block106);
                     com.fedex.framework.taglib.encode.HtmlTag __tag14 = null ;
                    int __result__tag14 = 0 ;

                    if (__tag14 == null ){
                        __tag14 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag14);
                    }
                    __tag14.setPageContext(pageContext);
                    __tag14.setParent(__tag0);
                    __tag14.setValue(locale.getCountry().toLowerCase()
);
                    _activeTag=__tag14;
                    __result__tag14 = __tag14.doStartTag();

                    if (__result__tag14!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag14== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag14.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag14);
                        return;
                    }
                    _activeTag=__tag14.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag14);
                    __tag14.release();
                    _bw.write(_wl_block107Bytes, _wl_block107);
                     com.fedex.framework.taglib.encode.HtmlTag __tag15 = null ;
                    int __result__tag15 = 0 ;

                    if (__tag15 == null ){
                        __tag15 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag15);
                    }
                    __tag15.setPageContext(pageContext);
                    __tag15.setParent(__tag0);
                    __tag15.setValue(locale.getLanguage()
);
                    _activeTag=__tag15;
                    __result__tag15 = __tag15.doStartTag();

                    if (__result__tag15!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag15== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag15.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag15);
                        return;
                    }
                    _activeTag=__tag15.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag15);
                    __tag15.release();
                    _bw.write(_wl_block108Bytes, _wl_block108);
                     org.apache.struts.taglib.html.FormTag __tag16 = null ;
                    int __result__tag16 = 0 ;

                    if (__tag16 == null ){
                        __tag16 = new  org.apache.struts.taglib.html.FormTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag16);
                    }
                    __tag16.setPageContext(pageContext);
                    __tag16.setParent(__tag0);
                    __tag16.setAction(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelAction", java.lang.String.class,"action"));
                    _activeTag=__tag16;
                    __result__tag16 = __tag16.doStartTag();

                    if (__result__tag16!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag16== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.html.FormTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block109Bytes, _wl_block109);
                            _bw.write(_wl_block110Bytes, _wl_block110);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block111Bytes, _wl_block111);

                            if (_jsp__tag17(request, response, pageContext, _activeTag, __tag16))
                             return;
                            _bw.write(_wl_block112Bytes, _wl_block112);
if(isIE){
                            _bw.write(_wl_block113Bytes, _wl_block113);
}
                            _bw.write(_wl_block114Bytes, _wl_block114);
                            _bw.write(_wl_block115Bytes, _wl_block115);
                             org.apache.struts.taglib.logic.EqualTag __tag18 = null ;
                            int __result__tag18 = 0 ;

                            if (__tag18 == null ){
                                __tag18 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag18);
                            }
                            __tag18.setPageContext(pageContext);
                            __tag18.setParent(__tag16);
                            __tag18.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag18.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag18.setValue(AppConstants.YES
);
                            _activeTag=__tag18;
                            __result__tag18 = __tag18.doStartTag();

                            if (__result__tag18!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag18== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block116Bytes, _wl_block116);

                                    if (_jsp__tag19(request, response, pageContext, _activeTag, __tag18))
                                     return;
                                    _bw.write(_wl_block117Bytes, _wl_block117);
if(!labelDisplay.getIsOutboundReturns().equals(AppConstants.YES)){ 
                                    _bw.write(_wl_block118Bytes, _wl_block118);
}
                                    _bw.write(_wl_block119Bytes, _wl_block119);

                                    if (_jsp__tag20(request, response, pageContext, _activeTag, __tag18))
                                     return;
                                    _bw.write(_wl_block120Bytes, _wl_block120);
                                } while (__tag18.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag18.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag18);
                                return;
                            }
                            _activeTag=__tag18.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag18);
                            __tag18.release();
                            _bw.write(_wl_block121Bytes, _wl_block121);

                            if (_jsp__tag21(request, response, pageContext, _activeTag, __tag16))
                             return;
                            _bw.write(_wl_block122Bytes, _wl_block122);
                             org.apache.struts.taglib.logic.EqualTag __tag22 = null ;
                            int __result__tag22 = 0 ;

                            if (__tag22 == null ){
                                __tag22 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag22);
                            }
                            __tag22.setPageContext(pageContext);
                            __tag22.setParent(__tag16);
                            __tag22.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag22.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag22.setValue(AppConstants.YES
);
                            _activeTag=__tag22;
                            __result__tag22 = __tag22.doStartTag();

                            if (__result__tag22!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag22== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block123Bytes, _wl_block123);

                                    if (_jsp__tag23(request, response, pageContext, _activeTag, __tag22))
                                     return;
                                    _bw.write(_wl_block124Bytes, _wl_block124);
                                } while (__tag22.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag22.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag22);
                                return;
                            }
                            _activeTag=__tag22.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag22);
                            __tag22.release();
                            _bw.write(_wl_block125Bytes, _wl_block125);
                             org.apache.struts.taglib.logic.NotEqualTag __tag24 = null ;
                            int __result__tag24 = 0 ;

                            if (__tag24 == null ){
                                __tag24 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag24);
                            }
                            __tag24.setPageContext(pageContext);
                            __tag24.setParent(__tag16);
                            __tag24.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag24.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isGroupShipment", java.lang.String.class,"property"));
                            __tag24.setValue(AppConstants.YES
);
                            _activeTag=__tag24;
                            __result__tag24 = __tag24.doStartTag();

                            if (__result__tag24!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag24== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block126Bytes, _wl_block126);

                                    if (_jsp__tag25(request, response, pageContext, _activeTag, __tag24))
                                     return;
                                    _bw.write(_wl_block127Bytes, _wl_block127);

                                    if (_jsp__tag26(request, response, pageContext, _activeTag, __tag24))
                                     return;
                                    _bw.write(_wl_block128Bytes, _wl_block128);
if(isHal && !isFreight){ 
                                    _bw.write(_wl_block129Bytes, _wl_block129);

                                    if (_jsp__tag27(request, response, pageContext, _activeTag, __tag24))
                                     return;
                                    _bw.write(_wl_block130Bytes, _wl_block130);
 } 
                                    _bw.write(_wl_block131Bytes, _wl_block131);
                                     org.apache.struts.taglib.logic.EqualTag __tag28 = null ;
                                    int __result__tag28 = 0 ;

                                    if (__tag28 == null ){
                                        __tag28 = new  org.apache.struts.taglib.logic.EqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag28);
                                    }
                                    __tag28.setPageContext(pageContext);
                                    __tag28.setParent(__tag24);
                                    __tag28.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag28.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag28.setValue(AppConstants.YES
);
                                    _activeTag=__tag28;
                                    __result__tag28 = __tag28.doStartTag();

                                    if (__result__tag28!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag28== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block132Bytes, _wl_block132);

                                            if (_jsp__tag29(request, response, pageContext, _activeTag, __tag28))
                                             return;
                                            _bw.write(_wl_block133Bytes, _wl_block133);

                                            if (_jsp__tag30(request, response, pageContext, _activeTag, __tag28))
                                             return;
                                            _bw.write(_wl_block128Bytes, _wl_block128);
                                        } while (__tag28.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag28.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag28);
                                        return;
                                    }
                                    _activeTag=__tag28.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag28);
                                    __tag28.release();
                                    _bw.write(_wl_block134Bytes, _wl_block134);
                                     org.apache.struts.taglib.logic.NotEqualTag __tag31 = null ;
                                    int __result__tag31 = 0 ;

                                    if (__tag31 == null ){
                                        __tag31 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag31);
                                    }
                                    __tag31.setPageContext(pageContext);
                                    __tag31.setParent(__tag24);
                                    __tag31.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag31.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag31.setValue(AppConstants.YES
);
                                    _activeTag=__tag31;
                                    __result__tag31 = __tag31.doStartTag();

                                    if (__result__tag31!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag31== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block135Bytes, _wl_block135);

                                            if (_jsp__tag32(request, response, pageContext, _activeTag, __tag31))
                                             return;
                                            _bw.write(_wl_block136Bytes, _wl_block136);

                                            if (_jsp__tag33(request, response, pageContext, _activeTag, __tag31))
                                             return;
                                            _bw.write(_wl_block137Bytes, _wl_block137);
                                        } while (__tag31.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag31.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag31);
                                        return;
                                    }
                                    _activeTag=__tag31.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag31);
                                    __tag31.release();
                                    _bw.write(_wl_block131Bytes, _wl_block131);
                                     org.apache.struts.taglib.logic.EqualTag __tag34 = null ;
                                    int __result__tag34 = 0 ;

                                    if (__tag34 == null ){
                                        __tag34 = new  org.apache.struts.taglib.logic.EqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag34);
                                    }
                                    __tag34.setPageContext(pageContext);
                                    __tag34.setParent(__tag24);
                                    __tag34.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag34.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag34.setValue(AppConstants.YES
);
                                    _activeTag=__tag34;
                                    __result__tag34 = __tag34.doStartTag();

                                    if (__result__tag34!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag34== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block135Bytes, _wl_block135);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag35 = null ;
                                            int __result__tag35 = 0 ;

                                            if (__tag35 == null ){
                                                __tag35 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag35);
                                            }
                                            __tag35.setPageContext(pageContext);
                                            __tag35.setParent(__tag34);
                                            __tag35.setValue((toAddressDataOutbound!= null && toAddressDataOutbound.getContactName()!=null)?toAddressDataOutbound.getContactName().trim():""
);
                                            _activeTag=__tag35;
                                            __result__tag35 = __tag35.doStartTag();

                                            if (__result__tag35!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag35== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag35.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag35);
                                                return;
                                            }
                                            _activeTag=__tag35.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag35);
                                            __tag35.release();
                                            _bw.write(_wl_block138Bytes, _wl_block138);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag36 = null ;
                                            int __result__tag36 = 0 ;

                                            if (__tag36 == null ){
                                                __tag36 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag36);
                                            }
                                            __tag36.setPageContext(pageContext);
                                            __tag36.setParent(__tag34);
                                            __tag36.setValue((fromAddressDataOutbound!= null && fromAddressDataOutbound.getContactName()!=null)?fromAddressDataOutbound.getContactName().trim():""
);
                                            _activeTag=__tag36;
                                            __result__tag36 = __tag36.doStartTag();

                                            if (__result__tag36!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag36== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag36.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag36);
                                                return;
                                            }
                                            _activeTag=__tag36.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag36);
                                            __tag36.release();
                                            _bw.write(_wl_block139Bytes, _wl_block139);

                                            if (_jsp__tag37(request, response, pageContext, _activeTag, __tag34))
                                             return;
                                            _bw.write(_wl_block136Bytes, _wl_block136);

                                            if (_jsp__tag38(request, response, pageContext, _activeTag, __tag34))
                                             return;
                                            _bw.write(_wl_block140Bytes, _wl_block140);
                                        } while (__tag34.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag34.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag34);
                                        return;
                                    }
                                    _activeTag=__tag34.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag34);
                                    __tag34.release();
                                    _bw.write(_wl_block141Bytes, _wl_block141);
                                     org.apache.struts.taglib.logic.NotEqualTag __tag39 = null ;
                                    int __result__tag39 = 0 ;

                                    if (__tag39 == null ){
                                        __tag39 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag39);
                                    }
                                    __tag39.setPageContext(pageContext);
                                    __tag39.setParent(__tag24);
                                    __tag39.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag39.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag39.setValue(AppConstants.YES
);
                                    _activeTag=__tag39;
                                    __result__tag39 = __tag39.doStartTag();

                                    if (__result__tag39!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag39== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block142Bytes, _wl_block142);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag40 = null ;
                                            int __result__tag40 = 0 ;

                                            if (__tag40 == null ){
                                                __tag40 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag40);
                                            }
                                            __tag40.setPageContext(pageContext);
                                            __tag40.setParent(__tag39);
                                            __tag40.setValue(toCompanyNameData
);
                                            _activeTag=__tag40;
                                            __result__tag40 = __tag40.doStartTag();

                                            if (__result__tag40!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag40== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag40.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag40);
                                                return;
                                            }
                                            _activeTag=__tag40.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag40);
                                            __tag40.release();
                                            _bw.write(_wl_block143Bytes, _wl_block143);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag41 = null ;
                                            int __result__tag41 = 0 ;

                                            if (__tag41 == null ){
                                                __tag41 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag41);
                                            }
                                            __tag41.setPageContext(pageContext);
                                            __tag41.setParent(__tag39);
                                            __tag41.setValue(fromCompanyNameData
);
                                            _activeTag=__tag41;
                                            __result__tag41 = __tag41.doStartTag();

                                            if (__result__tag41!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag41== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag41.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag41);
                                                return;
                                            }
                                            _activeTag=__tag41.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag41);
                                            __tag41.release();
                                            _bw.write(_wl_block144Bytes, _wl_block144);
if(isHal && !isFreight){ 
                                            _bw.write(_wl_block145Bytes, _wl_block145);

                                            if (_jsp__tag42(request, response, pageContext, _activeTag, __tag39))
                                             return;
                                            _bw.write(_wl_block146Bytes, _wl_block146);
 } 
                                            _bw.write(_wl_block131Bytes, _wl_block131);
                                        } while (__tag39.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag39.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag39);
                                        return;
                                    }
                                    _activeTag=__tag39.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag39);
                                    __tag39.release();
                                    _bw.write(_wl_block131Bytes, _wl_block131);
                                     org.apache.struts.taglib.logic.EqualTag __tag43 = null ;
                                    int __result__tag43 = 0 ;

                                    if (__tag43 == null ){
                                        __tag43 = new  org.apache.struts.taglib.logic.EqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag43);
                                    }
                                    __tag43.setPageContext(pageContext);
                                    __tag43.setParent(__tag24);
                                    __tag43.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag43.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag43.setValue(AppConstants.YES
);
                                    _activeTag=__tag43;
                                    __result__tag43 = __tag43.doStartTag();

                                    if (__result__tag43!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag43== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block142Bytes, _wl_block142);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag44 = null ;
                                            int __result__tag44 = 0 ;

                                            if (__tag44 == null ){
                                                __tag44 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag44);
                                            }
                                            __tag44.setPageContext(pageContext);
                                            __tag44.setParent(__tag43);
                                            __tag44.setValue((toAddressDataOutbound!= null && toAddressDataOutbound.getCompanyName()!=null)?toAddressDataOutbound.getCompanyName().trim():""
);
                                            _activeTag=__tag44;
                                            __result__tag44 = __tag44.doStartTag();

                                            if (__result__tag44!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag44== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag44.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag44);
                                                return;
                                            }
                                            _activeTag=__tag44.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag44);
                                            __tag44.release();
                                            _bw.write(_wl_block147Bytes, _wl_block147);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag45 = null ;
                                            int __result__tag45 = 0 ;

                                            if (__tag45 == null ){
                                                __tag45 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag45);
                                            }
                                            __tag45.setPageContext(pageContext);
                                            __tag45.setParent(__tag43);
                                            __tag45.setValue((fromAddressDataOutbound!= null && fromAddressDataOutbound.getCompanyName()!=null)?fromAddressDataOutbound.getCompanyName().trim():""
);
                                            _activeTag=__tag45;
                                            __result__tag45 = __tag45.doStartTag();

                                            if (__result__tag45!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag45== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag45.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag45);
                                                return;
                                            }
                                            _activeTag=__tag45.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag45);
                                            __tag45.release();
                                            _bw.write(_wl_block148Bytes, _wl_block148);

                                            if (_jsp__tag46(request, response, pageContext, _activeTag, __tag43))
                                             return;
                                            _bw.write(_wl_block149Bytes, _wl_block149);

                                            if (_jsp__tag47(request, response, pageContext, _activeTag, __tag43))
                                             return;
                                            _bw.write(_wl_block150Bytes, _wl_block150);
                                        } while (__tag43.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag43.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag43);
                                        return;
                                    }
                                    _activeTag=__tag43.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag43);
                                    __tag43.release();
                                    _bw.write(_wl_block151Bytes, _wl_block151);
                                     org.apache.struts.taglib.logic.NotEqualTag __tag48 = null ;
                                    int __result__tag48 = 0 ;

                                    if (__tag48 == null ){
                                        __tag48 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag48);
                                    }
                                    __tag48.setPageContext(pageContext);
                                    __tag48.setParent(__tag24);
                                    __tag48.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag48.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag48.setValue(AppConstants.YES
);
                                    _activeTag=__tag48;
                                    __result__tag48 = __tag48.doStartTag();

                                    if (__result__tag48!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag48== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block152Bytes, _wl_block152);

                                            if (_jsp__tag49(request, response, pageContext, _activeTag, __tag48))
                                             return;
                                            _bw.write(_wl_block153Bytes, _wl_block153);

                                            if (_jsp__tag50(request, response, pageContext, _activeTag, __tag48))
                                             return;
                                            _bw.write(_wl_block144Bytes, _wl_block144);
if(isHal && !isFreight){ 
                                            _bw.write(_wl_block154Bytes, _wl_block154);

                                            if (_jsp__tag51(request, response, pageContext, _activeTag, __tag48))
                                             return;
                                            _bw.write(_wl_block146Bytes, _wl_block146);
 } 
                                            _bw.write(_wl_block131Bytes, _wl_block131);
                                        } while (__tag48.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag48.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag48);
                                        return;
                                    }
                                    _activeTag=__tag48.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag48);
                                    __tag48.release();
                                    _bw.write(_wl_block131Bytes, _wl_block131);
                                     org.apache.struts.taglib.logic.EqualTag __tag52 = null ;
                                    int __result__tag52 = 0 ;

                                    if (__tag52 == null ){
                                        __tag52 = new  org.apache.struts.taglib.logic.EqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag52);
                                    }
                                    __tag52.setPageContext(pageContext);
                                    __tag52.setParent(__tag24);
                                    __tag52.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag52.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag52.setValue(AppConstants.YES
);
                                    _activeTag=__tag52;
                                    __result__tag52 = __tag52.doStartTag();

                                    if (__result__tag52!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag52== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block152Bytes, _wl_block152);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag53 = null ;
                                            int __result__tag53 = 0 ;

                                            if (__tag53 == null ){
                                                __tag53 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag53);
                                            }
                                            __tag53.setPageContext(pageContext);
                                            __tag53.setParent(__tag52);
                                            __tag53.setValue(toAddressDataOutbound.getAddressLine1().trim()
);
                                            _activeTag=__tag53;
                                            __result__tag53 = __tag53.doStartTag();

                                            if (__result__tag53!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag53== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag53.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag53);
                                                return;
                                            }
                                            _activeTag=__tag53.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag53);
                                            __tag53.release();
                                            _bw.write(_wl_block155Bytes, _wl_block155);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag54 = null ;
                                            int __result__tag54 = 0 ;

                                            if (__tag54 == null ){
                                                __tag54 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag54);
                                            }
                                            __tag54.setPageContext(pageContext);
                                            __tag54.setParent(__tag52);
                                            __tag54.setValue(fromAddressDataOutbound.getAddressLine1().trim()
);
                                            _activeTag=__tag54;
                                            __result__tag54 = __tag54.doStartTag();

                                            if (__result__tag54!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag54== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag54.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag54);
                                                return;
                                            }
                                            _activeTag=__tag54.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag54);
                                            __tag54.release();
                                            _bw.write(_wl_block156Bytes, _wl_block156);

                                            if (_jsp__tag55(request, response, pageContext, _activeTag, __tag52))
                                             return;
                                            _bw.write(_wl_block153Bytes, _wl_block153);

                                            if (_jsp__tag56(request, response, pageContext, _activeTag, __tag52))
                                             return;
                                            _bw.write(_wl_block157Bytes, _wl_block157);
                                        } while (__tag52.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag52.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag52);
                                        return;
                                    }
                                    _activeTag=__tag52.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag52);
                                    __tag52.release();
                                    _bw.write(_wl_block141Bytes, _wl_block141);
                                     org.apache.struts.taglib.logic.NotEqualTag __tag57 = null ;
                                    int __result__tag57 = 0 ;

                                    if (__tag57 == null ){
                                        __tag57 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag57);
                                    }
                                    __tag57.setPageContext(pageContext);
                                    __tag57.setParent(__tag24);
                                    __tag57.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag57.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag57.setValue(AppConstants.YES
);
                                    _activeTag=__tag57;
                                    __result__tag57 = __tag57.doStartTag();

                                    if (__result__tag57!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag57== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block158Bytes, _wl_block158);

                                            if (_jsp__tag58(request, response, pageContext, _activeTag, __tag57))
                                             return;
                                            _bw.write(_wl_block159Bytes, _wl_block159);

                                            if (_jsp__tag59(request, response, pageContext, _activeTag, __tag57))
                                             return;
                                            _bw.write(_wl_block144Bytes, _wl_block144);
if(isHal && !isFreight){ 
                                            _bw.write(_wl_block160Bytes, _wl_block160);

                                            if (_jsp__tag60(request, response, pageContext, _activeTag, __tag57))
                                             return;
                                            _bw.write(_wl_block146Bytes, _wl_block146);
 } 
                                            _bw.write(_wl_block161Bytes, _wl_block161);
                                        } while (__tag57.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag57.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag57);
                                        return;
                                    }
                                    _activeTag=__tag57.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag57);
                                    __tag57.release();
                                    _bw.write(_wl_block131Bytes, _wl_block131);
                                     org.apache.struts.taglib.logic.EqualTag __tag61 = null ;
                                    int __result__tag61 = 0 ;

                                    if (__tag61 == null ){
                                        __tag61 = new  org.apache.struts.taglib.logic.EqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag61);
                                    }
                                    __tag61.setPageContext(pageContext);
                                    __tag61.setParent(__tag24);
                                    __tag61.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag61.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag61.setValue(AppConstants.YES
);
                                    _activeTag=__tag61;
                                    __result__tag61 = __tag61.doStartTag();

                                    if (__result__tag61!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag61== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block158Bytes, _wl_block158);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag62 = null ;
                                            int __result__tag62 = 0 ;

                                            if (__tag62 == null ){
                                                __tag62 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag62);
                                            }
                                            __tag62.setPageContext(pageContext);
                                            __tag62.setParent(__tag61);
                                            __tag62.setValue((toAddressDataOutbound!= null && toAddressDataOutbound.getAddressLine2()!=null)?toAddressDataOutbound.getAddressLine2().trim():""
);
                                            _activeTag=__tag62;
                                            __result__tag62 = __tag62.doStartTag();

                                            if (__result__tag62!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag62== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag62.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag62);
                                                return;
                                            }
                                            _activeTag=__tag62.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag62);
                                            __tag62.release();
                                            _bw.write(_wl_block162Bytes, _wl_block162);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag63 = null ;
                                            int __result__tag63 = 0 ;

                                            if (__tag63 == null ){
                                                __tag63 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag63);
                                            }
                                            __tag63.setPageContext(pageContext);
                                            __tag63.setParent(__tag61);
                                            __tag63.setValue((fromAddressDataOutbound!= null && fromAddressDataOutbound.getAddressLine2()!=null)?fromAddressDataOutbound.getAddressLine2().trim():""
);
                                            _activeTag=__tag63;
                                            __result__tag63 = __tag63.doStartTag();

                                            if (__result__tag63!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag63== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag63.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag63);
                                                return;
                                            }
                                            _activeTag=__tag63.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag63);
                                            __tag63.release();
                                            _bw.write(_wl_block163Bytes, _wl_block163);

                                            if (_jsp__tag64(request, response, pageContext, _activeTag, __tag61))
                                             return;
                                            _bw.write(_wl_block159Bytes, _wl_block159);

                                            if (_jsp__tag65(request, response, pageContext, _activeTag, __tag61))
                                             return;
                                            _bw.write(_wl_block164Bytes, _wl_block164);
                                        } while (__tag61.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag61.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag61);
                                        return;
                                    }
                                    _activeTag=__tag61.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag61);
                                    __tag61.release();
                                    _bw.write(_wl_block141Bytes, _wl_block141);
                                     org.apache.struts.taglib.logic.NotEqualTag __tag66 = null ;
                                    int __result__tag66 = 0 ;

                                    if (__tag66 == null ){
                                        __tag66 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag66);
                                    }
                                    __tag66.setPageContext(pageContext);
                                    __tag66.setParent(__tag24);
                                    __tag66.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag66.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag66.setValue(AppConstants.YES
);
                                    _activeTag=__tag66;
                                    __result__tag66 = __tag66.doStartTag();

                                    if (__result__tag66!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag66== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block165Bytes, _wl_block165);

                                            if (_jsp__tag67(request, response, pageContext, _activeTag, __tag66))
                                             return;
                                            _bw.write(_wl_block166Bytes, _wl_block166);

                                            if (_jsp__tag68(request, response, pageContext, _activeTag, __tag66))
                                             return;
                                            _bw.write(_wl_block167Bytes, _wl_block167);

                                            if (_jsp__tag69(request, response, pageContext, _activeTag, __tag66))
                                             return;
                                            _bw.write(_wl_block166Bytes, _wl_block166);

                                            if (_jsp__tag70(request, response, pageContext, _activeTag, __tag66))
                                             return;
                                            _bw.write(_wl_block144Bytes, _wl_block144);
if(isHal && !isFreight){ 
                                            _bw.write(_wl_block168Bytes, _wl_block168);

                                            if (_jsp__tag71(request, response, pageContext, _activeTag, __tag66))
                                             return;
                                            _bw.write(_wl_block169Bytes, _wl_block169);

                                            if (_jsp__tag72(request, response, pageContext, _activeTag, __tag66))
                                             return;
                                            _bw.write(_wl_block146Bytes, _wl_block146);
 } 
                                            _bw.write(_wl_block131Bytes, _wl_block131);
                                        } while (__tag66.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag66.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag66);
                                        return;
                                    }
                                    _activeTag=__tag66.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag66);
                                    __tag66.release();
                                    _bw.write(_wl_block131Bytes, _wl_block131);
                                     org.apache.struts.taglib.logic.EqualTag __tag73 = null ;
                                    int __result__tag73 = 0 ;

                                    if (__tag73 == null ){
                                        __tag73 = new  org.apache.struts.taglib.logic.EqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag73);
                                    }
                                    __tag73.setPageContext(pageContext);
                                    __tag73.setParent(__tag24);
                                    __tag73.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag73.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag73.setValue(AppConstants.YES
);
                                    _activeTag=__tag73;
                                    __result__tag73 = __tag73.doStartTag();

                                    if (__result__tag73!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag73== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block165Bytes, _wl_block165);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag74 = null ;
                                            int __result__tag74 = 0 ;

                                            if (__tag74 == null ){
                                                __tag74 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag74);
                                            }
                                            __tag74.setPageContext(pageContext);
                                            __tag74.setParent(__tag73);
                                            __tag74.setValue((toAddressDataOutbound!= null && toAddressDataOutbound.getCity()!=null)?toAddressDataOutbound.getCity().trim():""
);
                                            _activeTag=__tag74;
                                            __result__tag74 = __tag74.doStartTag();

                                            if (__result__tag74!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag74== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag74.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag74);
                                                return;
                                            }
                                            _activeTag=__tag74.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag74);
                                            __tag74.release();
                                            _bw.write(_wl_block166Bytes, _wl_block166);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag75 = null ;
                                            int __result__tag75 = 0 ;

                                            if (__tag75 == null ){
                                                __tag75 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag75);
                                            }
                                            __tag75.setPageContext(pageContext);
                                            __tag75.setParent(__tag73);
                                            __tag75.setValue((toAddressDataOutbound!= null && toAddressDataOutbound.getStateProvinceCode()!=null)?toAddressDataOutbound.getStateProvinceCode().trim():""
);
                                            _activeTag=__tag75;
                                            __result__tag75 = __tag75.doStartTag();

                                            if (__result__tag75!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag75== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag75.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag75);
                                                return;
                                            }
                                            _activeTag=__tag75.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag75);
                                            __tag75.release();
                                            _bw.write(_wl_block170Bytes, _wl_block170);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag76 = null ;
                                            int __result__tag76 = 0 ;

                                            if (__tag76 == null ){
                                                __tag76 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag76);
                                            }
                                            __tag76.setPageContext(pageContext);
                                            __tag76.setParent(__tag73);
                                            __tag76.setValue((fromAddressDataOutbound!= null && fromAddressDataOutbound.getCity()!=null)?fromAddressDataOutbound.getCity().trim():""
);
                                            _activeTag=__tag76;
                                            __result__tag76 = __tag76.doStartTag();

                                            if (__result__tag76!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag76== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag76.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag76);
                                                return;
                                            }
                                            _activeTag=__tag76.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag76);
                                            __tag76.release();
                                            _bw.write(_wl_block166Bytes, _wl_block166);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag77 = null ;
                                            int __result__tag77 = 0 ;

                                            if (__tag77 == null ){
                                                __tag77 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag77);
                                            }
                                            __tag77.setPageContext(pageContext);
                                            __tag77.setParent(__tag73);
                                            __tag77.setValue((fromAddressDataOutbound!= null && fromAddressDataOutbound.getStateProvinceCode()!=null)?fromAddressDataOutbound.getStateProvinceCode().trim():""
);
                                            _activeTag=__tag77;
                                            __result__tag77 = __tag77.doStartTag();

                                            if (__result__tag77!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag77== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag77.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag77);
                                                return;
                                            }
                                            _activeTag=__tag77.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag77);
                                            __tag77.release();
                                            _bw.write(_wl_block171Bytes, _wl_block171);

                                            if (_jsp__tag78(request, response, pageContext, _activeTag, __tag73))
                                             return;
                                            _bw.write(_wl_block166Bytes, _wl_block166);

                                            if (_jsp__tag79(request, response, pageContext, _activeTag, __tag73))
                                             return;
                                            _bw.write(_wl_block167Bytes, _wl_block167);

                                            if (_jsp__tag80(request, response, pageContext, _activeTag, __tag73))
                                             return;
                                            _bw.write(_wl_block166Bytes, _wl_block166);

                                            if (_jsp__tag81(request, response, pageContext, _activeTag, __tag73))
                                             return;
                                            _bw.write(_wl_block164Bytes, _wl_block164);
                                        } while (__tag73.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag73.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag73);
                                        return;
                                    }
                                    _activeTag=__tag73.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag73);
                                    __tag73.release();
                                    _bw.write(_wl_block141Bytes, _wl_block141);
                                     org.apache.struts.taglib.logic.NotEqualTag __tag82 = null ;
                                    int __result__tag82 = 0 ;

                                    if (__tag82 == null ){
                                        __tag82 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag82);
                                    }
                                    __tag82.setPageContext(pageContext);
                                    __tag82.setParent(__tag24);
                                    __tag82.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag82.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag82.setValue(AppConstants.YES
);
                                    _activeTag=__tag82;
                                    __result__tag82 = __tag82.doStartTag();

                                    if (__result__tag82!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag82== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block172Bytes, _wl_block172);

                                            if (_jsp__tag83(request, response, pageContext, _activeTag, __tag82))
                                             return;
                                            _bw.write(_wl_block173Bytes, _wl_block173);

                                            if (_jsp__tag84(request, response, pageContext, _activeTag, __tag82))
                                             return;
                                            _bw.write(_wl_block144Bytes, _wl_block144);
if(isHal && !isFreight){ 
                                            _bw.write(_wl_block174Bytes, _wl_block174);

                                            if (_jsp__tag85(request, response, pageContext, _activeTag, __tag82))
                                             return;
                                            _bw.write(_wl_block146Bytes, _wl_block146);
 } 
                                            _bw.write(_wl_block131Bytes, _wl_block131);
                                        } while (__tag82.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag82.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag82);
                                        return;
                                    }
                                    _activeTag=__tag82.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag82);
                                    __tag82.release();
                                    _bw.write(_wl_block131Bytes, _wl_block131);
                                     org.apache.struts.taglib.logic.EqualTag __tag86 = null ;
                                    int __result__tag86 = 0 ;

                                    if (__tag86 == null ){
                                        __tag86 = new  org.apache.struts.taglib.logic.EqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag86);
                                    }
                                    __tag86.setPageContext(pageContext);
                                    __tag86.setParent(__tag24);
                                    __tag86.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag86.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag86.setValue(AppConstants.YES
);
                                    _activeTag=__tag86;
                                    __result__tag86 = __tag86.doStartTag();

                                    if (__result__tag86!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag86== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block172Bytes, _wl_block172);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag87 = null ;
                                            int __result__tag87 = 0 ;

                                            if (__tag87 == null ){
                                                __tag87 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag87);
                                            }
                                            __tag87.setPageContext(pageContext);
                                            __tag87.setParent(__tag86);
                                            __tag87.setValue((toAddressDataOutbound!= null && toAddressDataOutbound.getZipPostalCode()!=null)?toAddressDataOutbound.getZipPostalCode().trim():""
);
                                            _activeTag=__tag87;
                                            __result__tag87 = __tag87.doStartTag();

                                            if (__result__tag87!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag87== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag87.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag87);
                                                return;
                                            }
                                            _activeTag=__tag87.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag87);
                                            __tag87.release();
                                            _bw.write(_wl_block175Bytes, _wl_block175);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag88 = null ;
                                            int __result__tag88 = 0 ;

                                            if (__tag88 == null ){
                                                __tag88 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag88);
                                            }
                                            __tag88.setPageContext(pageContext);
                                            __tag88.setParent(__tag86);
                                            __tag88.setValue((fromAddressDataOutbound!= null && fromAddressDataOutbound.getZipPostalCode()!=null)?fromAddressDataOutbound.getZipPostalCode().trim():""
);
                                            _activeTag=__tag88;
                                            __result__tag88 = __tag88.doStartTag();

                                            if (__result__tag88!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag88== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag88.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag88);
                                                return;
                                            }
                                            _activeTag=__tag88.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag88);
                                            __tag88.release();
                                            _bw.write(_wl_block176Bytes, _wl_block176);

                                            if (_jsp__tag89(request, response, pageContext, _activeTag, __tag86))
                                             return;
                                            _bw.write(_wl_block173Bytes, _wl_block173);

                                            if (_jsp__tag90(request, response, pageContext, _activeTag, __tag86))
                                             return;
                                            _bw.write(_wl_block164Bytes, _wl_block164);
                                        } while (__tag86.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag86.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag86);
                                        return;
                                    }
                                    _activeTag=__tag86.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag86);
                                    __tag86.release();
                                    _bw.write(_wl_block141Bytes, _wl_block141);
                                     org.apache.struts.taglib.logic.NotEqualTag __tag91 = null ;
                                    int __result__tag91 = 0 ;

                                    if (__tag91 == null ){
                                        __tag91 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag91);
                                    }
                                    __tag91.setPageContext(pageContext);
                                    __tag91.setParent(__tag24);
                                    __tag91.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag91.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag91.setValue(AppConstants.YES
);
                                    _activeTag=__tag91;
                                    __result__tag91 = __tag91.doStartTag();

                                    if (__result__tag91!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag91== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block177Bytes, _wl_block177);

                                            if (_jsp__tag92(request, response, pageContext, _activeTag, __tag91))
                                             return;
                                            _bw.write(_wl_block178Bytes, _wl_block178);

                                            if (_jsp__tag93(request, response, pageContext, _activeTag, __tag91))
                                             return;
                                            _bw.write(_wl_block144Bytes, _wl_block144);
if(isHal && !isFreight){ 
                                            _bw.write(_wl_block179Bytes, _wl_block179);

                                            if (_jsp__tag94(request, response, pageContext, _activeTag, __tag91))
                                             return;
                                            _bw.write(_wl_block146Bytes, _wl_block146);
 } 
                                            _bw.write(_wl_block131Bytes, _wl_block131);
                                        } while (__tag91.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag91.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag91);
                                        return;
                                    }
                                    _activeTag=__tag91.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag91);
                                    __tag91.release();
                                    _bw.write(_wl_block131Bytes, _wl_block131);
                                     org.apache.struts.taglib.logic.EqualTag __tag95 = null ;
                                    int __result__tag95 = 0 ;

                                    if (__tag95 == null ){
                                        __tag95 = new  org.apache.struts.taglib.logic.EqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag95);
                                    }
                                    __tag95.setPageContext(pageContext);
                                    __tag95.setParent(__tag24);
                                    __tag95.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag95.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag95.setValue(AppConstants.YES
);
                                    _activeTag=__tag95;
                                    __result__tag95 = __tag95.doStartTag();

                                    if (__result__tag95!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag95== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block177Bytes, _wl_block177);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag96 = null ;
                                            int __result__tag96 = 0 ;

                                            if (__tag96 == null ){
                                                __tag96 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag96);
                                            }
                                            __tag96.setPageContext(pageContext);
                                            __tag96.setParent(__tag95);
                                            __tag96.setValue(toAddressDataOutbound.getCountryCode()
);
                                            _activeTag=__tag96;
                                            __result__tag96 = __tag96.doStartTag();

                                            if (__result__tag96!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag96== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag96.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag96);
                                                return;
                                            }
                                            _activeTag=__tag96.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag96);
                                            __tag96.release();
                                            _bw.write(_wl_block180Bytes, _wl_block180);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag97 = null ;
                                            int __result__tag97 = 0 ;

                                            if (__tag97 == null ){
                                                __tag97 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag97);
                                            }
                                            __tag97.setPageContext(pageContext);
                                            __tag97.setParent(__tag95);
                                            __tag97.setValue(fromAddressDataOutbound.getCountryCode()
);
                                            _activeTag=__tag97;
                                            __result__tag97 = __tag97.doStartTag();

                                            if (__result__tag97!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag97== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag97.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag97);
                                                return;
                                            }
                                            _activeTag=__tag97.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag97);
                                            __tag97.release();
                                            _bw.write(_wl_block181Bytes, _wl_block181);

                                            if (_jsp__tag98(request, response, pageContext, _activeTag, __tag95))
                                             return;
                                            _bw.write(_wl_block178Bytes, _wl_block178);

                                            if (_jsp__tag99(request, response, pageContext, _activeTag, __tag95))
                                             return;
                                            _bw.write(_wl_block182Bytes, _wl_block182);
                                        } while (__tag95.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag95.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag95);
                                        return;
                                    }
                                    _activeTag=__tag95.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag95);
                                    __tag95.release();
                                    _bw.write(_wl_block141Bytes, _wl_block141);
                                     org.apache.struts.taglib.logic.NotEqualTag __tag100 = null ;
                                    int __result__tag100 = 0 ;

                                    if (__tag100 == null ){
                                        __tag100 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag100);
                                    }
                                    __tag100.setPageContext(pageContext);
                                    __tag100.setParent(__tag24);
                                    __tag100.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag100.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag100.setValue(AppConstants.YES
);
                                    _activeTag=__tag100;
                                    __result__tag100 = __tag100.doStartTag();

                                    if (__result__tag100!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag100== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block183Bytes, _wl_block183);

                                            if (_jsp__tag101(request, response, pageContext, _activeTag, __tag100))
                                             return;
                                            _bw.write(_wl_block184Bytes, _wl_block184);

                                            if (_jsp__tag102(request, response, pageContext, _activeTag, __tag100))
                                             return;
                                            _bw.write(_wl_block185Bytes, _wl_block185);

                                            if (_jsp__tag103(request, response, pageContext, _activeTag, __tag100))
                                             return;
                                            _bw.write(_wl_block184Bytes, _wl_block184);

                                            if (_jsp__tag104(request, response, pageContext, _activeTag, __tag100))
                                             return;
                                            _bw.write(_wl_block186Bytes, _wl_block186);
                                        } while (__tag100.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag100.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag100);
                                        return;
                                    }
                                    _activeTag=__tag100.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag100);
                                    __tag100.release();
                                    _bw.write(_wl_block131Bytes, _wl_block131);
                                     org.apache.struts.taglib.logic.EqualTag __tag105 = null ;
                                    int __result__tag105 = 0 ;

                                    if (__tag105 == null ){
                                        __tag105 = new  org.apache.struts.taglib.logic.EqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag105);
                                    }
                                    __tag105.setPageContext(pageContext);
                                    __tag105.setParent(__tag24);
                                    __tag105.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag105.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag105.setValue(AppConstants.YES
);
                                    _activeTag=__tag105;
                                    __result__tag105 = __tag105.doStartTag();

                                    if (__result__tag105!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag105== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block183Bytes, _wl_block183);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag106 = null ;
                                            int __result__tag106 = 0 ;

                                            if (__tag106 == null ){
                                                __tag106 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag106);
                                            }
                                            __tag106.setPageContext(pageContext);
                                            __tag106.setParent(__tag105);
                                            __tag106.setValue(toAddressDataOutbound.getPhoneNumber()
);
                                            _activeTag=__tag106;
                                            __result__tag106 = __tag106.doStartTag();

                                            if (__result__tag106!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag106== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag106.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag106);
                                                return;
                                            }
                                            _activeTag=__tag106.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag106);
                                            __tag106.release();
                                            _bw.write(_wl_block184Bytes, _wl_block184);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag107 = null ;
                                            int __result__tag107 = 0 ;

                                            if (__tag107 == null ){
                                                __tag107 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag107);
                                            }
                                            __tag107.setPageContext(pageContext);
                                            __tag107.setParent(__tag105);
                                            __tag107.setValue(toAddressDataOutbound.getPhoneNumberExt()
);
                                            _activeTag=__tag107;
                                            __result__tag107 = __tag107.doStartTag();

                                            if (__result__tag107!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag107== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag107.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag107);
                                                return;
                                            }
                                            _activeTag=__tag107.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag107);
                                            __tag107.release();
                                            _bw.write(_wl_block187Bytes, _wl_block187);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag108 = null ;
                                            int __result__tag108 = 0 ;

                                            if (__tag108 == null ){
                                                __tag108 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag108);
                                            }
                                            __tag108.setPageContext(pageContext);
                                            __tag108.setParent(__tag105);
                                            __tag108.setValue(fromAddressDataOutbound.getPhoneNumber()
);
                                            _activeTag=__tag108;
                                            __result__tag108 = __tag108.doStartTag();

                                            if (__result__tag108!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag108== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag108.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag108);
                                                return;
                                            }
                                            _activeTag=__tag108.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag108);
                                            __tag108.release();
                                            _bw.write(_wl_block184Bytes, _wl_block184);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag109 = null ;
                                            int __result__tag109 = 0 ;

                                            if (__tag109 == null ){
                                                __tag109 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag109);
                                            }
                                            __tag109.setPageContext(pageContext);
                                            __tag109.setParent(__tag105);
                                            __tag109.setValue(fromAddressDataOutbound.getPhoneNumberExt()
);
                                            _activeTag=__tag109;
                                            __result__tag109 = __tag109.doStartTag();

                                            if (__result__tag109!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag109== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag109.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag109);
                                                return;
                                            }
                                            _activeTag=__tag109.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag109);
                                            __tag109.release();
                                            _bw.write(_wl_block188Bytes, _wl_block188);

                                            if (_jsp__tag110(request, response, pageContext, _activeTag, __tag105))
                                             return;
                                            _bw.write(_wl_block184Bytes, _wl_block184);

                                            if (_jsp__tag111(request, response, pageContext, _activeTag, __tag105))
                                             return;
                                            _bw.write(_wl_block185Bytes, _wl_block185);

                                            if (_jsp__tag112(request, response, pageContext, _activeTag, __tag105))
                                             return;
                                            _bw.write(_wl_block184Bytes, _wl_block184);

                                            if (_jsp__tag113(request, response, pageContext, _activeTag, __tag105))
                                             return;
                                            _bw.write(_wl_block189Bytes, _wl_block189);
                                        } while (__tag105.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag105.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag105);
                                        return;
                                    }
                                    _activeTag=__tag105.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag105);
                                    __tag105.release();
                                    _bw.write(_wl_block141Bytes, _wl_block141);
                                     org.apache.struts.taglib.logic.NotEqualTag __tag114 = null ;
                                    int __result__tag114 = 0 ;

                                    if (__tag114 == null ){
                                        __tag114 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag114);
                                    }
                                    __tag114.setPageContext(pageContext);
                                    __tag114.setParent(__tag24);
                                    __tag114.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag114.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag114.setValue(AppConstants.YES
);
                                    _activeTag=__tag114;
                                    __result__tag114 = __tag114.doStartTag();

                                    if (__result__tag114!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag114== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block190Bytes, _wl_block190);

                                            if (_jsp__tag115(request, response, pageContext, _activeTag, __tag114))
                                             return;
                                            _bw.write(_wl_block191Bytes, _wl_block191);

                                            if (_jsp__tag116(request, response, pageContext, _activeTag, __tag114))
                                             return;
                                            _bw.write(_wl_block192Bytes, _wl_block192);
                                        } while (__tag114.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag114.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag114);
                                        return;
                                    }
                                    _activeTag=__tag114.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag114);
                                    __tag114.release();
                                    _bw.write(_wl_block193Bytes, _wl_block193);
                                     org.apache.struts.taglib.logic.EqualTag __tag117 = null ;
                                    int __result__tag117 = 0 ;

                                    if (__tag117 == null ){
                                        __tag117 = new  org.apache.struts.taglib.logic.EqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag117);
                                    }
                                    __tag117.setPageContext(pageContext);
                                    __tag117.setParent(__tag24);
                                    __tag117.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag117.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag117.setValue(AppConstants.YES
);
                                    _activeTag=__tag117;
                                    __result__tag117 = __tag117.doStartTag();

                                    if (__result__tag117!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag117== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block194Bytes, _wl_block194);
                                        } while (__tag117.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag117.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag117);
                                        return;
                                    }
                                    _activeTag=__tag117.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag117);
                                    __tag117.release();
                                    _bw.write(_wl_block195Bytes, _wl_block195);
                                } while (__tag24.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag24.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag24);
                                return;
                            }
                            _activeTag=__tag24.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag24);
                            __tag24.release();
                            _bw.write(_wl_block196Bytes, _wl_block196);
                             org.apache.struts.taglib.logic.EqualTag __tag118 = null ;
                            int __result__tag118 = 0 ;

                            if (__tag118 == null ){
                                __tag118 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag118);
                            }
                            __tag118.setPageContext(pageContext);
                            __tag118.setParent(__tag16);
                            __tag118.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag118.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isGroupShipment", java.lang.String.class,"property"));
                            __tag118.setValue(AppConstants.YES
);
                            _activeTag=__tag118;
                            __result__tag118 = __tag118.doStartTag();

                            if (__result__tag118!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag118== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block197Bytes, _wl_block197);

                                    if (_jsp__tag119(request, response, pageContext, _activeTag, __tag118))
                                     return;
                                    _bw.write(_wl_block198Bytes, _wl_block198);

                                    if (_jsp__tag120(request, response, pageContext, _activeTag, __tag118))
                                     return;
                                    _bw.write(_wl_block199Bytes, _wl_block199);

                                    if (_jsp__tag121(request, response, pageContext, _activeTag, __tag118))
                                     return;
                                    _bw.write(_wl_block200Bytes, _wl_block200);

                                    if (_jsp__tag122(request, response, pageContext, _activeTag, __tag118))
                                     return;
                                    _bw.write(_wl_block201Bytes, _wl_block201);

                                    if (_jsp__tag123(request, response, pageContext, _activeTag, __tag118))
                                     return;
                                    _bw.write(_wl_block202Bytes, _wl_block202);

                                    if (_jsp__tag124(request, response, pageContext, _activeTag, __tag118))
                                     return;
                                    _bw.write(_wl_block203Bytes, _wl_block203);

                                    if (_jsp__tag125(request, response, pageContext, _activeTag, __tag118))
                                     return;
                                    _bw.write(_wl_block204Bytes, _wl_block204);

                                    if (_jsp__tag126(request, response, pageContext, _activeTag, __tag118))
                                     return;
                                    _bw.write(_wl_block205Bytes, _wl_block205);

                                    if (_jsp__tag127(request, response, pageContext, _activeTag, __tag118))
                                     return;
                                    _bw.write(_wl_block206Bytes, _wl_block206);

                                    if (_jsp__tag128(request, response, pageContext, _activeTag, __tag118))
                                     return;
                                    _bw.write(_wl_block207Bytes, _wl_block207);

                                    if (_jsp__tag129(request, response, pageContext, _activeTag, __tag118))
                                     return;
                                    _bw.write(_wl_block208Bytes, _wl_block208);
                                } while (__tag118.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag118.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag118);
                                return;
                            }
                            _activeTag=__tag118.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag118);
                            __tag118.release();
                            _bw.write(_wl_block209Bytes, _wl_block209);
                            _bw.write(_wl_block210Bytes, _wl_block210);

                            if (_jsp__tag130(request, response, pageContext, _activeTag, __tag16))
                             return;
                            _bw.write(_wl_block211Bytes, _wl_block211);
                             org.apache.struts.taglib.logic.EqualTag __tag131 = null ;
                            int __result__tag131 = 0 ;

                            if (__tag131 == null ){
                                __tag131 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag131);
                            }
                            __tag131.setPageContext(pageContext);
                            __tag131.setParent(__tag16);
                            __tag131.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag131.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag131.setValue(AppConstants.YES
);
                            _activeTag=__tag131;
                            __result__tag131 = __tag131.doStartTag();

                            if (__result__tag131!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag131== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block212Bytes, _wl_block212);

                                    if (_jsp__tag132(request, response, pageContext, _activeTag, __tag131))
                                     return;
                                    _bw.write(_wl_block213Bytes, _wl_block213);
                                } while (__tag131.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag131.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag131);
                                return;
                            }
                            _activeTag=__tag131.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag131);
                            __tag131.release();
                            _bw.write(_wl_block214Bytes, _wl_block214);
                             org.apache.struts.taglib.logic.NotEqualTag __tag133 = null ;
                            int __result__tag133 = 0 ;

                            if (__tag133 == null ){
                                __tag133 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag133);
                            }
                            __tag133.setPageContext(pageContext);
                            __tag133.setParent(__tag16);
                            __tag133.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag133.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag133.setValue(AppConstants.YES
);
                            _activeTag=__tag133;
                            __result__tag133 = __tag133.doStartTag();

                            if (__result__tag133!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag133== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block215Bytes, _wl_block215);

                                    if (_jsp__tag134(request, response, pageContext, _activeTag, __tag133))
                                     return;
                                    _bw.write(_wl_block216Bytes, _wl_block216);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag135 = null ;
                                    int __result__tag135 = 0 ;

                                    if (__tag135 == null ){
                                        __tag135 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag135);
                                    }
                                    __tag135.setPageContext(pageContext);
                                    __tag135.setParent(__tag133);
                                    __tag135.setValue(trackingNumbers
);
                                    _activeTag=__tag135;
                                    __result__tag135 = __tag135.doStartTag();

                                    if (__result__tag135!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag135== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag135.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag135);
                                        return;
                                    }
                                    _activeTag=__tag135.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag135);
                                    __tag135.release();
                                    _bw.write(_wl_block217Bytes, _wl_block217);
                                } while (__tag133.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag133.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag133);
                                return;
                            }
                            _activeTag=__tag133.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag133);
                            __tag133.release();
                            _bw.write(_wl_block218Bytes, _wl_block218);
                             org.apache.struts.taglib.logic.EqualTag __tag136 = null ;
                            int __result__tag136 = 0 ;

                            if (__tag136 == null ){
                                __tag136 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag136);
                            }
                            __tag136.setPageContext(pageContext);
                            __tag136.setParent(__tag16);
                            __tag136.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag136.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag136.setValue(AppConstants.YES
);
                            _activeTag=__tag136;
                            __result__tag136 = __tag136.doStartTag();

                            if (__result__tag136!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag136== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block215Bytes, _wl_block215);

                                    if (_jsp__tag137(request, response, pageContext, _activeTag, __tag136))
                                     return;
                                    _bw.write(_wl_block216Bytes, _wl_block216);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag138 = null ;
                                    int __result__tag138 = 0 ;

                                    if (__tag138 == null ){
                                        __tag138 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag138);
                                    }
                                    __tag138.setPageContext(pageContext);
                                    __tag138.setParent(__tag136);
                                    __tag138.setValue(trackingNumbersOutbound
);
                                    _activeTag=__tag138;
                                    __result__tag138 = __tag138.doStartTag();

                                    if (__result__tag138!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag138== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag138.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag138);
                                        return;
                                    }
                                    _activeTag=__tag138.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag138);
                                    __tag138.release();
                                    _bw.write(_wl_block219Bytes, _wl_block219);

                                    if (_jsp__tag139(request, response, pageContext, _activeTag, __tag136))
                                     return;
                                    _bw.write(_wl_block216Bytes, _wl_block216);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag140 = null ;
                                    int __result__tag140 = 0 ;

                                    if (__tag140 == null ){
                                        __tag140 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag140);
                                    }
                                    __tag140.setPageContext(pageContext);
                                    __tag140.setParent(__tag136);
                                    __tag140.setValue(trackingNumbers
);
                                    _activeTag=__tag140;
                                    __result__tag140 = __tag140.doStartTag();

                                    if (__result__tag140!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag140== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag140.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag140);
                                        return;
                                    }
                                    _activeTag=__tag140.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag140);
                                    __tag140.release();
                                    _bw.write(_wl_block220Bytes, _wl_block220);
                                } while (__tag136.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag136.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag136);
                                return;
                            }
                            _activeTag=__tag136.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag136);
                            __tag136.release();
                            _bw.write(_wl_block221Bytes, _wl_block221);
if(!isReturnShipment){ 
                            _bw.write(_wl_block222Bytes, _wl_block222);

                            if (_jsp__tag141(request, response, pageContext, _activeTag, __tag16))
                             return;
                            _bw.write(_wl_block216Bytes, _wl_block216);
                             com.fedex.fsm.ship.web.taglib.ReformatDateTag __tag142 = null ;
                            int __result__tag142 = 0 ;

                            if (__tag142 == null ){
                                __tag142 = new  com.fedex.fsm.ship.web.taglib.ReformatDateTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag142);
                            }
                            __tag142.setPageContext(pageContext);
                            __tag142.setParent(__tag16);
                            __tag142.setShipDate(psdData.getShipDate()
);
                            __tag142.setLang(locale.getLanguage()
);
                            __tag142.setCountry(locale.getCountry()
);
                            _activeTag=__tag142;
                            __result__tag142 = __tag142.doStartTag();

                            if (__result__tag142!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag142== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.ReformatDateTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                            }
                            if (__tag142.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag142);
                                return;
                            }
                            _activeTag=__tag142.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag142);
                            __tag142.release();
                            _bw.write(_wl_block223Bytes, _wl_block223);
} else {
                            _bw.write(_wl_block131Bytes, _wl_block131);
                             org.apache.struts.taglib.logic.EqualTag __tag143 = null ;
                            int __result__tag143 = 0 ;

                            if (__tag143 == null ){
                                __tag143 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag143);
                            }
                            __tag143.setPageContext(pageContext);
                            __tag143.setParent(__tag16);
                            __tag143.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag143.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag143.setValue(AppConstants.YES
);
                            _activeTag=__tag143;
                            __result__tag143 = __tag143.doStartTag();

                            if (__result__tag143!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag143== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block224Bytes, _wl_block224);

                                    if (_jsp__tag144(request, response, pageContext, _activeTag, __tag143))
                                     return;
                                    _bw.write(_wl_block216Bytes, _wl_block216);
                                     com.fedex.fsm.ship.web.taglib.ReformatDateTag __tag145 = null ;
                                    int __result__tag145 = 0 ;

                                    if (__tag145 == null ){
                                        __tag145 = new  com.fedex.fsm.ship.web.taglib.ReformatDateTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag145);
                                    }
                                    __tag145.setPageContext(pageContext);
                                    __tag145.setParent(__tag143);
                                    __tag145.setShipDate(psdData.getShipDate()
);
                                    __tag145.setLang(locale.getLanguage()
);
                                    __tag145.setCountry(locale.getCountry()
);
                                    _activeTag=__tag145;
                                    __result__tag145 = __tag145.doStartTag();

                                    if (__result__tag145!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag145== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.ReformatDateTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag145.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag145);
                                        return;
                                    }
                                    _activeTag=__tag145.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag145);
                                    __tag145.release();
                                    _bw.write(_wl_block225Bytes, _wl_block225);
                                } while (__tag143.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag143.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag143);
                                return;
                            }
                            _activeTag=__tag143.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag143);
                            __tag143.release();
                            _bw.write(_wl_block226Bytes, _wl_block226);
if(!labelDisplay.getIsOutboundReturns().equals(AppConstants.YES)){ 
                            _bw.write(_wl_block227Bytes, _wl_block227);
}
                            _bw.write(_wl_block228Bytes, _wl_block228);

                            if (_jsp__tag146(request, response, pageContext, _activeTag, __tag16))
                             return;
                            _bw.write(_wl_block216Bytes, _wl_block216);
                             com.fedex.fsm.ship.web.taglib.ReformatDateTag __tag147 = null ;
                            int __result__tag147 = 0 ;

                            if (__tag147 == null ){
                                __tag147 = new  com.fedex.fsm.ship.web.taglib.ReformatDateTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag147);
                            }
                            __tag147.setPageContext(pageContext);
                            __tag147.setParent(__tag16);
                            __tag147.setShipDate(psdData.getShipDate()
);
                            __tag147.setLang(locale.getLanguage()
);
                            __tag147.setCountry(locale.getCountry()
);
                            _activeTag=__tag147;
                            __result__tag147 = __tag147.doStartTag();

                            if (__result__tag147!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag147== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.ReformatDateTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                            }
                            if (__tag147.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag147);
                                return;
                            }
                            _activeTag=__tag147.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag147);
                            __tag147.release();
                            _bw.write(_wl_block229Bytes, _wl_block229);
}
                            _bw.write(_wl_block230Bytes, _wl_block230);
 if(!labelDisplay.getIsOutboundReturns().equals(AppConstants.YES) &&
						!(labelDisplay.getIsReturns().equals(AppConstants.YES) && 	
							labelDisplay.getIsSmartPostShipment().equals(AppConstants.YES))) {
					
                            _bw.write(_wl_block231Bytes, _wl_block231);

                            if (_jsp__tag148(request, response, pageContext, _activeTag, __tag16))
                             return;
                            _bw.write(_wl_block232Bytes, _wl_block232);
if(!userProfileAdapter.isPasskeyUser()) { 
                            _bw.write(_wl_block233Bytes, _wl_block233);
                             com.fedex.framework.taglib.encode.HtmlTag __tag149 = null ;
                            int __result__tag149 = 0 ;

                            if (__tag149 == null ){
                                __tag149 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag149);
                            }
                            __tag149.setPageContext(pageContext);
                            __tag149.setParent(__tag16);
                            __tag149.setValue(netChargeAmountWithCurrencyCode
);
                            _activeTag=__tag149;
                            __result__tag149 = __tag149.doStartTag();

                            if (__result__tag149!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag149== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                            }
                            if (__tag149.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag149);
                                return;
                            }
                            _activeTag=__tag149.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag149);
                            __tag149.release();
                            _bw.write(_wl_block234Bytes, _wl_block234);
 } else if(!userProfileAdapter.getUserProfileVO().getPackageUserConfigurationVO().getPrivilegesVO().isHideRateQuoteAllowed()) { 
                            _bw.write(_wl_block233Bytes, _wl_block233);
                             com.fedex.framework.taglib.encode.HtmlTag __tag150 = null ;
                            int __result__tag150 = 0 ;

                            if (__tag150 == null ){
                                __tag150 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag150);
                            }
                            __tag150.setPageContext(pageContext);
                            __tag150.setParent(__tag16);
                            __tag150.setValue(netChargeAmountWithCurrencyCode
);
                            _activeTag=__tag150;
                            __result__tag150 = __tag150.doStartTag();

                            if (__result__tag150!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag150== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                            }
                            if (__tag150.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag150);
                                return;
                            }
                            _activeTag=__tag150.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag150);
                            __tag150.release();
                            _bw.write(_wl_block234Bytes, _wl_block234);
 } 
                            _bw.write(_wl_block235Bytes, _wl_block235);
 } 
                            _bw.write(_wl_block218Bytes, _wl_block218);
                             org.apache.struts.taglib.logic.EqualTag __tag151 = null ;
                            int __result__tag151 = 0 ;

                            if (__tag151 == null ){
                                __tag151 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag151);
                            }
                            __tag151.setPageContext(pageContext);
                            __tag151.setParent(__tag16);
                            __tag151.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag151.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag151.setValue(AppConstants.YES
);
                            _activeTag=__tag151;
                            __result__tag151 = __tag151.doStartTag();

                            if (__result__tag151!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag151== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block236Bytes, _wl_block236);

                                    if (_jsp__tag152(request, response, pageContext, _activeTag, __tag151))
                                     return;
                                    _bw.write(_wl_block184Bytes, _wl_block184);
if(!userProfileAdapter.isPasskeyUser()) { 
                                    _bw.write(_wl_block237Bytes, _wl_block237);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag153 = null ;
                                    int __result__tag153 = 0 ;

                                    if (__tag153 == null ){
                                        __tag153 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag153);
                                    }
                                    __tag153.setPageContext(pageContext);
                                    __tag153.setParent(__tag151);
                                    __tag153.setValue(outboundNetChargeAmountWithCurrencyCode
);
                                    _activeTag=__tag153;
                                    __result__tag153 = __tag153.doStartTag();

                                    if (__result__tag153!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag153== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag153.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag153);
                                        return;
                                    }
                                    _activeTag=__tag153.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag153);
                                    __tag153.release();
                                    _bw.write(_wl_block233Bytes, _wl_block233);
}
								if(userProfileAdapter.isPasskeyUser()) { 
									if(!userProfileAdapter.getUserProfileVO().getPackageUserConfigurationVO().getPrivilegesVO().isHideRateQuoteAllowed()) { 
                                    _bw.write(_wl_block238Bytes, _wl_block238);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag154 = null ;
                                    int __result__tag154 = 0 ;

                                    if (__tag154 == null ){
                                        __tag154 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag154);
                                    }
                                    __tag154.setPageContext(pageContext);
                                    __tag154.setParent(__tag151);
                                    __tag154.setValue(outboundNetChargeAmountWithCurrencyCode
);
                                    _activeTag=__tag154;
                                    __result__tag154 = __tag154.doStartTag();

                                    if (__result__tag154!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag154== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag154.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag154);
                                        return;
                                    }
                                    _activeTag=__tag154.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag154);
                                    __tag154.release();
                                    _bw.write(_wl_block233Bytes, _wl_block233);
}} 
                                    _bw.write(_wl_block239Bytes, _wl_block239);

                                    if (_jsp__tag155(request, response, pageContext, _activeTag, __tag151))
                                     return;
                                    _bw.write(_wl_block184Bytes, _wl_block184);
if(!userProfileAdapter.isPasskeyUser()) { 
                                    _bw.write(_wl_block237Bytes, _wl_block237);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag156 = null ;
                                    int __result__tag156 = 0 ;

                                    if (__tag156 == null ){
                                        __tag156 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag156);
                                    }
                                    __tag156.setPageContext(pageContext);
                                    __tag156.setParent(__tag151);
                                    __tag156.setValue(netChargeAmountWithCurrencyCode
);
                                    _activeTag=__tag156;
                                    __result__tag156 = __tag156.doStartTag();

                                    if (__result__tag156!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag156== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag156.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag156);
                                        return;
                                    }
                                    _activeTag=__tag156.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag156);
                                    __tag156.release();
                                    _bw.write(_wl_block233Bytes, _wl_block233);
}
								if(userProfileAdapter.isPasskeyUser()) { 
									if(!userProfileAdapter.getUserProfileVO().getPackageUserConfigurationVO().getPrivilegesVO().isHideRateQuoteAllowed()) { 
                                    _bw.write(_wl_block238Bytes, _wl_block238);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag157 = null ;
                                    int __result__tag157 = 0 ;

                                    if (__tag157 == null ){
                                        __tag157 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag157);
                                    }
                                    __tag157.setPageContext(pageContext);
                                    __tag157.setParent(__tag151);
                                    __tag157.setValue(netChargeAmountWithCurrencyCode
);
                                    _activeTag=__tag157;
                                    __result__tag157 = __tag157.doStartTag();

                                    if (__result__tag157!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag157== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag157.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag157);
                                        return;
                                    }
                                    _activeTag=__tag157.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag157);
                                    __tag157.release();
                                    _bw.write(_wl_block233Bytes, _wl_block233);
}} 
                                    _bw.write(_wl_block240Bytes, _wl_block240);
                                } while (__tag151.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag151.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag151);
                                return;
                            }
                            _activeTag=__tag151.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag151);
                            __tag151.release();
                            _bw.write(_wl_block241Bytes, _wl_block241);
                             org.apache.struts.taglib.logic.EqualTag __tag158 = null ;
                            int __result__tag158 = 0 ;

                            if (__tag158 == null ){
                                __tag158 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag158);
                            }
                            __tag158.setPageContext(pageContext);
                            __tag158.setParent(__tag16);
                            __tag158.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag158.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag158.setValue(AppConstants.YES
);
                            _activeTag=__tag158;
                            __result__tag158 = __tag158.doStartTag();

                            if (__result__tag158!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag158== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block242Bytes, _wl_block242);
                                } while (__tag158.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag158.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag158);
                                return;
                            }
                            _activeTag=__tag158.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag158);
                            __tag158.release();
                            _bw.write(_wl_block243Bytes, _wl_block243);
                            _bw.write(_wl_block244Bytes, _wl_block244);

                            if (_jsp__tag159(request, response, pageContext, _activeTag, __tag16))
                             return;
                            _bw.write(_wl_block245Bytes, _wl_block245);
                             org.apache.struts.taglib.logic.EqualTag __tag160 = null ;
                            int __result__tag160 = 0 ;

                            if (__tag160 == null ){
                                __tag160 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag160);
                            }
                            __tag160.setPageContext(pageContext);
                            __tag160.setParent(__tag16);
                            __tag160.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag160.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag160.setValue(AppConstants.YES
);
                            _activeTag=__tag160;
                            __result__tag160 = __tag160.doStartTag();

                            if (__result__tag160!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag160== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block246Bytes, _wl_block246);

                                    if (_jsp__tag161(request, response, pageContext, _activeTag, __tag160))
                                     return;
                                    _bw.write(_wl_block247Bytes, _wl_block247);
                                } while (__tag160.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag160.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag160);
                                return;
                            }
                            _activeTag=__tag160.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag160);
                            __tag160.release();
                            _bw.write(_wl_block248Bytes, _wl_block248);
                             org.apache.struts.taglib.logic.NotEqualTag __tag162 = null ;
                            int __result__tag162 = 0 ;

                            if (__tag162 == null ){
                                __tag162 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag162);
                            }
                            __tag162.setPageContext(pageContext);
                            __tag162.setParent(__tag16);
                            __tag162.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag162.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag162.setValue(AppConstants.YES 
);
                            _activeTag=__tag162;
                            __result__tag162 = __tag162.doStartTag();

                            if (__result__tag162!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag162== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block218Bytes, _wl_block218);
                                     org.apache.struts.taglib.logic.EqualTag __tag163 = null ;
                                    int __result__tag163 = 0 ;

                                    if (__tag163 == null ){
                                        __tag163 = new  org.apache.struts.taglib.logic.EqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag163);
                                    }
                                    __tag163.setPageContext(pageContext);
                                    __tag163.setParent(__tag162);
                                    __tag163.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag163.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isReturns", java.lang.String.class,"property"));
                                    __tag163.setValue(AppConstants.YES 
);
                                    _activeTag=__tag163;
                                    __result__tag163 = __tag163.doStartTag();

                                    if (__result__tag163!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag163== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block249Bytes, _wl_block249);
if (isImportShipment) { 
                                            _bw.write(_wl_block250Bytes, _wl_block250);

                                            if (_jsp__tag164(request, response, pageContext, _activeTag, __tag163))
                                             return;
                                            _bw.write(_wl_block251Bytes, _wl_block251);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag165 = null ;
                                            int __result__tag165 = 0 ;

                                            if (__tag165 == null ){
                                                __tag165 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag165);
                                            }
                                            __tag165.setPageContext(pageContext);
                                            __tag165.setParent(__tag163);
                                            __tag165.setValue(returnLabelTypeForShipmentReceipt
);
                                            _activeTag=__tag165;
                                            __result__tag165 = __tag165.doStartTag();

                                            if (__result__tag165!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag165== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag165.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag165);
                                                return;
                                            }
                                            _activeTag=__tag165.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag165);
                                            __tag165.release();
                                            _bw.write(_wl_block252Bytes, _wl_block252);

                                            if (_jsp__tag166(request, response, pageContext, _activeTag, __tag163))
                                             return;
                                            _bw.write(_wl_block251Bytes, _wl_block251);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag167 = null ;
                                            int __result__tag167 = 0 ;

                                            if (__tag167 == null ){
                                                __tag167 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag167);
                                            }
                                            __tag167.setPageContext(pageContext);
                                            __tag167.setParent(__tag163);
                                            __tag167.setValue(returnOptionsData.getEmailAddress()
);
                                            _activeTag=__tag167;
                                            __result__tag167 = __tag167.doStartTag();

                                            if (__result__tag167!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag167== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag167.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag167);
                                                return;
                                            }
                                            _activeTag=__tag167.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag167);
                                            __tag167.release();
                                            _bw.write(_wl_block253Bytes, _wl_block253);
 } else { 
                                            _bw.write(_wl_block250Bytes, _wl_block250);

                                            if (_jsp__tag168(request, response, pageContext, _activeTag, __tag163))
                                             return;
                                            _bw.write(_wl_block251Bytes, _wl_block251);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag169 = null ;
                                            int __result__tag169 = 0 ;

                                            if (__tag169 == null ){
                                                __tag169 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag169);
                                            }
                                            __tag169.setPageContext(pageContext);
                                            __tag169.setParent(__tag163);
                                            __tag169.setValue(returnLabelTypeForShipmentReceipt
);
                                            _activeTag=__tag169;
                                            __result__tag169 = __tag169.doStartTag();

                                            if (__result__tag169!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag169== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag169.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag169);
                                                return;
                                            }
                                            _activeTag=__tag169.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag169);
                                            __tag169.release();
                                            _bw.write(_wl_block252Bytes, _wl_block252);

                                            if (_jsp__tag170(request, response, pageContext, _activeTag, __tag163))
                                             return;
                                            _bw.write(_wl_block251Bytes, _wl_block251);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag171 = null ;
                                            int __result__tag171 = 0 ;

                                            if (__tag171 == null ){
                                                __tag171 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag171);
                                            }
                                            __tag171.setPageContext(pageContext);
                                            __tag171.setParent(__tag163);
                                            __tag171.setValue(returnOptionsData.getEmailAddress()
);
                                            _activeTag=__tag171;
                                            __result__tag171 = __tag171.doStartTag();

                                            if (__result__tag171!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag171== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag171.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag171);
                                                return;
                                            }
                                            _activeTag=__tag171.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag171);
                                            __tag171.release();
                                            _bw.write(_wl_block253Bytes, _wl_block253);
 } 
                                            _bw.write(_wl_block254Bytes, _wl_block254);
                                        } while (__tag163.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag163.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag163);
                                        return;
                                    }
                                    _activeTag=__tag163.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag163);
                                    __tag163.release();
                                    _bw.write(_wl_block255Bytes, _wl_block255);
                                } while (__tag162.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag162.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag162);
                                return;
                            }
                            _activeTag=__tag162.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag162);
                            __tag162.release();
                            _bw.write(_wl_block256Bytes, _wl_block256);
                             org.apache.struts.taglib.logic.EqualTag __tag172 = null ;
                            int __result__tag172 = 0 ;

                            if (__tag172 == null ){
                                __tag172 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag172);
                            }
                            __tag172.setPageContext(pageContext);
                            __tag172.setParent(__tag16);
                            __tag172.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag172.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag172.setValue(AppConstants.YES
);
                            _activeTag=__tag172;
                            __result__tag172 = __tag172.doStartTag();

                            if (__result__tag172!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag172== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block257Bytes, _wl_block257);
if(isFedExOneRateShippingEnabled) {
                                    _bw.write(_wl_block258Bytes, _wl_block258);

                                    if (_jsp__tag173(request, response, pageContext, _activeTag, __tag172))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag174 = null ;
                                    int __result__tag174 = 0 ;

                                    if (__tag174 == null ){
                                        __tag174 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag174);
                                    }
                                    __tag174.setPageContext(pageContext);
                                    __tag174.setParent(__tag172);
                                    __tag174.setValue(outboundPricingOptionValue
);
                                    _activeTag=__tag174;
                                    __result__tag174 = __tag174.doStartTag();

                                    if (__result__tag174!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag174== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag174.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag174);
                                        return;
                                    }
                                    _activeTag=__tag174.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag174);
                                    __tag174.release();
                                    _bw.write(_wl_block259Bytes, _wl_block259);

                                    if (_jsp__tag175(request, response, pageContext, _activeTag, __tag172))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag176 = null ;
                                    int __result__tag176 = 0 ;

                                    if (__tag176 == null ){
                                        __tag176 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag176);
                                    }
                                    __tag176.setPageContext(pageContext);
                                    __tag176.setParent(__tag172);
                                    __tag176.setValue(returnLabelTypeForShipmentReceipt
);
                                    _activeTag=__tag176;
                                    __result__tag176 = __tag176.doStartTag();

                                    if (__result__tag176!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag176== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag176.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag176);
                                        return;
                                    }
                                    _activeTag=__tag176.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag176);
                                    __tag176.release();
                                    _bw.write(_wl_block260Bytes, _wl_block260);

                                    if (_jsp__tag177(request, response, pageContext, _activeTag, __tag172))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag178 = null ;
                                    int __result__tag178 = 0 ;

                                    if (__tag178 == null ){
                                        __tag178 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag178);
                                    }
                                    __tag178.setPageContext(pageContext);
                                    __tag178.setParent(__tag172);
                                    __tag178.setValue(psdDataOutbound.getServiceType()
);
                                    _activeTag=__tag178;
                                    __result__tag178 = __tag178.doStartTag();

                                    if (__result__tag178!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag178== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag178.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag178);
                                        return;
                                    }
                                    _activeTag=__tag178.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag178);
                                    __tag178.release();
                                    _bw.write(_wl_block261Bytes, _wl_block261);

                                    if (_jsp__tag179(request, response, pageContext, _activeTag, __tag172))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag180 = null ;
                                    int __result__tag180 = 0 ;

                                    if (__tag180 == null ){
                                        __tag180 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag180);
                                    }
                                    __tag180.setPageContext(pageContext);
                                    __tag180.setParent(__tag172);
                                    __tag180.setValue(pricingOptionValue
);
                                    _activeTag=__tag180;
                                    __result__tag180 = __tag180.doStartTag();

                                    if (__result__tag180!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag180== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag180.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag180);
                                        return;
                                    }
                                    _activeTag=__tag180.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag180);
                                    __tag180.release();
                                    _bw.write(_wl_block262Bytes, _wl_block262);
} else {
                                    _bw.write(_wl_block263Bytes, _wl_block263);

                                    if (_jsp__tag181(request, response, pageContext, _activeTag, __tag172))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag182 = null ;
                                    int __result__tag182 = 0 ;

                                    if (__tag182 == null ){
                                        __tag182 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag182);
                                    }
                                    __tag182.setPageContext(pageContext);
                                    __tag182.setParent(__tag172);
                                    __tag182.setValue(psdDataOutbound.getServiceType()
);
                                    _activeTag=__tag182;
                                    __result__tag182 = __tag182.doStartTag();

                                    if (__result__tag182!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag182== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag182.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag182);
                                        return;
                                    }
                                    _activeTag=__tag182.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag182);
                                    __tag182.release();
                                    _bw.write(_wl_block259Bytes, _wl_block259);

                                    if (_jsp__tag183(request, response, pageContext, _activeTag, __tag172))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag184 = null ;
                                    int __result__tag184 = 0 ;

                                    if (__tag184 == null ){
                                        __tag184 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag184);
                                    }
                                    __tag184.setPageContext(pageContext);
                                    __tag184.setParent(__tag172);
                                    __tag184.setValue(returnLabelTypeForShipmentReceipt
);
                                    _activeTag=__tag184;
                                    __result__tag184 = __tag184.doStartTag();

                                    if (__result__tag184!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag184== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag184.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag184);
                                        return;
                                    }
                                    _activeTag=__tag184.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag184);
                                    __tag184.release();
                                    _bw.write(_wl_block262Bytes, _wl_block262);
} 
                                    _bw.write(_wl_block264Bytes, _wl_block264);

                                    if (_jsp__tag185(request, response, pageContext, _activeTag, __tag172))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag186 = null ;
                                    int __result__tag186 = 0 ;

                                    if (__tag186 == null ){
                                        __tag186 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag186);
                                    }
                                    __tag186.setPageContext(pageContext);
                                    __tag186.setParent(__tag172);
                                    __tag186.setValue(psdDataOutbound.getPackageType()
);
                                    _activeTag=__tag186;
                                    __result__tag186 = __tag186.doStartTag();

                                    if (__result__tag186!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag186== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag186.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag186);
                                        return;
                                    }
                                    _activeTag=__tag186.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag186);
                                    __tag186.release();
                                    _bw.write(_wl_block265Bytes, _wl_block265);

                                    if (_jsp__tag187(request, response, pageContext, _activeTag, __tag172))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag188 = null ;
                                    int __result__tag188 = 0 ;

                                    if (__tag188 == null ){
                                        __tag188 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag188);
                                    }
                                    __tag188.setPageContext(pageContext);
                                    __tag188.setParent(__tag172);
                                    __tag188.setValue(serviceTypeDescription
);
                                    _activeTag=__tag188;
                                    __result__tag188 = __tag188.doStartTag();

                                    if (__result__tag188!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag188== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag188.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag188);
                                        return;
                                    }
                                    _activeTag=__tag188.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag188);
                                    __tag188.release();
                                    _bw.write(_wl_block266Bytes, _wl_block266);
                                } while (__tag172.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag172.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag172);
                                return;
                            }
                            _activeTag=__tag172.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag172);
                            __tag172.release();
                            _bw.write(_wl_block267Bytes, _wl_block267);
                             org.apache.struts.taglib.logic.NotEqualTag __tag189 = null ;
                            int __result__tag189 = 0 ;

                            if (__tag189 == null ){
                                __tag189 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag189);
                            }
                            __tag189.setPageContext(pageContext);
                            __tag189.setParent(__tag16);
                            __tag189.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag189.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag189.setValue(AppConstants.YES 
);
                            _activeTag=__tag189;
                            __result__tag189 = __tag189.doStartTag();

                            if (__result__tag189!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag189== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block268Bytes, _wl_block268);
if(isFedExOneRateShippingEnabled) {
                                    _bw.write(_wl_block269Bytes, _wl_block269);

                                    if (_jsp__tag190(request, response, pageContext, _activeTag, __tag189))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag191 = null ;
                                    int __result__tag191 = 0 ;

                                    if (__tag191 == null ){
                                        __tag191 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag191);
                                    }
                                    __tag191.setPageContext(pageContext);
                                    __tag191.setParent(__tag189);
                                    __tag191.setValue(pricingOptionValue
);
                                    _activeTag=__tag191;
                                    __result__tag191 = __tag191.doStartTag();

                                    if (__result__tag191!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag191== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag191.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag191);
                                        return;
                                    }
                                    _activeTag=__tag191.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag191);
                                    __tag191.release();
                                    _bw.write(_wl_block270Bytes, _wl_block270);
} 
                                    _bw.write(_wl_block271Bytes, _wl_block271);

                                    if (_jsp__tag192(request, response, pageContext, _activeTag, __tag189))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag193 = null ;
                                    int __result__tag193 = 0 ;

                                    if (__tag193 == null ){
                                        __tag193 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag193);
                                    }
                                    __tag193.setPageContext(pageContext);
                                    __tag193.setParent(__tag189);
                                    __tag193.setValue(serviceTypeDescription
);
                                    _activeTag=__tag193;
                                    __result__tag193 = __tag193.doStartTag();

                                    if (__result__tag193!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag193== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag193.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag193);
                                        return;
                                    }
                                    _activeTag=__tag193.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag193);
                                    __tag193.release();
                                    _bw.write(_wl_block272Bytes, _wl_block272);
                                } while (__tag189.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag189.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag189);
                                return;
                            }
                            _activeTag=__tag189.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag189);
                            __tag189.release();
                            _bw.write(_wl_block273Bytes, _wl_block273);
                             org.apache.struts.taglib.logic.NotEqualTag __tag194 = null ;
                            int __result__tag194 = 0 ;

                            if (__tag194 == null ){
                                __tag194 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag194);
                            }
                            __tag194.setPageContext(pageContext);
                            __tag194.setParent(__tag16);
                            __tag194.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag194.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag194.setValue(AppConstants.YES 
);
                            _activeTag=__tag194;
                            __result__tag194 = __tag194.doStartTag();

                            if (__result__tag194!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag194== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block274Bytes, _wl_block274);

                                    if (_jsp__tag195(request, response, pageContext, _activeTag, __tag194))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag196 = null ;
                                    int __result__tag196 = 0 ;

                                    if (__tag196 == null ){
                                        __tag196 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag196);
                                    }
                                    __tag196.setPageContext(pageContext);
                                    __tag196.setParent(__tag194);
                                    __tag196.setValue(packageTypeDescription 
);
                                    _activeTag=__tag196;
                                    __result__tag196 = __tag196.doStartTag();

                                    if (__result__tag196!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag196== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag196.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag196);
                                        return;
                                    }
                                    _activeTag=__tag196.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag196);
                                    __tag196.release();
                                    _bw.write(_wl_block275Bytes, _wl_block275);
                                } while (__tag194.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag194.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag194);
                                return;
                            }
                            _activeTag=__tag194.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag194);
                            __tag194.release();
                            _bw.write(_wl_block218Bytes, _wl_block218);
                             org.apache.struts.taglib.logic.EqualTag __tag197 = null ;
                            int __result__tag197 = 0 ;

                            if (__tag197 == null ){
                                __tag197 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag197);
                            }
                            __tag197.setPageContext(pageContext);
                            __tag197.setParent(__tag16);
                            __tag197.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag197.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag197.setValue(AppConstants.YES
);
                            _activeTag=__tag197;
                            __result__tag197 = __tag197.doStartTag();

                            if (__result__tag197!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag197== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block276Bytes, _wl_block276);
if(isReturnShipment){ 
                                    _bw.write(_wl_block277Bytes, _wl_block277);

                                    if (_jsp__tag198(request, response, pageContext, _activeTag, __tag197))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag199 = null ;
                                    int __result__tag199 = 0 ;

                                    if (__tag199 == null ){
                                        __tag199 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag199);
                                    }
                                    __tag199.setPageContext(pageContext);
                                    __tag199.setParent(__tag197);
                                    __tag199.setValue(noOfPackagesOutbound
);
                                    _activeTag=__tag199;
                                    __result__tag199 = __tag199.doStartTag();

                                    if (__result__tag199!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag199== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag199.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag199);
                                        return;
                                    }
                                    _activeTag=__tag199.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag199);
                                    __tag199.release();
                                    _bw.write(_wl_block131Bytes, _wl_block131);
} else { 
                                    _bw.write(_wl_block234Bytes, _wl_block234);

                                    if (_jsp__tag200(request, response, pageContext, _activeTag, __tag197))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag201 = null ;
                                    int __result__tag201 = 0 ;

                                    if (__tag201 == null ){
                                        __tag201 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag201);
                                    }
                                    __tag201.setPageContext(pageContext);
                                    __tag201.setParent(__tag197);
                                    __tag201.setValue(noOfPackagesOutbound
);
                                    _activeTag=__tag201;
                                    __result__tag201 = __tag201.doStartTag();

                                    if (__result__tag201!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag201== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag201.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag201);
                                        return;
                                    }
                                    _activeTag=__tag201.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag201);
                                    __tag201.release();
                                    _bw.write(_wl_block131Bytes, _wl_block131);
} 
                                    _bw.write(_wl_block278Bytes, _wl_block278);

                                    if (_jsp__tag202(request, response, pageContext, _activeTag, __tag197))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag203 = null ;
                                    int __result__tag203 = 0 ;

                                    if (__tag203 == null ){
                                        __tag203 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag203);
                                    }
                                    __tag203.setPageContext(pageContext);
                                    __tag203.setParent(__tag197);
                                    __tag203.setValue(packageTypeDescription 
);
                                    _activeTag=__tag203;
                                    __result__tag203 = __tag203.doStartTag();

                                    if (__result__tag203!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag203== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag203.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag203);
                                        return;
                                    }
                                    _activeTag=__tag203.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag203);
                                    __tag203.release();
                                    _bw.write(_wl_block275Bytes, _wl_block275);
                                } while (__tag197.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag197.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag197);
                                return;
                            }
                            _activeTag=__tag197.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag197);
                            __tag197.release();
                            _bw.write(_wl_block214Bytes, _wl_block214);
                             org.apache.struts.taglib.logic.NotEqualTag __tag204 = null ;
                            int __result__tag204 = 0 ;

                            if (__tag204 == null ){
                                __tag204 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag204);
                            }
                            __tag204.setPageContext(pageContext);
                            __tag204.setParent(__tag16);
                            __tag204.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag204.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag204.setValue(AppConstants.YES 
);
                            _activeTag=__tag204;
                            __result__tag204 = __tag204.doStartTag();

                            if (__result__tag204!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag204== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block131Bytes, _wl_block131);
 if (!isFreight) {
                                    _bw.write(_wl_block279Bytes, _wl_block279);
if(isImportShipment){ 
                                    _bw.write(_wl_block280Bytes, _wl_block280);

                                    if (_jsp__tag205(request, response, pageContext, _activeTag, __tag204))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag206 = null ;
                                    int __result__tag206 = 0 ;

                                    if (__tag206 == null ){
                                        __tag206 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag206);
                                    }
                                    __tag206.setPageContext(pageContext);
                                    __tag206.setParent(__tag204);
                                    __tag206.setValue(noOfPackages
);
                                    _activeTag=__tag206;
                                    __result__tag206 = __tag206.doStartTag();

                                    if (__result__tag206!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag206== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag206.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag206);
                                        return;
                                    }
                                    _activeTag=__tag206.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag206);
                                    __tag206.release();
                                    _bw.write(_wl_block281Bytes, _wl_block281);
 } else if(isReturnShipment){ 
                                    _bw.write(_wl_block280Bytes, _wl_block280);

                                    if (_jsp__tag207(request, response, pageContext, _activeTag, __tag204))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag208 = null ;
                                    int __result__tag208 = 0 ;

                                    if (__tag208 == null ){
                                        __tag208 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag208);
                                    }
                                    __tag208.setPageContext(pageContext);
                                    __tag208.setParent(__tag204);
                                    __tag208.setValue(noOfPackages
);
                                    _activeTag=__tag208;
                                    __result__tag208 = __tag208.doStartTag();

                                    if (__result__tag208!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag208== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag208.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag208);
                                        return;
                                    }
                                    _activeTag=__tag208.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag208);
                                    __tag208.release();
                                    _bw.write(_wl_block233Bytes, _wl_block233);
} else { 
                                    _bw.write(_wl_block282Bytes, _wl_block282);

                                    if (_jsp__tag209(request, response, pageContext, _activeTag, __tag204))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag210 = null ;
                                    int __result__tag210 = 0 ;

                                    if (__tag210 == null ){
                                        __tag210 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag210);
                                    }
                                    __tag210.setPageContext(pageContext);
                                    __tag210.setParent(__tag204);
                                    __tag210.setValue(noOfPackages
);
                                    _activeTag=__tag210;
                                    __result__tag210 = __tag210.doStartTag();

                                    if (__result__tag210!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag210== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag210.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag210);
                                        return;
                                    }
                                    _activeTag=__tag210.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag210);
                                    __tag210.release();
                                    _bw.write(_wl_block233Bytes, _wl_block233);
} 
                                    _bw.write(_wl_block283Bytes, _wl_block283);
 } else { 
                                    _bw.write(_wl_block284Bytes, _wl_block284);

                                    if (_jsp__tag211(request, response, pageContext, _activeTag, __tag204))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag212 = null ;
                                    int __result__tag212 = 0 ;

                                    if (__tag212 == null ){
                                        __tag212 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag212);
                                    }
                                    __tag212.setPageContext(pageContext);
                                    __tag212.setParent(__tag204);
                                    __tag212.setValue(noOfSkids
);
                                    _activeTag=__tag212;
                                    __result__tag212 = __tag212.doStartTag();

                                    if (__result__tag212!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag212== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag212.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag212);
                                        return;
                                    }
                                    _activeTag=__tag212.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag212);
                                    __tag212.release();
                                    _bw.write(_wl_block285Bytes, _wl_block285);

                                    if (_jsp__tag213(request, response, pageContext, _activeTag, __tag204))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag214 = null ;
                                    int __result__tag214 = 0 ;

                                    if (__tag214 == null ){
                                        __tag214 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag214);
                                    }
                                    __tag214.setPageContext(pageContext);
                                    __tag214.setParent(__tag204);
                                    __tag214.setValue(totalNoOfPieces
);
                                    _activeTag=__tag214;
                                    __result__tag214 = __tag214.doStartTag();

                                    if (__result__tag214!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag214== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag214.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag214);
                                        return;
                                    }
                                    _activeTag=__tag214.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag214);
                                    __tag214.release();
                                    _bw.write(_wl_block286Bytes, _wl_block286);

                                    if (_jsp__tag215(request, response, pageContext, _activeTag, __tag204))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag216 = null ;
                                    int __result__tag216 = 0 ;

                                    if (__tag216 == null ){
                                        __tag216 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag216);
                                    }
                                    __tag216.setPageContext(pageContext);
                                    __tag216.setParent(__tag204);
                                    __tag216.setValue(bookingConfNumber
);
                                    _activeTag=__tag216;
                                    __result__tag216 = __tag216.doStartTag();

                                    if (__result__tag216!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag216== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag216.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag216);
                                        return;
                                    }
                                    _activeTag=__tag216.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag216);
                                    __tag216.release();
                                    _bw.write(_wl_block287Bytes, _wl_block287);
 } 
                                    _bw.write(_wl_block288Bytes, _wl_block288);
                                } while (__tag204.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag204.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag204);
                                return;
                            }
                            _activeTag=__tag204.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag204);
                            __tag204.release();
                            _bw.write(_wl_block218Bytes, _wl_block218);
                             org.apache.struts.taglib.logic.EqualTag __tag217 = null ;
                            int __result__tag217 = 0 ;

                            if (__tag217 == null ){
                                __tag217 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag217);
                            }
                            __tag217.setPageContext(pageContext);
                            __tag217.setParent(__tag16);
                            __tag217.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag217.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag217.setValue(AppConstants.YES
);
                            _activeTag=__tag217;
                            __result__tag217 = __tag217.doStartTag();

                            if (__result__tag217!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag217== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block289Bytes, _wl_block289);

                                    if (_jsp__tag218(request, response, pageContext, _activeTag, __tag217))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag219 = null ;
                                    int __result__tag219 = 0 ;

                                    if (__tag219 == null ){
                                        __tag219 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag219);
                                    }
                                    __tag219.setPageContext(pageContext);
                                    __tag219.setParent(__tag217);
                                    __tag219.setValue(totalWeightOutbound + " " + outBoundWeightUnitOfMeasure
);
                                    _activeTag=__tag219;
                                    __result__tag219 = __tag219.doStartTag();

                                    if (__result__tag219!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag219== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag219.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag219);
                                        return;
                                    }
                                    _activeTag=__tag219.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag219);
                                    __tag219.release();
                                    _bw.write(_wl_block290Bytes, _wl_block290);
if(isReturnShipment){ 
                                    _bw.write(_wl_block277Bytes, _wl_block277);

                                    if (_jsp__tag220(request, response, pageContext, _activeTag, __tag217))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag221 = null ;
                                    int __result__tag221 = 0 ;

                                    if (__tag221 == null ){
                                        __tag221 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag221);
                                    }
                                    __tag221.setPageContext(pageContext);
                                    __tag221.setParent(__tag217);
                                    __tag221.setValue(noOfPackages
);
                                    _activeTag=__tag221;
                                    __result__tag221 = __tag221.doStartTag();

                                    if (__result__tag221!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag221== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag221.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag221);
                                        return;
                                    }
                                    _activeTag=__tag221.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag221);
                                    __tag221.release();
                                    _bw.write(_wl_block131Bytes, _wl_block131);
} else { 
                                    _bw.write(_wl_block234Bytes, _wl_block234);

                                    if (_jsp__tag222(request, response, pageContext, _activeTag, __tag217))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag223 = null ;
                                    int __result__tag223 = 0 ;

                                    if (__tag223 == null ){
                                        __tag223 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag223);
                                    }
                                    __tag223.setPageContext(pageContext);
                                    __tag223.setParent(__tag217);
                                    __tag223.setValue(noOfPackages
);
                                    _activeTag=__tag223;
                                    __result__tag223 = __tag223.doStartTag();

                                    if (__result__tag223!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag223== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag223.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag223);
                                        return;
                                    }
                                    _activeTag=__tag223.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag223);
                                    __tag223.release();
                                    _bw.write(_wl_block131Bytes, _wl_block131);
} 
                                    _bw.write(_wl_block275Bytes, _wl_block275);
                                } while (__tag217.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag217.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag217);
                                return;
                            }
                            _activeTag=__tag217.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag217);
                            __tag217.release();
                            _bw.write(_wl_block291Bytes, _wl_block291);
                             org.apache.struts.taglib.logic.NotEqualTag __tag224 = null ;
                            int __result__tag224 = 0 ;

                            if (__tag224 == null ){
                                __tag224 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag224);
                            }
                            __tag224.setPageContext(pageContext);
                            __tag224.setParent(__tag16);
                            __tag224.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag224.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag224.setValue(AppConstants.YES 
);
                            _activeTag=__tag224;
                            __result__tag224 = __tag224.doStartTag();

                            if (__result__tag224!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag224== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block292Bytes, _wl_block292);
                                     org.apache.struts.taglib.logic.EqualTag __tag225 = null ;
                                    int __result__tag225 = 0 ;

                                    if (__tag225 == null ){
                                        __tag225 = new  org.apache.struts.taglib.logic.EqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag225);
                                    }
                                    __tag225.setPageContext(pageContext);
                                    __tag225.setParent(__tag224);
                                    __tag225.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag225.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isReturns", java.lang.String.class,"property"));
                                    __tag225.setValue(AppConstants.YES 
);
                                    _activeTag=__tag225;
                                    __result__tag225 = __tag225.doStartTag();

                                    if (__result__tag225!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag225== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block131Bytes, _wl_block131);
 if(!isImportShipment) { 
                                            _bw.write(_wl_block293Bytes, _wl_block293);

                                            if (_jsp__tag226(request, response, pageContext, _activeTag, __tag225))
                                             return;
                                            _bw.write(_wl_block251Bytes, _wl_block251);

                                            if (_jsp__tag227(request, response, pageContext, _activeTag, __tag225))
                                             return;
                                            _bw.write(_wl_block294Bytes, _wl_block294);
 } 
                                            _bw.write(_wl_block218Bytes, _wl_block218);
                                        } while (__tag225.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag225.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag225);
                                        return;
                                    }
                                    _activeTag=__tag225.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag225);
                                    __tag225.release();
                                    _bw.write(_wl_block295Bytes, _wl_block295);
                                } while (__tag224.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag224.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag224);
                                return;
                            }
                            _activeTag=__tag224.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag224);
                            __tag224.release();
                            _bw.write(_wl_block296Bytes, _wl_block296);
                             org.apache.struts.taglib.logic.EqualTag __tag228 = null ;
                            int __result__tag228 = 0 ;

                            if (__tag228 == null ){
                                __tag228 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag228);
                            }
                            __tag228.setPageContext(pageContext);
                            __tag228.setParent(__tag16);
                            __tag228.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag228.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag228.setValue(AppConstants.YES
);
                            _activeTag=__tag228;
                            __result__tag228 = __tag228.doStartTag();

                            if (__result__tag228!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag228== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block297Bytes, _wl_block297);

							if (!isOutboundSmartPostShipment) {
						
                                    _bw.write(_wl_block298Bytes, _wl_block298);

                                    if (_jsp__tag229(request, response, pageContext, _activeTag, __tag228))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag230 = null ;
                                    int __result__tag230 = 0 ;

                                    if (__tag230 == null ){
                                        __tag230 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag230);
                                    }
                                    __tag230.setPageContext(pageContext);
                                    __tag230.setParent(__tag228);
                                    __tag230.setValue(totalCarriageValueOutbound
);
                                    _activeTag=__tag230;
                                    __result__tag230 = __tag230.doStartTag();

                                    if (__result__tag230!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag230== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag230.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag230);
                                        return;
                                    }
                                    _activeTag=__tag230.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag230);
                                    __tag230.release();
                                    _bw.write(_wl_block234Bytes, _wl_block234);

                                    if (_jsp__tag231(request, response, pageContext, _activeTag, __tag228))
                                     return;
                                    _bw.write(_wl_block299Bytes, _wl_block299);

							}
						
                                    _bw.write(_wl_block300Bytes, _wl_block300);

                                    if (_jsp__tag232(request, response, pageContext, _activeTag, __tag228))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);

                                    if (_jsp__tag233(request, response, pageContext, _activeTag, __tag228))
                                     return;
                                    _bw.write(_wl_block301Bytes, _wl_block301);
                                } while (__tag228.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag228.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag228);
                                return;
                            }
                            _activeTag=__tag228.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag228);
                            __tag228.release();
                            _bw.write(_wl_block302Bytes, _wl_block302);
                             org.apache.struts.taglib.logic.NotEqualTag __tag234 = null ;
                            int __result__tag234 = 0 ;

                            if (__tag234 == null ){
                                __tag234 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag234);
                            }
                            __tag234.setPageContext(pageContext);
                            __tag234.setParent(__tag16);
                            __tag234.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag234.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag234.setValue(AppConstants.YES 
);
                            _activeTag=__tag234;
                            __result__tag234 = __tag234.doStartTag();

                            if (__result__tag234!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag234== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block303Bytes, _wl_block303);

                                    if (_jsp__tag235(request, response, pageContext, _activeTag, __tag234))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag236 = null ;
                                    int __result__tag236 = 0 ;

                                    if (__tag236 == null ){
                                        __tag236 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag236);
                                    }
                                    __tag236.setPageContext(pageContext);
                                    __tag236.setParent(__tag234);
                                    __tag236.setValue(totalWeight
);
                                    _activeTag=__tag236;
                                    __result__tag236 = __tag236.doStartTag();

                                    if (__result__tag236!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag236== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag236.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag236);
                                        return;
                                    }
                                    _activeTag=__tag236.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag236);
                                    __tag236.release();
                                    _bw.write(_wl_block234Bytes, _wl_block234);

							if (!psdData.isFedExOneRate()) {
							
                                    _bw.write(_wl_block304Bytes, _wl_block304);

                                    if (_jsp__tag237(request, response, pageContext, _activeTag, __tag234))
                                     return;
                                    _bw.write(_wl_block234Bytes, _wl_block234);
}
                                    _bw.write(_wl_block275Bytes, _wl_block275);
                                } while (__tag234.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag234.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag234);
                                return;
                            }
                            _activeTag=__tag234.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag234);
                            __tag234.release();
                            _bw.write(_wl_block218Bytes, _wl_block218);
                             org.apache.struts.taglib.logic.EqualTag __tag238 = null ;
                            int __result__tag238 = 0 ;

                            if (__tag238 == null ){
                                __tag238 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag238);
                            }
                            __tag238.setPageContext(pageContext);
                            __tag238.setParent(__tag16);
                            __tag238.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag238.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag238.setValue(AppConstants.YES
);
                            _activeTag=__tag238;
                            __result__tag238 = __tag238.doStartTag();

                            if (__result__tag238!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag238== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block305Bytes, _wl_block305);

                                    if (_jsp__tag239(request, response, pageContext, _activeTag, __tag238))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag240 = null ;
                                    int __result__tag240 = 0 ;

                                    if (__tag240 == null ){
                                        __tag240 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag240);
                                    }
                                    __tag240.setPageContext(pageContext);
                                    __tag240.setParent(__tag238);
                                    __tag240.setValue(specialServicesOutbound
);
                                    _activeTag=__tag240;
                                    __result__tag240 = __tag240.doStartTag();

                                    if (__result__tag240!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag240== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag240.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag240);
                                        return;
                                    }
                                    _activeTag=__tag240.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag240);
                                    __tag240.release();
                                    _bw.write(_wl_block306Bytes, _wl_block306);

                                    if (_jsp__tag241(request, response, pageContext, _activeTag, __tag238))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag242 = null ;
                                    int __result__tag242 = 0 ;

                                    if (__tag242 == null ){
                                        __tag242 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag242);
                                    }
                                    __tag242.setPageContext(pageContext);
                                    __tag242.setParent(__tag238);
                                    __tag242.setValue(totalWeight
);
                                    _activeTag=__tag242;
                                    __result__tag242 = __tag242.doStartTag();

                                    if (__result__tag242!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag242== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag242.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag242);
                                        return;
                                    }
                                    _activeTag=__tag242.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag242);
                                    __tag242.release();
                                    _bw.write(_wl_block234Bytes, _wl_block234);

							if (!psdData.isFedExOneRate()) {
							
                                    _bw.write(_wl_block304Bytes, _wl_block304);

                                    if (_jsp__tag243(request, response, pageContext, _activeTag, __tag238))
                                     return;
                                    _bw.write(_wl_block234Bytes, _wl_block234);
}
                                    _bw.write(_wl_block307Bytes, _wl_block307);
                                } while (__tag238.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag238.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag238);
                                return;
                            }
                            _activeTag=__tag238.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag238);
                            __tag238.release();
                            _bw.write(_wl_block214Bytes, _wl_block214);
                             org.apache.struts.taglib.logic.NotEqualTag __tag244 = null ;
                            int __result__tag244 = 0 ;

                            if (__tag244 == null ){
                                __tag244 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag244);
                            }
                            __tag244.setPageContext(pageContext);
                            __tag244.setParent(__tag16);
                            __tag244.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag244.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag244.setValue(AppConstants.YES 
);
                            _activeTag=__tag244;
                            __result__tag244 = __tag244.doStartTag();

                            if (__result__tag244!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag244== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block308Bytes, _wl_block308);

							if (!isSmartPostShipment) {
						
                                    _bw.write(_wl_block309Bytes, _wl_block309);

                                    if (_jsp__tag245(request, response, pageContext, _activeTag, __tag244))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag246 = null ;
                                    int __result__tag246 = 0 ;

                                    if (__tag246 == null ){
                                        __tag246 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag246);
                                    }
                                    __tag246.setPageContext(pageContext);
                                    __tag246.setParent(__tag244);
                                    __tag246.setValue(totalCarriageValue
);
                                    _activeTag=__tag246;
                                    __result__tag246 = __tag246.doStartTag();

                                    if (__result__tag246!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag246== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag246.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag246);
                                        return;
                                    }
                                    _activeTag=__tag246.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag246);
                                    __tag246.release();
                                    _bw.write(_wl_block310Bytes, _wl_block310);

                                    if (_jsp__tag247(request, response, pageContext, _activeTag, __tag244))
                                     return;
                                    _bw.write(_wl_block311Bytes, _wl_block311);

							}
						
                                    _bw.write(_wl_block312Bytes, _wl_block312);
                                } while (__tag244.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag244.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag244);
                                return;
                            }
                            _activeTag=__tag244.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag244);
                            __tag244.release();
                            _bw.write(_wl_block218Bytes, _wl_block218);
                             org.apache.struts.taglib.logic.EqualTag __tag248 = null ;
                            int __result__tag248 = 0 ;

                            if (__tag248 == null ){
                                __tag248 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag248);
                            }
                            __tag248.setPageContext(pageContext);
                            __tag248.setParent(__tag16);
                            __tag248.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag248.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag248.setValue(AppConstants.YES
);
                            _activeTag=__tag248;
                            __result__tag248 = __tag248.doStartTag();

                            if (__result__tag248!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag248== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block313Bytes, _wl_block313);

                                    if (_jsp__tag249(request, response, pageContext, _activeTag, __tag248))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag250 = null ;
                                    int __result__tag250 = 0 ;

                                    if (__tag250 == null ){
                                        __tag250 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag250);
                                    }
                                    __tag250.setPageContext(pageContext);
                                    __tag250.setParent(__tag248);
                                    __tag250.setValue(pickUpDropOffType
);
                                    _activeTag=__tag250;
                                    __result__tag250 = __tag250.doStartTag();

                                    if (__result__tag250!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag250== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag250.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag250);
                                        return;
                                    }
                                    _activeTag=__tag250.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag250);
                                    __tag250.release();
                                    _bw.write(_wl_block314Bytes, _wl_block314);

							if (!isSmartPostShipment) {
						
                                    _bw.write(_wl_block315Bytes, _wl_block315);

                                    if (_jsp__tag251(request, response, pageContext, _activeTag, __tag248))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag252 = null ;
                                    int __result__tag252 = 0 ;

                                    if (__tag252 == null ){
                                        __tag252 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag252);
                                    }
                                    __tag252.setPageContext(pageContext);
                                    __tag252.setParent(__tag248);
                                    __tag252.setValue(totalCarriageValue
);
                                    _activeTag=__tag252;
                                    __result__tag252 = __tag252.doStartTag();

                                    if (__result__tag252!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag252== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag252.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag252);
                                        return;
                                    }
                                    _activeTag=__tag252.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag252);
                                    __tag252.release();
                                    _bw.write(_wl_block310Bytes, _wl_block310);

                                    if (_jsp__tag253(request, response, pageContext, _activeTag, __tag248))
                                     return;
                                    _bw.write(_wl_block299Bytes, _wl_block299);

							}
						
                                    _bw.write(_wl_block316Bytes, _wl_block316);
                                } while (__tag248.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag248.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag248);
                                return;
                            }
                            _activeTag=__tag248.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag248);
                            __tag248.release();
                            _bw.write(_wl_block317Bytes, _wl_block317);
                             org.apache.struts.taglib.logic.EqualTag __tag254 = null ;
                            int __result__tag254 = 0 ;

                            if (__tag254 == null ){
                                __tag254 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag254);
                            }
                            __tag254.setPageContext(pageContext);
                            __tag254.setParent(__tag16);
                            __tag254.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag254.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isExpressOrGroundCallTag", java.lang.String.class,"property"));
                            __tag254.setValue(AppConstants.YES
);
                            _activeTag=__tag254;
                            __result__tag254 = __tag254.doStartTag();

                            if (__result__tag254!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag254== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block318Bytes, _wl_block318);
                                     org.apache.struts.taglib.logic.NotEqualTag __tag255 = null ;
                                    int __result__tag255 = 0 ;

                                    if (__tag255 == null ){
                                        __tag255 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag255);
                                    }
                                    __tag255.setPageContext(pageContext);
                                    __tag255.setParent(__tag254);
                                    __tag255.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag255.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag255.setValue(AppConstants.YES
);
                                    _activeTag=__tag255;
                                    __result__tag255 = __tag255.doStartTag();

                                    if (__result__tag255!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag255== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block319Bytes, _wl_block319);

                                            if (_jsp__tag256(request, response, pageContext, _activeTag, __tag255))
                                             return;
                                            _bw.write(_wl_block251Bytes, _wl_block251);
                                             com.fedex.fsm.ship.web.taglib.ReformatDateTag __tag257 = null ;
                                            int __result__tag257 = 0 ;

                                            if (__tag257 == null ){
                                                __tag257 = new  com.fedex.fsm.ship.web.taglib.ReformatDateTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag257);
                                            }
                                            __tag257.setPageContext(pageContext);
                                            __tag257.setParent(__tag255);
                                            __tag257.setShipDate(shipActionForm.getPsdData().getPickupDate()
);
                                            __tag257.setLang(locale.getLanguage()
);
                                            __tag257.setCountry(locale.getCountry()
);
                                            _activeTag=__tag257;
                                            __result__tag257 = __tag257.doStartTag();

                                            if (__result__tag257!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag257== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.ReformatDateTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag257.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag257);
                                                return;
                                            }
                                            _activeTag=__tag257.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag257);
                                            __tag257.release();
                                            _bw.write(_wl_block320Bytes, _wl_block320);
                                        } while (__tag255.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag255.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag255);
                                        return;
                                    }
                                    _activeTag=__tag255.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag255);
                                    __tag255.release();
                                    _bw.write(_wl_block131Bytes, _wl_block131);
                                    _bw.write(_wl_block321Bytes, _wl_block321);
                                     org.apache.struts.taglib.logic.NotEqualTag __tag258 = null ;
                                    int __result__tag258 = 0 ;

                                    if (__tag258 == null ){
                                        __tag258 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag258);
                                    }
                                    __tag258.setPageContext(pageContext);
                                    __tag258.setParent(__tag254);
                                    __tag258.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag258.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag258.setValue(AppConstants.YES
);
                                    _activeTag=__tag258;
                                    __result__tag258 = __tag258.doStartTag();

                                    if (__result__tag258!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag258== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block322Bytes, _wl_block322);

                                            if (_jsp__tag259(request, response, pageContext, _activeTag, __tag258))
                                             return;
                                            _bw.write(_wl_block251Bytes, _wl_block251);

                                            if (_jsp__tag260(request, response, pageContext, _activeTag, __tag258))
                                             return;
                                            _bw.write(_wl_block323Bytes, _wl_block323);
                                        } while (__tag258.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag258.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag258);
                                        return;
                                    }
                                    _activeTag=__tag258.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag258);
                                    __tag258.release();
                                    _bw.write(_wl_block324Bytes, _wl_block324);
                                     org.apache.struts.taglib.logic.EqualTag __tag261 = null ;
                                    int __result__tag261 = 0 ;

                                    if (__tag261 == null ){
                                        __tag261 = new  org.apache.struts.taglib.logic.EqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag261);
                                    }
                                    __tag261.setPageContext(pageContext);
                                    __tag261.setParent(__tag254);
                                    __tag261.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag261.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                                    __tag261.setValue(AppConstants.YES
);
                                    _activeTag=__tag261;
                                    __result__tag261 = __tag261.doStartTag();

                                    if (__result__tag261!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag261== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block325Bytes, _wl_block325);

                                            if (_jsp__tag262(request, response, pageContext, _activeTag, __tag261))
                                             return;
                                            _bw.write(_wl_block251Bytes, _wl_block251);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag263 = null ;
                                            int __result__tag263 = 0 ;

                                            if (__tag263 == null ){
                                                __tag263 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag263);
                                            }
                                            __tag263.setPageContext(pageContext);
                                            __tag263.setParent(__tag261);
                                            __tag263.setValue(pickupDropoffDataOutbound.getConfirmationNumber()
);
                                            _activeTag=__tag263;
                                            __result__tag263 = __tag263.doStartTag();

                                            if (__result__tag263!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag263== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag263.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag263);
                                                return;
                                            }
                                            _activeTag=__tag263.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag263);
                                            __tag263.release();
                                            _bw.write(_wl_block326Bytes, _wl_block326);

                                            if (_jsp__tag264(request, response, pageContext, _activeTag, __tag261))
                                             return;
                                            _bw.write(_wl_block327Bytes, _wl_block327);
if(!isReturnShipment){ 
                                            _bw.write(_wl_block282Bytes, _wl_block282);

                                            if (_jsp__tag265(request, response, pageContext, _activeTag, __tag261))
                                             return;
                                            _bw.write(_wl_block233Bytes, _wl_block233);
}
                                            _bw.write(_wl_block323Bytes, _wl_block323);
                                        } while (__tag261.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag261.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag261);
                                        return;
                                    }
                                    _activeTag=__tag261.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag261);
                                    __tag261.release();
                                    _bw.write(_wl_block328Bytes, _wl_block328);
                                } while (__tag254.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag254.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag254);
                                return;
                            }
                            _activeTag=__tag254.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag254);
                            __tag254.release();
                            _bw.write(_wl_block329Bytes, _wl_block329);
                             org.apache.struts.taglib.logic.NotEqualTag __tag266 = null ;
                            int __result__tag266 = 0 ;

                            if (__tag266 == null ){
                                __tag266 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag266);
                            }
                            __tag266.setPageContext(pageContext);
                            __tag266.setParent(__tag16);
                            __tag266.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag266.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag266.setValue(AppConstants.YES
);
                            _activeTag=__tag266;
                            __result__tag266 = __tag266.doStartTag();

                            if (__result__tag266!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag266== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block305Bytes, _wl_block305);

                                    if (_jsp__tag267(request, response, pageContext, _activeTag, __tag266))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag268 = null ;
                                    int __result__tag268 = 0 ;

                                    if (__tag268 == null ){
                                        __tag268 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag268);
                                    }
                                    __tag268.setPageContext(pageContext);
                                    __tag268.setParent(__tag266);
                                    __tag268.setValue(specialServices
);
                                    _activeTag=__tag268;
                                    __result__tag268 = __tag268.doStartTag();

                                    if (__result__tag268!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag268== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag268.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag268);
                                        return;
                                    }
                                    _activeTag=__tag268.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag268);
                                    __tag268.release();
                                    _bw.write(_wl_block275Bytes, _wl_block275);
                                } while (__tag266.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag266.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag266);
                                return;
                            }
                            _activeTag=__tag266.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag266);
                            __tag266.release();
                            _bw.write(_wl_block330Bytes, _wl_block330);
                             org.apache.struts.taglib.logic.EqualTag __tag269 = null ;
                            int __result__tag269 = 0 ;

                            if (__tag269 == null ){
                                __tag269 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag269);
                            }
                            __tag269.setPageContext(pageContext);
                            __tag269.setParent(__tag16);
                            __tag269.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag269.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag269.setValue(AppConstants.YES
);
                            _activeTag=__tag269;
                            __result__tag269 = __tag269.doStartTag();

                            if (__result__tag269!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag269== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block331Bytes, _wl_block331);

                                    if (_jsp__tag270(request, response, pageContext, _activeTag, __tag269))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag271 = null ;
                                    int __result__tag271 = 0 ;

                                    if (__tag271 == null ){
                                        __tag271 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag271);
                                    }
                                    __tag271.setPageContext(pageContext);
                                    __tag271.setParent(__tag269);
                                    __tag271.setValue(specialServices
);
                                    _activeTag=__tag271;
                                    __result__tag271 = __tag271.doStartTag();

                                    if (__result__tag271!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag271== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag271.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag271);
                                        return;
                                    }
                                    _activeTag=__tag271.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag271);
                                    __tag271.release();
                                    _bw.write(_wl_block275Bytes, _wl_block275);
                                } while (__tag269.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag269.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag269);
                                return;
                            }
                            _activeTag=__tag269.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag269);
                            __tag269.release();
                            _bw.write(_wl_block214Bytes, _wl_block214);
                             org.apache.struts.taglib.logic.NotEqualTag __tag272 = null ;
                            int __result__tag272 = 0 ;

                            if (__tag272 == null ){
                                __tag272 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag272);
                            }
                            __tag272.setPageContext(pageContext);
                            __tag272.setParent(__tag16);
                            __tag272.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag272.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag272.setValue(AppConstants.YES
);
                            _activeTag=__tag272;
                            __result__tag272 = __tag272.doStartTag();

                            if (__result__tag272!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag272== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block332Bytes, _wl_block332);

                                    if (_jsp__tag273(request, response, pageContext, _activeTag, __tag272))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag274 = null ;
                                    int __result__tag274 = 0 ;

                                    if (__tag274 == null ){
                                        __tag274 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag274);
                                    }
                                    __tag274.setPageContext(pageContext);
                                    __tag274.setParent(__tag272);
                                    __tag274.setValue(pickUpDropOffType
);
                                    _activeTag=__tag274;
                                    __result__tag274 = __tag274.doStartTag();

                                    if (__result__tag274!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag274== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag274.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag274);
                                        return;
                                    }
                                    _activeTag=__tag274.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag274);
                                    __tag274.release();
                                    _bw.write(_wl_block333Bytes, _wl_block333);
                                } while (__tag272.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag272.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag272);
                                return;
                            }
                            _activeTag=__tag272.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag272);
                            __tag272.release();
                            _bw.write(_wl_block218Bytes, _wl_block218);
                             org.apache.struts.taglib.logic.EqualTag __tag275 = null ;
                            int __result__tag275 = 0 ;

                            if (__tag275 == null ){
                                __tag275 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag275);
                            }
                            __tag275.setPageContext(pageContext);
                            __tag275.setParent(__tag16);
                            __tag275.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag275.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag275.setValue(AppConstants.YES
);
                            _activeTag=__tag275;
                            __result__tag275 = __tag275.doStartTag();

                            if (__result__tag275!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag275== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block334Bytes, _wl_block334);

                                    if (_jsp__tag276(request, response, pageContext, _activeTag, __tag275))
                                     return;
                                    _bw.write(_wl_block335Bytes, _wl_block335);
if(!isReturnShipment){ 
                                    _bw.write(_wl_block233Bytes, _wl_block233);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag277 = null ;
                                    int __result__tag277 = 0 ;

                                    if (__tag277 == null ){
                                        __tag277 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag277);
                                    }
                                    __tag277.setPageContext(pageContext);
                                    __tag277.setParent(__tag275);
                                    __tag277.setValue(pickUpDropOffType
);
                                    _activeTag=__tag277;
                                    __result__tag277 = __tag277.doStartTag();

                                    if (__result__tag277!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag277== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag277.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag277);
                                        return;
                                    }
                                    _activeTag=__tag277.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag277);
                                    __tag277.release();
                                    _bw.write(_wl_block234Bytes, _wl_block234);
}
                                    _bw.write(_wl_block336Bytes, _wl_block336);
                                } while (__tag275.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag275.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag275);
                                return;
                            }
                            _activeTag=__tag275.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag275);
                            __tag275.release();
                            _bw.write(_wl_block337Bytes, _wl_block337);
                             org.apache.struts.taglib.logic.EqualTag __tag278 = null ;
                            int __result__tag278 = 0 ;

                            if (__tag278 == null ){
                                __tag278 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag278);
                            }
                            __tag278.setPageContext(pageContext);
                            __tag278.setParent(__tag16);
                            __tag278.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag278.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag278.setValue(AppConstants.YES
);
                            _activeTag=__tag278;
                            __result__tag278 = __tag278.doStartTag();

                            if (__result__tag278!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag278== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block242Bytes, _wl_block242);
                                } while (__tag278.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag278.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag278);
                                return;
                            }
                            _activeTag=__tag278.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag278);
                            __tag278.release();
                            _bw.write(_wl_block338Bytes, _wl_block338);
                            _bw.write(_wl_block339Bytes, _wl_block339);

                            if (_jsp__tag279(request, response, pageContext, _activeTag, __tag16))
                             return;
                            _bw.write(_wl_block245Bytes, _wl_block245);
                             org.apache.struts.taglib.logic.EqualTag __tag280 = null ;
                            int __result__tag280 = 0 ;

                            if (__tag280 == null ){
                                __tag280 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag280);
                            }
                            __tag280.setPageContext(pageContext);
                            __tag280.setParent(__tag16);
                            __tag280.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag280.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag280.setValue(AppConstants.YES
);
                            _activeTag=__tag280;
                            __result__tag280 = __tag280.doStartTag();

                            if (__result__tag280!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag280== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block340Bytes, _wl_block340);

                                    if (_jsp__tag281(request, response, pageContext, _activeTag, __tag280))
                                     return;
                                    _bw.write(_wl_block247Bytes, _wl_block247);
                                } while (__tag280.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag280.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag280);
                                return;
                            }
                            _activeTag=__tag280.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag280);
                            __tag280.release();
                            _bw.write(_wl_block341Bytes, _wl_block341);
                             org.apache.struts.taglib.logic.NotEqualTag __tag282 = null ;
                            int __result__tag282 = 0 ;

                            if (__tag282 == null ){
                                __tag282 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag282);
                            }
                            __tag282.setPageContext(pageContext);
                            __tag282.setParent(__tag16);
                            __tag282.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag282.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag282.setValue(AppConstants.YES
);
                            _activeTag=__tag282;
                            __result__tag282 = __tag282.doStartTag();

                            if (__result__tag282!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag282== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block342Bytes, _wl_block342);

                                    if (_jsp__tag283(request, response, pageContext, _activeTag, __tag282))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag284 = null ;
                                    int __result__tag284 = 0 ;

                                    if (__tag284 == null ){
                                        __tag284 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag284);
                                    }
                                    __tag284.setPageContext(pageContext);
                                    __tag284.setParent(__tag282);
                                    __tag284.setValue(billTransTo
);
                                    _activeTag=__tag284;
                                    __result__tag284 = __tag284.doStartTag();

                                    if (__result__tag284!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag284== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag284.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag284);
                                        return;
                                    }
                                    _activeTag=__tag284.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag284);
                                    __tag284.release();
                                    _bw.write(_wl_block217Bytes, _wl_block217);
                                } while (__tag282.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag282.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag282);
                                return;
                            }
                            _activeTag=__tag282.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag282);
                            __tag282.release();
                            _bw.write(_wl_block218Bytes, _wl_block218);
                             org.apache.struts.taglib.logic.EqualTag __tag285 = null ;
                            int __result__tag285 = 0 ;

                            if (__tag285 == null ){
                                __tag285 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag285);
                            }
                            __tag285.setPageContext(pageContext);
                            __tag285.setParent(__tag16);
                            __tag285.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag285.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag285.setValue(AppConstants.YES
);
                            _activeTag=__tag285;
                            __result__tag285 = __tag285.doStartTag();

                            if (__result__tag285!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag285== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block342Bytes, _wl_block342);

                                    if (_jsp__tag286(request, response, pageContext, _activeTag, __tag285))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag287 = null ;
                                    int __result__tag287 = 0 ;

                                    if (__tag287 == null ){
                                        __tag287 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag287);
                                    }
                                    __tag287.setPageContext(pageContext);
                                    __tag287.setParent(__tag285);
                                    __tag287.setValue(billTransToOutbound
);
                                    _activeTag=__tag287;
                                    __result__tag287 = __tag287.doStartTag();

                                    if (__result__tag287!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag287== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag287.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag287);
                                        return;
                                    }
                                    _activeTag=__tag287.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag287);
                                    __tag287.release();
                                    _bw.write(_wl_block343Bytes, _wl_block343);

                                    if (_jsp__tag288(request, response, pageContext, _activeTag, __tag285))
                                     return;
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag289 = null ;
                                    int __result__tag289 = 0 ;

                                    if (__tag289 == null ){
                                        __tag289 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag289);
                                    }
                                    __tag289.setPageContext(pageContext);
                                    __tag289.setParent(__tag285);
                                    __tag289.setValue(billTransTo
);
                                    _activeTag=__tag289;
                                    __result__tag289 = __tag289.doStartTag();

                                    if (__result__tag289!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag289== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag289.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag289);
                                        return;
                                    }
                                    _activeTag=__tag289.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag289);
                                    __tag289.release();
                                    _bw.write(_wl_block217Bytes, _wl_block217);
                                } while (__tag285.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag285.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag285);
                                return;
                            }
                            _activeTag=__tag285.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag285);
                            __tag285.release();
                            _bw.write(_wl_block344Bytes, _wl_block344);
                             org.apache.struts.taglib.logic.NotEqualTag __tag290 = null ;
                            int __result__tag290 = 0 ;

                            if (__tag290 == null ){
                                __tag290 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag290);
                            }
                            __tag290.setPageContext(pageContext);
                            __tag290.setParent(__tag16);
                            __tag290.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag290.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag290.setValue(AppConstants.YES
);
                            _activeTag=__tag290;
                            __result__tag290 = __tag290.doStartTag();

                            if (__result__tag290!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag290== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block345Bytes, _wl_block345);
                                     org.apache.struts.taglib.logic.EqualTag __tag291 = null ;
                                    int __result__tag291 = 0 ;

                                    if (__tag291 == null ){
                                        __tag291 = new  org.apache.struts.taglib.logic.EqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag291);
                                    }
                                    __tag291.setPageContext(pageContext);
                                    __tag291.setParent(__tag290);
                                    __tag291.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag291.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isInternationalExpressOnly", java.lang.String.class,"property"));
                                    __tag291.setValue(AppConstants.YES
);
                                    _activeTag=__tag291;
                                    __result__tag291 = __tag291.doStartTag();

                                    if (__result__tag291!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag291== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block346Bytes, _wl_block346);

                                            if (_jsp__tag292(request, response, pageContext, _activeTag, __tag291))
                                             return;
                                            _bw.write(_wl_block251Bytes, _wl_block251);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag293 = null ;
                                            int __result__tag293 = 0 ;

                                            if (__tag293 == null ){
                                                __tag293 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag293);
                                            }
                                            __tag293.setPageContext(pageContext);
                                            __tag293.setParent(__tag291);
                                            __tag293.setValue(billDutiesAndTaxesTo
);
                                            _activeTag=__tag293;
                                            __result__tag293 = __tag293.doStartTag();

                                            if (__result__tag293!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag293== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag293.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag293);
                                                return;
                                            }
                                            _activeTag=__tag293.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag293);
                                            __tag293.release();
                                            _bw.write(_wl_block347Bytes, _wl_block347);
                                        } while (__tag291.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag291.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag291);
                                        return;
                                    }
                                    _activeTag=__tag291.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag291);
                                    __tag291.release();
                                    _bw.write(_wl_block316Bytes, _wl_block316);
                                } while (__tag290.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag290.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag290);
                                return;
                            }
                            _activeTag=__tag290.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag290);
                            __tag290.release();
                            _bw.write(_wl_block218Bytes, _wl_block218);
                             org.apache.struts.taglib.logic.EqualTag __tag294 = null ;
                            int __result__tag294 = 0 ;

                            if (__tag294 == null ){
                                __tag294 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag294);
                            }
                            __tag294.setPageContext(pageContext);
                            __tag294.setParent(__tag16);
                            __tag294.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag294.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag294.setValue(AppConstants.YES
);
                            _activeTag=__tag294;
                            __result__tag294 = __tag294.doStartTag();

                            if (__result__tag294!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag294== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block345Bytes, _wl_block345);
                                     org.apache.struts.taglib.logic.EqualTag __tag295 = null ;
                                    int __result__tag295 = 0 ;

                                    if (__tag295 == null ){
                                        __tag295 = new  org.apache.struts.taglib.logic.EqualTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag295);
                                    }
                                    __tag295.setPageContext(pageContext);
                                    __tag295.setParent(__tag294);
                                    __tag295.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                    __tag295.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isInternationalExpressOnly", java.lang.String.class,"property"));
                                    __tag295.setValue(AppConstants.YES
);
                                    _activeTag=__tag295;
                                    __result__tag295 = __tag295.doStartTag();

                                    if (__result__tag295!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag295== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block348Bytes, _wl_block348);

                                            if (_jsp__tag296(request, response, pageContext, _activeTag, __tag295))
                                             return;
                                            _bw.write(_wl_block251Bytes, _wl_block251);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag297 = null ;
                                            int __result__tag297 = 0 ;

                                            if (__tag297 == null ){
                                                __tag297 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag297);
                                            }
                                            __tag297.setPageContext(pageContext);
                                            __tag297.setParent(__tag295);
                                            __tag297.setValue(billDutiesAndTaxesToOutbound
);
                                            _activeTag=__tag297;
                                            __result__tag297 = __tag297.doStartTag();

                                            if (__result__tag297!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag297== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag297.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag297);
                                                return;
                                            }
                                            _activeTag=__tag297.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag297);
                                            __tag297.release();
                                            _bw.write(_wl_block349Bytes, _wl_block349);

                                            if (_jsp__tag298(request, response, pageContext, _activeTag, __tag295))
                                             return;
                                            _bw.write(_wl_block251Bytes, _wl_block251);
                                             com.fedex.framework.taglib.encode.HtmlTag __tag299 = null ;
                                            int __result__tag299 = 0 ;

                                            if (__tag299 == null ){
                                                __tag299 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag299);
                                            }
                                            __tag299.setPageContext(pageContext);
                                            __tag299.setParent(__tag295);
                                            __tag299.setValue(billDutiesAndTaxesTo
);
                                            _activeTag=__tag299;
                                            __result__tag299 = __tag299.doStartTag();

                                            if (__result__tag299!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag299== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag299.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag299);
                                                return;
                                            }
                                            _activeTag=__tag299.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag299);
                                            __tag299.release();
                                            _bw.write(_wl_block350Bytes, _wl_block350);
                                        } while (__tag295.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag295.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag295);
                                        return;
                                    }
                                    _activeTag=__tag295.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag295);
                                    __tag295.release();
                                    _bw.write(_wl_block316Bytes, _wl_block316);
                                } while (__tag294.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag294.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag294);
                                return;
                            }
                            _activeTag=__tag294.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag294);
                            __tag294.release();
                            _bw.write(_wl_block351Bytes, _wl_block351);
                            _bw.write(_wl_block352Bytes, _wl_block352);
                             org.apache.struts.taglib.logic.NotEqualTag __tag300 = null ;
                            int __result__tag300 = 0 ;

                            if (__tag300 == null ){
                                __tag300 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag300);
                            }
                            __tag300.setPageContext(pageContext);
                            __tag300.setParent(__tag16);
                            __tag300.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag300.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag300.setValue(AppConstants.YES
);
                            _activeTag=__tag300;
                            __result__tag300 = __tag300.doStartTag();

                            if (__result__tag300!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag300== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block353Bytes, _wl_block353);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( yourReferenceLabel ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block354Bytes, _wl_block354);

                                    if (_jsp__tag301(request, response, pageContext, _activeTag, __tag300))
                                     return;
                                    _bw.write(_wl_block275Bytes, _wl_block275);
                                } while (__tag300.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag300.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag300);
                                return;
                            }
                            _activeTag=__tag300.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag300);
                            __tag300.release();
                            _bw.write(_wl_block218Bytes, _wl_block218);
                             org.apache.struts.taglib.logic.EqualTag __tag302 = null ;
                            int __result__tag302 = 0 ;

                            if (__tag302 == null ){
                                __tag302 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag302);
                            }
                            __tag302.setPageContext(pageContext);
                            __tag302.setParent(__tag16);
                            __tag302.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag302.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag302.setValue(AppConstants.YES
);
                            _activeTag=__tag302;
                            __result__tag302 = __tag302.doStartTag();

                            if (__result__tag302!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag302== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block353Bytes, _wl_block353);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( yourReferenceLabel ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag303 = null ;
                                    int __result__tag303 = 0 ;

                                    if (__tag303 == null ){
                                        __tag303 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag303);
                                    }
                                    __tag303.setPageContext(pageContext);
                                    __tag303.setParent(__tag302);
                                    __tag303.setValue(billingDataOutbound.getReferenceData().getYourReference()
);
                                    _activeTag=__tag303;
                                    __result__tag303 = __tag303.doStartTag();

                                    if (__result__tag303!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag303== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag303.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag303);
                                        return;
                                    }
                                    _activeTag=__tag303.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag303);
                                    __tag303.release();
                                    _bw.write(_wl_block355Bytes, _wl_block355);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( yourReferenceLabel ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block251Bytes, _wl_block251);

                                    if (_jsp__tag304(request, response, pageContext, _activeTag, __tag302))
                                     return;
                                    _bw.write(_wl_block275Bytes, _wl_block275);
                                } while (__tag302.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag302.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag302);
                                return;
                            }
                            _activeTag=__tag302.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag302);
                            __tag302.release();
                            _bw.write(_wl_block356Bytes, _wl_block356);
                            _bw.write(_wl_block352Bytes, _wl_block352);
                             org.apache.struts.taglib.logic.NotEqualTag __tag305 = null ;
                            int __result__tag305 = 0 ;

                            if (__tag305 == null ){
                                __tag305 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag305);
                            }
                            __tag305.setPageContext(pageContext);
                            __tag305.setParent(__tag16);
                            __tag305.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag305.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag305.setValue(AppConstants.YES
);
                            _activeTag=__tag305;
                            __result__tag305 = __tag305.doStartTag();

                            if (__result__tag305!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag305== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block357Bytes, _wl_block357);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( poNumberLabel ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block251Bytes, _wl_block251);

                                    if (_jsp__tag306(request, response, pageContext, _activeTag, __tag305))
                                     return;
                                    _bw.write(_wl_block275Bytes, _wl_block275);
                                } while (__tag305.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag305.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag305);
                                return;
                            }
                            _activeTag=__tag305.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag305);
                            __tag305.release();
                            _bw.write(_wl_block218Bytes, _wl_block218);
                             org.apache.struts.taglib.logic.EqualTag __tag307 = null ;
                            int __result__tag307 = 0 ;

                            if (__tag307 == null ){
                                __tag307 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag307);
                            }
                            __tag307.setPageContext(pageContext);
                            __tag307.setParent(__tag16);
                            __tag307.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag307.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag307.setValue(AppConstants.YES
);
                            _activeTag=__tag307;
                            __result__tag307 = __tag307.doStartTag();

                            if (__result__tag307!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag307== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block357Bytes, _wl_block357);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( poNumberLabel ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag308 = null ;
                                    int __result__tag308 = 0 ;

                                    if (__tag308 == null ){
                                        __tag308 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag308);
                                    }
                                    __tag308.setPageContext(pageContext);
                                    __tag308.setParent(__tag307);
                                    __tag308.setValue(billingDataOutbound.getReferenceData().getPurchaseOrderNumber()
);
                                    _activeTag=__tag308;
                                    __result__tag308 = __tag308.doStartTag();

                                    if (__result__tag308!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag308== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag308.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag308);
                                        return;
                                    }
                                    _activeTag=__tag308.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag308);
                                    __tag308.release();
                                    _bw.write(_wl_block358Bytes, _wl_block358);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( poNumberLabel ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block251Bytes, _wl_block251);

                                    if (_jsp__tag309(request, response, pageContext, _activeTag, __tag307))
                                     return;
                                    _bw.write(_wl_block307Bytes, _wl_block307);
                                } while (__tag307.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag307.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag307);
                                return;
                            }
                            _activeTag=__tag307.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag307);
                            __tag307.release();
                            _bw.write(_wl_block356Bytes, _wl_block356);
                            _bw.write(_wl_block352Bytes, _wl_block352);
                             org.apache.struts.taglib.logic.NotEqualTag __tag310 = null ;
                            int __result__tag310 = 0 ;

                            if (__tag310 == null ){
                                __tag310 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag310);
                            }
                            __tag310.setPageContext(pageContext);
                            __tag310.setParent(__tag16);
                            __tag310.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag310.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag310.setValue(AppConstants.YES
);
                            _activeTag=__tag310;
                            __result__tag310 = __tag310.doStartTag();

                            if (__result__tag310!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag310== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block359Bytes, _wl_block359);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( invoiceNumberLabel ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block251Bytes, _wl_block251);

                                    if (_jsp__tag311(request, response, pageContext, _activeTag, __tag310))
                                     return;
                                    _bw.write(_wl_block275Bytes, _wl_block275);
                                } while (__tag310.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag310.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag310);
                                return;
                            }
                            _activeTag=__tag310.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag310);
                            __tag310.release();
                            _bw.write(_wl_block218Bytes, _wl_block218);
                             org.apache.struts.taglib.logic.EqualTag __tag312 = null ;
                            int __result__tag312 = 0 ;

                            if (__tag312 == null ){
                                __tag312 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag312);
                            }
                            __tag312.setPageContext(pageContext);
                            __tag312.setParent(__tag16);
                            __tag312.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag312.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag312.setValue(AppConstants.YES
);
                            _activeTag=__tag312;
                            __result__tag312 = __tag312.doStartTag();

                            if (__result__tag312!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag312== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block359Bytes, _wl_block359);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( invoiceNumberLabel ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag313 = null ;
                                    int __result__tag313 = 0 ;

                                    if (__tag313 == null ){
                                        __tag313 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag313);
                                    }
                                    __tag313.setPageContext(pageContext);
                                    __tag313.setParent(__tag312);
                                    __tag313.setValue(billingDataOutbound.getReferenceData().getInvoiceNumber()
);
                                    _activeTag=__tag313;
                                    __result__tag313 = __tag313.doStartTag();

                                    if (__result__tag313!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag313== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag313.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag313);
                                        return;
                                    }
                                    _activeTag=__tag313.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag313);
                                    __tag313.release();
                                    _bw.write(_wl_block360Bytes, _wl_block360);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( invoiceNumberLabel ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block251Bytes, _wl_block251);

                                    if (_jsp__tag314(request, response, pageContext, _activeTag, __tag312))
                                     return;
                                    _bw.write(_wl_block307Bytes, _wl_block307);
                                } while (__tag312.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag312.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag312);
                                return;
                            }
                            _activeTag=__tag312.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag312);
                            __tag312.release();
                            _bw.write(_wl_block356Bytes, _wl_block356);
                            _bw.write(_wl_block352Bytes, _wl_block352);
                             org.apache.struts.taglib.logic.NotEqualTag __tag315 = null ;
                            int __result__tag315 = 0 ;

                            if (__tag315 == null ){
                                __tag315 = new  org.apache.struts.taglib.logic.NotEqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag315);
                            }
                            __tag315.setPageContext(pageContext);
                            __tag315.setParent(__tag16);
                            __tag315.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag315.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag315.setValue(AppConstants.YES
);
                            _activeTag=__tag315;
                            __result__tag315 = __tag315.doStartTag();

                            if (__result__tag315!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag315== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.NotEqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block361Bytes, _wl_block361);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( deptNumberLabel ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block251Bytes, _wl_block251);

                                    if (_jsp__tag316(request, response, pageContext, _activeTag, __tag315))
                                     return;
                                    _bw.write(_wl_block275Bytes, _wl_block275);
                                } while (__tag315.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag315.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag315);
                                return;
                            }
                            _activeTag=__tag315.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag315);
                            __tag315.release();
                            _bw.write(_wl_block218Bytes, _wl_block218);
                             org.apache.struts.taglib.logic.EqualTag __tag317 = null ;
                            int __result__tag317 = 0 ;

                            if (__tag317 == null ){
                                __tag317 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag317);
                            }
                            __tag317.setPageContext(pageContext);
                            __tag317.setParent(__tag16);
                            __tag317.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag317.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag317.setValue(AppConstants.YES
);
                            _activeTag=__tag317;
                            __result__tag317 = __tag317.doStartTag();

                            if (__result__tag317!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag317== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block361Bytes, _wl_block361);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( deptNumberLabel ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block251Bytes, _wl_block251);
                                     com.fedex.framework.taglib.encode.HtmlTag __tag318 = null ;
                                    int __result__tag318 = 0 ;

                                    if (__tag318 == null ){
                                        __tag318 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag318);
                                    }
                                    __tag318.setPageContext(pageContext);
                                    __tag318.setParent(__tag317);
                                    __tag318.setValue(billingDataOutbound.getReferenceData().getDepartmentNumber()
);
                                    _activeTag=__tag318;
                                    __result__tag318 = __tag318.doStartTag();

                                    if (__result__tag318!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag318== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                    }
                                    if (__tag318.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag318);
                                        return;
                                    }
                                    _activeTag=__tag318.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag318);
                                    __tag318.release();
                                    _bw.write(_wl_block362Bytes, _wl_block362);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( deptNumberLabel ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block251Bytes, _wl_block251);

                                    if (_jsp__tag319(request, response, pageContext, _activeTag, __tag317))
                                     return;
                                    _bw.write(_wl_block275Bytes, _wl_block275);
                                } while (__tag317.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag317.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag317);
                                return;
                            }
                            _activeTag=__tag317.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag317);
                            __tag317.release();
                            _bw.write(_wl_block363Bytes, _wl_block363);
                             org.apache.struts.taglib.logic.EqualTag __tag320 = null ;
                            int __result__tag320 = 0 ;

                            if (__tag320 == null ){
                                __tag320 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag320);
                            }
                            __tag320.setPageContext(pageContext);
                            __tag320.setParent(__tag16);
                            __tag320.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                            __tag320.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("labelDisplay.isOutboundReturns", java.lang.String.class,"property"));
                            __tag320.setValue(AppConstants.YES
);
                            _activeTag=__tag320;
                            __result__tag320 = __tag320.doStartTag();

                            if (__result__tag320!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag320== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block242Bytes, _wl_block242);
                                } while (__tag320.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag320.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag320);
                                return;
                            }
                            _activeTag=__tag320.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag320);
                            __tag320.release();
                            _bw.write(_wl_block364Bytes, _wl_block364);
                            _bw.write(_wl_block365Bytes, _wl_block365);

                            if (_jsp__tag321(request, response, pageContext, _activeTag, __tag16))
                             return;
                            _bw.write(_wl_block366Bytes, _wl_block366);

                            if (_jsp__tag322(request, response, pageContext, _activeTag, __tag16))
                             return;
                            _bw.write(_wl_block367Bytes, _wl_block367);

                            if (_jsp__tag323(request, response, pageContext, _activeTag, __tag16))
                             return;
                            _bw.write(_wl_block368Bytes, _wl_block368);

                            if (_jsp__tag324(request, response, pageContext, _activeTag, __tag16))
                             return;
                            _bw.write(_wl_block369Bytes, _wl_block369);
 if("Y".equals(isWSSRequired)) { 
                            _bw.write(_wl_block370Bytes, _wl_block370);
                            _bw.write(_wl_block3Bytes, _wl_block3);

	WebAnalyticsSelector ws = new WebAnalyticsSelector();
	String webAnalyticsJSFile = ws.getWebAnalyticsTool().getJsFile();

                            _bw.write(_wl_block1Bytes, _wl_block1);
                             com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag325 = null ;
                            int __result__tag325 = 0 ;

                            if (__tag325 == null ){
                                __tag325 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag325);
                            }
                            __tag325.setPageContext(pageContext);
                            __tag325.setParent(__tag16);
                            __tag325.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
                            __tag325.setFile(webAnalyticsJSFile
);
                            __tag325.setMinified(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("false", java.lang.String.class,"minified"));
                            __tag325.setVersioned(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("true", java.lang.String.class,"versioned"));
                            _activeTag=__tag325;
                            __result__tag325 = __tag325.doStartTag();

                            if (__result__tag325!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag325== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.component.ScriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                            }
                            if (__tag325.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag325);
                                return;
                            }
                            _activeTag=__tag325.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag325);
                            __tag325.release();
                            _bw.write(_wl_block0Bytes, _wl_block0);
                            _bw.write(_wl_block114Bytes, _wl_block114);

                            if (_jsp__tag326(request, response, pageContext, _activeTag, __tag16))
                             return;
                            _bw.write(_wl_block371Bytes, _wl_block371);
 } 
                            _bw.write(_wl_block372Bytes, _wl_block372);
                        } while (__tag16.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                    }
                    if (__tag16.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag16);
                        return;
                    }
                    _activeTag=__tag16.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag16);
                    __tag16.release();
                    _bw.write(_wl_block373Bytes, _wl_block373);
                } while (__tag0.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            }
            if (__tag0.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag0);
                return;
            }
            _activeTag=__tag0.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag0);
            __tag0.release();
            _bw.write(_wl_block0Bytes, _wl_block0);
        } catch (java.lang.Throwable __ee){
            if(!(__ee instanceof javax.servlet.jsp.SkipPageException)) {
                while ((out != null) && (out != _originalOut)) out = pageContext.popBody(); 
                _releaseTags(pageContext, _activeTag);
                pageContext.handlePageException(__ee);
            }
        } finally {
            javax.servlet.jsp.JspFactory.getDefaultFactory().releasePageContext(pageContext);
        }
    }

    private boolean _jsp__tag2(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag2 = null ;
        int __result__tag2 = 0 ;

        if (__tag2 == null ){
            __tag2 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag2);
        }
        __tag2.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag2, parent);
        __tag2.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.select", java.lang.String.class,"key"));
        _activeTag=__tag2;
        __result__tag2 = __tag2.doStartTag();

        if (__result__tag2!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag2== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag2.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag2);
            return true;
        }
        _activeTag=__tag2.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag2);
        __tag2.release();
        return false;
    }

    private boolean _jsp__tag3(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag3 = null ;
        int __result__tag3 = 0 ;

        if (__tag3 == null ){
            __tag3 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag3);
        }
        __tag3.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag3, parent);
        __tag3.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.address.results", java.lang.String.class,"key"));
        _activeTag=__tag3;
        __result__tag3 = __tag3.doStartTag();

        if (__result__tag3!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag3== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag3.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag3);
            return true;
        }
        _activeTag=__tag3.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag3);
        __tag3.release();
        return false;
    }

    private boolean _jsp__tag4(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag4 = null ;
        int __result__tag4 = 0 ;

        if (__tag4 == null ){
            __tag4 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag4);
        }
        __tag4.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag4, parent);
        __tag4.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("addressChecker.text.UseAddressAsEntered", java.lang.String.class,"key"));
        _activeTag=__tag4;
        __result__tag4 = __tag4.doStartTag();

        if (__result__tag4!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag4== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag4.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag4);
            return true;
        }
        _activeTag=__tag4.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag4);
        __tag4.release();
        return false;
    }

    private boolean _jsp__tag5(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag5 = null ;
        int __result__tag5 = 0 ;

        if (__tag5 == null ){
            __tag5 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag5);
        }
        __tag5.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag5, parent);
        __tag5.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("addressChecker.text.Commercial", java.lang.String.class,"key"));
        _activeTag=__tag5;
        __result__tag5 = __tag5.doStartTag();

        if (__result__tag5!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag5== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag5.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag5);
            return true;
        }
        _activeTag=__tag5.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag5);
        __tag5.release();
        return false;
    }

    private boolean _jsp__tag6(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag6 = null ;
        int __result__tag6 = 0 ;

        if (__tag6 == null ){
            __tag6 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag6);
        }
        __tag6.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag6, parent);
        __tag6.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("addressChecker.text.Residential", java.lang.String.class,"key"));
        _activeTag=__tag6;
        __result__tag6 = __tag6.doStartTag();

        if (__result__tag6!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag6== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag6.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag6);
            return true;
        }
        _activeTag=__tag6.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag6);
        __tag6.release();
        return false;
    }

    private boolean _jsp__tag7(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag7 = null ;
        int __result__tag7 = 0 ;

        if (__tag7 == null ){
            __tag7 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag7);
        }
        __tag7.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag7, parent);
        __tag7.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("addressChecker.text.UseOfIncorrectAddress", java.lang.String.class,"key"));
        _activeTag=__tag7;
        __result__tag7 = __tag7.doStartTag();

        if (__result__tag7!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag7== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag7.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag7);
            return true;
        }
        _activeTag=__tag7.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag7);
        __tag7.release();
        return false;
    }

    private boolean _jsp__tag8(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag8 = null ;
        int __result__tag8 = 0 ;

        if (__tag8 == null ){
            __tag8 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag8);
        }
        __tag8.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag8, parent);
        __tag8.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ss.groundSpecificServices", java.lang.String.class,"key"));
        _activeTag=__tag8;
        __result__tag8 = __tag8.doStartTag();

        if (__result__tag8!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag8== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag8.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag8);
            return true;
        }
        _activeTag=__tag8.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag8);
        __tag8.release();
        return false;
    }

    private boolean _jsp__tag9(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag9 = null ;
        int __result__tag9 = 0 ;

        if (__tag9 == null ){
            __tag9 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag9);
        }
        __tag9.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag9, parent);
        __tag9.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ss.groundSpecificServicesHelpRollOver", java.lang.String.class,"key"));
        _activeTag=__tag9;
        __result__tag9 = __tag9.doStartTag();

        if (__result__tag9!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag9== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag9.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag9);
            return true;
        }
        _activeTag=__tag9.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag9);
        __tag9.release();
        return false;
    }

    private boolean _jsp__tag10(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag10 = null ;
        int __result__tag10 = 0 ;

        if (__tag10 == null ){
            __tag10 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag10);
        }
        __tag10.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag10, parent);
        __tag10.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ss.homeDeliverySpecificServices", java.lang.String.class,"key"));
        _activeTag=__tag10;
        __result__tag10 = __tag10.doStartTag();

        if (__result__tag10!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag10== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag10.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag10);
            return true;
        }
        _activeTag=__tag10.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag10);
        __tag10.release();
        return false;
    }

    private boolean _jsp__tag11(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag11 = null ;
        int __result__tag11 = 0 ;

        if (__tag11 == null ){
            __tag11 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag11);
        }
        __tag11.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag11, parent);
        __tag11.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ss.homeDeliverySpecificServicesHelpRollOver", java.lang.String.class,"key"));
        _activeTag=__tag11;
        __result__tag11 = __tag11.doStartTag();

        if (__result__tag11!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag11== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag11.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag11);
            return true;
        }
        _activeTag=__tag11.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag11);
        __tag11.release();
        return false;
    }

    private boolean _jsp__tag12(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag12 = null ;
        int __result__tag12 = 0 ;

        if (__tag12 == null ){
            __tag12 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag12);
        }
        __tag12.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag12, parent);
        __tag12.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("app.name.label", java.lang.String.class,"key"));
        _activeTag=__tag12;
        __result__tag12 = __tag12.doStartTag();

        if (__result__tag12!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag12== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag12.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag12);
            return true;
        }
        _activeTag=__tag12.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag12);
        __tag12.release();
        return false;
    }

    private boolean _jsp__tag17(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag17 = null ;
        int __result__tag17 = 0 ;

        if (__tag17 == null ){
            __tag17 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag17);
        }
        __tag17.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag17, parent);
        __tag17.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ShipmentReceipt", java.lang.String.class,"key"));
        _activeTag=__tag17;
        __result__tag17 = __tag17.doStartTag();

        if (__result__tag17!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag17== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag17.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag17);
            return true;
        }
        _activeTag=__tag17.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag17);
        __tag17.release();
        return false;
    }

    private boolean _jsp__tag19(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag19 = null ;
        int __result__tag19 = 0 ;

        if (__tag19 == null ){
            __tag19 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag19);
        }
        __tag19.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag19, parent);
        __tag19.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("app.outboundShip", java.lang.String.class,"key"));
        _activeTag=__tag19;
        __result__tag19 = __tag19.doStartTag();

        if (__result__tag19!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag19== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag19.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag19);
            return true;
        }
        _activeTag=__tag19.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag19);
        __tag19.release();
        return false;
    }

    private boolean _jsp__tag20(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag20 = null ;
        int __result__tag20 = 0 ;

        if (__tag20 == null ){
            __tag20 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag20);
        }
        __tag20.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag20, parent);
        __tag20.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("app.returnShip", java.lang.String.class,"key"));
        _activeTag=__tag20;
        __result__tag20 = __tag20.doStartTag();

        if (__result__tag20!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag20== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag20.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag20);
            return true;
        }
        _activeTag=__tag20.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag20);
        __tag20.release();
        return false;
    }

    private boolean _jsp__tag21(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag21 = null ;
        int __result__tag21 = 0 ;

        if (__tag21 == null ){
            __tag21 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag21);
        }
        __tag21.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag21, parent);
        __tag21.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.address.info", java.lang.String.class,"key"));
        _activeTag=__tag21;
        __result__tag21 = __tag21.doStartTag();

        if (__result__tag21!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag21== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag21.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag21);
            return true;
        }
        _activeTag=__tag21.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag21);
        __tag21.release();
        return false;
    }

    private boolean _jsp__tag23(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag23 = null ;
        int __result__tag23 = 0 ;

        if (__tag23 == null ){
            __tag23 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag23);
        }
        __tag23.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag23, parent);
        __tag23.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.address.info", java.lang.String.class,"key"));
        _activeTag=__tag23;
        __result__tag23 = __tag23.doStartTag();

        if (__result__tag23!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag23== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag23.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag23);
            return true;
        }
        _activeTag=__tag23.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag23);
        __tag23.release();
        return false;
    }

    private boolean _jsp__tag25(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag25 = null ;
        int __result__tag25 = 0 ;

        if (__tag25 == null ){
            __tag25 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag25);
        }
        __tag25.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag25, parent);
        __tag25.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.to", java.lang.String.class,"key"));
        _activeTag=__tag25;
        __result__tag25 = __tag25.doStartTag();

        if (__result__tag25!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag25== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag25.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag25);
            return true;
        }
        _activeTag=__tag25.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag25);
        __tag25.release();
        return false;
    }

    private boolean _jsp__tag26(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag26 = null ;
        int __result__tag26 = 0 ;

        if (__tag26 == null ){
            __tag26 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag26);
        }
        __tag26.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag26, parent);
        __tag26.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.from", java.lang.String.class,"key"));
        _activeTag=__tag26;
        __result__tag26 = __tag26.doStartTag();

        if (__result__tag26!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag26== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag26.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag26);
            return true;
        }
        _activeTag=__tag26.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag26);
        __tag26.release();
        return false;
    }

    private boolean _jsp__tag27(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag27 = null ;
        int __result__tag27 = 0 ;

        if (__tag27 == null ){
            __tag27 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag27);
        }
        __tag27.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag27, parent);
        __tag27.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.label.holdAtFedExLocation", java.lang.String.class,"key"));
        _activeTag=__tag27;
        __result__tag27 = __tag27.doStartTag();

        if (__result__tag27!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag27== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag27.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag27);
            return true;
        }
        _activeTag=__tag27.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag27);
        __tag27.release();
        return false;
    }

    private boolean _jsp__tag29(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag29 = null ;
        int __result__tag29 = 0 ;

        if (__tag29 == null ){
            __tag29 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag29);
        }
        __tag29.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag29, parent);
        __tag29.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.to", java.lang.String.class,"key"));
        _activeTag=__tag29;
        __result__tag29 = __tag29.doStartTag();

        if (__result__tag29!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag29== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag29.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag29);
            return true;
        }
        _activeTag=__tag29.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag29);
        __tag29.release();
        return false;
    }

    private boolean _jsp__tag30(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag30 = null ;
        int __result__tag30 = 0 ;

        if (__tag30 == null ){
            __tag30 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag30);
        }
        __tag30.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag30, parent);
        __tag30.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.from", java.lang.String.class,"key"));
        _activeTag=__tag30;
        __result__tag30 = __tag30.doStartTag();

        if (__result__tag30!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag30== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag30.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag30);
            return true;
        }
        _activeTag=__tag30.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag30);
        __tag30.release();
        return false;
    }

    private boolean _jsp__tag32(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag32 = null ;
        int __result__tag32 = 0 ;

        if (__tag32 == null ){
            __tag32 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag32);
        }
        __tag32.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag32, parent);
        __tag32.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.contactName", java.lang.String.class,"property"));
        __tag32.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag32;
        __result__tag32 = __tag32.doStartTag();

        if (__result__tag32!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag32== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag32.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag32);
            return true;
        }
        _activeTag=__tag32.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag32);
        __tag32.release();
        return false;
    }

    private boolean _jsp__tag33(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag33 = null ;
        int __result__tag33 = 0 ;

        if (__tag33 == null ){
            __tag33 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag33);
        }
        __tag33.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag33, parent);
        __tag33.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.contactName", java.lang.String.class,"property"));
        __tag33.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag33;
        __result__tag33 = __tag33.doStartTag();

        if (__result__tag33!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag33== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag33.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag33);
            return true;
        }
        _activeTag=__tag33.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag33);
        __tag33.release();
        return false;
    }

    private boolean _jsp__tag37(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag37 = null ;
        int __result__tag37 = 0 ;

        if (__tag37 == null ){
            __tag37 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag37);
        }
        __tag37.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag37, parent);
        __tag37.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.contactName", java.lang.String.class,"property"));
        __tag37.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag37;
        __result__tag37 = __tag37.doStartTag();

        if (__result__tag37!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag37== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag37.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag37);
            return true;
        }
        _activeTag=__tag37.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag37);
        __tag37.release();
        return false;
    }

    private boolean _jsp__tag38(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag38 = null ;
        int __result__tag38 = 0 ;

        if (__tag38 == null ){
            __tag38 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag38);
        }
        __tag38.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag38, parent);
        __tag38.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.contactName", java.lang.String.class,"property"));
        __tag38.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag38;
        __result__tag38 = __tag38.doStartTag();

        if (__result__tag38!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag38== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag38.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag38);
            return true;
        }
        _activeTag=__tag38.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag38);
        __tag38.release();
        return false;
    }

    private boolean _jsp__tag42(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag42 = null ;
        int __result__tag42 = 0 ;

        if (__tag42 == null ){
            __tag42 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag42);
        }
        __tag42.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag42, parent);
        __tag42.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ssData.halData.locationName", java.lang.String.class,"property"));
        __tag42.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag42;
        __result__tag42 = __tag42.doStartTag();

        if (__result__tag42!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag42== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag42.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag42);
            return true;
        }
        _activeTag=__tag42.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag42);
        __tag42.release();
        return false;
    }

    private boolean _jsp__tag46(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag46 = null ;
        int __result__tag46 = 0 ;

        if (__tag46 == null ){
            __tag46 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag46);
        }
        __tag46.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag46, parent);
        __tag46.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.companyName", java.lang.String.class,"property"));
        __tag46.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag46;
        __result__tag46 = __tag46.doStartTag();

        if (__result__tag46!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag46== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag46.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag46);
            return true;
        }
        _activeTag=__tag46.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag46);
        __tag46.release();
        return false;
    }

    private boolean _jsp__tag47(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag47 = null ;
        int __result__tag47 = 0 ;

        if (__tag47 == null ){
            __tag47 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag47);
        }
        __tag47.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag47, parent);
        __tag47.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.companyName", java.lang.String.class,"property"));
        __tag47.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag47;
        __result__tag47 = __tag47.doStartTag();

        if (__result__tag47!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag47== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag47.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag47);
            return true;
        }
        _activeTag=__tag47.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag47);
        __tag47.release();
        return false;
    }

    private boolean _jsp__tag49(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag49 = null ;
        int __result__tag49 = 0 ;

        if (__tag49 == null ){
            __tag49 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag49);
        }
        __tag49.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag49, parent);
        __tag49.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.addressLine1", java.lang.String.class,"property"));
        __tag49.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag49;
        __result__tag49 = __tag49.doStartTag();

        if (__result__tag49!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag49== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag49.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag49);
            return true;
        }
        _activeTag=__tag49.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag49);
        __tag49.release();
        return false;
    }

    private boolean _jsp__tag50(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag50 = null ;
        int __result__tag50 = 0 ;

        if (__tag50 == null ){
            __tag50 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag50);
        }
        __tag50.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag50, parent);
        __tag50.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.addressLine1", java.lang.String.class,"property"));
        __tag50.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag50;
        __result__tag50 = __tag50.doStartTag();

        if (__result__tag50!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag50== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag50.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag50);
            return true;
        }
        _activeTag=__tag50.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag50);
        __tag50.release();
        return false;
    }

    private boolean _jsp__tag51(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag51 = null ;
        int __result__tag51 = 0 ;

        if (__tag51 == null ){
            __tag51 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag51);
        }
        __tag51.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag51, parent);
        __tag51.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ssData.halData.addressData.addressLine1", java.lang.String.class,"property"));
        __tag51.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag51;
        __result__tag51 = __tag51.doStartTag();

        if (__result__tag51!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag51== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag51.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag51);
            return true;
        }
        _activeTag=__tag51.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag51);
        __tag51.release();
        return false;
    }

    private boolean _jsp__tag55(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag55 = null ;
        int __result__tag55 = 0 ;

        if (__tag55 == null ){
            __tag55 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag55);
        }
        __tag55.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag55, parent);
        __tag55.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.addressLine1", java.lang.String.class,"property"));
        __tag55.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag55;
        __result__tag55 = __tag55.doStartTag();

        if (__result__tag55!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag55== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag55.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag55);
            return true;
        }
        _activeTag=__tag55.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag55);
        __tag55.release();
        return false;
    }

    private boolean _jsp__tag56(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag56 = null ;
        int __result__tag56 = 0 ;

        if (__tag56 == null ){
            __tag56 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag56);
        }
        __tag56.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag56, parent);
        __tag56.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.addressLine1", java.lang.String.class,"property"));
        __tag56.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag56;
        __result__tag56 = __tag56.doStartTag();

        if (__result__tag56!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag56== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag56.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag56);
            return true;
        }
        _activeTag=__tag56.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag56);
        __tag56.release();
        return false;
    }

    private boolean _jsp__tag58(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag58 = null ;
        int __result__tag58 = 0 ;

        if (__tag58 == null ){
            __tag58 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag58);
        }
        __tag58.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag58, parent);
        __tag58.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.addressLine2", java.lang.String.class,"property"));
        __tag58.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag58;
        __result__tag58 = __tag58.doStartTag();

        if (__result__tag58!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag58== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag58.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag58);
            return true;
        }
        _activeTag=__tag58.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag58);
        __tag58.release();
        return false;
    }

    private boolean _jsp__tag59(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag59 = null ;
        int __result__tag59 = 0 ;

        if (__tag59 == null ){
            __tag59 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag59);
        }
        __tag59.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag59, parent);
        __tag59.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.addressLine2", java.lang.String.class,"property"));
        __tag59.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag59;
        __result__tag59 = __tag59.doStartTag();

        if (__result__tag59!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag59== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag59.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag59);
            return true;
        }
        _activeTag=__tag59.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag59);
        __tag59.release();
        return false;
    }

    private boolean _jsp__tag60(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag60 = null ;
        int __result__tag60 = 0 ;

        if (__tag60 == null ){
            __tag60 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag60);
        }
        __tag60.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag60, parent);
        __tag60.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ssData.halData.addressData.addressLine2", java.lang.String.class,"property"));
        __tag60.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag60;
        __result__tag60 = __tag60.doStartTag();

        if (__result__tag60!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag60== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag60.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag60);
            return true;
        }
        _activeTag=__tag60.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag60);
        __tag60.release();
        return false;
    }

    private boolean _jsp__tag64(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag64 = null ;
        int __result__tag64 = 0 ;

        if (__tag64 == null ){
            __tag64 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag64);
        }
        __tag64.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag64, parent);
        __tag64.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.addressLine2", java.lang.String.class,"property"));
        __tag64.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag64;
        __result__tag64 = __tag64.doStartTag();

        if (__result__tag64!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag64== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag64.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag64);
            return true;
        }
        _activeTag=__tag64.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag64);
        __tag64.release();
        return false;
    }

    private boolean _jsp__tag65(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag65 = null ;
        int __result__tag65 = 0 ;

        if (__tag65 == null ){
            __tag65 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag65);
        }
        __tag65.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag65, parent);
        __tag65.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.addressLine2", java.lang.String.class,"property"));
        __tag65.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag65;
        __result__tag65 = __tag65.doStartTag();

        if (__result__tag65!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag65== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag65.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag65);
            return true;
        }
        _activeTag=__tag65.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag65);
        __tag65.release();
        return false;
    }

    private boolean _jsp__tag67(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag67 = null ;
        int __result__tag67 = 0 ;

        if (__tag67 == null ){
            __tag67 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag67);
        }
        __tag67.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag67, parent);
        __tag67.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.city", java.lang.String.class,"property"));
        __tag67.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag67;
        __result__tag67 = __tag67.doStartTag();

        if (__result__tag67!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag67== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag67.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag67);
            return true;
        }
        _activeTag=__tag67.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag67);
        __tag67.release();
        return false;
    }

    private boolean _jsp__tag68(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag68 = null ;
        int __result__tag68 = 0 ;

        if (__tag68 == null ){
            __tag68 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag68);
        }
        __tag68.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag68, parent);
        __tag68.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.stateProvinceCode", java.lang.String.class,"property"));
        __tag68.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag68;
        __result__tag68 = __tag68.doStartTag();

        if (__result__tag68!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag68== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag68.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag68);
            return true;
        }
        _activeTag=__tag68.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag68);
        __tag68.release();
        return false;
    }

    private boolean _jsp__tag69(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag69 = null ;
        int __result__tag69 = 0 ;

        if (__tag69 == null ){
            __tag69 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag69);
        }
        __tag69.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag69, parent);
        __tag69.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.city", java.lang.String.class,"property"));
        __tag69.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag69;
        __result__tag69 = __tag69.doStartTag();

        if (__result__tag69!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag69== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag69.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag69);
            return true;
        }
        _activeTag=__tag69.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag69);
        __tag69.release();
        return false;
    }

    private boolean _jsp__tag70(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag70 = null ;
        int __result__tag70 = 0 ;

        if (__tag70 == null ){
            __tag70 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag70);
        }
        __tag70.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag70, parent);
        __tag70.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.stateProvinceCode", java.lang.String.class,"property"));
        __tag70.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag70;
        __result__tag70 = __tag70.doStartTag();

        if (__result__tag70!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag70== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag70.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag70);
            return true;
        }
        _activeTag=__tag70.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag70);
        __tag70.release();
        return false;
    }

    private boolean _jsp__tag71(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag71 = null ;
        int __result__tag71 = 0 ;

        if (__tag71 == null ){
            __tag71 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag71);
        }
        __tag71.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag71, parent);
        __tag71.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ssData.halData.addressData.city", java.lang.String.class,"property"));
        __tag71.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag71;
        __result__tag71 = __tag71.doStartTag();

        if (__result__tag71!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag71== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag71.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag71);
            return true;
        }
        _activeTag=__tag71.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag71);
        __tag71.release();
        return false;
    }

    private boolean _jsp__tag72(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag72 = null ;
        int __result__tag72 = 0 ;

        if (__tag72 == null ){
            __tag72 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag72);
        }
        __tag72.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag72, parent);
        __tag72.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ssData.halData.addressData.stateProvinceCode", java.lang.String.class,"property"));
        __tag72.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag72;
        __result__tag72 = __tag72.doStartTag();

        if (__result__tag72!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag72== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag72.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag72);
            return true;
        }
        _activeTag=__tag72.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag72);
        __tag72.release();
        return false;
    }

    private boolean _jsp__tag78(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag78 = null ;
        int __result__tag78 = 0 ;

        if (__tag78 == null ){
            __tag78 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag78);
        }
        __tag78.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag78, parent);
        __tag78.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.city", java.lang.String.class,"property"));
        __tag78.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag78;
        __result__tag78 = __tag78.doStartTag();

        if (__result__tag78!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag78== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag78.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag78);
            return true;
        }
        _activeTag=__tag78.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag78);
        __tag78.release();
        return false;
    }

    private boolean _jsp__tag79(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag79 = null ;
        int __result__tag79 = 0 ;

        if (__tag79 == null ){
            __tag79 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag79);
        }
        __tag79.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag79, parent);
        __tag79.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.stateProvinceCode", java.lang.String.class,"property"));
        __tag79.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag79;
        __result__tag79 = __tag79.doStartTag();

        if (__result__tag79!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag79== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag79.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag79);
            return true;
        }
        _activeTag=__tag79.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag79);
        __tag79.release();
        return false;
    }

    private boolean _jsp__tag80(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag80 = null ;
        int __result__tag80 = 0 ;

        if (__tag80 == null ){
            __tag80 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag80);
        }
        __tag80.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag80, parent);
        __tag80.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.city", java.lang.String.class,"property"));
        __tag80.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag80;
        __result__tag80 = __tag80.doStartTag();

        if (__result__tag80!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag80== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag80.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag80);
            return true;
        }
        _activeTag=__tag80.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag80);
        __tag80.release();
        return false;
    }

    private boolean _jsp__tag81(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag81 = null ;
        int __result__tag81 = 0 ;

        if (__tag81 == null ){
            __tag81 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag81);
        }
        __tag81.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag81, parent);
        __tag81.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.stateProvinceCode", java.lang.String.class,"property"));
        __tag81.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag81;
        __result__tag81 = __tag81.doStartTag();

        if (__result__tag81!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag81== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag81.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag81);
            return true;
        }
        _activeTag=__tag81.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag81);
        __tag81.release();
        return false;
    }

    private boolean _jsp__tag83(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag83 = null ;
        int __result__tag83 = 0 ;

        if (__tag83 == null ){
            __tag83 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag83);
        }
        __tag83.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag83, parent);
        __tag83.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.zipPostalCode", java.lang.String.class,"property"));
        __tag83.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag83;
        __result__tag83 = __tag83.doStartTag();

        if (__result__tag83!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag83== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag83.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag83);
            return true;
        }
        _activeTag=__tag83.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag83);
        __tag83.release();
        return false;
    }

    private boolean _jsp__tag84(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag84 = null ;
        int __result__tag84 = 0 ;

        if (__tag84 == null ){
            __tag84 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag84);
        }
        __tag84.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag84, parent);
        __tag84.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.zipPostalCode", java.lang.String.class,"property"));
        __tag84.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag84;
        __result__tag84 = __tag84.doStartTag();

        if (__result__tag84!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag84== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag84.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag84);
            return true;
        }
        _activeTag=__tag84.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag84);
        __tag84.release();
        return false;
    }

    private boolean _jsp__tag85(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag85 = null ;
        int __result__tag85 = 0 ;

        if (__tag85 == null ){
            __tag85 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag85);
        }
        __tag85.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag85, parent);
        __tag85.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ssData.halData.addressData.zipPostalCode", java.lang.String.class,"property"));
        __tag85.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag85;
        __result__tag85 = __tag85.doStartTag();

        if (__result__tag85!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag85== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag85.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag85);
            return true;
        }
        _activeTag=__tag85.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag85);
        __tag85.release();
        return false;
    }

    private boolean _jsp__tag89(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag89 = null ;
        int __result__tag89 = 0 ;

        if (__tag89 == null ){
            __tag89 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag89);
        }
        __tag89.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag89, parent);
        __tag89.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.zipPostalCode", java.lang.String.class,"property"));
        __tag89.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag89;
        __result__tag89 = __tag89.doStartTag();

        if (__result__tag89!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag89== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag89.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag89);
            return true;
        }
        _activeTag=__tag89.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag89);
        __tag89.release();
        return false;
    }

    private boolean _jsp__tag90(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag90 = null ;
        int __result__tag90 = 0 ;

        if (__tag90 == null ){
            __tag90 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag90);
        }
        __tag90.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag90, parent);
        __tag90.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.zipPostalCode", java.lang.String.class,"property"));
        __tag90.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag90;
        __result__tag90 = __tag90.doStartTag();

        if (__result__tag90!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag90== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag90.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag90);
            return true;
        }
        _activeTag=__tag90.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag90);
        __tag90.release();
        return false;
    }

    private boolean _jsp__tag92(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag92 = null ;
        int __result__tag92 = 0 ;

        if (__tag92 == null ){
            __tag92 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag92);
        }
        __tag92.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag92, parent);
        __tag92.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.countryCode", java.lang.String.class,"property"));
        __tag92.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag92;
        __result__tag92 = __tag92.doStartTag();

        if (__result__tag92!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag92== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag92.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag92);
            return true;
        }
        _activeTag=__tag92.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag92);
        __tag92.release();
        return false;
    }

    private boolean _jsp__tag93(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag93 = null ;
        int __result__tag93 = 0 ;

        if (__tag93 == null ){
            __tag93 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag93);
        }
        __tag93.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag93, parent);
        __tag93.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.countryCode", java.lang.String.class,"property"));
        __tag93.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag93;
        __result__tag93 = __tag93.doStartTag();

        if (__result__tag93!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag93== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag93.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag93);
            return true;
        }
        _activeTag=__tag93.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag93);
        __tag93.release();
        return false;
    }

    private boolean _jsp__tag94(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag94 = null ;
        int __result__tag94 = 0 ;

        if (__tag94 == null ){
            __tag94 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag94);
        }
        __tag94.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag94, parent);
        __tag94.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ssData.halData.addressData.countryCode", java.lang.String.class,"property"));
        __tag94.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag94;
        __result__tag94 = __tag94.doStartTag();

        if (__result__tag94!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag94== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag94.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag94);
            return true;
        }
        _activeTag=__tag94.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag94);
        __tag94.release();
        return false;
    }

    private boolean _jsp__tag98(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag98 = null ;
        int __result__tag98 = 0 ;

        if (__tag98 == null ){
            __tag98 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag98);
        }
        __tag98.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag98, parent);
        __tag98.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.countryCode", java.lang.String.class,"property"));
        __tag98.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag98;
        __result__tag98 = __tag98.doStartTag();

        if (__result__tag98!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag98== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag98.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag98);
            return true;
        }
        _activeTag=__tag98.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag98);
        __tag98.release();
        return false;
    }

    private boolean _jsp__tag99(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag99 = null ;
        int __result__tag99 = 0 ;

        if (__tag99 == null ){
            __tag99 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag99);
        }
        __tag99.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag99, parent);
        __tag99.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.countryCode", java.lang.String.class,"property"));
        __tag99.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag99;
        __result__tag99 = __tag99.doStartTag();

        if (__result__tag99!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag99== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag99.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag99);
            return true;
        }
        _activeTag=__tag99.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag99);
        __tag99.release();
        return false;
    }

    private boolean _jsp__tag101(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag101 = null ;
        int __result__tag101 = 0 ;

        if (__tag101 == null ){
            __tag101 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag101);
        }
        __tag101.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag101, parent);
        __tag101.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.phoneNumber", java.lang.String.class,"property"));
        __tag101.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag101;
        __result__tag101 = __tag101.doStartTag();

        if (__result__tag101!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag101== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag101.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag101);
            return true;
        }
        _activeTag=__tag101.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag101);
        __tag101.release();
        return false;
    }

    private boolean _jsp__tag102(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag102 = null ;
        int __result__tag102 = 0 ;

        if (__tag102 == null ){
            __tag102 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag102);
        }
        __tag102.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag102, parent);
        __tag102.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.phoneNumberExt", java.lang.String.class,"property"));
        __tag102.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag102;
        __result__tag102 = __tag102.doStartTag();

        if (__result__tag102!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag102== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag102.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag102);
            return true;
        }
        _activeTag=__tag102.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag102);
        __tag102.release();
        return false;
    }

    private boolean _jsp__tag103(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag103 = null ;
        int __result__tag103 = 0 ;

        if (__tag103 == null ){
            __tag103 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag103);
        }
        __tag103.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag103, parent);
        __tag103.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.phoneNumber", java.lang.String.class,"property"));
        __tag103.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag103;
        __result__tag103 = __tag103.doStartTag();

        if (__result__tag103!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag103== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag103.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag103);
            return true;
        }
        _activeTag=__tag103.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag103);
        __tag103.release();
        return false;
    }

    private boolean _jsp__tag104(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag104 = null ;
        int __result__tag104 = 0 ;

        if (__tag104 == null ){
            __tag104 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag104);
        }
        __tag104.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag104, parent);
        __tag104.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.phoneNumberExt", java.lang.String.class,"property"));
        __tag104.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag104;
        __result__tag104 = __tag104.doStartTag();

        if (__result__tag104!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag104== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag104.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag104);
            return true;
        }
        _activeTag=__tag104.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag104);
        __tag104.release();
        return false;
    }

    private boolean _jsp__tag110(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag110 = null ;
        int __result__tag110 = 0 ;

        if (__tag110 == null ){
            __tag110 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag110);
        }
        __tag110.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag110, parent);
        __tag110.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.phoneNumber", java.lang.String.class,"property"));
        __tag110.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag110;
        __result__tag110 = __tag110.doStartTag();

        if (__result__tag110!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag110== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag110.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag110);
            return true;
        }
        _activeTag=__tag110.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag110);
        __tag110.release();
        return false;
    }

    private boolean _jsp__tag111(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag111 = null ;
        int __result__tag111 = 0 ;

        if (__tag111 == null ){
            __tag111 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag111);
        }
        __tag111.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag111, parent);
        __tag111.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.phoneNumberExt", java.lang.String.class,"property"));
        __tag111.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag111;
        __result__tag111 = __tag111.doStartTag();

        if (__result__tag111!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag111== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag111.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag111);
            return true;
        }
        _activeTag=__tag111.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag111);
        __tag111.release();
        return false;
    }

    private boolean _jsp__tag112(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag112 = null ;
        int __result__tag112 = 0 ;

        if (__tag112 == null ){
            __tag112 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag112);
        }
        __tag112.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag112, parent);
        __tag112.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.phoneNumber", java.lang.String.class,"property"));
        __tag112.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag112;
        __result__tag112 = __tag112.doStartTag();

        if (__result__tag112!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag112== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag112.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag112);
            return true;
        }
        _activeTag=__tag112.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag112);
        __tag112.release();
        return false;
    }

    private boolean _jsp__tag113(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag113 = null ;
        int __result__tag113 = 0 ;

        if (__tag113 == null ){
            __tag113 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag113);
        }
        __tag113.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag113, parent);
        __tag113.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.phoneNumberExt", java.lang.String.class,"property"));
        __tag113.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag113;
        __result__tag113 = __tag113.doStartTag();

        if (__result__tag113!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag113== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag113.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag113);
            return true;
        }
        _activeTag=__tag113.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag113);
        __tag113.release();
        return false;
    }

    private boolean _jsp__tag115(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag115 = null ;
        int __result__tag115 = 0 ;

        if (__tag115 == null ){
            __tag115 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag115);
        }
        __tag115.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag115, parent);
        __tag115.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("toData.addressData.taxID", java.lang.String.class,"property"));
        __tag115.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag115;
        __result__tag115 = __tag115.doStartTag();

        if (__result__tag115!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag115== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag115.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag115);
            return true;
        }
        _activeTag=__tag115.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag115);
        __tag115.release();
        return false;
    }

    private boolean _jsp__tag116(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag116 = null ;
        int __result__tag116 = 0 ;

        if (__tag116 == null ){
            __tag116 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag116);
        }
        __tag116.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag116, parent);
        __tag116.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.taxID", java.lang.String.class,"property"));
        __tag116.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag116;
        __result__tag116 = __tag116.doStartTag();

        if (__result__tag116!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag116== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag116.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag116);
            return true;
        }
        _activeTag=__tag116.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag116);
        __tag116.release();
        return false;
    }

    private boolean _jsp__tag119(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag119 = null ;
        int __result__tag119 = 0 ;

        if (__tag119 == null ){
            __tag119 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag119);
        }
        __tag119.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag119, parent);
        __tag119.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.to", java.lang.String.class,"key"));
        _activeTag=__tag119;
        __result__tag119 = __tag119.doStartTag();

        if (__result__tag119!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag119== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag119.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag119);
            return true;
        }
        _activeTag=__tag119.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag119);
        __tag119.release();
        return false;
    }

    private boolean _jsp__tag120(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag120 = null ;
        int __result__tag120 = 0 ;

        if (__tag120 == null ){
            __tag120 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag120);
        }
        __tag120.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag120, parent);
        __tag120.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.from", java.lang.String.class,"key"));
        _activeTag=__tag120;
        __result__tag120 = __tag120.doStartTag();

        if (__result__tag120!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag120== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag120.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag120);
            return true;
        }
        _activeTag=__tag120.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag120);
        __tag120.release();
        return false;
    }

    private boolean _jsp__tag121(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag121 = null ;
        int __result__tag121 = 0 ;

        if (__tag121 == null ){
            __tag121 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag121);
        }
        __tag121.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag121, parent);
        __tag121.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("groupShipData.name", java.lang.String.class,"property"));
        __tag121.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag121;
        __result__tag121 = __tag121.doStartTag();

        if (__result__tag121!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag121== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag121.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag121);
            return true;
        }
        _activeTag=__tag121.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag121);
        __tag121.release();
        return false;
    }

    private boolean _jsp__tag122(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag122 = null ;
        int __result__tag122 = 0 ;

        if (__tag122 == null ){
            __tag122 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag122);
        }
        __tag122.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag122, parent);
        __tag122.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.contactName", java.lang.String.class,"property"));
        __tag122.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag122;
        __result__tag122 = __tag122.doStartTag();

        if (__result__tag122!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag122== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag122.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag122);
            return true;
        }
        _activeTag=__tag122.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag122);
        __tag122.release();
        return false;
    }

    private boolean _jsp__tag123(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag123 = null ;
        int __result__tag123 = 0 ;

        if (__tag123 == null ){
            __tag123 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag123);
        }
        __tag123.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag123, parent);
        __tag123.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("groupShipData.nickname", java.lang.String.class,"property"));
        __tag123.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag123;
        __result__tag123 = __tag123.doStartTag();

        if (__result__tag123!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag123== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag123.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag123);
            return true;
        }
        _activeTag=__tag123.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag123);
        __tag123.release();
        return false;
    }

    private boolean _jsp__tag124(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag124 = null ;
        int __result__tag124 = 0 ;

        if (__tag124 == null ){
            __tag124 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag124);
        }
        __tag124.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag124, parent);
        __tag124.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.companyName", java.lang.String.class,"property"));
        __tag124.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag124;
        __result__tag124 = __tag124.doStartTag();

        if (__result__tag124!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag124== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag124.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag124);
            return true;
        }
        _activeTag=__tag124.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag124);
        __tag124.release();
        return false;
    }

    private boolean _jsp__tag125(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag125 = null ;
        int __result__tag125 = 0 ;

        if (__tag125 == null ){
            __tag125 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag125);
        }
        __tag125.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag125, parent);
        __tag125.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("groupShipData.description", java.lang.String.class,"property"));
        __tag125.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag125;
        __result__tag125 = __tag125.doStartTag();

        if (__result__tag125!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag125== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag125.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag125);
            return true;
        }
        _activeTag=__tag125.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag125);
        __tag125.release();
        return false;
    }

    private boolean _jsp__tag126(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag126 = null ;
        int __result__tag126 = 0 ;

        if (__tag126 == null ){
            __tag126 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag126);
        }
        __tag126.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag126, parent);
        __tag126.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.addressLine1", java.lang.String.class,"property"));
        __tag126.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag126;
        __result__tag126 = __tag126.doStartTag();

        if (__result__tag126!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag126== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag126.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag126);
            return true;
        }
        _activeTag=__tag126.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag126);
        __tag126.release();
        return false;
    }

    private boolean _jsp__tag127(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag127 = null ;
        int __result__tag127 = 0 ;

        if (__tag127 == null ){
            __tag127 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag127);
        }
        __tag127.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag127, parent);
        __tag127.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.addressLine2", java.lang.String.class,"property"));
        __tag127.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag127;
        __result__tag127 = __tag127.doStartTag();

        if (__result__tag127!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag127== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag127.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag127);
            return true;
        }
        _activeTag=__tag127.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag127);
        __tag127.release();
        return false;
    }

    private boolean _jsp__tag128(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag128 = null ;
        int __result__tag128 = 0 ;

        if (__tag128 == null ){
            __tag128 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag128);
        }
        __tag128.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag128, parent);
        __tag128.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.countryCode", java.lang.String.class,"property"));
        __tag128.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag128;
        __result__tag128 = __tag128.doStartTag();

        if (__result__tag128!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag128== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag128.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag128);
            return true;
        }
        _activeTag=__tag128.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag128);
        __tag128.release();
        return false;
    }

    private boolean _jsp__tag129(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag129 = null ;
        int __result__tag129 = 0 ;

        if (__tag129 == null ){
            __tag129 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag129);
        }
        __tag129.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag129, parent);
        __tag129.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fromData.addressData.phoneNumber", java.lang.String.class,"property"));
        __tag129.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag129;
        __result__tag129 = __tag129.doStartTag();

        if (__result__tag129!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag129== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag129.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag129);
            return true;
        }
        _activeTag=__tag129.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag129);
        __tag129.release();
        return false;
    }

    private boolean _jsp__tag130(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag130 = null ;
        int __result__tag130 = 0 ;

        if (__tag130 == null ){
            __tag130 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag130);
        }
        __tag130.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag130, parent);
        __tag130.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.info", java.lang.String.class,"key"));
        _activeTag=__tag130;
        __result__tag130 = __tag130.doStartTag();

        if (__result__tag130!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag130== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag130.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag130);
            return true;
        }
        _activeTag=__tag130.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag130);
        __tag130.release();
        return false;
    }

    private boolean _jsp__tag132(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag132 = null ;
        int __result__tag132 = 0 ;

        if (__tag132 == null ){
            __tag132 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag132);
        }
        __tag132.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag132, parent);
        __tag132.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.info", java.lang.String.class,"key"));
        _activeTag=__tag132;
        __result__tag132 = __tag132.doStartTag();

        if (__result__tag132!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag132== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag132.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag132);
            return true;
        }
        _activeTag=__tag132.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag132);
        __tag132.release();
        return false;
    }

    private boolean _jsp__tag134(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag134 = null ;
        int __result__tag134 = 0 ;

        if (__tag134 == null ){
            __tag134 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag134);
        }
        __tag134.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag134, parent);
        __tag134.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.info.track", java.lang.String.class,"key"));
        _activeTag=__tag134;
        __result__tag134 = __tag134.doStartTag();

        if (__result__tag134!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag134== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag134.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag134);
            return true;
        }
        _activeTag=__tag134.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag134);
        __tag134.release();
        return false;
    }

    private boolean _jsp__tag137(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag137 = null ;
        int __result__tag137 = 0 ;

        if (__tag137 == null ){
            __tag137 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag137);
        }
        __tag137.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag137, parent);
        __tag137.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.info.track", java.lang.String.class,"key"));
        _activeTag=__tag137;
        __result__tag137 = __tag137.doStartTag();

        if (__result__tag137!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag137== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag137.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag137);
            return true;
        }
        _activeTag=__tag137.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag137);
        __tag137.release();
        return false;
    }

    private boolean _jsp__tag139(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag139 = null ;
        int __result__tag139 = 0 ;

        if (__tag139 == null ){
            __tag139 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag139);
        }
        __tag139.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag139, parent);
        __tag139.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.info.track", java.lang.String.class,"key"));
        _activeTag=__tag139;
        __result__tag139 = __tag139.doStartTag();

        if (__result__tag139!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag139== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag139.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag139);
            return true;
        }
        _activeTag=__tag139.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag139);
        __tag139.release();
        return false;
    }

    private boolean _jsp__tag141(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag141 = null ;
        int __result__tag141 = 0 ;

        if (__tag141 == null ){
            __tag141 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag141);
        }
        __tag141.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag141, parent);
        __tag141.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.info.date", java.lang.String.class,"key"));
        _activeTag=__tag141;
        __result__tag141 = __tag141.doStartTag();

        if (__result__tag141!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag141== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag141.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag141);
            return true;
        }
        _activeTag=__tag141.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag141);
        __tag141.release();
        return false;
    }

    private boolean _jsp__tag144(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag144 = null ;
        int __result__tag144 = 0 ;

        if (__tag144 == null ){
            __tag144 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag144);
        }
        __tag144.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag144, parent);
        __tag144.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.info.date", java.lang.String.class,"key"));
        _activeTag=__tag144;
        __result__tag144 = __tag144.doStartTag();

        if (__result__tag144!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag144== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag144.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag144);
            return true;
        }
        _activeTag=__tag144.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag144);
        __tag144.release();
        return false;
    }

    private boolean _jsp__tag146(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag146 = null ;
        int __result__tag146 = 0 ;

        if (__tag146 == null ){
            __tag146 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag146);
        }
        __tag146.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag146, parent);
        __tag146.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.info.datecreated", java.lang.String.class,"key"));
        _activeTag=__tag146;
        __result__tag146 = __tag146.doStartTag();

        if (__result__tag146!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag146== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag146.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag146);
            return true;
        }
        _activeTag=__tag146.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag146);
        __tag146.release();
        return false;
    }

    private boolean _jsp__tag148(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag148 = null ;
        int __result__tag148 = 0 ;

        if (__tag148 == null ){
            __tag148 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag148);
        }
        __tag148.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag148, parent);
        __tag148.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.info.estimated", java.lang.String.class,"key"));
        _activeTag=__tag148;
        __result__tag148 = __tag148.doStartTag();

        if (__result__tag148!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag148== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag148.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag148);
            return true;
        }
        _activeTag=__tag148.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag148);
        __tag148.release();
        return false;
    }

    private boolean _jsp__tag152(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag152 = null ;
        int __result__tag152 = 0 ;

        if (__tag152 == null ){
            __tag152 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag152);
        }
        __tag152.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag152, parent);
        __tag152.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.info.estimated", java.lang.String.class,"key"));
        _activeTag=__tag152;
        __result__tag152 = __tag152.doStartTag();

        if (__result__tag152!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag152== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag152.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag152);
            return true;
        }
        _activeTag=__tag152.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag152);
        __tag152.release();
        return false;
    }

    private boolean _jsp__tag155(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag155 = null ;
        int __result__tag155 = 0 ;

        if (__tag155 == null ){
            __tag155 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag155);
        }
        __tag155.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag155, parent);
        __tag155.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.info.estimated", java.lang.String.class,"key"));
        _activeTag=__tag155;
        __result__tag155 = __tag155.doStartTag();

        if (__result__tag155!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag155== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag155.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag155);
            return true;
        }
        _activeTag=__tag155.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag155);
        __tag155.release();
        return false;
    }

    private boolean _jsp__tag159(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag159 = null ;
        int __result__tag159 = 0 ;

        if (__tag159 == null ){
            __tag159 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag159);
        }
        __tag159.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag159, parent);
        __tag159.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.pickup.showPackageInfo", java.lang.String.class,"key"));
        _activeTag=__tag159;
        __result__tag159 = __tag159.doStartTag();

        if (__result__tag159!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag159== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag159.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag159);
            return true;
        }
        _activeTag=__tag159.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag159);
        __tag159.release();
        return false;
    }

    private boolean _jsp__tag161(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag161 = null ;
        int __result__tag161 = 0 ;

        if (__tag161 == null ){
            __tag161 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag161);
        }
        __tag161.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag161, parent);
        __tag161.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.pickup.showPackageInfo", java.lang.String.class,"key"));
        _activeTag=__tag161;
        __result__tag161 = __tag161.doStartTag();

        if (__result__tag161!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag161== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag161.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag161);
            return true;
        }
        _activeTag=__tag161.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag161);
        __tag161.release();
        return false;
    }

    private boolean _jsp__tag164(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag164 = null ;
        int __result__tag164 = 0 ;

        if (__tag164 == null ){
            __tag164 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag164);
        }
        __tag164.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag164, parent);
        __tag164.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.importLabelType", java.lang.String.class,"key"));
        _activeTag=__tag164;
        __result__tag164 = __tag164.doStartTag();

        if (__result__tag164!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag164== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag164.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag164);
            return true;
        }
        _activeTag=__tag164.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag164);
        __tag164.release();
        return false;
    }

    private boolean _jsp__tag166(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag166 = null ;
        int __result__tag166 = 0 ;

        if (__tag166 == null ){
            __tag166 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag166);
        }
        __tag166.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag166, parent);
        __tag166.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.importShipperEmail", java.lang.String.class,"key"));
        _activeTag=__tag166;
        __result__tag166 = __tag166.doStartTag();

        if (__result__tag166!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag166== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag166.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag166);
            return true;
        }
        _activeTag=__tag166.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag166);
        __tag166.release();
        return false;
    }

    private boolean _jsp__tag168(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag168 = null ;
        int __result__tag168 = 0 ;

        if (__tag168 == null ){
            __tag168 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag168);
        }
        __tag168.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag168, parent);
        __tag168.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.returnLabelType", java.lang.String.class,"key"));
        _activeTag=__tag168;
        __result__tag168 = __tag168.doStartTag();

        if (__result__tag168!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag168== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag168.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag168);
            return true;
        }
        _activeTag=__tag168.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag168);
        __tag168.release();
        return false;
    }

    private boolean _jsp__tag170(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag170 = null ;
        int __result__tag170 = 0 ;

        if (__tag170 == null ){
            __tag170 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag170);
        }
        __tag170.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag170, parent);
        __tag170.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.returnShipperEmail", java.lang.String.class,"key"));
        _activeTag=__tag170;
        __result__tag170 = __tag170.doStartTag();

        if (__result__tag170!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag170== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag170.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag170);
            return true;
        }
        _activeTag=__tag170.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag170);
        __tag170.release();
        return false;
    }

    private boolean _jsp__tag173(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag173 = null ;
        int __result__tag173 = 0 ;

        if (__tag173 == null ){
            __tag173 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag173);
        }
        __tag173.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag173, parent);
        __tag173.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.pricingOption", java.lang.String.class,"key"));
        _activeTag=__tag173;
        __result__tag173 = __tag173.doStartTag();

        if (__result__tag173!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag173== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag173.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag173);
            return true;
        }
        _activeTag=__tag173.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag173);
        __tag173.release();
        return false;
    }

    private boolean _jsp__tag175(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag175 = null ;
        int __result__tag175 = 0 ;

        if (__tag175 == null ){
            __tag175 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag175);
        }
        __tag175.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag175, parent);
        __tag175.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.returnLabelType", java.lang.String.class,"key"));
        _activeTag=__tag175;
        __result__tag175 = __tag175.doStartTag();

        if (__result__tag175!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag175== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag175.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag175);
            return true;
        }
        _activeTag=__tag175.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag175);
        __tag175.release();
        return false;
    }

    private boolean _jsp__tag177(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag177 = null ;
        int __result__tag177 = 0 ;

        if (__tag177 == null ){
            __tag177 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag177);
        }
        __tag177.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag177, parent);
        __tag177.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.serviceType", java.lang.String.class,"key"));
        _activeTag=__tag177;
        __result__tag177 = __tag177.doStartTag();

        if (__result__tag177!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag177== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag177.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag177);
            return true;
        }
        _activeTag=__tag177.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag177);
        __tag177.release();
        return false;
    }

    private boolean _jsp__tag179(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag179 = null ;
        int __result__tag179 = 0 ;

        if (__tag179 == null ){
            __tag179 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag179);
        }
        __tag179.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag179, parent);
        __tag179.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.pricingOption", java.lang.String.class,"key"));
        _activeTag=__tag179;
        __result__tag179 = __tag179.doStartTag();

        if (__result__tag179!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag179== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag179.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag179);
            return true;
        }
        _activeTag=__tag179.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag179);
        __tag179.release();
        return false;
    }

    private boolean _jsp__tag181(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag181 = null ;
        int __result__tag181 = 0 ;

        if (__tag181 == null ){
            __tag181 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag181);
        }
        __tag181.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag181, parent);
        __tag181.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.serviceType", java.lang.String.class,"key"));
        _activeTag=__tag181;
        __result__tag181 = __tag181.doStartTag();

        if (__result__tag181!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag181== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag181.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag181);
            return true;
        }
        _activeTag=__tag181.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag181);
        __tag181.release();
        return false;
    }

    private boolean _jsp__tag183(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag183 = null ;
        int __result__tag183 = 0 ;

        if (__tag183 == null ){
            __tag183 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag183);
        }
        __tag183.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag183, parent);
        __tag183.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.returnLabelType", java.lang.String.class,"key"));
        _activeTag=__tag183;
        __result__tag183 = __tag183.doStartTag();

        if (__result__tag183!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag183== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag183.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag183);
            return true;
        }
        _activeTag=__tag183.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag183);
        __tag183.release();
        return false;
    }

    private boolean _jsp__tag185(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag185 = null ;
        int __result__tag185 = 0 ;

        if (__tag185 == null ){
            __tag185 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag185);
        }
        __tag185.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag185, parent);
        __tag185.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.packageType", java.lang.String.class,"key"));
        _activeTag=__tag185;
        __result__tag185 = __tag185.doStartTag();

        if (__result__tag185!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag185== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag185.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag185);
            return true;
        }
        _activeTag=__tag185.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag185);
        __tag185.release();
        return false;
    }

    private boolean _jsp__tag187(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag187 = null ;
        int __result__tag187 = 0 ;

        if (__tag187 == null ){
            __tag187 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag187);
        }
        __tag187.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag187, parent);
        __tag187.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.serviceType", java.lang.String.class,"key"));
        _activeTag=__tag187;
        __result__tag187 = __tag187.doStartTag();

        if (__result__tag187!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag187== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag187.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag187);
            return true;
        }
        _activeTag=__tag187.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag187);
        __tag187.release();
        return false;
    }

    private boolean _jsp__tag190(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag190 = null ;
        int __result__tag190 = 0 ;

        if (__tag190 == null ){
            __tag190 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag190);
        }
        __tag190.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag190, parent);
        __tag190.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.pricingOption", java.lang.String.class,"key"));
        _activeTag=__tag190;
        __result__tag190 = __tag190.doStartTag();

        if (__result__tag190!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag190== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag190.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag190);
            return true;
        }
        _activeTag=__tag190.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag190);
        __tag190.release();
        return false;
    }

    private boolean _jsp__tag192(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag192 = null ;
        int __result__tag192 = 0 ;

        if (__tag192 == null ){
            __tag192 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag192);
        }
        __tag192.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag192, parent);
        __tag192.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.serviceType", java.lang.String.class,"key"));
        _activeTag=__tag192;
        __result__tag192 = __tag192.doStartTag();

        if (__result__tag192!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag192== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag192.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag192);
            return true;
        }
        _activeTag=__tag192.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag192);
        __tag192.release();
        return false;
    }

    private boolean _jsp__tag195(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag195 = null ;
        int __result__tag195 = 0 ;

        if (__tag195 == null ){
            __tag195 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag195);
        }
        __tag195.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag195, parent);
        __tag195.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.packageType", java.lang.String.class,"key"));
        _activeTag=__tag195;
        __result__tag195 = __tag195.doStartTag();

        if (__result__tag195!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag195== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag195.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag195);
            return true;
        }
        _activeTag=__tag195.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag195);
        __tag195.release();
        return false;
    }

    private boolean _jsp__tag198(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag198 = null ;
        int __result__tag198 = 0 ;

        if (__tag198 == null ){
            __tag198 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag198);
        }
        __tag198.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag198, parent);
        __tag198.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.noOfReturns", java.lang.String.class,"key"));
        _activeTag=__tag198;
        __result__tag198 = __tag198.doStartTag();

        if (__result__tag198!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag198== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag198.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag198);
            return true;
        }
        _activeTag=__tag198.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag198);
        __tag198.release();
        return false;
    }

    private boolean _jsp__tag200(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag200 = null ;
        int __result__tag200 = 0 ;

        if (__tag200 == null ){
            __tag200 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag200);
        }
        __tag200.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag200, parent);
        __tag200.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.numberOfPackages", java.lang.String.class,"key"));
        _activeTag=__tag200;
        __result__tag200 = __tag200.doStartTag();

        if (__result__tag200!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag200== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag200.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag200);
            return true;
        }
        _activeTag=__tag200.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag200);
        __tag200.release();
        return false;
    }

    private boolean _jsp__tag202(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag202 = null ;
        int __result__tag202 = 0 ;

        if (__tag202 == null ){
            __tag202 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag202);
        }
        __tag202.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag202, parent);
        __tag202.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.packageType", java.lang.String.class,"key"));
        _activeTag=__tag202;
        __result__tag202 = __tag202.doStartTag();

        if (__result__tag202!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag202== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag202.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag202);
            return true;
        }
        _activeTag=__tag202.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag202);
        __tag202.release();
        return false;
    }

    private boolean _jsp__tag205(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag205 = null ;
        int __result__tag205 = 0 ;

        if (__tag205 == null ){
            __tag205 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag205);
        }
        __tag205.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag205, parent);
        __tag205.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.noOfImports", java.lang.String.class,"key"));
        _activeTag=__tag205;
        __result__tag205 = __tag205.doStartTag();

        if (__result__tag205!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag205== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag205.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag205);
            return true;
        }
        _activeTag=__tag205.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag205);
        __tag205.release();
        return false;
    }

    private boolean _jsp__tag207(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag207 = null ;
        int __result__tag207 = 0 ;

        if (__tag207 == null ){
            __tag207 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag207);
        }
        __tag207.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag207, parent);
        __tag207.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.noOfReturns", java.lang.String.class,"key"));
        _activeTag=__tag207;
        __result__tag207 = __tag207.doStartTag();

        if (__result__tag207!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag207== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag207.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag207);
            return true;
        }
        _activeTag=__tag207.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag207);
        __tag207.release();
        return false;
    }

    private boolean _jsp__tag209(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag209 = null ;
        int __result__tag209 = 0 ;

        if (__tag209 == null ){
            __tag209 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag209);
        }
        __tag209.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag209, parent);
        __tag209.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.numberOfPackages", java.lang.String.class,"key"));
        _activeTag=__tag209;
        __result__tag209 = __tag209.doStartTag();

        if (__result__tag209!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag209== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag209.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag209);
            return true;
        }
        _activeTag=__tag209.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag209);
        __tag209.release();
        return false;
    }

    private boolean _jsp__tag211(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag211 = null ;
        int __result__tag211 = 0 ;

        if (__tag211 == null ){
            __tag211 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag211);
        }
        __tag211.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag211, parent);
        __tag211.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.numberOfSkids", java.lang.String.class,"key"));
        _activeTag=__tag211;
        __result__tag211 = __tag211.doStartTag();

        if (__result__tag211!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag211== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag211.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag211);
            return true;
        }
        _activeTag=__tag211.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag211);
        __tag211.release();
        return false;
    }

    private boolean _jsp__tag213(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag213 = null ;
        int __result__tag213 = 0 ;

        if (__tag213 == null ){
            __tag213 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag213);
        }
        __tag213.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag213, parent);
        __tag213.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.totalPiecesOnSkids", java.lang.String.class,"key"));
        _activeTag=__tag213;
        __result__tag213 = __tag213.doStartTag();

        if (__result__tag213!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag213== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag213.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag213);
            return true;
        }
        _activeTag=__tag213.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag213);
        __tag213.release();
        return false;
    }

    private boolean _jsp__tag215(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag215 = null ;
        int __result__tag215 = 0 ;

        if (__tag215 == null ){
            __tag215 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag215);
        }
        __tag215.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag215, parent);
        __tag215.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.bookingConfirmationNumber", java.lang.String.class,"key"));
        _activeTag=__tag215;
        __result__tag215 = __tag215.doStartTag();

        if (__result__tag215!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag215== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag215.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag215);
            return true;
        }
        _activeTag=__tag215.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag215);
        __tag215.release();
        return false;
    }

    private boolean _jsp__tag218(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag218 = null ;
        int __result__tag218 = 0 ;

        if (__tag218 == null ){
            __tag218 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag218);
        }
        __tag218.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag218, parent);
        __tag218.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.pickup.totalWeight", java.lang.String.class,"key"));
        _activeTag=__tag218;
        __result__tag218 = __tag218.doStartTag();

        if (__result__tag218!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag218== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag218.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag218);
            return true;
        }
        _activeTag=__tag218.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag218);
        __tag218.release();
        return false;
    }

    private boolean _jsp__tag220(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag220 = null ;
        int __result__tag220 = 0 ;

        if (__tag220 == null ){
            __tag220 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag220);
        }
        __tag220.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag220, parent);
        __tag220.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.noOfReturns", java.lang.String.class,"key"));
        _activeTag=__tag220;
        __result__tag220 = __tag220.doStartTag();

        if (__result__tag220!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag220== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag220.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag220);
            return true;
        }
        _activeTag=__tag220.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag220);
        __tag220.release();
        return false;
    }

    private boolean _jsp__tag222(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag222 = null ;
        int __result__tag222 = 0 ;

        if (__tag222 == null ){
            __tag222 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag222);
        }
        __tag222.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag222, parent);
        __tag222.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.numberOfPackages", java.lang.String.class,"key"));
        _activeTag=__tag222;
        __result__tag222 = __tag222.doStartTag();

        if (__result__tag222!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag222== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag222.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag222);
            return true;
        }
        _activeTag=__tag222.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag222);
        __tag222.release();
        return false;
    }

    private boolean _jsp__tag226(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag226 = null ;
        int __result__tag226 = 0 ;

        if (__tag226 == null ){
            __tag226 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag226);
        }
        __tag226.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag226, parent);
        __tag226.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.rma", java.lang.String.class,"key"));
        _activeTag=__tag226;
        __result__tag226 = __tag226.doStartTag();

        if (__result__tag226!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag226== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag226.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag226);
            return true;
        }
        _activeTag=__tag226.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag226);
        __tag226.release();
        return false;
    }

    private boolean _jsp__tag227(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag227 = null ;
        int __result__tag227 = 0 ;

        if (__tag227 == null ){
            __tag227 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag227);
        }
        __tag227.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag227, parent);
        __tag227.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("billingData.rmaNumber", java.lang.String.class,"property"));
        __tag227.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag227;
        __result__tag227 = __tag227.doStartTag();

        if (__result__tag227!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag227== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag227.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag227);
            return true;
        }
        _activeTag=__tag227.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag227);
        __tag227.release();
        return false;
    }

    private boolean _jsp__tag229(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag229 = null ;
        int __result__tag229 = 0 ;

        if (__tag229 == null ){
            __tag229 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag229);
        }
        __tag229.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag229, parent);
        __tag229.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.declaredValue", java.lang.String.class,"key"));
        _activeTag=__tag229;
        __result__tag229 = __tag229.doStartTag();

        if (__result__tag229!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag229== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag229.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag229);
            return true;
        }
        _activeTag=__tag229.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag229);
        __tag229.release();
        return false;
    }

    private boolean _jsp__tag231(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag231 = null ;
        int __result__tag231 = 0 ;

        if (__tag231 == null ){
            __tag231 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag231);
        }
        __tag231.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag231, parent);
        __tag231.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("psdData.declaredValueCurrencyCode", java.lang.String.class,"property"));
        __tag231.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag231;
        __result__tag231 = __tag231.doStartTag();

        if (__result__tag231!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag231== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag231.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag231);
            return true;
        }
        _activeTag=__tag231.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag231);
        __tag231.release();
        return false;
    }

    private boolean _jsp__tag232(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag232 = null ;
        int __result__tag232 = 0 ;

        if (__tag232 == null ){
            __tag232 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag232);
        }
        __tag232.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag232, parent);
        __tag232.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.rma", java.lang.String.class,"key"));
        _activeTag=__tag232;
        __result__tag232 = __tag232.doStartTag();

        if (__result__tag232!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag232== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag232.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag232);
            return true;
        }
        _activeTag=__tag232.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag232);
        __tag232.release();
        return false;
    }

    private boolean _jsp__tag233(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag233 = null ;
        int __result__tag233 = 0 ;

        if (__tag233 == null ){
            __tag233 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag233);
        }
        __tag233.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag233, parent);
        __tag233.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("billingData.rmaNumber", java.lang.String.class,"property"));
        __tag233.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag233;
        __result__tag233 = __tag233.doStartTag();

        if (__result__tag233!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag233== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag233.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag233);
            return true;
        }
        _activeTag=__tag233.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag233);
        __tag233.release();
        return false;
    }

    private boolean _jsp__tag235(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag235 = null ;
        int __result__tag235 = 0 ;

        if (__tag235 == null ){
            __tag235 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag235);
        }
        __tag235.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag235, parent);
        __tag235.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.pickup.totalWeight", java.lang.String.class,"key"));
        _activeTag=__tag235;
        __result__tag235 = __tag235.doStartTag();

        if (__result__tag235!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag235== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag235.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag235);
            return true;
        }
        _activeTag=__tag235.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag235);
        __tag235.release();
        return false;
    }

    private boolean _jsp__tag237(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag237 = null ;
        int __result__tag237 = 0 ;

        if (__tag237 == null ){
            __tag237 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag237);
        }
        __tag237.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag237, parent);
        __tag237.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("psdData.weightUnitOfMeasure", java.lang.String.class,"property"));
        __tag237.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag237;
        __result__tag237 = __tag237.doStartTag();

        if (__result__tag237!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag237== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag237.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag237);
            return true;
        }
        _activeTag=__tag237.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag237);
        __tag237.release();
        return false;
    }

    private boolean _jsp__tag239(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag239 = null ;
        int __result__tag239 = 0 ;

        if (__tag239 == null ){
            __tag239 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag239);
        }
        __tag239.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag239, parent);
        __tag239.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("preferences.specialServices", java.lang.String.class,"key"));
        _activeTag=__tag239;
        __result__tag239 = __tag239.doStartTag();

        if (__result__tag239!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag239== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag239.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag239);
            return true;
        }
        _activeTag=__tag239.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag239);
        __tag239.release();
        return false;
    }

    private boolean _jsp__tag241(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag241 = null ;
        int __result__tag241 = 0 ;

        if (__tag241 == null ){
            __tag241 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag241);
        }
        __tag241.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag241, parent);
        __tag241.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.pickup.totalWeight", java.lang.String.class,"key"));
        _activeTag=__tag241;
        __result__tag241 = __tag241.doStartTag();

        if (__result__tag241!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag241== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag241.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag241);
            return true;
        }
        _activeTag=__tag241.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag241);
        __tag241.release();
        return false;
    }

    private boolean _jsp__tag243(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag243 = null ;
        int __result__tag243 = 0 ;

        if (__tag243 == null ){
            __tag243 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag243);
        }
        __tag243.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag243, parent);
        __tag243.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("psdData.weightUnitOfMeasure", java.lang.String.class,"property"));
        __tag243.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag243;
        __result__tag243 = __tag243.doStartTag();

        if (__result__tag243!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag243== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag243.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag243);
            return true;
        }
        _activeTag=__tag243.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag243);
        __tag243.release();
        return false;
    }

    private boolean _jsp__tag245(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag245 = null ;
        int __result__tag245 = 0 ;

        if (__tag245 == null ){
            __tag245 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag245);
        }
        __tag245.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag245, parent);
        __tag245.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.declaredValue", java.lang.String.class,"key"));
        _activeTag=__tag245;
        __result__tag245 = __tag245.doStartTag();

        if (__result__tag245!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag245== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag245.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag245);
            return true;
        }
        _activeTag=__tag245.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag245);
        __tag245.release();
        return false;
    }

    private boolean _jsp__tag247(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag247 = null ;
        int __result__tag247 = 0 ;

        if (__tag247 == null ){
            __tag247 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag247);
        }
        __tag247.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag247, parent);
        __tag247.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("psdData.declaredValueCurrencyCode", java.lang.String.class,"property"));
        __tag247.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag247;
        __result__tag247 = __tag247.doStartTag();

        if (__result__tag247!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag247== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag247.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag247);
            return true;
        }
        _activeTag=__tag247.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag247);
        __tag247.release();
        return false;
    }

    private boolean _jsp__tag249(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag249 = null ;
        int __result__tag249 = 0 ;

        if (__tag249 == null ){
            __tag249 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag249);
        }
        __tag249.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag249, parent);
        __tag249.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("preferences.pickupDropoff", java.lang.String.class,"key"));
        _activeTag=__tag249;
        __result__tag249 = __tag249.doStartTag();

        if (__result__tag249!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag249== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag249.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag249);
            return true;
        }
        _activeTag=__tag249.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag249);
        __tag249.release();
        return false;
    }

    private boolean _jsp__tag251(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag251 = null ;
        int __result__tag251 = 0 ;

        if (__tag251 == null ){
            __tag251 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag251);
        }
        __tag251.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag251, parent);
        __tag251.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.declaredValue", java.lang.String.class,"key"));
        _activeTag=__tag251;
        __result__tag251 = __tag251.doStartTag();

        if (__result__tag251!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag251== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag251.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag251);
            return true;
        }
        _activeTag=__tag251.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag251);
        __tag251.release();
        return false;
    }

    private boolean _jsp__tag253(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag253 = null ;
        int __result__tag253 = 0 ;

        if (__tag253 == null ){
            __tag253 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag253);
        }
        __tag253.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag253, parent);
        __tag253.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("psdData.declaredValueCurrencyCode", java.lang.String.class,"property"));
        __tag253.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag253;
        __result__tag253 = __tag253.doStartTag();

        if (__result__tag253!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag253== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag253.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag253);
            return true;
        }
        _activeTag=__tag253.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag253);
        __tag253.release();
        return false;
    }

    private boolean _jsp__tag256(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag256 = null ;
        int __result__tag256 = 0 ;

        if (__tag256 == null ){
            __tag256 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag256);
        }
        __tag256.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag256, parent);
        __tag256.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.pickupDate", java.lang.String.class,"key"));
        _activeTag=__tag256;
        __result__tag256 = __tag256.doStartTag();

        if (__result__tag256!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag256== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag256.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag256);
            return true;
        }
        _activeTag=__tag256.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag256);
        __tag256.release();
        return false;
    }

    private boolean _jsp__tag259(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag259 = null ;
        int __result__tag259 = 0 ;

        if (__tag259 == null ){
            __tag259 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag259);
        }
        __tag259.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag259, parent);
        __tag259.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.confirmationNo", java.lang.String.class,"key"));
        _activeTag=__tag259;
        __result__tag259 = __tag259.doStartTag();

        if (__result__tag259!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag259== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag259.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag259);
            return true;
        }
        _activeTag=__tag259.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag259);
        __tag259.release();
        return false;
    }

    private boolean _jsp__tag260(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag260 = null ;
        int __result__tag260 = 0 ;

        if (__tag260 == null ){
            __tag260 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag260);
        }
        __tag260.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag260, parent);
        __tag260.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("pickupDropoffData.confirmationNumber", java.lang.String.class,"property"));
        __tag260.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag260;
        __result__tag260 = __tag260.doStartTag();

        if (__result__tag260!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag260== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag260.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag260);
            return true;
        }
        _activeTag=__tag260.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag260);
        __tag260.release();
        return false;
    }

    private boolean _jsp__tag262(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag262 = null ;
        int __result__tag262 = 0 ;

        if (__tag262 == null ){
            __tag262 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag262);
        }
        __tag262.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag262, parent);
        __tag262.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.confirmationNo", java.lang.String.class,"key"));
        _activeTag=__tag262;
        __result__tag262 = __tag262.doStartTag();

        if (__result__tag262!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag262== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag262.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag262);
            return true;
        }
        _activeTag=__tag262.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag262);
        __tag262.release();
        return false;
    }

    private boolean _jsp__tag264(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag264 = null ;
        int __result__tag264 = 0 ;

        if (__tag264 == null ){
            __tag264 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag264);
        }
        __tag264.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag264, parent);
        __tag264.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.confirmationNo", java.lang.String.class,"key"));
        _activeTag=__tag264;
        __result__tag264 = __tag264.doStartTag();

        if (__result__tag264!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag264== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag264.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag264);
            return true;
        }
        _activeTag=__tag264.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag264);
        __tag264.release();
        return false;
    }

    private boolean _jsp__tag265(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag265 = null ;
        int __result__tag265 = 0 ;

        if (__tag265 == null ){
            __tag265 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag265);
        }
        __tag265.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag265, parent);
        __tag265.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("pickupDropoffData.confirmationNumber", java.lang.String.class,"property"));
        __tag265.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag265;
        __result__tag265 = __tag265.doStartTag();

        if (__result__tag265!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag265== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag265.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag265);
            return true;
        }
        _activeTag=__tag265.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag265);
        __tag265.release();
        return false;
    }

    private boolean _jsp__tag267(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag267 = null ;
        int __result__tag267 = 0 ;

        if (__tag267 == null ){
            __tag267 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag267);
        }
        __tag267.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag267, parent);
        __tag267.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("preferences.specialServices", java.lang.String.class,"key"));
        _activeTag=__tag267;
        __result__tag267 = __tag267.doStartTag();

        if (__result__tag267!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag267== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag267.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag267);
            return true;
        }
        _activeTag=__tag267.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag267);
        __tag267.release();
        return false;
    }

    private boolean _jsp__tag270(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag270 = null ;
        int __result__tag270 = 0 ;

        if (__tag270 == null ){
            __tag270 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag270);
        }
        __tag270.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag270, parent);
        __tag270.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("preferences.specialServices", java.lang.String.class,"key"));
        _activeTag=__tag270;
        __result__tag270 = __tag270.doStartTag();

        if (__result__tag270!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag270== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag270.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag270);
            return true;
        }
        _activeTag=__tag270.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag270);
        __tag270.release();
        return false;
    }

    private boolean _jsp__tag273(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag273 = null ;
        int __result__tag273 = 0 ;

        if (__tag273 == null ){
            __tag273 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag273);
        }
        __tag273.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag273, parent);
        __tag273.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("preferences.pickupDropoff", java.lang.String.class,"key"));
        _activeTag=__tag273;
        __result__tag273 = __tag273.doStartTag();

        if (__result__tag273!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag273== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag273.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag273);
            return true;
        }
        _activeTag=__tag273.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag273);
        __tag273.release();
        return false;
    }

    private boolean _jsp__tag276(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag276 = null ;
        int __result__tag276 = 0 ;

        if (__tag276 == null ){
            __tag276 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag276);
        }
        __tag276.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag276, parent);
        __tag276.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("preferences.pickupDropoff", java.lang.String.class,"key"));
        _activeTag=__tag276;
        __result__tag276 = __tag276.doStartTag();

        if (__result__tag276!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag276== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag276.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag276);
            return true;
        }
        _activeTag=__tag276.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag276);
        __tag276.release();
        return false;
    }

    private boolean _jsp__tag279(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag279 = null ;
        int __result__tag279 = 0 ;

        if (__tag279 == null ){
            __tag279 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag279);
        }
        __tag279.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag279, parent);
        __tag279.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.bill.info", java.lang.String.class,"key"));
        _activeTag=__tag279;
        __result__tag279 = __tag279.doStartTag();

        if (__result__tag279!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag279== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag279.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag279);
            return true;
        }
        _activeTag=__tag279.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag279);
        __tag279.release();
        return false;
    }

    private boolean _jsp__tag281(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag281 = null ;
        int __result__tag281 = 0 ;

        if (__tag281 == null ){
            __tag281 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag281);
        }
        __tag281.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag281, parent);
        __tag281.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ship.bill.info", java.lang.String.class,"key"));
        _activeTag=__tag281;
        __result__tag281 = __tag281.doStartTag();

        if (__result__tag281!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag281== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag281.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag281);
            return true;
        }
        _activeTag=__tag281.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag281);
        __tag281.release();
        return false;
    }

    private boolean _jsp__tag283(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag283 = null ;
        int __result__tag283 = 0 ;

        if (__tag283 == null ){
            __tag283 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag283);
        }
        __tag283.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag283, parent);
        __tag283.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.billTransportationTo1", java.lang.String.class,"key"));
        _activeTag=__tag283;
        __result__tag283 = __tag283.doStartTag();

        if (__result__tag283!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag283== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag283.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag283);
            return true;
        }
        _activeTag=__tag283.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag283);
        __tag283.release();
        return false;
    }

    private boolean _jsp__tag286(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag286 = null ;
        int __result__tag286 = 0 ;

        if (__tag286 == null ){
            __tag286 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag286);
        }
        __tag286.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag286, parent);
        __tag286.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.billTransportationTo1", java.lang.String.class,"key"));
        _activeTag=__tag286;
        __result__tag286 = __tag286.doStartTag();

        if (__result__tag286!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag286== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag286.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag286);
            return true;
        }
        _activeTag=__tag286.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag286);
        __tag286.release();
        return false;
    }

    private boolean _jsp__tag288(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag288 = null ;
        int __result__tag288 = 0 ;

        if (__tag288 == null ){
            __tag288 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag288);
        }
        __tag288.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag288, parent);
        __tag288.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.billTransportationTo1", java.lang.String.class,"key"));
        _activeTag=__tag288;
        __result__tag288 = __tag288.doStartTag();

        if (__result__tag288!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag288== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag288.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag288);
            return true;
        }
        _activeTag=__tag288.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag288);
        __tag288.release();
        return false;
    }

    private boolean _jsp__tag292(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag292 = null ;
        int __result__tag292 = 0 ;

        if (__tag292 == null ){
            __tag292 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag292);
        }
        __tag292.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag292, parent);
        __tag292.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.billDutiesAndTaxesTo", java.lang.String.class,"key"));
        _activeTag=__tag292;
        __result__tag292 = __tag292.doStartTag();

        if (__result__tag292!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag292== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag292.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag292);
            return true;
        }
        _activeTag=__tag292.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag292);
        __tag292.release();
        return false;
    }

    private boolean _jsp__tag296(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag296 = null ;
        int __result__tag296 = 0 ;

        if (__tag296 == null ){
            __tag296 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag296);
        }
        __tag296.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag296, parent);
        __tag296.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.billDutiesAndTaxesTo", java.lang.String.class,"key"));
        _activeTag=__tag296;
        __result__tag296 = __tag296.doStartTag();

        if (__result__tag296!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag296== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag296.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag296);
            return true;
        }
        _activeTag=__tag296.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag296);
        __tag296.release();
        return false;
    }

    private boolean _jsp__tag298(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag298 = null ;
        int __result__tag298 = 0 ;

        if (__tag298 == null ){
            __tag298 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag298);
        }
        __tag298.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag298, parent);
        __tag298.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.billDutiesAndTaxesTo", java.lang.String.class,"key"));
        _activeTag=__tag298;
        __result__tag298 = __tag298.doStartTag();

        if (__result__tag298!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag298== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag298.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag298);
            return true;
        }
        _activeTag=__tag298.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag298);
        __tag298.release();
        return false;
    }

    private boolean _jsp__tag301(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag301 = null ;
        int __result__tag301 = 0 ;

        if (__tag301 == null ){
            __tag301 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag301);
        }
        __tag301.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag301, parent);
        __tag301.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("billingData.referenceData.yourReference", java.lang.String.class,"property"));
        __tag301.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag301;
        __result__tag301 = __tag301.doStartTag();

        if (__result__tag301!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag301== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag301.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag301);
            return true;
        }
        _activeTag=__tag301.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag301);
        __tag301.release();
        return false;
    }

    private boolean _jsp__tag304(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag304 = null ;
        int __result__tag304 = 0 ;

        if (__tag304 == null ){
            __tag304 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag304);
        }
        __tag304.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag304, parent);
        __tag304.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("billingData.referenceData.yourReference", java.lang.String.class,"property"));
        __tag304.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag304;
        __result__tag304 = __tag304.doStartTag();

        if (__result__tag304!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag304== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag304.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag304);
            return true;
        }
        _activeTag=__tag304.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag304);
        __tag304.release();
        return false;
    }

    private boolean _jsp__tag306(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag306 = null ;
        int __result__tag306 = 0 ;

        if (__tag306 == null ){
            __tag306 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag306);
        }
        __tag306.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag306, parent);
        __tag306.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("billingData.referenceData.purchaseOrderNumber", java.lang.String.class,"property"));
        __tag306.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag306;
        __result__tag306 = __tag306.doStartTag();

        if (__result__tag306!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag306== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag306.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag306);
            return true;
        }
        _activeTag=__tag306.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag306);
        __tag306.release();
        return false;
    }

    private boolean _jsp__tag309(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag309 = null ;
        int __result__tag309 = 0 ;

        if (__tag309 == null ){
            __tag309 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag309);
        }
        __tag309.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag309, parent);
        __tag309.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("billingData.referenceData.purchaseOrderNumber", java.lang.String.class,"property"));
        __tag309.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag309;
        __result__tag309 = __tag309.doStartTag();

        if (__result__tag309!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag309== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag309.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag309);
            return true;
        }
        _activeTag=__tag309.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag309);
        __tag309.release();
        return false;
    }

    private boolean _jsp__tag311(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag311 = null ;
        int __result__tag311 = 0 ;

        if (__tag311 == null ){
            __tag311 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag311);
        }
        __tag311.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag311, parent);
        __tag311.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("billingData.referenceData.invoiceNumber", java.lang.String.class,"property"));
        __tag311.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag311;
        __result__tag311 = __tag311.doStartTag();

        if (__result__tag311!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag311== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag311.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag311);
            return true;
        }
        _activeTag=__tag311.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag311);
        __tag311.release();
        return false;
    }

    private boolean _jsp__tag314(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag314 = null ;
        int __result__tag314 = 0 ;

        if (__tag314 == null ){
            __tag314 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag314);
        }
        __tag314.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag314, parent);
        __tag314.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("billingData.referenceData.invoiceNumber", java.lang.String.class,"property"));
        __tag314.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag314;
        __result__tag314 = __tag314.doStartTag();

        if (__result__tag314!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag314== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag314.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag314);
            return true;
        }
        _activeTag=__tag314.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag314);
        __tag314.release();
        return false;
    }

    private boolean _jsp__tag316(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag316 = null ;
        int __result__tag316 = 0 ;

        if (__tag316 == null ){
            __tag316 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag316);
        }
        __tag316.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag316, parent);
        __tag316.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("billingData.referenceData.departmentNumber", java.lang.String.class,"property"));
        __tag316.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag316;
        __result__tag316 = __tag316.doStartTag();

        if (__result__tag316!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag316== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag316.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag316);
            return true;
        }
        _activeTag=__tag316.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag316);
        __tag316.release();
        return false;
    }

    private boolean _jsp__tag319(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.WriteTag __tag319 = null ;
        int __result__tag319 = 0 ;

        if (__tag319 == null ){
            __tag319 = new  org.apache.struts.taglib.bean.WriteTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag319);
        }
        __tag319.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag319, parent);
        __tag319.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("billingData.referenceData.departmentNumber", java.lang.String.class,"property"));
        __tag319.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag319;
        __result__tag319 = __tag319.doStartTag();

        if (__result__tag319!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag319== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.WriteTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag319.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag319);
            return true;
        }
        _activeTag=__tag319.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag319);
        __tag319.release();
        return false;
    }

    private boolean _jsp__tag321(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag321 = null ;
        int __result__tag321 = 0 ;

        if (__tag321 == null ){
            __tag321 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag321);
        }
        __tag321.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag321, parent);
        __tag321.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.shipReceipt.thankYou", java.lang.String.class,"key"));
        _activeTag=__tag321;
        __result__tag321 = __tag321.doStartTag();

        if (__result__tag321!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag321== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag321.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag321);
            return true;
        }
        _activeTag=__tag321.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag321);
        __tag321.release();
        return false;
    }

    private boolean _jsp__tag322(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag322 = null ;
        int __result__tag322 = 0 ;

        if (__tag322 == null ){
            __tag322 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag322);
        }
        __tag322.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag322, parent);
        __tag322.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.shipReceipt.pleaseNote", java.lang.String.class,"key"));
        _activeTag=__tag322;
        __result__tag322 = __tag322.doStartTag();

        if (__result__tag322!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag322== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag322.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag322);
            return true;
        }
        _activeTag=__tag322.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag322);
        __tag322.release();
        return false;
    }

    private boolean _jsp__tag323(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag323 = null ;
        int __result__tag323 = 0 ;

        if (__tag323 == null ){
            __tag323 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag323);
        }
        __tag323.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag323, parent);
        __tag323.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.shipReceipt.pleaseNoteText", java.lang.String.class,"key"));
        _activeTag=__tag323;
        __result__tag323 = __tag323.doStartTag();

        if (__result__tag323!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag323== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag323.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag323);
            return true;
        }
        _activeTag=__tag323.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag323);
        __tag323.release();
        return false;
    }

    private boolean _jsp__tag324(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag324 = null ;
        int __result__tag324 = 0 ;

        if (__tag324 == null ){
            __tag324 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag324);
        }
        __tag324.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag324, parent);
        __tag324.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.shipReceipt.pleaseNoteEstimatedCharges", java.lang.String.class,"key"));
        _activeTag=__tag324;
        __result__tag324 = __tag324.doStartTag();

        if (__result__tag324!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag324== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag324.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag324);
            return true;
        }
        _activeTag=__tag324.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag324);
        __tag324.release();
        return false;
    }

    private boolean _jsp__tag326(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag326 = null ;
        int __result__tag326 = 0 ;

        if (__tag326 == null ){
            __tag326 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag326);
        }
        __tag326.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag326, parent);
        __tag326.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("/css", java.lang.String.class,"dir"));
        __tag326.setFile(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("s_code-min.js", java.lang.String.class,"file"));
        __tag326.setMinified(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("false", java.lang.String.class,"minified"));
        __tag326.setVersioned(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("false", java.lang.String.class,"versioned"));
        _activeTag=__tag326;
        __result__tag326 = __tag326.doStartTag();

        if (__result__tag326!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag326== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.component.ScriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag326.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag326);
            return true;
        }
        _activeTag=__tag326.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag326);
        __tag326.release();
        return false;
    }
}
