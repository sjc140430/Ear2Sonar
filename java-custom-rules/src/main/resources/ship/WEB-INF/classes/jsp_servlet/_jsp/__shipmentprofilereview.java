package jsp_servlet._jsp;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fedex.fsm.ship.web.util.WebUtils;
import com.fedex.fsm.ship.web.util.WebShipEnvironment;
import com.fedex.fsm.ship.web.outbound.ShipActionForm;
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
import java.util.*;
import com.fedex.fsm.ship.web.util.WebUtils;
import com.fedex.fsm.ship.web.util.*;
import com.fedex.fsm.ship.web.displayRules.SenderDisplayRules;
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.web.util.LoggerFactory;
import com.fedex.fsm.ship.web.util.ApplicationPropertyLoader;
import org.apache.struts.Globals;
import java.util.*;
import org.apache.struts.util.MessageResources;
import com.fedex.fsm.ship.common.constants.AppConstants;
import com.fedex.fsm.ship.common.constants.CountryConstants;
import org.apache.struts.Globals;
import com.fedex.fsm.ship.web.util.WebUtils;
import com.fedex.fsm.ship.web.util.*;
import com.fedex.fsm.ship.web.displayRules.SenderDisplayRules;
import com.fedex.fsm.ship.web.util.WebAnalytics;
import com.fedex.fsm.ship.web.displayRules.WebAnalyticsSelector;
import com.fedex.fsm.ship.web.decouple.DecoupleState;

