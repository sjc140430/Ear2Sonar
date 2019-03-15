package jsp_servlet._jsp;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fedex.fsm.ship.common.vo.user.FSMPrivilege;
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.web.util.LoggerFactory;
import com.fedex.fsm.ship.web.util.ApplicationPropertyLoader;
import com.fedex.fsm.ship.web.util.ApplicationPropertyLoader;
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.web.util.UserProfileAdapter;
import org.apache.struts.Globals;
import org.apache.struts.util.MessageResources;
import com.fedex.fsm.ship.web.util.WebUtils;
import com.fedex.fsm.ship.web.util.*;
import java.util.*;
import com.fedex.fsm.ship.web.displayRules.SenderDisplayRules;
import com.fedex.framework.encode.commonslang.HTMLEncoder;
import com.fedex.fsm.http.LocaleBuilder;
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
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.web.util.LoggerFactory;
import com.fedex.fsm.ship.web.util.ApplicationPropertyLoader;

public final class __freightemailconfirmation extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/FreightEmailConfirmation.jsp", 1550053020000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/ModuleCommonInclude.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/PageCommonCSSInclude.jsi", 1550053020000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/PageCommonJSInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/FrameworkJSInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/PageCommonInclude.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/ReadSessionCSRFToken.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/WebCacheInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/MinifyInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        return false;
    }
    private weblogic.servlet.jsp.ExpressionInterceptor _jsp_expressionInterceptor = weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.getNonOperExpressionInterceptor();

    private static boolean _WL_ENCODED_BYTES_OK = true;
    private static final java.lang.String _WL_ORIGINAL_ENCODING = "ISO-8859-1".intern();

    private static byte[] _getBytes(java.lang.String block){
        try {
            return block.getBytes(_WL_ORIGINAL_ENCODING);
        } catch (java.io.UnsupportedEncodingException u){
            _WL_ENCODED_BYTES_OK = false;
        }
        return null;
    }

    private static java.lang.String  _wl_block0 ="\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\r\n";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\r\n\r\n";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private static java.lang.String  _wl_block4 ="\r\n\r\n<script>\r\nvar webCacheTimeStamp = \"";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private static java.lang.String  _wl_block5 ="\";\r\n</script>";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private static java.lang.String  _wl_block6 ="\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\"/> \r\n<script language=\"JavaScript\">\r\n\tvar contextPath =\"";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private static java.lang.String  _wl_block7 ="\";\r\n\tvar passKeyAdminEmailId = \"";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private static java.lang.String  _wl_block8 ="\";\r\n\tvar errors=";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

    private static java.lang.String  _wl_block9 =";\r\n\tvar ajaxTimeout = ";
    private final static byte[]  _wl_block9Bytes = _getBytes( _wl_block9 );

    private static java.lang.String  _wl_block10 =";\r\n\tvar S5TaggingEnabled = \"";
    private final static byte[]  _wl_block10Bytes = _getBytes( _wl_block10 );

    private static java.lang.String  _wl_block11 ="\";\r\n\tvar hitBoxAcctNumber=\"";
    private final static byte[]  _wl_block11Bytes = _getBytes( _wl_block11 );

    private static java.lang.String  _wl_block12 ="\";\r\n\tvar enableConsoleLogging = \"";
    private final static byte[]  _wl_block12Bytes = _getBytes( _wl_block12 );

    private static java.lang.String  _wl_block13 ="\";\r\n\tvar _dimensionLength = \"";
    private final static byte[]  _wl_block13Bytes = _getBytes( _wl_block13 );

    private static java.lang.String  _wl_block14 ="\";\r\n\tvar _dimensionWidth = \"";
    private final static byte[]  _wl_block14Bytes = _getBytes( _wl_block14 );

    private static java.lang.String  _wl_block15 ="\";\r\n\tvar _dimensionHeight = \"";
    private final static byte[]  _wl_block15Bytes = _getBytes( _wl_block15 );

    private static java.lang.String  _wl_block16 ="\";\r\n\tvar fsmr = {};\r\n\tfsmr.priv = {};\r\n\tfsmr.url={};\r\n\tfsmr.pref={};\r\n\t\r\n\t// Jan18CL - ITG 171800 - Allow Option for Billing Defaults not to change\r\n\tvar _isPrefBillToRestrictedFlag = ";
    private final static byte[]  _wl_block16Bytes = _getBytes( _wl_block16 );

    private static java.lang.String  _wl_block17 =";\r\n\tvar _isPrefDutyBillToRestrictedFlag = ";
    private final static byte[]  _wl_block17Bytes = _getBytes( _wl_block17 );

    private static java.lang.String  _wl_block18 =";\r\n\tvar _isPrefAdditionalHandlingRestrictedFlag = ";
    private final static byte[]  _wl_block18Bytes = _getBytes( _wl_block18 );

    private static java.lang.String  _wl_block19 =";\r\n\tvar _billingPrefRestrictedFlag = ";
    private final static byte[]  _wl_block19Bytes = _getBytes( _wl_block19 );

    private static java.lang.String  _wl_block20 =";\r\n\t\r\n\tfunction readUpdatedSessionCSRFToken() {\r\n    \t$(\'#reloadCSRFToken\').load(\'reloadCSRFToken.action\',{});\r\n    \t// Added {} at end to force POST request. By default IE uses GET request due to which page is cached and subsequent page loading requests are blocked. \r\n    }\r\n</script>\r\n<div id=\"reloadCSRFToken\"> ";
    private final static byte[]  _wl_block20Bytes = _getBytes( _wl_block20 );

    private static java.lang.String  _wl_block21 ="\r\n<script>\r\n\tvar _csrfToken = \"";
    private final static byte[]  _wl_block21Bytes = _getBytes( _wl_block21 );

    private static java.lang.String  _wl_block22 ="\";\r\n</script>\r\n";
    private final static byte[]  _wl_block22Bytes = _getBytes( _wl_block22 );

    private static java.lang.String  _wl_block23 ="</div>";
    private final static byte[]  _wl_block23Bytes = _getBytes( _wl_block23 );

    private static java.lang.String  _wl_block24 =" \r\n";
    private final static byte[]  _wl_block24Bytes = _getBytes( _wl_block24 );

    private static java.lang.String  _wl_block25 =" \r\n\r\n";
    private final static byte[]  _wl_block25Bytes = _getBytes( _wl_block25 );

    private static java.lang.String  _wl_block26 =" \r\n\r\n\r\n";
    private final static byte[]  _wl_block26Bytes = _getBytes( _wl_block26 );

    private static java.lang.String  _wl_block27 ="\r\n<script type=\"text/javascript\" charset=\"utf-8\">\r\n\r\n\t\r\n\tvar _isSPEnabled = ";
    private final static byte[]  _wl_block27Bytes = _getBytes( _wl_block27 );

    private static java.lang.String  _wl_block28 =";\r\n\tvar _isReturnsSPEnabled = ";
    private final static byte[]  _wl_block28Bytes = _getBytes( _wl_block28 );

    private static java.lang.String  _wl_block29 =";\r\n\tvar isRegionalServiceTypes = ";
    private final static byte[]  _wl_block29Bytes = _getBytes( _wl_block29 );

    private static java.lang.String  _wl_block30 =";\r\n\tvar isRegionalPackageTypes = ";
    private final static byte[]  _wl_block30Bytes = _getBytes( _wl_block30 );

    private static java.lang.String  _wl_block31 =";\r\n\tvar _isDomestic = ";
    private final static byte[]  _wl_block31Bytes = _getBytes( _wl_block31 );

    private static java.lang.String  _wl_block32 =";\r\n\tvar _isDomesticAllowed = ";
    private final static byte[]  _wl_block32Bytes = _getBytes( _wl_block32 );

    private static java.lang.String  _wl_block33 =";\r\n\tvar _isDomesticReturnsSupported = ";
    private final static byte[]  _wl_block33Bytes = _getBytes( _wl_block33 );

    private static java.lang.String  _wl_block34 =";\r\n\tvar _isDomesticShippingSupported = ";
    private final static byte[]  _wl_block34Bytes = _getBytes( _wl_block34 );

    private static java.lang.String  _wl_block35 =";\t\r\n\tvar _isSameCategoryPackageRefreshNeeded = ";
    private final static byte[]  _wl_block35Bytes = _getBytes( _wl_block35 );

    private static java.lang.String  _wl_block36 =";\t\r\n\tvar _isShowAlcoholService = ";
    private final static byte[]  _wl_block36Bytes = _getBytes( _wl_block36 );

    private static java.lang.String  _wl_block37 =";\r\n\tvar _localeURL = \"";
    private final static byte[]  _wl_block37Bytes = _getBytes( _wl_block37 );

    private static java.lang.String  _wl_block38 ="\";\r\n\tvar _isPackageContentsAvailable=";
    private final static byte[]  _wl_block38Bytes = _getBytes( _wl_block38 );

    private static java.lang.String  _wl_block39 =";\r\n\tvar _isReturnOnly = ";
    private final static byte[]  _wl_block39Bytes = _getBytes( _wl_block39 );

    private static java.lang.String  _wl_block40 =";\r\n\tvar _isFromEMEA = \"";
    private final static byte[]  _wl_block40Bytes = _getBytes( _wl_block40 );

    private static java.lang.String  _wl_block41 ="\";\r\n\tvar _originCountryCd = \"";
    private final static byte[]  _wl_block41Bytes = _getBytes( _wl_block41 );

    private static java.lang.String  _wl_block42 ="\";\r\n\tvar fromCountryCode = \"";
    private final static byte[]  _wl_block42Bytes = _getBytes( _wl_block42 );

    private static java.lang.String  _wl_block43 ="\";\r\n\tvar debugStatements = \"\"; ";
    private final static byte[]  _wl_block43Bytes = _getBytes( _wl_block43 );

    private static java.lang.String  _wl_block44 ="\t\r\n//\tvar i18n_select = \"";
    private final static byte[]  _wl_block44Bytes = _getBytes( _wl_block44 );

    private static java.lang.String  _wl_block45 ="\";\r\n//\tvar i18n_addressResults = \"";
    private final static byte[]  _wl_block45Bytes = _getBytes( _wl_block45 );

    private static java.lang.String  _wl_block46 ="\";\r\n//\tvar i18n_commercial = \"";
    private final static byte[]  _wl_block46Bytes = _getBytes( _wl_block46 );

    private static java.lang.String  _wl_block47 ="\";\r\n//\tvar i18n_residential = \"";
    private final static byte[]  _wl_block47Bytes = _getBytes( _wl_block47 );

    private static java.lang.String  _wl_block48 ="\";\r\n//\tvar i18n_useAddressEntered = \"";
    private final static byte[]  _wl_block48Bytes = _getBytes( _wl_block48 );

    private static java.lang.String  _wl_block49 ="\";\r\n//\tvar enteredAddressRolloverHelp = \"";
    private final static byte[]  _wl_block49Bytes = _getBytes( _wl_block49 );

    private static java.lang.String  _wl_block50 ="\";\r\n\tvar isReturnEnabled = ";
    private final static byte[]  _wl_block50Bytes = _getBytes( _wl_block50 );

    private static java.lang.String  _wl_block51 =";\r\n\tvar isSaveAsDefaultDiaChbxChecked = ";
    private final static byte[]  _wl_block51Bytes = _getBytes( _wl_block51 );

    private static java.lang.String  _wl_block52 =";\r\n\tvar isSaveAsDefaultCodChbxChecked = ";
    private final static byte[]  _wl_block52Bytes = _getBytes( _wl_block52 );

    private static java.lang.String  _wl_block53 =";\r\n\r\n\tvar i18n_select = \"";
    private final static byte[]  _wl_block53Bytes = _getBytes( _wl_block53 );

    private static java.lang.String  _wl_block54 ="\";\r\n\tvar i18n_addressResults=\"";
    private final static byte[]  _wl_block54Bytes = _getBytes( _wl_block54 );

    private static java.lang.String  _wl_block55 ="\";\r\n\tvar i18n_useAddressEntered =\"";
    private final static byte[]  _wl_block55Bytes = _getBytes( _wl_block55 );

    private static java.lang.String  _wl_block56 ="\";\r\n\tvar i18n_commercial =\"";
    private final static byte[]  _wl_block56Bytes = _getBytes( _wl_block56 );

    private static java.lang.String  _wl_block57 ="\";\r\n\tvar i18n_residential =\"";
    private final static byte[]  _wl_block57Bytes = _getBytes( _wl_block57 );

    private static java.lang.String  _wl_block58 ="\";\r\n\tvar enteredAddressRolloverHelp =\"";
    private final static byte[]  _wl_block58Bytes = _getBytes( _wl_block58 );

    private static java.lang.String  _wl_block59 ="\";\r\n\r\n\r\n\t//DTD3300: GDE3 Code Added\r\n\tvar globalDisplayRules={};\r\n\tglobalDisplayRules.isCustomsModuleAvailable=";
    private final static byte[]  _wl_block59Bytes = _getBytes( _wl_block59 );

    private static java.lang.String  _wl_block60 =";\r\n\tglobalDisplayRules.isPackageContentsAvailable=";
    private final static byte[]  _wl_block60Bytes = _getBytes( _wl_block60 );

    private static java.lang.String  _wl_block61 =";\r\n\r\n\tglobalDisplayRules.isUSDomestic = ";
    private final static byte[]  _wl_block61Bytes = _getBytes( _wl_block61 );

    private static java.lang.String  _wl_block62 =";\r\n\tglobalDisplayRules.isCADomestic = ";
    private final static byte[]  _wl_block62Bytes = _getBytes( _wl_block62 );

    private static java.lang.String  _wl_block63 =";\r\n\tglobalDisplayRules.isIndiaDomestic = ";
    private final static byte[]  _wl_block63Bytes = _getBytes( _wl_block63 );

    private static java.lang.String  _wl_block64 =";\r\n\tglobalDisplayRules.isUAEDomestic = ";
    private final static byte[]  _wl_block64Bytes = _getBytes( _wl_block64 );

    private static java.lang.String  _wl_block65 =";\r\n    globalDisplayRules.isDomestic = ";
    private final static byte[]  _wl_block65Bytes = _getBytes( _wl_block65 );

    private static java.lang.String  _wl_block66 =";\r\n    globalDisplayRules.isUKDomestic = ";
    private final static byte[]  _wl_block66Bytes = _getBytes( _wl_block66 );

    private static java.lang.String  _wl_block67 =";\r\n    globalDisplayRules.isDomesticAllowed = ";
    private final static byte[]  _wl_block67Bytes = _getBytes( _wl_block67 );

    private static java.lang.String  _wl_block68 =";\r\n\r\n//\tvar txtGroundSpecificSS = \"";
    private final static byte[]  _wl_block68Bytes = _getBytes( _wl_block68 );

    private static java.lang.String  _wl_block69 ="\";\r\n//\tvar txtGroundSpecificSSRollOverHelp = \"";
    private final static byte[]  _wl_block69Bytes = _getBytes( _wl_block69 );

    private static java.lang.String  _wl_block70 ="\";\r\n//\tvar txtHomeDeliverySpecificSS = \"";
    private final static byte[]  _wl_block70Bytes = _getBytes( _wl_block70 );

    private static java.lang.String  _wl_block71 ="\";\r\n//\tvar txtHomeDeliverySpecificSSRolloverHelp = \"";
    private final static byte[]  _wl_block71Bytes = _getBytes( _wl_block71 );

    private static java.lang.String  _wl_block72 ="\";\r\n\tvar txtGroundSpecificSS =\"";
    private final static byte[]  _wl_block72Bytes = _getBytes( _wl_block72 );

    private static java.lang.String  _wl_block73 ="\";\r\n\tvar txtGroundSpecificSSRollOverHelp =\"";
    private final static byte[]  _wl_block73Bytes = _getBytes( _wl_block73 );

    private static java.lang.String  _wl_block74 ="\";\r\n\tvar txtHomeDeliverySpecificSS =\"";
    private final static byte[]  _wl_block74Bytes = _getBytes( _wl_block74 );

    private static java.lang.String  _wl_block75 ="\";\r\n\tvar txtHomeDeliverySpecificSSRolloverHelp =\"";
    private final static byte[]  _wl_block75Bytes = _getBytes( _wl_block75 );

    private static java.lang.String  _wl_block76 ="\";\r\n\r\n\tvar isPostalCheckEnabled = ";
    private final static byte[]  _wl_block76Bytes = _getBytes( _wl_block76 );

    private static java.lang.String  _wl_block77 =" ;\r\n\tvar isAddressCheckEnabled = ";
    private final static byte[]  _wl_block77Bytes = _getBytes( _wl_block77 );

    private static java.lang.String  _wl_block78 =" ;\r\n\tvar isMandatoryAddressCheckEnabled = ";
    private final static byte[]  _wl_block78Bytes = _getBytes( _wl_block78 );

    private static java.lang.String  _wl_block79 =" ;\r\n\t\r\n\t// ITG # 163023 - File:inetAppConfig.properties, Key:LACANSplitEnabled\r\n\t// As part of cleanup isLACANSplitEnabled() is no longer exists in DecoupleState.java\r\n\tvar meterNumber = \"";
    private final static byte[]  _wl_block79Bytes = _getBytes( _wl_block79 );

    private static java.lang.String  _wl_block80 ="\";\r\n\tvar gticSuggestedDocumentsURL = \"";
    private final static byte[]  _wl_block80Bytes = _getBytes( _wl_block80 );

    private static java.lang.String  _wl_block81 ="\";\r\n\tvar isIRDEmailLableShipmentAllowed = \"";
    private final static byte[]  _wl_block81Bytes = _getBytes( _wl_block81 );

    private static java.lang.String  _wl_block82 ="\";\t\r\n\r\n\tvar isImportShipmentAllowed = \"";
    private final static byte[]  _wl_block82Bytes = _getBytes( _wl_block82 );

    private static java.lang.String  _wl_block83 ="\";\r\n\t\r\n\t//ITG 149885, LAC Columbia\r\n\tvar isAvailableCityListRefreshEnabled = ";
    private final static byte[]  _wl_block83Bytes = _getBytes( _wl_block83 );

    private static java.lang.String  _wl_block84 =";\r\n\tvar _isGDE4UKEnabled = ";
    private final static byte[]  _wl_block84Bytes = _getBytes( _wl_block84 );

    private static java.lang.String  _wl_block85 =";\r\n\tvar _isSMARRTZEnabled = ";
    private final static byte[]  _wl_block85Bytes = _getBytes( _wl_block85 );

    private static java.lang.String  _wl_block86 =";\r\n\tvar _isSMARRTZAlertEnabled = ";
    private final static byte[]  _wl_block86Bytes = _getBytes( _wl_block86 );

    private static java.lang.String  _wl_block87 =";\r\n\tvar _isNIAGARAEnabled = ";
    private final static byte[]  _wl_block87Bytes = _getBytes( _wl_block87 );

    private static java.lang.String  _wl_block88 =";\r\n\tvar isColumbiaPostalCodeMockEnabled = ";
    private final static byte[]  _wl_block88Bytes = _getBytes( _wl_block88 );

    private static java.lang.String  _wl_block89 =";\r\n\tvar _isIrdApacEnabled = ";
    private final static byte[]  _wl_block89Bytes = _getBytes( _wl_block89 );

    private static java.lang.String  _wl_block90 =";\r\n\t// Jan 2016 CL - ITG-169590 and ID-1485584\r\n    var _isEDNForSmartPostEnabled=";
    private final static byte[]  _wl_block90Bytes = _getBytes( _wl_block90 );

    private static java.lang.String  _wl_block91 =";\r\n\t// Jan 2015 CL, ITG 155652 and ID 1340471\r\n\t//  To validate eventId when adding/updating the commodity\r\n\tvar commodityEventId = \"\"; \r\n\t//  To save existing commodities data for temporary usage\r\n\tvar productsAsStringTemp = \"\";\r\n\t//  To get number of product prohibits\r\n\tvar numberOfProductProhibits = 0;\t\r\n\t\r\n\t//Fix for defect#319288, to validate prohibits\r\n\tvar isProhibit = false;\r\n\tvar _isLACSouthMiamiEnabled=";
    private final static byte[]  _wl_block91Bytes = _getBytes( _wl_block91 );

    private static java.lang.String  _wl_block92 =";\r\n\t//Jul 2016 CL - ITG 159201 ETD Enhancements - ID 1485809\r\n\tvar _isETDDGHazmatEnabled = ";
    private final static byte[]  _wl_block92Bytes = _getBytes( _wl_block92 );

    private static java.lang.String  _wl_block93 =";\r\n\tvar _isETDEnhancementEnabled = ";
    private final static byte[]  _wl_block93Bytes = _getBytes( _wl_block93 );

    private static java.lang.String  _wl_block94 =";\r\n\t// Jul 2018 CL - ITG-180129 OnSite2.3 - ID:112428\r\n\tvar _isOnsitePackageHandlingRestrictionEnabled = ";
    private final static byte[]  _wl_block94Bytes = _getBytes( _wl_block94 );

    private static java.lang.String  _wl_block95 =";\r\n\t//Jan 2017 CL - 177016 Sec II Lithium Battery Identification 1529522\r\n\tvar _isExpLitBatCellsAllowed = ";
    private final static byte[]  _wl_block95Bytes = _getBytes( _wl_block95 );

    private static java.lang.String  _wl_block96 =";\r\n\t\r\n\t// JUL17CL - ITG 176640 - Niagara 2.0 Phase 2\r\n\tvar _isBrokerSelect = ";
    private final static byte[]  _wl_block96Bytes = _getBytes( _wl_block96 );

    private static java.lang.String  _wl_block97 =";\r\n\tvar _isIGCAccountEnabled= ";
    private final static byte[]  _wl_block97Bytes = _getBytes( _wl_block97 );

    private static java.lang.String  _wl_block98 =";\r\n\tvar _isExcludeFromConsolidationChecked= ";
    private final static byte[]  _wl_block98Bytes = _getBytes( _wl_block98 );

    private static java.lang.String  _wl_block99 =";\r\n\tvar _isNIAGARAPhase2Enabled = ";
    private final static byte[]  _wl_block99Bytes = _getBytes( _wl_block99 );

    private static java.lang.String  _wl_block100 =";\r\n\tvar _isNonETDLabelAndIntraEUEnabled = ";
    private final static byte[]  _wl_block100Bytes = _getBytes( _wl_block100 );

    private static java.lang.String  _wl_block101 =";\r\n\tvar psdDispObj = ";
    private final static byte[]  _wl_block101Bytes = _getBytes( _wl_block101 );

    private static java.lang.String  _wl_block102 =";\r\n\t// Jan18CL - ITG 163016 Freight 2020\r\n\tvar _isFreight2020Enabled = ";
    private final static byte[]  _wl_block102Bytes = _getBytes( _wl_block102 );

    private static java.lang.String  _wl_block103 =";\r\n\tvar _freight2020MaxTotalHandlingUnits= ";
    private final static byte[]  _wl_block103Bytes = _getBytes( _wl_block103 );

    private static java.lang.String  _wl_block104 =";\r\n\r\n\t// Jan19CL - ITG 171804 - Allow an Admin to restrict shipping to the Central Address Book\r\n\tvar _isAddressBookRestricted = ";
    private final static byte[]  _wl_block104Bytes = _getBytes( _wl_block104 );

    private static java.lang.String  _wl_block105 =";\r\n\tconsole.log(_isAddressBookRestricted);\r\n\tvar clearAllFields = ";
    private final static byte[]  _wl_block105Bytes = _getBytes( _wl_block105 );

    private static java.lang.String  _wl_block106 =";\r\n\tvar _cabOutboundFlag = ";
    private final static byte[]  _wl_block106Bytes = _getBytes( _wl_block106 );

    private static java.lang.String  _wl_block107 =";\r\n\tvar _cabReturnFlag = ";
    private final static byte[]  _wl_block107Bytes = _getBytes( _wl_block107 );

    private static java.lang.String  _wl_block108 =";\r\n\tvar _isReturnImport= ";
    private final static byte[]  _wl_block108Bytes = _getBytes( _wl_block108 );

    private static java.lang.String  _wl_block109 =";\r\n\t\r\n\t// Jan19CL - ITG 171800 - Allow Option for Billing Defaults not to change\r\n\tvar _isBillToRestrictedFlag = ";
    private final static byte[]  _wl_block109Bytes = _getBytes( _wl_block109 );

    private static java.lang.String  _wl_block110 =";\r\n\tconsole.log(_isBillToRestrictedFlag);\r\n\tvar _isDutyBillToRestrictedFlag = ";
    private final static byte[]  _wl_block110Bytes = _getBytes( _wl_block110 );

    private static java.lang.String  _wl_block111 =";\r\n\tconsole.log(_isDutyBillToRestrictedFlag);\r\n\tvar _billingRestrictedFlag = ";
    private final static byte[]  _wl_block111Bytes = _getBytes( _wl_block111 );

    private static java.lang.String  _wl_block112 =";\r\n\tvar _isSafariOnMAC = ";
    private final static byte[]  _wl_block112Bytes = _getBytes( _wl_block112 );

    private static java.lang.String  _wl_block113 =";\r\n\t\r\n\t//\r\n</script>\r\n\r\n\r\n\r\n";
    private final static byte[]  _wl_block113Bytes = _getBytes( _wl_block113 );

    private static java.lang.String  _wl_block114 ="\r\n<meta name=\"wsstitle\" id=\"wsstitle\" content=\"";
    private final static byte[]  _wl_block114Bytes = _getBytes( _wl_block114 );

    private static java.lang.String  _wl_block115 ="\">\r\n<meta name=\"wssmlc\" id=\"wssmlc\" content=\"/";
    private final static byte[]  _wl_block115Bytes = _getBytes( _wl_block115 );

    private static java.lang.String  _wl_block116 ="/";
    private final static byte[]  _wl_block116Bytes = _getBytes( _wl_block116 );

    private static java.lang.String  _wl_block117 ="/fedex/inet/ship\">\r\n<title>";
    private final static byte[]  _wl_block117Bytes = _getBytes( _wl_block117 );

    private static java.lang.String  _wl_block118 =" - ";
    private final static byte[]  _wl_block118Bytes = _getBytes( _wl_block118 );

    private static java.lang.String  _wl_block119 ="</title>\r\n\r\n\r\n";
    private final static byte[]  _wl_block119Bytes = _getBytes( _wl_block119 );

    private static java.lang.String  _wl_block120 ="\r\n\t<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block120Bytes = _getBytes( _wl_block120 );

    private static java.lang.String  _wl_block121 ="/css/fsm_widgets.css\">\r\n\t<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block121Bytes = _getBytes( _wl_block121 );

    private static java.lang.String  _wl_block122 ="/css/fsm_safarifixsafari.css\">\r\n";
    private final static byte[]  _wl_block122Bytes = _getBytes( _wl_block122 );

    private static java.lang.String  _wl_block123 ="\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"/framework/css/widgets.css\">\r\n\t<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block123Bytes = _getBytes( _wl_block123 );

    private static java.lang.String  _wl_block124 ="/css/fsm_safarifixother.css\">\r\n";
    private final static byte[]  _wl_block124Bytes = _getBytes( _wl_block124 );

    private static java.lang.String  _wl_block125 =" \r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block125Bytes = _getBytes( _wl_block125 );

    private static java.lang.String  _wl_block126 ="/css/fsm_common_all";
    private final static byte[]  _wl_block126Bytes = _getBytes( _wl_block126 );

    private static java.lang.String  _wl_block127 =".css\">";
    private final static byte[]  _wl_block127Bytes = _getBytes( _wl_block127 );

    private static java.lang.String  _wl_block128 ="\r\n<script type=\"text/javascript\" charset=\"utf-8\">\r\n\tvar emailError = \"";
    private final static byte[]  _wl_block128Bytes = _getBytes( _wl_block128 );

    private static java.lang.String  _wl_block129 ="\";\r\n\tvar emailFormatError =\"";
    private final static byte[]  _wl_block129Bytes = _getBytes( _wl_block129 );

    private static java.lang.String  _wl_block130 ="\";\r\n\tvar pageType=\"freightEmailConfirmation\";\r\n\tvar helpPage= \'";
    private final static byte[]  _wl_block130Bytes = _getBytes( _wl_block130 );

    private static java.lang.String  _wl_block131 ="\';\r\n</script>\r\n</head>\r\n\r\n<body>\r\n<div id=\"page_no_global_header\">\r\n\t<div id=\"fsmContent\">\r\n\t";
    private final static byte[]  _wl_block131Bytes = _getBytes( _wl_block131 );

    private static java.lang.String  _wl_block132 ="\r\n\t\t<input type=\"hidden\" name=\"utype\" value=\"";
    private final static byte[]  _wl_block132Bytes = _getBytes( _wl_block132 );

    private static java.lang.String  _wl_block133 ="\">\r\n\t\t<div id=\"pageTopErr\" class=\"error\"></div>\r\n\t\t<div id=\"columnSingle\">\r\n\t\t\t<br>\r\n\t\t\t";
    private final static byte[]  _wl_block133Bytes = _getBytes( _wl_block133 );

    private static java.lang.String  _wl_block134 ="\r\n\t\t\t\t";
    private final static byte[]  _wl_block134Bytes = _getBytes( _wl_block134 );

    private static java.lang.String  _wl_block135 ="\r\n\t\t\t\t\t<label for=\"freightData.email\">";
    private final static byte[]  _wl_block135Bytes = _getBytes( _wl_block135 );

    private static java.lang.String  _wl_block136 ="</label>\r\n\t\t\t\t\t<br><br>\r\n\t\t\t\t\t<label for=\"freightData.email\">";
    private final static byte[]  _wl_block136Bytes = _getBytes( _wl_block136 );

    private static java.lang.String  _wl_block137 ="</label>\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block137Bytes = _getBytes( _wl_block137 );

    private static java.lang.String  _wl_block138 ="\r\n\t\t\t\t\t<hr color=\"#660099\" size=\"1px\">\r\n\t\t\t\t\t<label for=\"freightData.email\">";
    private final static byte[]  _wl_block138Bytes = _getBytes( _wl_block138 );

    private static java.lang.String  _wl_block139 ="</label><br><br>\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block139Bytes = _getBytes( _wl_block139 );

    private static java.lang.String  _wl_block140 ="\r\n\t\t\t\t\t<br>\r\n\t\t\t\t";
    private final static byte[]  _wl_block140Bytes = _getBytes( _wl_block140 );

    private static java.lang.String  _wl_block141 ="\r\n\t\t\t";
    private final static byte[]  _wl_block141Bytes = _getBytes( _wl_block141 );

    private static java.lang.String  _wl_block142 ="\r\n\t\t\t<br><br>\r\n\t\t\t<div style=\"float:right; padding-bottom:6px;\">\r\n\t\t\t\t<label for=\"freight.emailConfirmContinue\"><span class=\"ui-hidden-accessible\">";
    private final static byte[]  _wl_block142Bytes = _getBytes( _wl_block142 );

    private static java.lang.String  _wl_block143 ="</span><span aria-hidden=\"true\">";
    private final static byte[]  _wl_block143Bytes = _getBytes( _wl_block143 );

    private static java.lang.String  _wl_block144 ="</span></label>\r\n\t\t\t\t<input type=\"button\" id=\"freight.emailConfirmContinue\" class=\"btnPurple\" value=\'&nbsp;";
    private final static byte[]  _wl_block144Bytes = _getBytes( _wl_block144 );

    private static java.lang.String  _wl_block145 ="&nbsp;\'>\r\n\t\t\t</div> \r\n\t\t</div>\r\n\t\t";
    private final static byte[]  _wl_block145Bytes = _getBytes( _wl_block145 );

    private static java.lang.String  _wl_block146 ="\r\n\t";
    private final static byte[]  _wl_block146Bytes = _getBytes( _wl_block146 );

    private static java.lang.String  _wl_block147 ="\r\n\t</div>\r\n\t<div id=\"instructions\">\r\n\t\t\t\t<p><strong>";
    private final static byte[]  _wl_block147Bytes = _getBytes( _wl_block147 );

    private static java.lang.String  _wl_block148 ="<br></strong></p>\r\n\t\t\t\t<ul><li>";
    private final static byte[]  _wl_block148Bytes = _getBytes( _wl_block148 );

    private static java.lang.String  _wl_block149 ="</li></ul>\r\n\t\t\t\t<br><br>\r\n\t\t\t</div>\r\n</div>\r\n";
    private final static byte[]  _wl_block149Bytes = _getBytes( _wl_block149 );

    private static java.lang.String  _wl_block150 ="\r\n\r\n<script>\r\nvar minifiedJSFileSuffix = \"";
    private final static byte[]  _wl_block150Bytes = _getBytes( _wl_block150 );

    private static java.lang.String  _wl_block151 ="\r\n<script type=\"text/javascript\" charset=\"utf-8\" src=\"/framework/js/framework";
    private final static byte[]  _wl_block151Bytes = _getBytes( _wl_block151 );

    private static java.lang.String  _wl_block152 =".js\"></script>\r\n";
    private final static byte[]  _wl_block152Bytes = _getBytes( _wl_block152 );

    private static java.lang.String  _wl_block153 ="\r\n<script type=\"text/javascript\" charset=\"utf-8\">fsm.nav.init();</script>\r\n<script type=\"text/javascript\" charset=\"utf-8\">init();</script>\r\n</body>\r\n";
    private final static byte[]  _wl_block153Bytes = _getBytes( _wl_block153 );

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
        response.setHeader("Content-Type", "text/html;charset=UTF-8");
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter)out;
        _bw.setInitCharacterEncoding(_WL_ORIGINAL_ENCODING, _WL_ENCODED_BYTES_OK);
        javax.servlet.jsp.JspWriter _originalOut = out;
        javax.servlet.http.HttpSession session = request.getSession( true );
        try {;
            response.setContentType("text/html;charset=UTF-8");
            _bw.write(_wl_block0Bytes, _wl_block0);
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
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block3Bytes, _wl_block3);

	
	String webCachePolicy = ApplicationPropertyLoader.getInstance().getProperty("WEBCache");
	String webCacheTimeStamp = ApplicationPropertyLoader.getInstance().getProperty("WEBCacheTimeStamp");
	webCacheTimeStamp = ((WebConstants.Y.equals(webCachePolicy) && !webCacheTimeStamp.startsWith("@")) ? "_"+webCacheTimeStamp : "");
	if(webCacheTimeStamp==null){
		webCacheTimeStamp="";
	}
	//System.out.println("webCacheTimeStamp= " + webCacheTimeStamp);
	LoggerFactory.getLogger().debug(
	        "webCacheTimeStamp= " + webCacheTimeStamp);

                    _bw.write(_wl_block4Bytes, _wl_block4);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block5Bytes, _wl_block5);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block3Bytes, _wl_block3);

	String contextPath = request.getContextPath();
	String utype = (String) request.getAttribute(WebConstants.USER_TYPE);
	UserProfileAdapter userProfileAdapter = WebUtils.getUserProfileAdapter(request);
	//Jan 2015 CL - ITG-155772 and ID-1257810
	MessageResources res = (MessageResources) application.getAttribute(Globals.MESSAGES_KEY);
	HTMLEncoder htmlEncoder = new HTMLEncoder();
	String yourReferenceLbl = htmlEncoder.encode(WebUtils.getRenameReferencesObject(request,res).getYourReferenceLabel());
	String poNumberLbl = htmlEncoder.encode(WebUtils.getRenameReferencesObject(request,res).getPoNumberLabel());
	String invoiceNumberLbl = htmlEncoder.encode(WebUtils.getRenameReferencesObject(request,res).getInvoiceNumberLabel());
	String deptNumberLbl = htmlEncoder.encode(WebUtils.getRenameReferencesObject(request,res).getDeptNumberLabel());
	Locale loc = LocaleBuilder.getLocale(request);
	
	//Fix for defect 266390
	String pageType = request.getHeader ( "User-Agent" );
	boolean isPageSafari = false;
	boolean isPageOpera = false;
	boolean isPageFirefox = false;
	boolean isPageChrome = false;
	boolean isPageIE = false;
	int pageIndex = 0;
	if (pageType != null){
	    pageIndex = pageType.indexOf("Safari");
	    if (pageIndex >= 0) {
	        isPageSafari = true;
	    }
	    pageIndex = pageType.indexOf("Opera");
	    if (pageIndex >= 0) {
	        isPageOpera = true;
	    }
	    pageIndex = pageType.indexOf("Firefox");
	    if (pageIndex >= 0) {
	        isPageFirefox = true;
	    }
	    pageIndex = pageType.indexOf("Chrome");
	    if (pageIndex >= 0) {
	        isPageChrome = true;
	    }
	    pageIndex = pageType.indexOf("MSIE");
	    if (pageIndex >= 0) {
	        isPageIE = true;
	    }
	}
	
	// Jan19CL - ITG 171800 - Allow Option for Billing Defaults not to change
	// Reverting ITG171800 - hardcoding flags to true

	boolean isPrefBillToRestrictedFlag = false;
	boolean isPrefDutyBillToRestrictedFlag = false;
	boolean isPrefAdditionalHandlingRestrictedFlag = false;
	
	
	boolean billingPrefRestrictedFlag = isPrefBillToRestrictedFlag || isPrefDutyBillToRestrictedFlag || isPrefAdditionalHandlingRestrictedFlag;

                    _bw.write(_wl_block6Bytes, _wl_block6);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block7Bytes, _wl_block7);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(userProfileAdapter.getAdminEmail()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block8Bytes, _wl_block8);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(request.getAttribute("fsmMessages")), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block9Bytes, _wl_block9);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( ApplicationPropertyLoader.getInstance().getProperty("AJAX_TIMEOUT") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block10Bytes, _wl_block10);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( ApplicationPropertyLoader.getInstance().getProperty("S5TaggingEnabled") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block11Bytes, _wl_block11);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( ApplicationPropertyLoader.getInstance().getProperty("hitBoxAcctNumber") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block12Bytes, _wl_block12);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(ApplicationPropertyLoader.getInstance().getProperty("ConsoleLogging")), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block13Bytes, _wl_block13);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( res.getMessage(loc, "text.pickup.dimensions.length") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block14Bytes, _wl_block14);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( res.getMessage(loc, "text.pickup.dimensions.width") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block15Bytes, _wl_block15);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( res.getMessage(loc, "text.pickup.dimensions.height") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block16Bytes, _wl_block16);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPrefBillToRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block17Bytes, _wl_block17);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPrefDutyBillToRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block18Bytes, _wl_block18);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPrefAdditionalHandlingRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block19Bytes, _wl_block19);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(billingPrefRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block20Bytes, _wl_block20);
 String csrfToken =  (String) session.getAttribute("csrfToken"); 
                    _bw.write(_wl_block21Bytes, _wl_block21);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(csrfToken), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block22Bytes, _wl_block22);
                    _bw.write(_wl_block23Bytes, _wl_block23);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block3Bytes, _wl_block3);
                    _bw.write(_wl_block3Bytes, _wl_block3);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block3Bytes, _wl_block3);

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

                    _bw.write(_wl_block3Bytes, _wl_block3);
                    _bw.write(_wl_block24Bytes, _wl_block24);
                    _bw.write(_wl_block24Bytes, _wl_block24);
                    _bw.write(_wl_block24Bytes, _wl_block24);
                    _bw.write(_wl_block24Bytes, _wl_block24);
                    _bw.write(_wl_block24Bytes, _wl_block24);
                    _bw.write(_wl_block25Bytes, _wl_block25);
                    _bw.write(_wl_block24Bytes, _wl_block24);
                    _bw.write(_wl_block24Bytes, _wl_block24);
                    _bw.write(_wl_block24Bytes, _wl_block24);
                    _bw.write(_wl_block26Bytes, _wl_block26);
                    _bw.write(_wl_block27Bytes, _wl_block27);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( isSPEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block28Bytes, _wl_block28);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( isReturnsSPEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block29Bytes, _wl_block29);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( displayRules.isRegionalServiceTypes() ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block30Bytes, _wl_block30);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( displayRules.isRegionalPackageTypes() ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block31Bytes, _wl_block31);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isDomestic), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block32Bytes, _wl_block32);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isDomesticAllowed ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block33Bytes, _wl_block33);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isDomesticReturnsSupported ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block34Bytes, _wl_block34);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isDomesticShippingSupported), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block35Bytes, _wl_block35);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSameServiceCategoryPackageRefreshNeeded), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block36Bytes, _wl_block36);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isShowAlcoholService ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block37Bytes, _wl_block37);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(locale.toString()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block38Bytes, _wl_block38);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPackageContentsAvailable ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block39Bytes, _wl_block39);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isReturnOnly ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block40Bytes, _wl_block40);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFromEMEA), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block41Bytes, _wl_block41);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(originCountryCd), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block42Bytes, _wl_block42);
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
                    _bw.write(_wl_block43Bytes, _wl_block43);
                    _bw.write(_wl_block44Bytes, _wl_block44);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtSelect}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block45Bytes, _wl_block45);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtAddressResults}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block46Bytes, _wl_block46);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtCommercial}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block47Bytes, _wl_block47);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtResidential}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block48Bytes, _wl_block48);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtUseAddressEntered}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block49Bytes, _wl_block49);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${enteredAddressRolloverHelp}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block50Bytes, _wl_block50);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isReturnEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block51Bytes, _wl_block51);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSaveAsDefaultDiaChbxChecked), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block52Bytes, _wl_block52);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSaveAsDefaultCodChbxChecked), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block53Bytes, _wl_block53);

                    if (_jsp__tag2(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block54Bytes, _wl_block54);

                    if (_jsp__tag3(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block55Bytes, _wl_block55);

                    if (_jsp__tag4(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block56Bytes, _wl_block56);

                    if (_jsp__tag5(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block57Bytes, _wl_block57);

                    if (_jsp__tag6(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block58Bytes, _wl_block58);

                    if (_jsp__tag7(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block59Bytes, _wl_block59);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isCustomsModuleAvailable()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block60Bytes, _wl_block60);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isPackageContentsAvailable()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block61Bytes, _wl_block61);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isUSDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block62Bytes, _wl_block62);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isCanadaDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block63Bytes, _wl_block63);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isIndiaDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block64Bytes, _wl_block64);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isUAEDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block65Bytes, _wl_block65);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block66Bytes, _wl_block66);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isUKDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block67Bytes, _wl_block67);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isDomesticAllowed()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block68Bytes, _wl_block68);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtGroundSpecificSS}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block69Bytes, _wl_block69);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtGroundSpecificSSRollOverHelp}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block70Bytes, _wl_block70);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtHomeDeliverySpecificSS}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block71Bytes, _wl_block71);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtHomeDeliverySpecificSSRolloverHelp}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block72Bytes, _wl_block72);

                    if (_jsp__tag8(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block73Bytes, _wl_block73);

                    if (_jsp__tag9(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block74Bytes, _wl_block74);

                    if (_jsp__tag10(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block75Bytes, _wl_block75);

                    if (_jsp__tag11(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block76Bytes, _wl_block76);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPostalCheckEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block77Bytes, _wl_block77);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isAddressCheckEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block78Bytes, _wl_block78);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isMandatoryAddressCheckEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block79Bytes, _wl_block79);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(meterNumber), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block80Bytes, _wl_block80);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(gticSuggestedDocumentsURL), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block81Bytes, _wl_block81);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isIRDEmailLableShipmentAllowed), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block82Bytes, _wl_block82);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isImportShipmentAllowed), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block83Bytes, _wl_block83);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isAvailableCityListRefreshEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block84Bytes, _wl_block84);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isGDE4UKEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block85Bytes, _wl_block85);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSMARRTZEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block86Bytes, _wl_block86);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSMARRTZAlertEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block87Bytes, _wl_block87);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isNIAGARAEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block88Bytes, _wl_block88);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isColumbiaPostalCodeMockEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block89Bytes, _wl_block89);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(DecoupleState.INSTANCE.isIRDAPACShippingAllowed()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block90Bytes, _wl_block90);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isEDNForSmartPostEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block91Bytes, _wl_block91);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isLACSouthMiamiEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block92Bytes, _wl_block92);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isETDDGHazmatEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block93Bytes, _wl_block93);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isETDEnhancementEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block94Bytes, _wl_block94);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isOnsitePackageHandlingRestrictionEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block95Bytes, _wl_block95);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isExpressLithiumBatteryAllowed ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block96Bytes, _wl_block96);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isBrokerSelect), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block97Bytes, _wl_block97);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(form.getSsData().isIntlGrdConsolidationAcctBoolean()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block98Bytes, _wl_block98);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(form.getSsData().isExcludeFromConsolidationBoolean()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block99Bytes, _wl_block99);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isNIAGARAPhase2Enabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block100Bytes, _wl_block100);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isNonETDLabelAndIntraEUEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block101Bytes, _wl_block101);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(JSONSimulator.toJSONString(form.getPsdDisplay())), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block102Bytes, _wl_block102);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020Enabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block103Bytes, _wl_block103);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(freight2020MaxTotalHandlingUnits), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block104Bytes, _wl_block104);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isAddressBookRestricted), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block105Bytes, _wl_block105);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isClearAllFields), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block106Bytes, _wl_block106);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(cabOutboundFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block107Bytes, _wl_block107);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(cabReturnFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block108Bytes, _wl_block108);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isReturnShipment || isImportShipment ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block109Bytes, _wl_block109);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isBillToRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block110Bytes, _wl_block110);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isDutyBillToRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block111Bytes, _wl_block111);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(billingRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block112Bytes, _wl_block112);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSafariOnMAC), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block113Bytes, _wl_block113);
                    _bw.write(_wl_block2Bytes, _wl_block2);

 String shipType = "domestic";
 if ( isInternational) {
	shipType = "international";
 } else if (isReturnShipment) {
	shipType = "return";
 } else if (isGroupShip) {
	shipType = "group";
 }

                    _bw.write(_wl_block114Bytes, _wl_block114);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(shipType), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block115Bytes, _wl_block115);
                     com.fedex.framework.taglib.encode.HtmlTag __tag12 = null ;
                    int __result__tag12 = 0 ;

                    if (__tag12 == null ){
                        __tag12 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag12);
                    }
                    __tag12.setPageContext(pageContext);
                    __tag12.setParent(__tag0);
                    __tag12.setValue(locale.getCountry()
);
                    _activeTag=__tag12;
                    __result__tag12 = __tag12.doStartTag();

                    if (__result__tag12!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag12== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag12.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag12);
                        return;
                    }
                    _activeTag=__tag12.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag12);
                    __tag12.release();
                    _bw.write(_wl_block116Bytes, _wl_block116);
                     com.fedex.framework.taglib.encode.HtmlTag __tag13 = null ;
                    int __result__tag13 = 0 ;

                    if (__tag13 == null ){
                        __tag13 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag13);
                    }
                    __tag13.setPageContext(pageContext);
                    __tag13.setParent(__tag0);
                    __tag13.setValue(locale.getLanguage()
);
                    _activeTag=__tag13;
                    __result__tag13 = __tag13.doStartTag();

                    if (__result__tag13!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag13== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
                    _bw.write(_wl_block117Bytes, _wl_block117);

                    if (_jsp__tag14(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block118Bytes, _wl_block118);

                    if (_jsp__tag15(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block119Bytes, _wl_block119);

String emailConfirmation = resources.getMessage(locale, "text.emailConfirmation");
String senderEmail = "";
if(outboundForm != null) {
	senderEmail = outboundForm.getFreightData().getEmail();
}else {
 	senderEmail = form.getFreightData().getEmail();
}
if (WebUtils.isEmpty(senderEmail)) {
	if(outboundForm != null) {
		senderEmail = outboundForm.getNotificationData().getSenderNotifications().getEmail();
	}else {
		senderEmail = form.getNotificationData().getSenderNotifications().getEmail();
	}
}
String helpPage = references.getMessage(locale, "page.help.freightEmailConfirmation");

                    _bw.write(_wl_block2Bytes, _wl_block2);
 String userAgentDetails = request.getHeader ( "User-Agent" );
	boolean isSafariOnMac = false;
	int browserIndx = 0;
	int OSIndx,chromeIndx = 0;
	if (userAgentDetails != null){
	    browserIndx = userAgentDetails.indexOf("Safari");
	    OSIndx = userAgentDetails.indexOf("Mac");
	     chromeIndx = userAgentDetails.indexOf("Chrome");
	     if((browserIndx >= 0) && (OSIndx > 0) && (!(chromeIndx > 0))) {
	    	isSafariOnMac = true;
	    }
	 }  
if(isSafariOnMac) {
                    _bw.write(_wl_block120Bytes, _wl_block120);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block121Bytes, _wl_block121);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block122Bytes, _wl_block122);
 } else { 
                    _bw.write(_wl_block123Bytes, _wl_block123);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block124Bytes, _wl_block124);
 } 
                    _bw.write(_wl_block125Bytes, _wl_block125);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block126Bytes, _wl_block126);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block127Bytes, _wl_block127);
                    _bw.write(_wl_block128Bytes, _wl_block128);

                    if (_jsp__tag16(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block129Bytes, _wl_block129);

                    if (_jsp__tag17(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block130Bytes, _wl_block130);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( helpPage ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block131Bytes, _wl_block131);
                     org.apache.struts.taglib.html.FormTag __tag18 = null ;
                    int __result__tag18 = 0 ;

                    if (__tag18 == null ){
                        __tag18 = new  org.apache.struts.taglib.html.FormTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag18);
                    }
                    __tag18.setPageContext(pageContext);
                    __tag18.setParent(__tag0);
                    __tag18.setAction(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freightEmailConfirmationAction", java.lang.String.class,"action"));
                    _activeTag=__tag18;
                    __result__tag18 = __tag18.doStartTag();

                    if (__result__tag18!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag18== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.html.FormTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block132Bytes, _wl_block132);
                             com.fedex.framework.taglib.encode.HtmlTag __tag19 = null ;
                            int __result__tag19 = 0 ;

                            if (__tag19 == null ){
                                __tag19 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag19);
                            }
                            __tag19.setPageContext(pageContext);
                            __tag19.setParent(__tag18);
                            __tag19.setValue(utype
);
                            _activeTag=__tag19;
                            __result__tag19 = __tag19.doStartTag();

                            if (__result__tag19!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag19== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                            }
                            if (__tag19.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag19);
                                return;
                            }
                            _activeTag=__tag19.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag19);
                            __tag19.release();
                            _bw.write(_wl_block133Bytes, _wl_block133);
                             com.fedex.framework.taglib.ModuleTag __tag20 = null ;
                            int __result__tag20 = 0 ;

                            if (__tag20 == null ){
                                __tag20 = new  com.fedex.framework.taglib.ModuleTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag20);
                            }
                            __tag20.setPageContext(pageContext);
                            __tag20.setParent(__tag18);
                            __tag20.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freight.emailConfirmation", java.lang.String.class,"id"));
                            __tag20.setType(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("required", java.lang.String.class,"type"));
                            __tag20.setTitle(emailConfirmation 
);
                            __tag20.setDefaultMode(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("expanded", java.lang.String.class,"defaultMode"));
                            __tag20.setHasHelp(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                            __tag20.setCollapsable(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                            _activeTag=__tag20;
                            __result__tag20 = __tag20.doStartTag();

                            if (__result__tag20!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag20== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.ModuleTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block134Bytes, _wl_block134);
                                     com.fedex.framework.taglib.ModuleExpandedTag __tag21 = null ;
                                    int __result__tag21 = 0 ;

                                    if (__tag21 == null ){
                                        __tag21 = new  com.fedex.framework.taglib.ModuleExpandedTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag21);
                                    }
                                    __tag21.setPageContext(pageContext);
                                    __tag21.setParent(__tag20);
                                    _activeTag=__tag21;
                                    __result__tag21 = __tag21.doStartTag();

                                    if (__result__tag21!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag21== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.ModuleExpandedTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block135Bytes, _wl_block135);

                                            if (_jsp__tag22(request, response, pageContext, _activeTag, __tag21))
                                             return;
                                            _bw.write(_wl_block136Bytes, _wl_block136);

                                            if (_jsp__tag23(request, response, pageContext, _activeTag, __tag21))
                                             return;
                                            _bw.write(_wl_block136Bytes, _wl_block136);

                                            if (_jsp__tag24(request, response, pageContext, _activeTag, __tag21))
                                             return;
                                            _bw.write(_wl_block137Bytes, _wl_block137);
                                            _bw.write(_wl_block138Bytes, _wl_block138);

                                            if (_jsp__tag25(request, response, pageContext, _activeTag, __tag21))
                                             return;
                                            _bw.write(_wl_block139Bytes, _wl_block139);
                                             org.apache.struts.taglib.html.TextTag __tag26 = null ;
                                            int __result__tag26 = 0 ;

                                            if (__tag26 == null ){
                                                __tag26 = new  org.apache.struts.taglib.html.TextTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag26);
                                            }
                                            __tag26.setPageContext(pageContext);
                                            __tag26.setParent(__tag21);
                                            __tag26.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freightData.email", java.lang.String.class,"property"));
                                            __tag26.setStyleId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freightData.email", java.lang.String.class,"styleId"));
                                            __tag26.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
                                            __tag26.setSize(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("40", java.lang.String.class,"size"));
                                            __tag26.setMaxlength(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("80", java.lang.String.class,"maxlength"));
                                            __tag26.setValue(senderEmail 
);
                                            _activeTag=__tag26;
                                            __result__tag26 = __tag26.doStartTag();

                                            if (__result__tag26!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag26== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                }
                                            }
                                            if (__tag26.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag26);
                                                return;
                                            }
                                            _activeTag=__tag26.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag26);
                                            __tag26.release();
                                            _bw.write(_wl_block140Bytes, _wl_block140);
                                        } while (__tag21.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag21.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag21);
                                        return;
                                    }
                                    _activeTag=__tag21.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag21);
                                    __tag21.release();
                                    _bw.write(_wl_block141Bytes, _wl_block141);
                                } while (__tag20.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag20.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag20);
                                return;
                            }
                            _activeTag=__tag20.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag20);
                            __tag20.release();
                            _bw.write(_wl_block142Bytes, _wl_block142);

                            if (_jsp__tag27(request, response, pageContext, _activeTag, __tag18))
                             return;
                            _bw.write(_wl_block143Bytes, _wl_block143);

                            if (_jsp__tag28(request, response, pageContext, _activeTag, __tag18))
                             return;
                            _bw.write(_wl_block144Bytes, _wl_block144);

                            if (_jsp__tag29(request, response, pageContext, _activeTag, __tag18))
                             return;
                            _bw.write(_wl_block145Bytes, _wl_block145);
                            {java.lang.String __page ="/jsp/HiddenNav.jsp";
                                java.lang.String[][] __queryParams = {};
                                java.lang.String __encoding = request.getCharacterEncoding();
                                if (__encoding == null) __encoding ="ISO-8859-1";

                                if (__queryParams.length == 0 ) pageContext.include(__page);
                                 else pageContext.include(weblogic.utils.http.HttpParsing.makeURI(__page, __queryParams, __encoding));
                            }_bw.write(_wl_block146Bytes, _wl_block146);
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
                    _bw.write(_wl_block147Bytes, _wl_block147);

                    if (_jsp__tag30(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block148Bytes, _wl_block148);

                    if (_jsp__tag31(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block149Bytes, _wl_block149);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block3Bytes, _wl_block3);

	
	String minifiedJSFileSuffix = (String)request.getAttribute("jsSuffix") ;
	String minifiedFwkFileSuffix = (String)request.getAttribute("frameworkSuffix");
	if(minifiedJSFileSuffix==null){
		minifiedJSFileSuffix="";
	}
	if(minifiedFwkFileSuffix==null){
		minifiedFwkFileSuffix="";
	}
	LoggerFactory.getLogger().debug(
	        "minifiedJSFileSuffix= " + minifiedJSFileSuffix + " minifiedFWKFileSuffix= "
	                + minifiedFwkFileSuffix);

                    _bw.write(_wl_block150Bytes, _wl_block150);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(minifiedJSFileSuffix), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block5Bytes, _wl_block5);
                    _bw.write(_wl_block151Bytes, _wl_block151);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(minifiedFwkFileSuffix), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block152Bytes, _wl_block152);
                    _bw.write(_wl_block2Bytes, _wl_block2);

                    if (_jsp__tag32(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block2Bytes, _wl_block2);

                    if (_jsp__tag33(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block24Bytes, _wl_block24);

                    if (_jsp__tag34(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block2Bytes, _wl_block2);

                    if (_jsp__tag35(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block153Bytes, _wl_block153);
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
            _bw.write(_wl_block2Bytes, _wl_block2);
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

    private boolean _jsp__tag14(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag14 = null ;
        int __result__tag14 = 0 ;

        if (__tag14 == null ){
            __tag14 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag14);
        }
        __tag14.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag14, parent);
        __tag14.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("app.name", java.lang.String.class,"key"));
        _activeTag=__tag14;
        __result__tag14 = __tag14.doStartTag();

        if (__result__tag14!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag14== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag14.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag14);
            return true;
        }
        _activeTag=__tag14.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag14);
        __tag14.release();
        return false;
    }

    private boolean _jsp__tag15(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag15 = null ;
        int __result__tag15 = 0 ;

        if (__tag15 == null ){
            __tag15 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag15);
        }
        __tag15.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag15, parent);
        __tag15.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("app.title.outboundShip", java.lang.String.class,"key"));
        _activeTag=__tag15;
        __result__tag15 = __tag15.doStartTag();

        if (__result__tag15!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag15== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag15.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag15);
            return true;
        }
        _activeTag=__tag15.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag15);
        __tag15.release();
        return false;
    }

    private boolean _jsp__tag16(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag16 = null ;
        int __result__tag16 = 0 ;

        if (__tag16 == null ){
            __tag16 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag16);
        }
        __tag16.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag16, parent);
        __tag16.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.emailInvalidError", java.lang.String.class,"key"));
        _activeTag=__tag16;
        __result__tag16 = __tag16.doStartTag();

        if (__result__tag16!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag16== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag16.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag16);
            return true;
        }
        _activeTag=__tag16.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag16);
        __tag16.release();
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
        __tag17.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("invalidEmail", java.lang.String.class,"key"));
        __tag17.setBundle(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("error", java.lang.String.class,"bundle"));
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

    private boolean _jsp__tag22(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag22 = null ;
        int __result__tag22 = 0 ;

        if (__tag22 == null ){
            __tag22 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag22);
        }
        __tag22.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag22, parent);
        __tag22.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.emailRequiredMessage1", java.lang.String.class,"key"));
        _activeTag=__tag22;
        __result__tag22 = __tag22.doStartTag();

        if (__result__tag22!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag22== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag22.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag22);
            return true;
        }
        _activeTag=__tag22.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag22);
        __tag22.release();
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
        __tag23.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.emailRequiredMessage2", java.lang.String.class,"key"));
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

    private boolean _jsp__tag24(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag24 = null ;
        int __result__tag24 = 0 ;

        if (__tag24 == null ){
            __tag24 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag24);
        }
        __tag24.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag24, parent);
        __tag24.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.emailRequiredMessage3", java.lang.String.class,"key"));
        _activeTag=__tag24;
        __result__tag24 = __tag24.doStartTag();

        if (__result__tag24!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag24== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag24.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag24);
            return true;
        }
        _activeTag=__tag24.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag24);
        __tag24.release();
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
        __tag25.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.emailRequiredMessage4", java.lang.String.class,"key"));
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
        __tag27.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.continue", java.lang.String.class,"key"));
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

    private boolean _jsp__tag28(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag28 = null ;
        int __result__tag28 = 0 ;

        if (__tag28 == null ){
            __tag28 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag28);
        }
        __tag28.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag28, parent);
        __tag28.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.emailRequiredMessage2", java.lang.String.class,"key"));
        _activeTag=__tag28;
        __result__tag28 = __tag28.doStartTag();

        if (__result__tag28!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag28== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag28.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag28);
            return true;
        }
        _activeTag=__tag28.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag28);
        __tag28.release();
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
        __tag29.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.continue", java.lang.String.class,"key"));
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
        __tag30.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.pleaseNote", java.lang.String.class,"key"));
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

    private boolean _jsp__tag31(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag31 = null ;
        int __result__tag31 = 0 ;

        if (__tag31 == null ){
            __tag31 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag31);
        }
        __tag31.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag31, parent);
        __tag31.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.emailPleaseNoteMsg", java.lang.String.class,"key"));
        _activeTag=__tag31;
        __result__tag31 = __tag31.doStartTag();

        if (__result__tag31!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag31== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag31.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag31);
            return true;
        }
        _activeTag=__tag31.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag31);
        __tag31.release();
        return false;
    }

    private boolean _jsp__tag32(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag32 = null ;
        int __result__tag32 = 0 ;

        if (__tag32 == null ){
            __tag32 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag32);
        }
        __tag32.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag32, parent);
        __tag32.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
        __tag32.setFile(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fsm_common_all.js", java.lang.String.class,"file"));
        __tag32.setLanguage(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("true", java.lang.String.class,"language"));
        _activeTag=__tag32;
        __result__tag32 = __tag32.doStartTag();

        if (__result__tag32!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag32== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.component.ScriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag33 = null ;
        int __result__tag33 = 0 ;

        if (__tag33 == null ){
            __tag33 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag33);
        }
        __tag33.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag33, parent);
        __tag33.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
        __tag33.setFile(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fsm_common_all_intl_langDep.js", java.lang.String.class,"file"));
        __tag33.setMinified(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("false", java.lang.String.class,"minified"));
        __tag33.setLanguage(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("true", java.lang.String.class,"language"));
        _activeTag=__tag33;
        __result__tag33 = __tag33.doStartTag();

        if (__result__tag33!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag33== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.component.ScriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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

    private boolean _jsp__tag34(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag34 = null ;
        int __result__tag34 = 0 ;

        if (__tag34 == null ){
            __tag34 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag34);
        }
        __tag34.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag34, parent);
        __tag34.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
        __tag34.setFile(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fsm_showHideNonSafari.js", java.lang.String.class,"file"));
        _activeTag=__tag34;
        __result__tag34 = __tag34.doStartTag();

        if (__result__tag34!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag34== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.component.ScriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag34.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag34);
            return true;
        }
        _activeTag=__tag34.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag34);
        __tag34.release();
        return false;
    }

    private boolean _jsp__tag35(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag35 = null ;
        int __result__tag35 = 0 ;

        if (__tag35 == null ){
            __tag35 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag35);
        }
        __tag35.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag35, parent);
        __tag35.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
        __tag35.setFile(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fsm_freight.js", java.lang.String.class,"file"));
        __tag35.setMinified(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("false", java.lang.String.class,"minified"));
        _activeTag=__tag35;
        __result__tag35 = __tag35.doStartTag();

        if (__result__tag35!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag35== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.component.ScriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag35.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag35);
            return true;
        }
        _activeTag=__tag35.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag35);
        __tag35.release();
        return false;
    }
}