public final class __shipmentprofilereview extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/ShipmentProfileReview.jsp", 1550053020000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/FrameworkJSInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/GlobalCSSInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/PageCommonCSSInclude.jsi", 1550053020000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/Footer.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/PageCommonJSInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/WebAnalyticsFooter.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block0 ="\r\n\r\n";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\r\n";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\r\n<head>\r\n\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\"/>\r\n\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n\t<title>";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private static java.lang.String  _wl_block4 =" - ";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private static java.lang.String  _wl_block5 ="</title>\r\n\t";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private static java.lang.String  _wl_block6 ="\r\n\r\n<script>\r\nvar webCacheTimeStamp = \"";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private static java.lang.String  _wl_block7 ="\";\r\n</script>";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private static java.lang.String  _wl_block8 ="\r\n\t";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

    private static java.lang.String  _wl_block9 ="\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\"/> \r\n<script language=\"JavaScript\">\r\n\tvar contextPath =\"";
    private final static byte[]  _wl_block9Bytes = _getBytes( _wl_block9 );

    private static java.lang.String  _wl_block10 ="\";\r\n\tvar passKeyAdminEmailId = \"";
    private final static byte[]  _wl_block10Bytes = _getBytes( _wl_block10 );

    private static java.lang.String  _wl_block11 ="\";\r\n\tvar errors=";
    private final static byte[]  _wl_block11Bytes = _getBytes( _wl_block11 );

    private static java.lang.String  _wl_block12 =";\r\n\tvar ajaxTimeout = ";
    private final static byte[]  _wl_block12Bytes = _getBytes( _wl_block12 );

    private static java.lang.String  _wl_block13 =";\r\n\tvar S5TaggingEnabled = \"";
    private final static byte[]  _wl_block13Bytes = _getBytes( _wl_block13 );

    private static java.lang.String  _wl_block14 ="\";\r\n\tvar hitBoxAcctNumber=\"";
    private final static byte[]  _wl_block14Bytes = _getBytes( _wl_block14 );

    private static java.lang.String  _wl_block15 ="\";\r\n\tvar enableConsoleLogging = \"";
    private final static byte[]  _wl_block15Bytes = _getBytes( _wl_block15 );

    private static java.lang.String  _wl_block16 ="\";\r\n\tvar _dimensionLength = \"";
    private final static byte[]  _wl_block16Bytes = _getBytes( _wl_block16 );

    private static java.lang.String  _wl_block17 ="\";\r\n\tvar _dimensionWidth = \"";
    private final static byte[]  _wl_block17Bytes = _getBytes( _wl_block17 );

    private static java.lang.String  _wl_block18 ="\";\r\n\tvar _dimensionHeight = \"";
    private final static byte[]  _wl_block18Bytes = _getBytes( _wl_block18 );

    private static java.lang.String  _wl_block19 ="\";\r\n\tvar fsmr = {};\r\n\tfsmr.priv = {};\r\n\tfsmr.url={};\r\n\tfsmr.pref={};\r\n\t\r\n\t// Jan18CL - ITG 171800 - Allow Option for Billing Defaults not to change\r\n\tvar _isPrefBillToRestrictedFlag = ";
    private final static byte[]  _wl_block19Bytes = _getBytes( _wl_block19 );

    private static java.lang.String  _wl_block20 =";\r\n\tvar _isPrefDutyBillToRestrictedFlag = ";
    private final static byte[]  _wl_block20Bytes = _getBytes( _wl_block20 );

    private static java.lang.String  _wl_block21 =";\r\n\tvar _isPrefAdditionalHandlingRestrictedFlag = ";
    private final static byte[]  _wl_block21Bytes = _getBytes( _wl_block21 );

    private static java.lang.String  _wl_block22 =";\r\n\tvar _billingPrefRestrictedFlag = ";
    private final static byte[]  _wl_block22Bytes = _getBytes( _wl_block22 );

    private static java.lang.String  _wl_block23 =";\r\n\t\r\n\tfunction readUpdatedSessionCSRFToken() {\r\n    \t$(\'#reloadCSRFToken\').load(\'reloadCSRFToken.action\',{});\r\n    \t// Added {} at end to force POST request. By default IE uses GET request due to which page is cached and subsequent page loading requests are blocked. \r\n    }\r\n</script>\r\n<div id=\"reloadCSRFToken\"> ";
    private final static byte[]  _wl_block23Bytes = _getBytes( _wl_block23 );

    private static java.lang.String  _wl_block24 ="\r\n<script>\r\n\tvar _csrfToken = \"";
    private final static byte[]  _wl_block24Bytes = _getBytes( _wl_block24 );

    private static java.lang.String  _wl_block25 ="\";\r\n</script>\r\n";
    private final static byte[]  _wl_block25Bytes = _getBytes( _wl_block25 );

    private static java.lang.String  _wl_block26 ="</div>";
    private final static byte[]  _wl_block26Bytes = _getBytes( _wl_block26 );

    private static java.lang.String  _wl_block27 ="\r\n\t<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block27Bytes = _getBytes( _wl_block27 );

    private static java.lang.String  _wl_block28 ="/css/fsm_widgets.css\">\r\n\t<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block28Bytes = _getBytes( _wl_block28 );

    private static java.lang.String  _wl_block29 ="/css/fsm_safarifixsafari.css\">\r\n";
    private final static byte[]  _wl_block29Bytes = _getBytes( _wl_block29 );

    private static java.lang.String  _wl_block30 ="\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"/framework/css/widgets.css\">\r\n\t<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block30Bytes = _getBytes( _wl_block30 );

    private static java.lang.String  _wl_block31 ="/css/fsm_safarifixother.css\">\r\n";
    private final static byte[]  _wl_block31Bytes = _getBytes( _wl_block31 );

    private static java.lang.String  _wl_block32 =" \r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block32Bytes = _getBytes( _wl_block32 );

    private static java.lang.String  _wl_block33 ="/css/fsm_common_all";
    private final static byte[]  _wl_block33Bytes = _getBytes( _wl_block33 );

    private static java.lang.String  _wl_block34 =".css\">";
    private final static byte[]  _wl_block34Bytes = _getBytes( _wl_block34 );

    private static java.lang.String  _wl_block35 ="\r\n    \r\n\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/t1/global-wrapper-min.css\" id=\"globalCSS\" />\r\n\t<!--[if lte IE 7]><link rel=\"stylesheet\" type=\"text/css\" href=\"/css/t1/global-wrapper-ie-min.css\" /><![endif]-->\r\n\t<!--[if lte IE 6]><link rel=\"stylesheet\" type=\"text/css\" href=\"/css/t1/global-wrapper-ie6-min.css\" /><![endif]-->\r\n";
    private final static byte[]  _wl_block35Bytes = _getBytes( _wl_block35 );

    private static java.lang.String  _wl_block36 ="\r\n\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/framework/css/widgets.css\">\r\n\t<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block36Bytes = _getBytes( _wl_block36 );

    private static java.lang.String  _wl_block37 ="/css/fsm_confirm";
    private final static byte[]  _wl_block37Bytes = _getBytes( _wl_block37 );

    private static java.lang.String  _wl_block38 =".css\">\r\n\t<link rel=\"stylesheet\" type=\"text/css\" \r\n\t\t\thref=\"";
    private final static byte[]  _wl_block38Bytes = _getBytes( _wl_block38 );

    private static java.lang.String  _wl_block39 ="/css/fsm_profileprint";
    private final static byte[]  _wl_block39Bytes = _getBytes( _wl_block39 );

    private static java.lang.String  _wl_block40 =".css\" media=\"print\"> \r\n</head>\r\n";
    private final static byte[]  _wl_block40Bytes = _getBytes( _wl_block40 );

    private static java.lang.String  _wl_block41 ="\r\n\r\n<script type=\"text/javascript\" charset=\"utf-8\">\r\n\tvar originCountryCode = \"";
    private final static byte[]  _wl_block41Bytes = _getBytes( _wl_block41 );

    private static java.lang.String  _wl_block42 ="\";\r\n\tvar senderCountryCode =  \"";
    private final static byte[]  _wl_block42Bytes = _getBytes( _wl_block42 );

    private static java.lang.String  _wl_block43 ="\";\r\n\tvar profiles_senderCountryAlert = \"";
    private final static byte[]  _wl_block43Bytes = _getBytes( _wl_block43 );

    private static java.lang.String  _wl_block44 ="\";\t\t\r\n\tvar profileStatus =  \"";
    private final static byte[]  _wl_block44Bytes = _getBytes( _wl_block44 );

    private static java.lang.String  _wl_block45 ="\";\r\n\tvar profiles_reviewIncompleteAlert = \"";
    private final static byte[]  _wl_block45Bytes = _getBytes( _wl_block45 );

    private static java.lang.String  _wl_block46 ="\";\t\r\n\tvar _utype= ";
    private final static byte[]  _wl_block46Bytes = _getBytes( _wl_block46 );

    private static java.lang.String  _wl_block47 =";\r\n\tvar withLabelText=\"";
    private final static byte[]  _wl_block47Bytes = _getBytes( _wl_block47 );

    private static java.lang.String  _wl_block48 ="\";\r\n</script>\r\n\r\n<body>\r\n<div id=\"debug\" style=\"display:none;position:absolute;top:5px;left:5px;width:800px;height:1500px;background:white;border:1px solid;\">\r\n</div> \r\n";
    private final static byte[]  _wl_block48Bytes = _getBytes( _wl_block48 );

    private static java.lang.String  _wl_block49 =" ";
    private final static byte[]  _wl_block49Bytes = _getBytes( _wl_block49 );

    private static java.lang.String  _wl_block50 ="\r\n<div id=\"fsmPage\">\t\r\n        ";
    private final static byte[]  _wl_block50Bytes = _getBytes( _wl_block50 );

    private static java.lang.String  _wl_block51 ="\r\n        \r\n\t\t\t<div id=\"fsmContent\">\r\n\t\t\t";
    private final static byte[]  _wl_block51Bytes = _getBytes( _wl_block51 );

    private static java.lang.String  _wl_block52 ="\r\n\t\t\t\t<div id=\"temp\" class=\"fullWidthContent\">\r\n\t\t\t\t<h2 class=\"ui-hidden-accessibleH1\">";
    private final static byte[]  _wl_block52Bytes = _getBytes( _wl_block52 );

    private static java.lang.String  _wl_block53 ="</h2>\r\n\t\t\t\t\t<label class=\"appName\" aria-hidden=\"true\">\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block53Bytes = _getBytes( _wl_block53 );

    private static java.lang.String  _wl_block54 ="\r\n\t\t\t\t\t</label>\r\n\t\t\t\t\t<br>\r\n\t\t\t\t\t<br>\r\n\t\t\t\t\t<br>\r\n\t\t\t\t</div>\t\t\t\r\n\t\t\t\t<div class=\"fsmConfirmFull\">\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block54Bytes = _getBytes( _wl_block54 );

    private static java.lang.String  _wl_block55 ="\r\n\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block55Bytes = _getBytes( _wl_block55 );

    private static java.lang.String  _wl_block56 ="\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block56Bytes = _getBytes( _wl_block56 );

    private static java.lang.String  _wl_block57 ="\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block57Bytes = _getBytes( _wl_block57 );

    private static java.lang.String  _wl_block58 ="\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block58Bytes = _getBytes( _wl_block58 );

    private static java.lang.String  _wl_block59 ="\r\n\t\t\t\t</div>\r\n\t\t\t\t<div id=\"country.alert\" class=\"listFullWidthContent listAlertWrap\">\r\n\t\t\t\t\t<div class=\"lsttableAlert listsTwolinesAlertMessage\">\r\n\t\t\t\t\t\t<b>";
    private final static byte[]  _wl_block59Bytes = _getBytes( _wl_block59 );

    private static java.lang.String  _wl_block60 ="&nbsp;</b>\r\n\t\t\t\t\t\t<label id=\"country.alert.message\"></label>\r\n\t\t\t\t\t\t<input type=\"button\" id=\"countryButton.YES\" class=\"btnPurple\" value=\'";
    private final static byte[]  _wl_block60Bytes = _getBytes( _wl_block60 );

    private static java.lang.String  _wl_block61 ="\'>\r\n\t\t\t\t\t\t<input type=\"button\" id=\"countryButton.NO\" class=\"btnGray\" value=\'";
    private final static byte[]  _wl_block61Bytes = _getBytes( _wl_block61 );

    private static java.lang.String  _wl_block62 ="\'>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div style=\"clear;\"></div>\r\n\t\t\t\t</div>\t\r\n\t\t\t\t\r\n\t\t\t\t<div id=\"review.alert\" class=\"listFullWidthContent listAlertWrap hide\">\r\n\t\t\t\t\t<div class=\"lstAlert listsTwolinesAlertMessage\">\r\n\t\t\t\t\t\t<b>";
    private final static byte[]  _wl_block62Bytes = _getBytes( _wl_block62 );

    private static java.lang.String  _wl_block63 ="&nbsp;</b>\r\n\t\t\t\t\t\t<label id=\"review.alert.message\"></label>\r\n\t\t\t\t\t\t<input type=\"button\" id=\"reviewButton.YES\" class=\"btnPurple\" value=\'";
    private final static byte[]  _wl_block63Bytes = _getBytes( _wl_block63 );

    private static java.lang.String  _wl_block64 ="\'>\r\n\t\t\t\t\t\t<input type=\"button\" id=\"reviewButton.NO\" class=\"btnGray\" value=\'";
    private final static byte[]  _wl_block64Bytes = _getBytes( _wl_block64 );

    private static java.lang.String  _wl_block65 ="\'>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\r\n\t\t\t\t\r\n\t\t\t\t<div id=\"buttonArea\" class=\"reviewShipProfile\" align=\"right\">\r\n\t\t\t\t\t<div style=\"float: right;margin-right:10px;\">\r\n\t\t\t\t\t\t<input type=\"button\" id=\"profile.button.print\" class=\"btnPurple\"\r\n\t\t\t\t\t\t\t\tvalue=\"";
    private final static byte[]  _wl_block65Bytes = _getBytes( _wl_block65 );

    private static java.lang.String  _wl_block66 ="\">\r\n\t\t\t\t\t\t<input type=\"button\" id=\"profile.button.cancel\" class=\"btnGray\"\r\n\t\t\t\t\t\t\tvalue=\"";
    private final static byte[]  _wl_block66Bytes = _getBytes( _wl_block66 );

    private static java.lang.String  _wl_block67 ="\">\r\n\t\t\t\t\t\t<input type=\"button\" id=\"profile.button.editandship\" class=\"btnGray\" \r\n\t\t\t\t\t\t    value=\"";
    private final static byte[]  _wl_block67Bytes = _getBytes( _wl_block67 );

    private static java.lang.String  _wl_block68 ="\">\r\n\t\t\t\t\t\t<input type=\"button\" id=\"profile.button.ship\" class=\"btnPurple\"\r\n\t\t\t\t\t\t\tvalue=\"";
    private final static byte[]  _wl_block68Bytes = _getBytes( _wl_block68 );

    private static java.lang.String  _wl_block69 ="\">\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\r\n\r\n\t\t\t\t<div class=\"fsmClearDiv\"/>\t\t\t\t\t\r\n\t\t\t</div>\r\n\t\t\t";
    private final static byte[]  _wl_block69Bytes = _getBytes( _wl_block69 );

    private static java.lang.String  _wl_block70 ="\r\n\t\t\t";
    private final static byte[]  _wl_block70Bytes = _getBytes( _wl_block70 );

    private static java.lang.String  _wl_block71 ="\r\n\t\t";
    private final static byte[]  _wl_block71Bytes = _getBytes( _wl_block71 );

    private static java.lang.String  _wl_block72 ="\r\n</div>\r\n</div>\r\n<script type=\"text/javascript\" charset=\"utf-8\">\r\n\tvar pageType=\"shipmentProfileReview\";\r\n\tvar helpPage= \'";
    private final static byte[]  _wl_block72Bytes = _getBytes( _wl_block72 );

    private static java.lang.String  _wl_block73 ="\';\r\n\tvar profileReviewModuleHelp= helpPageUrl + \'";
    private final static byte[]  _wl_block73Bytes = _getBytes( _wl_block73 );

    private static java.lang.String  _wl_block74 ="\';\r\n</script>\r\n";
    private final static byte[]  _wl_block74Bytes = _getBytes( _wl_block74 );

    private static java.lang.String  _wl_block75 ="\r\n\r\n<script>\r\nvar minifiedJSFileSuffix = \"";
    private final static byte[]  _wl_block75Bytes = _getBytes( _wl_block75 );

    private static java.lang.String  _wl_block76 ="\r\n<script type=\"text/javascript\" charset=\"utf-8\" src=\"/framework/js/framework";
    private final static byte[]  _wl_block76Bytes = _getBytes( _wl_block76 );

    private static java.lang.String  _wl_block77 =".js\"></script>\r\n";
    private final static byte[]  _wl_block77Bytes = _getBytes( _wl_block77 );

    private static java.lang.String  _wl_block78 =" \r\n";
    private final static byte[]  _wl_block78Bytes = _getBytes( _wl_block78 );

    private static java.lang.String  _wl_block79 ="\r\n<script type=\"text/javascript\" charset=\"utf-8\">fsm.nav.init();</script>\r\n<script type=\"text/javascript\" charset=\"utf-8\">initShipProfileReview();</script>\r\n";
    private final static byte[]  _wl_block79Bytes = _getBytes( _wl_block79 );

    private static java.lang.String  _wl_block80 ="\r\n\r\n\r\n";
    private final static byte[]  _wl_block80Bytes = _getBytes( _wl_block80 );

    private static java.lang.String  _wl_block81 ="\r\n    \r\n\t</div>\r\n    \t<div id=\"fedex-footer\">\r\n\t\t\t\r\n\t\t</div>\r\n\t</div>\r\n\t\r\n\t<script type=\"text/javascript\" charset=\"utf-8\" src=\"/templates/components/apps/contentim/contentim_include-min.js\"></script>";
    private final static byte[]  _wl_block81Bytes = _getBytes( _wl_block81 );

    private static java.lang.String  _wl_block82 ="\r\n</body>\r\n";
    private final static byte[]  _wl_block82Bytes = _getBytes( _wl_block82 );

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
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block2Bytes, _wl_block2);
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
                    _bw.write(_wl_block3Bytes, _wl_block3);

                    if (_jsp__tag1(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block4Bytes, _wl_block4);

                    if (_jsp__tag2(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block5Bytes, _wl_block5);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block0Bytes, _wl_block0);

	
	String webCachePolicy = ApplicationPropertyLoader.getInstance().getProperty("WEBCache");
	String webCacheTimeStamp = ApplicationPropertyLoader.getInstance().getProperty("WEBCacheTimeStamp");
	webCacheTimeStamp = ((WebConstants.Y.equals(webCachePolicy) && !webCacheTimeStamp.startsWith("@")) ? "_"+webCacheTimeStamp : "");
	if(webCacheTimeStamp==null){
		webCacheTimeStamp="";
	}
	//System.out.println("webCacheTimeStamp= " + webCacheTimeStamp);
	LoggerFactory.getLogger().debug(
	        "webCacheTimeStamp= " + webCacheTimeStamp);

                    _bw.write(_wl_block6Bytes, _wl_block6);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block7Bytes, _wl_block7);
                    _bw.write(_wl_block8Bytes, _wl_block8);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block0Bytes, _wl_block0);

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

                    _bw.write(_wl_block9Bytes, _wl_block9);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block10Bytes, _wl_block10);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(userProfileAdapter.getAdminEmail()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block11Bytes, _wl_block11);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(request.getAttribute("fsmMessages")), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block12Bytes, _wl_block12);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( ApplicationPropertyLoader.getInstance().getProperty("AJAX_TIMEOUT") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block13Bytes, _wl_block13);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( ApplicationPropertyLoader.getInstance().getProperty("S5TaggingEnabled") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block14Bytes, _wl_block14);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( ApplicationPropertyLoader.getInstance().getProperty("hitBoxAcctNumber") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block15Bytes, _wl_block15);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(ApplicationPropertyLoader.getInstance().getProperty("ConsoleLogging")), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block16Bytes, _wl_block16);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( res.getMessage(loc, "text.pickup.dimensions.length") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block17Bytes, _wl_block17);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( res.getMessage(loc, "text.pickup.dimensions.width") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block18Bytes, _wl_block18);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( res.getMessage(loc, "text.pickup.dimensions.height") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block19Bytes, _wl_block19);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPrefBillToRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block20Bytes, _wl_block20);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPrefDutyBillToRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block21Bytes, _wl_block21);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPrefAdditionalHandlingRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block22Bytes, _wl_block22);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(billingPrefRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block23Bytes, _wl_block23);
 String csrfToken =  (String) session.getAttribute("csrfToken"); 
                    _bw.write(_wl_block24Bytes, _wl_block24);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(csrfToken), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block25Bytes, _wl_block25);
                    _bw.write(_wl_block26Bytes, _wl_block26);
                    _bw.write(_wl_block8Bytes, _wl_block8);
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
                    _bw.write(_wl_block27Bytes, _wl_block27);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block28Bytes, _wl_block28);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block29Bytes, _wl_block29);
 } else { 
                    _bw.write(_wl_block30Bytes, _wl_block30);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block31Bytes, _wl_block31);
 } 
                    _bw.write(_wl_block32Bytes, _wl_block32);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block33Bytes, _wl_block33);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block34Bytes, _wl_block34);
                    _bw.write(_wl_block8Bytes, _wl_block8);
                    _bw.write(_wl_block0Bytes, _wl_block0);

WebShipEnvironment webShipEnvironmentCSS = WebUtils.getWebShipEnvironment(request);
SenderDisplayRules senderDisplayRulesCSS = new SenderDisplayRules();
Locale localeGlobalCSS = webShipEnvironmentCSS.getLocale();

                    _bw.write(_wl_block35Bytes, _wl_block35);
                    _bw.write(_wl_block36Bytes, _wl_block36);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block37Bytes, _wl_block37);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block38Bytes, _wl_block38);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block39Bytes, _wl_block39);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block40Bytes, _wl_block40);

	ShipActionForm form =(ShipActionForm)request.getAttribute("shipActionForm");
    MessageResources resources = (MessageResources)application.getAttribute(Globals.MESSAGES_KEY);
	WebShipEnvironment webShipEnvironment = WebUtils.getWebShipEnvironment(request);
	Locale locale = webShipEnvironment.getLocale();
	MessageResources references = (MessageResources)application.getAttribute("ref");
	String shipmentProfileReviewModuleHelp = references.getMessage(locale, "module.help.shipmentProfiles");
	String helpPage = references.getMessage(locale, "page.help.shipmentProfileReview");
	String printButton = resources.getMessage(locale, "button.print");
	String cancelButton = resources.getMessage(locale, "text.cancelReview");
	String editShipButton = resources.getMessage(locale, "text.editAndShip");
	String shipButton = resources.getMessage(locale, "button.profiles.shipReviewedProfile");

	String outBoundShipment = resources.getMessage(locale, "app.outboundShip");
	String helpText = resources.getMessage(locale, "text.help");
	String editText = resources.getMessage(locale, "text.edit");
	String hideText = resources.getMessage(locale, "text.hide");
	request.setAttribute("isShipmentProfile", "Y");
	String fromCountryCode = form.getFromData().getAddressData().getCountryCode();
	if(fromCountryCode!=null) {
	   fromCountryCode = fromCountryCode.trim();	
	}
	String originCountryCd = WebUtils.getWebShipEnvironment(request).getOriginCountry();
	String profileStatus = form.getCompleteShipData().getShipmentStatus();

                    _bw.write(_wl_block41Bytes, _wl_block41);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag3 = null ;
                    int __result__tag3 = 0 ;

                    if (__tag3 == null ){
                        __tag3 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag3);
                    }
                    __tag3.setPageContext(pageContext);
                    __tag3.setParent(__tag0);
                    __tag3.setValue(originCountryCd 
);
                    _activeTag=__tag3;
                    __result__tag3 = __tag3.doStartTag();

                    if (__result__tag3!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag3== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag3.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag3);
                        return;
                    }
                    _activeTag=__tag3.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag3);
                    __tag3.release();
                    _bw.write(_wl_block42Bytes, _wl_block42);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag4 = null ;
                    int __result__tag4 = 0 ;

                    if (__tag4 == null ){
                        __tag4 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag4);
                    }
                    __tag4.setPageContext(pageContext);
                    __tag4.setParent(__tag0);
                    __tag4.setValue(fromCountryCode 
);
                    _activeTag=__tag4;
                    __result__tag4 = __tag4.doStartTag();

                    if (__result__tag4!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag4== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag4.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag4);
                        return;
                    }
                    _activeTag=__tag4.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag4);
                    __tag4.release();
                    _bw.write(_wl_block43Bytes, _wl_block43);

                    if (_jsp__tag5(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block44Bytes, _wl_block44);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag6 = null ;
                    int __result__tag6 = 0 ;

                    if (__tag6 == null ){
                        __tag6 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag6);
                    }
                    __tag6.setPageContext(pageContext);
                    __tag6.setParent(__tag0);
                    __tag6.setValue(profileStatus 
);
                    _activeTag=__tag6;
                    __result__tag6 = __tag6.doStartTag();

                    if (__result__tag6!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag6== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag6.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag6);
                        return;
                    }
                    _activeTag=__tag6.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag6);
                    __tag6.release();
                    _bw.write(_wl_block45Bytes, _wl_block45);

                    if (_jsp__tag7(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block46Bytes, _wl_block46);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag8 = null ;
                    int __result__tag8 = 0 ;

                    if (__tag8 == null ){
                        __tag8 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag8);
                    }
                    __tag8.setPageContext(pageContext);
                    __tag8.setParent(__tag0);
                    __tag8.setValue(utype
);
                    _activeTag=__tag8;
                    __result__tag8 = __tag8.doStartTag();

                    if (__result__tag8!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag8== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag8.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag8);
                        return;
                    }
                    _activeTag=__tag8.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag8);
                    __tag8.release();
                    _bw.write(_wl_block47Bytes, _wl_block47);

                    if (_jsp__tag9(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block48Bytes, _wl_block48);

                    if (_jsp__tag10(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    {java.lang.String __page ="Header.jsp";
                        java.lang.String[][] __queryParams = {};
                        java.lang.String __encoding = request.getCharacterEncoding();
                        if (__encoding == null) __encoding ="ISO-8859-1";

                        if (__queryParams.length == 0 ) pageContext.include(__page);
                         else pageContext.include(weblogic.utils.http.HttpParsing.makeURI(__page, __queryParams, __encoding));
                    }_bw.write(_wl_block50Bytes, _wl_block50);
                    {java.lang.String __page ="/jsp/NavigationHeader.jsp";
                        java.lang.String[][] __queryParams = {};
                        java.lang.String __encoding = request.getCharacterEncoding();
                        if (__encoding == null) __encoding ="ISO-8859-1";

                        if (__queryParams.length == 0 ) pageContext.include(__page);
                         else pageContext.include(weblogic.utils.http.HttpParsing.makeURI(__page, __queryParams, __encoding));
                    }_bw.write(_wl_block51Bytes, _wl_block51);
                     org.apache.struts.taglib.html.FormTag __tag11 = null ;
                    int __result__tag11 = 0 ;

                    if (__tag11 == null ){
                        __tag11 = new  org.apache.struts.taglib.html.FormTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag11);
                    }
                    __tag11.setPageContext(pageContext);
                    __tag11.setParent(__tag0);
                    __tag11.setAction(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipmentProfileReviewAction", java.lang.String.class,"action"));
                    _activeTag=__tag11;
                    __result__tag11 = __tag11.doStartTag();

                    if (__result__tag11!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag11== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.html.FormTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block52Bytes, _wl_block52);

                            if (_jsp__tag12(request, response, pageContext, _activeTag, __tag11))
                             return;
                            _bw.write(_wl_block53Bytes, _wl_block53);

                            if (_jsp__tag13(request, response, pageContext, _activeTag, __tag11))
                             return;
                            _bw.write(_wl_block54Bytes, _wl_block54);
                             com.fedex.framework.taglib.ModuleTag __tag14 = null ;
                            int __result__tag14 = 0 ;

                            if (__tag14 == null ){
                                __tag14 = new  com.fedex.framework.taglib.ModuleTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag14);
                            }
                            __tag14.setPageContext(pageContext);
                            __tag14.setParent(__tag11);
                            __tag14.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("module.confirmYourShipment", java.lang.String.class,"id"));
                            __tag14.setType(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("required", java.lang.String.class,"type"));
                            __tag14.setTitle(outBoundShipment
);
                            __tag14.setDefaultMode(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("expanded", java.lang.String.class,"defaultMode"));
                            __tag14.setHelpText(helpText
);
                            __tag14.setCollapsable(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                            __tag14.setEditText(editText
);
                            __tag14.setHideText(hideText
);
                            _activeTag=__tag14;
                            __result__tag14 = __tag14.doStartTag();

                            if (__result__tag14!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag14== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.ModuleTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block55Bytes, _wl_block55);

                                    if (_jsp__tag15(request, response, pageContext, _activeTag, __tag14))
                                     return;
                                    _bw.write(_wl_block58Bytes, _wl_block58);
                                } while (__tag14.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag14.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag14);
                                return;
                            }
                            _activeTag=__tag14.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag14);
                            __tag14.release();
                            _bw.write(_wl_block59Bytes, _wl_block59);

                            if (_jsp__tag16(request, response, pageContext, _activeTag, __tag11))
                             return;
                            _bw.write(_wl_block60Bytes, _wl_block60);

                            if (_jsp__tag17(request, response, pageContext, _activeTag, __tag11))
                             return;
                            _bw.write(_wl_block61Bytes, _wl_block61);

                            if (_jsp__tag18(request, response, pageContext, _activeTag, __tag11))
                             return;
                            _bw.write(_wl_block62Bytes, _wl_block62);

                            if (_jsp__tag19(request, response, pageContext, _activeTag, __tag11))
                             return;
                            _bw.write(_wl_block63Bytes, _wl_block63);

                            if (_jsp__tag20(request, response, pageContext, _activeTag, __tag11))
                             return;
                            _bw.write(_wl_block64Bytes, _wl_block64);

                            if (_jsp__tag21(request, response, pageContext, _activeTag, __tag11))
                             return;
                            _bw.write(_wl_block65Bytes, _wl_block65);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(printButton), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block66Bytes, _wl_block66);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(cancelButton), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block67Bytes, _wl_block67);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(editShipButton ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block68Bytes, _wl_block68);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(shipButton), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block69Bytes, _wl_block69);

                            if (_jsp__tag22(request, response, pageContext, _activeTag, __tag11))
                             return;
                            _bw.write(_wl_block70Bytes, _wl_block70);

                            if (_jsp__tag23(request, response, pageContext, _activeTag, __tag11))
                             return;
                            _bw.write(_wl_block70Bytes, _wl_block70);

                            if (_jsp__tag24(request, response, pageContext, _activeTag, __tag11))
                             return;
                            _bw.write(_wl_block70Bytes, _wl_block70);

                            if (_jsp__tag25(request, response, pageContext, _activeTag, __tag11))
                             return;
                            _bw.write(_wl_block70Bytes, _wl_block70);

                            if (_jsp__tag26(request, response, pageContext, _activeTag, __tag11))
                             return;
                            _bw.write(_wl_block70Bytes, _wl_block70);

                            if (_jsp__tag27(request, response, pageContext, _activeTag, __tag11))
                             return;
                            _bw.write(_wl_block70Bytes, _wl_block70);

                            if (_jsp__tag28(request, response, pageContext, _activeTag, __tag11))
                             return;
                            _bw.write(_wl_block71Bytes, _wl_block71);
                        } while (__tag11.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                    }
                    if (__tag11.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag11);
                        return;
                    }
                    _activeTag=__tag11.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag11);
                    __tag11.release();
                    _bw.write(_wl_block72Bytes, _wl_block72);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( helpPage ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block73Bytes, _wl_block73);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( shipmentProfileReviewModuleHelp ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block74Bytes, _wl_block74);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block0Bytes, _wl_block0);

	
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

                    _bw.write(_wl_block75Bytes, _wl_block75);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(minifiedJSFileSuffix), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block7Bytes, _wl_block7);
                    _bw.write(_wl_block76Bytes, _wl_block76);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(minifiedFwkFileSuffix), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block77Bytes, _wl_block77);
                    _bw.write(_wl_block1Bytes, _wl_block1);

                    if (_jsp__tag29(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block1Bytes, _wl_block1);

                    if (_jsp__tag30(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block78Bytes, _wl_block78);

                    if (_jsp__tag31(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block1Bytes, _wl_block1);

                    if (_jsp__tag32(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block79Bytes, _wl_block79);
                    _bw.write(_wl_block80Bytes, _wl_block80);

	WebAnalyticsSelector ws = new WebAnalyticsSelector();
	String webAnalyticsJSFile = ws.getWebAnalyticsTool().getJsFile();

                    _bw.write(_wl_block0Bytes, _wl_block0);
                     com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag33 = null ;
                    int __result__tag33 = 0 ;

                    if (__tag33 == null ){
                        __tag33 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag33);
                    }
                    __tag33.setPageContext(pageContext);
                    __tag33.setParent(__tag0);
                    __tag33.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
                    __tag33.setFile(webAnalyticsJSFile
);
                    __tag33.setMinified(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("false", java.lang.String.class,"minified"));
                    __tag33.setVersioned(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("true", java.lang.String.class,"versioned"));
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
                        return;
                    }
                    _activeTag=__tag33.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag33);
                    __tag33.release();
                    _bw.write(_wl_block1Bytes, _wl_block1);
                    _bw.write(_wl_block0Bytes, _wl_block0);

SenderDisplayRules senderDisplayRulesFooter = new SenderDisplayRules();
java.util.Locale localeFooter = (java.util.Locale)session.getAttribute(WebConstants.COOKIE_LOCALE);
String localeCountryFooter = localeFooter.getCountry();

                    _bw.write(_wl_block81Bytes, _wl_block81);
                    _bw.write(_wl_block82Bytes, _wl_block82);
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
            _bw.write(_wl_block1Bytes, _wl_block1);
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

    private boolean _jsp__tag1(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag1 = null ;
        int __result__tag1 = 0 ;

        if (__tag1 == null ){
            __tag1 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag1);
        }
        __tag1.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag1, parent);
        __tag1.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("app.name", java.lang.String.class,"key"));
        _activeTag=__tag1;
        __result__tag1 = __tag1.doStartTag();

        if (__result__tag1!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag1== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag1.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag1);
            return true;
        }
        _activeTag=__tag1.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag1);
        __tag1.release();
        return false;
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
        __tag2.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("app.title.shipmentProfile", java.lang.String.class,"key"));
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
        __tag5.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.list.senderCountryAlert", java.lang.String.class,"key"));
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
        __tag7.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.list.editShipConfirmAlert", java.lang.String.class,"key"));
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
        __tag9.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ada.withlabel", java.lang.String.class,"key"));
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
         com.fedex.framework.taglib.FloatingWindowTag __tag10 = null ;
        int __result__tag10 = 0 ;

        if (__tag10 == null ){
            __tag10 = new  com.fedex.framework.taglib.FloatingWindowTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag10);
        }
        __tag10.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag10, parent);
        __tag10.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("floatingWindow.help", java.lang.String.class,"id"));
        __tag10.setTitle(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("Help", java.lang.String.class,"title"));
        __tag10.setCloseText(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("Close", java.lang.String.class,"closeText"));
        _activeTag=__tag10;
        __result__tag10 = __tag10.doStartTag();

        if (__result__tag10!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag10== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.FloatingWindowTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block1Bytes, _wl_block1);
            } while (__tag10.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
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
        __tag12.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("app.title.shipmentProfile", java.lang.String.class,"key"));
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

    private boolean _jsp__tag13(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag13 = null ;
        int __result__tag13 = 0 ;

        if (__tag13 == null ){
            __tag13 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag13);
        }
        __tag13.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag13, parent);
        __tag13.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("app.title.shipmentProfile", java.lang.String.class,"key"));
        _activeTag=__tag13;
        __result__tag13 = __tag13.doStartTag();

        if (__result__tag13!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag13== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag13.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag13);
            return true;
        }
        _activeTag=__tag13.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag13);
        __tag13.release();
        return false;
    }

    private boolean _jsp__tag15(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.ModuleExpandedTag __tag15 = null ;
        int __result__tag15 = 0 ;

        if (__tag15 == null ){
            __tag15 = new  com.fedex.framework.taglib.ModuleExpandedTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag15);
        }
        __tag15.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag15, parent);
        _activeTag=__tag15;
        __result__tag15 = __tag15.doStartTag();

        if (__result__tag15!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag15== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.ModuleExpandedTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block56Bytes, _wl_block56);
                {java.lang.String __page ="/jsp/ShipmentDetailsSection.jsp";
                    java.lang.String[][] __queryParams = {};
                    java.lang.String __encoding = request.getCharacterEncoding();
                    if (__encoding == null) __encoding ="ISO-8859-1";

                    if (__queryParams.length == 0 ) pageContext.include(__page);
                     else pageContext.include(weblogic.utils.http.HttpParsing.makeURI(__page, __queryParams, __encoding));
                }_bw.write(_wl_block57Bytes, _wl_block57);
            } while (__tag15.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
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
        __tag16.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.alertWithColon", java.lang.String.class,"key"));
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
        __tag17.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.yes", java.lang.String.class,"key"));
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

    private boolean _jsp__tag18(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag18 = null ;
        int __result__tag18 = 0 ;

        if (__tag18 == null ){
            __tag18 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag18);
        }
        __tag18.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag18, parent);
        __tag18.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.no", java.lang.String.class,"key"));
        _activeTag=__tag18;
        __result__tag18 = __tag18.doStartTag();

        if (__result__tag18!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag18== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag18.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag18);
            return true;
        }
        _activeTag=__tag18.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag18);
        __tag18.release();
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
        __tag19.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.alertWithColon", java.lang.String.class,"key"));
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
        __tag20.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.yes", java.lang.String.class,"key"));
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
        __tag21.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.no", java.lang.String.class,"key"));
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

    private boolean _jsp__tag22(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.html.HiddenTag __tag22 = null ;
        int __result__tag22 = 0 ;

        if (__tag22 == null ){
            __tag22 = new  org.apache.struts.taglib.html.HiddenTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag22);
        }
        __tag22.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag22, parent);
        __tag22.setStyleId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("completeShipData.profileId", java.lang.String.class,"styleId"));
        __tag22.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("completeShipData.profileId", java.lang.String.class,"property"));
        __tag22.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag22;
        __result__tag22 = __tag22.doStartTag();

        if (__result__tag22!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag22== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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
         org.apache.struts.taglib.html.HiddenTag __tag23 = null ;
        int __result__tag23 = 0 ;

        if (__tag23 == null ){
            __tag23 = new  org.apache.struts.taglib.html.HiddenTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag23);
        }
        __tag23.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag23, parent);
        __tag23.setStyleId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("completeShipData.shipmentStatus", java.lang.String.class,"styleId"));
        __tag23.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("completeShipData.shipmentStatus", java.lang.String.class,"property"));
        __tag23.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag23;
        __result__tag23 = __tag23.doStartTag();

        if (__result__tag23!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag23== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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
         org.apache.struts.taglib.html.HiddenTag __tag24 = null ;
        int __result__tag24 = 0 ;

        if (__tag24 == null ){
            __tag24 = new  org.apache.struts.taglib.html.HiddenTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag24);
        }
        __tag24.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag24, parent);
        __tag24.setStyleId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("completeShipData.reviewShipmentProfilesFlg", java.lang.String.class,"styleId"));
        __tag24.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("completeShipData.reviewShipmentProfilesFlg", java.lang.String.class,"property"));
        __tag24.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag24;
        __result__tag24 = __tag24.doStartTag();

        if (__result__tag24!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag24== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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
         org.apache.struts.taglib.html.HiddenTag __tag25 = null ;
        int __result__tag25 = 0 ;

        if (__tag25 == null ){
            __tag25 = new  org.apache.struts.taglib.html.HiddenTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag25);
        }
        __tag25.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag25, parent);
        __tag25.setStyleId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("completeShipData.reviewPaginationInfo", java.lang.String.class,"styleId"));
        __tag25.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("completeShipData.reviewPaginationInfo", java.lang.String.class,"property"));
        __tag25.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag25;
        __result__tag25 = __tag25.doStartTag();

        if (__result__tag25!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag25== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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
         org.apache.struts.taglib.html.HiddenTag __tag26 = null ;
        int __result__tag26 = 0 ;

        if (__tag26 == null ){
            __tag26 = new  org.apache.struts.taglib.html.HiddenTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag26);
        }
        __tag26.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag26, parent);
        __tag26.setStyleId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("completeShipData.hasNextProfile", java.lang.String.class,"styleId"));
        __tag26.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("completeShipData.hasNextProfile", java.lang.String.class,"property"));
        __tag26.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag26;
        __result__tag26 = __tag26.doStartTag();

        if (__result__tag26!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag26== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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
         org.apache.struts.taglib.html.HiddenTag __tag27 = null ;
        int __result__tag27 = 0 ;

        if (__tag27 == null ){
            __tag27 = new  org.apache.struts.taglib.html.HiddenTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag27);
        }
        __tag27.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag27, parent);
        __tag27.setStyleId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("completeShipData.hasPreviousProfile", java.lang.String.class,"styleId"));
        __tag27.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("completeShipData.hasPreviousProfile", java.lang.String.class,"property"));
        __tag27.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag27;
        __result__tag27 = __tag27.doStartTag();

        if (__result__tag27!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag27== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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
         org.apache.struts.taglib.html.HiddenTag __tag28 = null ;
        int __result__tag28 = 0 ;

        if (__tag28 == null ){
            __tag28 = new  org.apache.struts.taglib.html.HiddenTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag28);
        }
        __tag28.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag28, parent);
        __tag28.setStyleId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("completeShipData.reviewEvent", java.lang.String.class,"styleId"));
        __tag28.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("completeShipData.reviewEvent", java.lang.String.class,"property"));
        __tag28.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        _activeTag=__tag28;
        __result__tag28 = __tag28.doStartTag();

        if (__result__tag28!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag28== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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
         com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag29 = null ;
        int __result__tag29 = 0 ;

        if (__tag29 == null ){
            __tag29 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag29);
        }
        __tag29.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag29, parent);
        __tag29.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
        __tag29.setFile(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fsm_common_all.js", java.lang.String.class,"file"));
        __tag29.setLanguage(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("true", java.lang.String.class,"language"));
        _activeTag=__tag29;
        __result__tag29 = __tag29.doStartTag();

        if (__result__tag29!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag29== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.component.ScriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag30 = null ;
        int __result__tag30 = 0 ;

        if (__tag30 == null ){
            __tag30 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag30);
        }
        __tag30.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag30, parent);
        __tag30.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
        __tag30.setFile(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fsm_common_all_intl_langDep.js", java.lang.String.class,"file"));
        __tag30.setMinified(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("false", java.lang.String.class,"minified"));
        __tag30.setLanguage(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("true", java.lang.String.class,"language"));
        _activeTag=__tag30;
        __result__tag30 = __tag30.doStartTag();

        if (__result__tag30!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag30== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.component.ScriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag31 = null ;
        int __result__tag31 = 0 ;

        if (__tag31 == null ){
            __tag31 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag31);
        }
        __tag31.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag31, parent);
        __tag31.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
        __tag31.setFile(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fsm_showHideNonSafari.js", java.lang.String.class,"file"));
        _activeTag=__tag31;
        __result__tag31 = __tag31.doStartTag();

        if (__result__tag31!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag31== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.component.ScriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
        __tag32.setFile(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fsm_shipmentProfileReview.js", java.lang.String.class,"file"));
        __tag32.setMinified(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("false", java.lang.String.class,"minified"));
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
}
