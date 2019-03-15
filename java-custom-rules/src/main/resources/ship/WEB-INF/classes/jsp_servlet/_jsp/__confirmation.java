package jsp_servlet._jsp;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts.Globals;
import org.apache.struts.util.MessageResources;
import com.fedex.fsm.ship.web.outbound.*;
import com.fedex.fsm.ship.web.util.WebUtils;
import com.fedex.fsm.ship.web.util.*;
import java.util.*;
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
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.web.util.LoggerFactory;
import com.fedex.fsm.ship.web.util.ApplicationPropertyLoader;
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.web.util.LoggerFactory;
import com.fedex.fsm.ship.web.util.ApplicationPropertyLoader;
import com.fedex.fsm.ship.web.util.WebAnalytics;
import com.fedex.fsm.ship.web.displayRules.WebAnalyticsSelector;
import com.fedex.fsm.ship.web.decouple.DecoupleState;

public final class __confirmation extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/confirmation.jsp", 1550053020000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/FrameworkJSInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/PageCommonCSSInclude.jsi", 1550053020000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block0 ="\r\n";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\r\n\r\n";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\r\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\"/> \r\n<script language=\"JavaScript\">\r\n\tvar contextPath =\"";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\";\r\n\tvar passKeyAdminEmailId = \"";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private static java.lang.String  _wl_block4 ="\";\r\n\tvar errors=";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private static java.lang.String  _wl_block5 =";\r\n\tvar ajaxTimeout = ";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private static java.lang.String  _wl_block6 =";\r\n\tvar S5TaggingEnabled = \"";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private static java.lang.String  _wl_block7 ="\";\r\n\tvar hitBoxAcctNumber=\"";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private static java.lang.String  _wl_block8 ="\";\r\n\tvar enableConsoleLogging = \"";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

    private static java.lang.String  _wl_block9 ="\";\r\n\tvar _dimensionLength = \"";
    private final static byte[]  _wl_block9Bytes = _getBytes( _wl_block9 );

    private static java.lang.String  _wl_block10 ="\";\r\n\tvar _dimensionWidth = \"";
    private final static byte[]  _wl_block10Bytes = _getBytes( _wl_block10 );

    private static java.lang.String  _wl_block11 ="\";\r\n\tvar _dimensionHeight = \"";
    private final static byte[]  _wl_block11Bytes = _getBytes( _wl_block11 );

    private static java.lang.String  _wl_block12 ="\";\r\n\tvar fsmr = {};\r\n\tfsmr.priv = {};\r\n\tfsmr.url={};\r\n\tfsmr.pref={};\r\n\t\r\n\t// Jan18CL - ITG 171800 - Allow Option for Billing Defaults not to change\r\n\tvar _isPrefBillToRestrictedFlag = ";
    private final static byte[]  _wl_block12Bytes = _getBytes( _wl_block12 );

    private static java.lang.String  _wl_block13 =";\r\n\tvar _isPrefDutyBillToRestrictedFlag = ";
    private final static byte[]  _wl_block13Bytes = _getBytes( _wl_block13 );

    private static java.lang.String  _wl_block14 =";\r\n\tvar _isPrefAdditionalHandlingRestrictedFlag = ";
    private final static byte[]  _wl_block14Bytes = _getBytes( _wl_block14 );

    private static java.lang.String  _wl_block15 =";\r\n\tvar _billingPrefRestrictedFlag = ";
    private final static byte[]  _wl_block15Bytes = _getBytes( _wl_block15 );

    private static java.lang.String  _wl_block16 =";\r\n\t\r\n\tfunction readUpdatedSessionCSRFToken() {\r\n    \t$(\'#reloadCSRFToken\').load(\'reloadCSRFToken.action\',{});\r\n    \t// Added {} at end to force POST request. By default IE uses GET request due to which page is cached and subsequent page loading requests are blocked. \r\n    }\r\n</script>\r\n<div id=\"reloadCSRFToken\"> ";
    private final static byte[]  _wl_block16Bytes = _getBytes( _wl_block16 );

    private static java.lang.String  _wl_block17 ="\r\n<script>\r\n\tvar _csrfToken = \"";
    private final static byte[]  _wl_block17Bytes = _getBytes( _wl_block17 );

    private static java.lang.String  _wl_block18 ="\";\r\n</script>\r\n";
    private final static byte[]  _wl_block18Bytes = _getBytes( _wl_block18 );

    private static java.lang.String  _wl_block19 ="</div>";
    private final static byte[]  _wl_block19Bytes = _getBytes( _wl_block19 );

    private static java.lang.String  _wl_block20 ="\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n";
    private final static byte[]  _wl_block20Bytes = _getBytes( _wl_block20 );

    private static java.lang.String  _wl_block21 ="\r\n<head>\r\n    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\"/>\r\n\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n\t";
    private final static byte[]  _wl_block21Bytes = _getBytes( _wl_block21 );

    private static java.lang.String  _wl_block22 ="\r\n    ";
    private final static byte[]  _wl_block22Bytes = _getBytes( _wl_block22 );

    private static java.lang.String  _wl_block23 ="\r\n\r\n<script>\r\nvar webCacheTimeStamp = \"";
    private final static byte[]  _wl_block23Bytes = _getBytes( _wl_block23 );

    private static java.lang.String  _wl_block24 ="\";\r\n</script>";
    private final static byte[]  _wl_block24Bytes = _getBytes( _wl_block24 );

    private static java.lang.String  _wl_block25 ="\r\n\t<title>";
    private final static byte[]  _wl_block25Bytes = _getBytes( _wl_block25 );

    private static java.lang.String  _wl_block26 =" - ";
    private final static byte[]  _wl_block26Bytes = _getBytes( _wl_block26 );

    private static java.lang.String  _wl_block27 ="</title>\r\n";
    private final static byte[]  _wl_block27Bytes = _getBytes( _wl_block27 );

    private static java.lang.String  _wl_block28 ="\r\n\t";
    private final static byte[]  _wl_block28Bytes = _getBytes( _wl_block28 );

    private static java.lang.String  _wl_block29 ="\r\n\t<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block29Bytes = _getBytes( _wl_block29 );

    private static java.lang.String  _wl_block30 ="/css/fsm_widgets.css\">\r\n\t<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block30Bytes = _getBytes( _wl_block30 );

    private static java.lang.String  _wl_block31 ="/css/fsm_safarifixsafari.css\">\r\n";
    private final static byte[]  _wl_block31Bytes = _getBytes( _wl_block31 );

    private static java.lang.String  _wl_block32 ="\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"/framework/css/widgets.css\">\r\n\t<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block32Bytes = _getBytes( _wl_block32 );

    private static java.lang.String  _wl_block33 ="/css/fsm_safarifixother.css\">\r\n";
    private final static byte[]  _wl_block33Bytes = _getBytes( _wl_block33 );

    private static java.lang.String  _wl_block34 =" \r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block34Bytes = _getBytes( _wl_block34 );

    private static java.lang.String  _wl_block35 ="/css/fsm_common_all";
    private final static byte[]  _wl_block35Bytes = _getBytes( _wl_block35 );

    private static java.lang.String  _wl_block36 =".css\">";
    private final static byte[]  _wl_block36Bytes = _getBytes( _wl_block36 );

    private static java.lang.String  _wl_block37 ="\r\n\t<meta name=\"wsstitle\" id=\"wsstitle\" content=\"confirmation\">\r\n\t<meta name=\"wssmlc\" id=\"wssmlc\" content=\"/";
    private final static byte[]  _wl_block37Bytes = _getBytes( _wl_block37 );

    private static java.lang.String  _wl_block38 ="/";
    private final static byte[]  _wl_block38Bytes = _getBytes( _wl_block38 );

    private static java.lang.String  _wl_block39 ="/fedex/inet\">\r\n</head>\r\n";
    private final static byte[]  _wl_block39Bytes = _getBytes( _wl_block39 );

    private static java.lang.String  _wl_block40 ="\r\n<script>\r\nvar cancelButttonAlert = \"";
    private final static byte[]  _wl_block40Bytes = _getBytes( _wl_block40 );

    private static java.lang.String  _wl_block41 ="\";\r\n";
    private final static byte[]  _wl_block41Bytes = _getBytes( _wl_block41 );

    private static java.lang.String  _wl_block42 ="\r\n\tvar pendingId = \"";
    private final static byte[]  _wl_block42Bytes = _getBytes( _wl_block42 );

    private static java.lang.String  _wl_block43 ="\"; \r\n";
    private final static byte[]  _wl_block43Bytes = _getBytes( _wl_block43 );

    private static java.lang.String  _wl_block44 ="\t\r\nvar _isReturnShipment = ";
    private final static byte[]  _wl_block44Bytes = _getBytes( _wl_block44 );

    private static java.lang.String  _wl_block45 =";\r\nvar localeLang = \"";
    private final static byte[]  _wl_block45Bytes = _getBytes( _wl_block45 );

    private static java.lang.String  _wl_block46 ="\";\r\nvar withLabelText=\"";
    private final static byte[]  _wl_block46Bytes = _getBytes( _wl_block46 );

    private static java.lang.String  _wl_block47 ="\";\r\n</script>\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"/framework/css/widgets.css\">\r\n<link rel=\"stylesheet\" type=\"text/css\"\r\n\thref=\"";
    private final static byte[]  _wl_block47Bytes = _getBytes( _wl_block47 );

    private static java.lang.String  _wl_block48 ="/css/fsm_confirm";
    private final static byte[]  _wl_block48Bytes = _getBytes( _wl_block48 );

    private static java.lang.String  _wl_block49 =".css\">\r\n<body>\r\n\t";
    private final static byte[]  _wl_block49Bytes = _getBytes( _wl_block49 );

    private static java.lang.String  _wl_block50 ="\r\n\t\t<div id=\"debug\"\r\n\t\t\tstyle=\"display:none;position:absolute;top:5px;left:5px;width:800px;height:1500px;background:white;border:1px solid;\"></div>\r\n\t\t<div id=\"page_no_global_header\">\r\n\t\t\t<div id=\"fsmContent\">\r\n\t\t\t\t<div id=\"temp\" class=\"fullWidthContent\">\r\n\t\t\t\t<input id=\"confirmationAppNameOrphan\" style=\"display: none;\">      <!-- ada change -->\r\n\t\t\t\t<label for=\"confirmationAppNameOrphan\" class=\"appName\">\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block50Bytes = _getBytes( _wl_block50 );

    private static java.lang.String  _wl_block51 ="\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block51Bytes = _getBytes( _wl_block51 );

    private static java.lang.String  _wl_block52 ="\r\n\t\t\t\t\t</label>\r\n\t\t\t\t\t<br>\r\n\t\t\t\t\t<br>\r\n\t\t\t\t\t<br>\r\n\t\t\t\t</div>\r\n\t\t\t\t<div class=\"fsmConfirmFull\">\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block52Bytes = _getBytes( _wl_block52 );

    private static java.lang.String  _wl_block53 ="\r\n\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block53Bytes = _getBytes( _wl_block53 );

    private static java.lang.String  _wl_block54 ="\t\t\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block54Bytes = _getBytes( _wl_block54 );

    private static java.lang.String  _wl_block55 ="\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block55Bytes = _getBytes( _wl_block55 );

    private static java.lang.String  _wl_block56 =" ";
    private final static byte[]  _wl_block56Bytes = _getBytes( _wl_block56 );

    private static java.lang.String  _wl_block57 ="\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block57Bytes = _getBytes( _wl_block57 );

    private static java.lang.String  _wl_block58 ="\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block58Bytes = _getBytes( _wl_block58 );

    private static java.lang.String  _wl_block59 ="\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block59Bytes = _getBytes( _wl_block59 );

    private static java.lang.String  _wl_block60 ="\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block60Bytes = _getBytes( _wl_block60 );

    private static java.lang.String  _wl_block61 ="\r\n\t\t\t\t\t<div class=\"listFullConfirmContent\" align=\"left\">\t\r\n\t\t\t<div id=\"placement_1\" class=\"fsmConfirmInteractiveMkt\"></div>\t\r\n\t\t</div>\t\t\t\r\n\t\t<div class=\"listFullConfirmContent\" align=\"left\">\t\r\n\t\t\t<div id=\"cancel.alert\" class=\"listAlertWrap\">\r\n\t\t\t\t<div class=\"listAlert\">\r\n\t\t\t\t\t<b>";
    private final static byte[]  _wl_block61Bytes = _getBytes( _wl_block61 );

    private static java.lang.String  _wl_block62 ="&nbsp;</b>\r\n\t\t\t\t\t<label id=\"cancel.alert.message\"></label>\r\n\t\t\t\t\t<input type=\"button\" id=\"button.YES\" class=\"buttonPurple\" aria-label=\"";
    private final static byte[]  _wl_block62Bytes = _getBytes( _wl_block62 );

    private static java.lang.String  _wl_block63 ="\" value=\'";
    private final static byte[]  _wl_block63Bytes = _getBytes( _wl_block63 );

    private static java.lang.String  _wl_block64 ="\'>\r\n\t\t\t\t\t<input type=\"button\" id=\"button.NO\" class=\"buttonGray\" aria-label=\"";
    private final static byte[]  _wl_block64Bytes = _getBytes( _wl_block64 );

    private static java.lang.String  _wl_block65 ="\'>\r\n\t\t\t\t</div>\r\n\t\t\t</div>\t\r\n\t\t</div>\t\t\t\r\n\t\t<div class=\"listFullConfirmContent\" align=\"right\">\t\t\t\t\t\r\n\t\t";
    private final static byte[]  _wl_block65Bytes = _getBytes( _wl_block65 );

    private static java.lang.String  _wl_block66 ="\r\n\t\t";
    private final static byte[]  _wl_block66Bytes = _getBytes( _wl_block66 );

    private static java.lang.String  _wl_block67 ="\r\n\t\t\t<div id =\"printErrorMsg\" style=\"color:red\">";
    private final static byte[]  _wl_block67Bytes = _getBytes( _wl_block67 );

    private static java.lang.String  _wl_block68 ="</div>\r\n\t\t";
    private final static byte[]  _wl_block68Bytes = _getBytes( _wl_block68 );

    private static java.lang.String  _wl_block69 ="\r\n\t\t<div style=\"float:left; padding-left:10px;\">\r\n\t\t\t<input type=\"button\" id=\"pending.ship.print.button\" class=\"btnPurple\"  \r\n\t\t\t\tvalue=\"";
    private final static byte[]  _wl_block69Bytes = _getBytes( _wl_block69 );

    private static java.lang.String  _wl_block70 ="\"/>\r\n\t\t</div>\r\n\t\t<div id = \"tempPendingPrintArea\"></div>\r\n\t";
    private final static byte[]  _wl_block70Bytes = _getBytes( _wl_block70 );

    private static java.lang.String  _wl_block71 ="\r\n\t    \r\n\t\t<div style=\"float:right;\">&nbsp;&nbsp;</div>\r\n\t\t<div style=\"float:right;\">\r\n\t\t\t<input type=\"button\" id=\"pending.ship.confirm.button.viewPendingShipment\" value=\"";
    private final static byte[]  _wl_block71Bytes = _getBytes( _wl_block71 );

    private static java.lang.String  _wl_block72 ="\" class=\"btnPurple btnLeftRightPadding3pt\" />\r\n\t\t</div>\r\n\t\t\r\n\t\t\r\n\t\t";
    private final static byte[]  _wl_block72Bytes = _getBytes( _wl_block72 );

    private static java.lang.String  _wl_block73 ="\r\n\t\t\r\n\t\t<div style=\"float:right;\">&nbsp;&nbsp;</div>\r\n\t\t<div style=\"float:right;\">\r\n\t\t\t<input type=\"button\" id=\"pending.ship.confirm.button.newShipment\" value=\"";
    private final static byte[]  _wl_block73Bytes = _getBytes( _wl_block73 );

    private static java.lang.String  _wl_block74 ="\"\tclass=\"btnGray btnLeftRightPadding3pt\"/>\r\n\t\t</div>\r\n\t\t<div style=\"float:right;\">&nbsp;&nbsp;</div>\r\n\t\t<div style=\"float:right;\">\r\n\t\t\t<input type=\"button\" id=\"pending.ship.confirm.button.repeatLastShipment\" value=\"";
    private final static byte[]  _wl_block74Bytes = _getBytes( _wl_block74 );

    private static java.lang.String  _wl_block75 ="\" class=\"btnGray btnLeftRightPadding3pt\"/>\r\n\t\t</div>\r\n\t\t<div style=\"float:right;\">&nbsp;&nbsp;</div>\r\n\t\t<div style=\"float:right;\">\r\n\t\t\t<input type=\"button\" id=\"pending.ship.confirm.button.cancelShipment\" value=\"";
    private final static byte[]  _wl_block75Bytes = _getBytes( _wl_block75 );

    private static java.lang.String  _wl_block76 ="\" class=\"btnGray btnLeftRightPadding3pt\" />\r\n\t\t</div>\r\n\t\t\r\n\t\t<div style=\"float:right;\">&nbsp;&nbsp;</div>\r\n\t\t<div style=\"float:right;\">\r\n\t\t\t<input type=\"button\" id=\"pending.ship.confirm.button.editShipment\" value=\"";
    private final static byte[]  _wl_block76Bytes = _getBytes( _wl_block76 );

    private static java.lang.String  _wl_block77 ="\" class=\"btnGray btnLeftRightPadding3pt\" />\r\n\t\t</div>\r\n\t\t\r\n\t\t\r\n\t\t\t\t\r\n\t\t";
    private final static byte[]  _wl_block77Bytes = _getBytes( _wl_block77 );

    private static java.lang.String  _wl_block78 ="\r\n\t\r\n  \t\r\n  \t";
    private final static byte[]  _wl_block78Bytes = _getBytes( _wl_block78 );

    private static java.lang.String  _wl_block79 ="\r\n<!--   \t// Jul18CL-ITG 179944 INET and LITE Terms of Use ID:115878-->\r\n\t\t<div id =\"instructions\" style=\"";
    private final static byte[]  _wl_block79Bytes = _getBytes( _wl_block79 );

    private static java.lang.String  _wl_block80 ="\">\r\n  \t\t\t";
    private final static byte[]  _wl_block80Bytes = _getBytes( _wl_block80 );

    private static java.lang.String  _wl_block81 ="\r\n  \t\t</div> \r\n  \t\t<div class=\"listFullConfirmContent\" align=\"right\">\r\n\t\t\t\t \t\t\t<div style=\"float:right;\">\r\n\t\t\t\t\t\t\t\t<input type=\"button\" id=\"confirm.ship.field\" class=\"btnPurple\" value=\"";
    private final static byte[]  _wl_block81Bytes = _getBytes( _wl_block81 );

    private static java.lang.String  _wl_block82 ="\">\t</div>\r\n\t\t\t\t\t\t\t<div style=\"float:right;\">&nbsp;&nbsp;</div>\r\n\t\t\t\t\t\t\t<div style=\"float:right;\">\r\n\t\t\t\t\t\t\t<input type=\"button\" id=\"confirm.button.edit\" class=\"btnGray\" value=\" ";
    private final static byte[]  _wl_block82Bytes = _getBytes( _wl_block82 );

    private static java.lang.String  _wl_block83 =" \"></div>\r\n\t\t\t\t\t\t</div> \r\n  \t";
    private final static byte[]  _wl_block83Bytes = _getBytes( _wl_block83 );

    private static java.lang.String  _wl_block84 ="\r\n  \t</div>\r\n\t\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t\t";
    private final static byte[]  _wl_block84Bytes = _getBytes( _wl_block84 );

    private static java.lang.String  _wl_block85 ="\r\n\r\n<script>\r\nvar minifiedJSFileSuffix = \"";
    private final static byte[]  _wl_block85Bytes = _getBytes( _wl_block85 );

    private static java.lang.String  _wl_block86 ="\r\n<script type=\"text/javascript\" charset=\"utf-8\" src=\"/framework/js/framework";
    private final static byte[]  _wl_block86Bytes = _getBytes( _wl_block86 );

    private static java.lang.String  _wl_block87 =".js\"></script>\r\n";
    private final static byte[]  _wl_block87Bytes = _getBytes( _wl_block87 );

    private static java.lang.String  _wl_block88 =" \r\n";
    private final static byte[]  _wl_block88Bytes = _getBytes( _wl_block88 );

    private static java.lang.String  _wl_block89 ="\r\n   \t\t<script type=\"text/javascript\" charset=\"utf-8\">init();</script>\r\n   \t\t<script type=\"text/javascript\" charset=\"utf-8\" src=\"/templates/components/javascript/v1/im-min.js\"></script>\r\n   \t\t<script>\r\n   \t\t\tvar webloc = new String(window.location);\r\n   \t\t\tvar imageHost = webloc.replace(/http(s)?:\\/\\/((.*\\.)?fedex\\.com)\\/.*/, \"$2\");\r\n   \t\t\r\n   \t\t    // var IM is defined in im-min.js - if it\'s not defined\r\n   \t\t\t // in current scope, need to lazy load it\r\n\t\t    if (typeof IM !== \"undefined\" && IM !== null) {\r\n\t\t        IM.processCurrentPage();\r\n\t\t    }\r\n\t\t    else {\r\n\t\t        loadscript(\"/templates/components/javascript/v1/im-min.js\");\r\n\t\t    }\r\n       \t \t\r\n\t\t    function loadscript(url, callback) {\r\n\r\n\t\t        var oScript = document.createElement(\"script\");\r\n\t\t        oScript.language = \"javascript\";\r\n\t\t        oScript.type = \"text/javascript\";\r\n\t\t        oScript.charset = \"utf-8\";\r\n\t\t        oScript.async = \'true\';\r\n\t\t        oScript.src = url;\r\n\r\n\t\t        if (typeof callback !== \'undefined\' && typeof callback === \"function\") {\r\n\t\t            oScript.onloadDone = false;\r\n\t\t            oScript.onload = function () {\r\n\t\t                if (!oScript.onloadDone) {\r\n\t\t                    oScript.onloadDone = true;\r\n\t\t                    callback();\r\n\t\t                }\r\n\t\t            };\r\n\r\n\t\t            oScript.onreadystatechange = function () {\r\n\t\t                if ((\"loaded\" === oScript.readyState || \"complete\" === \r\n\t\t                  oScript.readyState) && !oScript.onloadDone) {\r\n\t\t                    oScript.onloadDone = true;\r\n\t\t                    callback();\r\n\t\t                }\r\n\t\t            };\r\n\t\t        }\r\n\r\n\t\t        var oHead = document.getElementsByTagName(\'HEAD\').item(0);\r\n\t\t        oHead.appendChild(oScript);\r\n\t\t    }\r\n\r\n        \t// EACI 2.5 : Feature F7 decouple Flag \r\n        \tvar pendingShipConfPrintIFrameUrl = \"";
    private final static byte[]  _wl_block89Bytes = _getBytes( _wl_block89 );

    private static java.lang.String  _wl_block90 ="/html/PrintIFrameForPendingShipmentConfirmation.html\";\r\n        \tvar isBarcodedDocumentForPendingShipmentEnabled = ";
    private final static byte[]  _wl_block90Bytes = _getBytes( _wl_block90 );

    private static java.lang.String  _wl_block91 =";\r\n        \tvar isPendingDocRetrievalFailed =\"";
    private final static byte[]  _wl_block91Bytes = _getBytes( _wl_block91 );

    private static java.lang.String  _wl_block92 ="\";\r\n        \tvar _utype= ";
    private final static byte[]  _wl_block92Bytes = _getBytes( _wl_block92 );

    private static java.lang.String  _wl_block93 =";\r\n        \t\r\n        \tfunction resizeImage(){\r\n\t\t\t\tvar iframeElm = document.getElementById(\'pendingDocIframe\');\r\n\t\t\t\tvar innerDoc = iframeElm.contentDocument || iframeElm.contentWindow.document;\r\n\t\t\t\tif (/MSIE (\\d+\\.\\d+);/.test(navigator.userAgent)){ //test for MSIE\r\n\t        \t\tinnerDoc = iframeElm.contentWindow.document;\r\n\t        \t}\r\n\t\t\t\tvar iframeBodyTag = innerDoc.getElementsByTagName(\"body\");\r\n\t\t\t\tif(iframeBodyTag.length > 0){\r\n\t\t\t\t\tiframeBodyTag[0].style.width = \"930px\";\r\n\t\t\t\t}\r\n\t\t\t\tvar imgTag = innerDoc.getElementsByTagName(\"img\");\r\n\t\t\t\tif(imgTag.length > 0 ){\r\n\t\t\t\t\timgTag[0].style.width = \"930px\";\r\n\t\t\t\t}\r\n\r\n\t\t\t}\r\n\t\r\n   \t\t</script>\r\n\t\t";
    private final static byte[]  _wl_block93Bytes = _getBytes( _wl_block93 );

    private static java.lang.String  _wl_block94 ="\r\n\t\t<input type=\"hidden\" name=\"COMPRESSED_OUTBOUND_SHIP_ACTION_FORM\" value=\"";
    private final static byte[]  _wl_block94Bytes = _getBytes( _wl_block94 );

    private static java.lang.String  _wl_block95 =" \"/>\r\n   \t\t";
    private final static byte[]  _wl_block95Bytes = _getBytes( _wl_block95 );

    private static java.lang.String  _wl_block96 ="\r\n\r\n\r\n";
    private final static byte[]  _wl_block96Bytes = _getBytes( _wl_block96 );

    private static java.lang.String  _wl_block97 ="\r\n   \t\t<input type=\"hidden\" name=\"utype\" value=\"";
    private final static byte[]  _wl_block97Bytes = _getBytes( _wl_block97 );

    private static java.lang.String  _wl_block98 ="\">\r\n   \t\t<iframe id=\"pendingDocIframe\" onload = \"resizeImage();\" src=\"";
    private final static byte[]  _wl_block98Bytes = _getBytes( _wl_block98 );

    private static java.lang.String  _wl_block99 ="/shipmentConfirmationAction.handle?method=getPendingConfirmationDocument&reqData=";
    private final static byte[]  _wl_block99Bytes = _getBytes( _wl_block99 );

    private static java.lang.String  _wl_block100 ="\" style=\"display:none; width:930px\" ></iframe>\r\n\t\t\r\n\t";
    private final static byte[]  _wl_block100Bytes = _getBytes( _wl_block100 );

    private static java.lang.String  _wl_block101 ="\r\n</body>\r\n<head>\r\n";
    private final static byte[]  _wl_block101Bytes = _getBytes( _wl_block101 );

    private static java.lang.String  _wl_block102 ="\r\n</head>\r\n";
    private final static byte[]  _wl_block102Bytes = _getBytes( _wl_block102 );

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

            _bw.write(_wl_block2Bytes, _wl_block2);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block3Bytes, _wl_block3);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(userProfileAdapter.getAdminEmail()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block4Bytes, _wl_block4);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(request.getAttribute("fsmMessages")), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block5Bytes, _wl_block5);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf( ApplicationPropertyLoader.getInstance().getProperty("AJAX_TIMEOUT") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block6Bytes, _wl_block6);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf( ApplicationPropertyLoader.getInstance().getProperty("S5TaggingEnabled") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block7Bytes, _wl_block7);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf( ApplicationPropertyLoader.getInstance().getProperty("hitBoxAcctNumber") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block8Bytes, _wl_block8);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(ApplicationPropertyLoader.getInstance().getProperty("ConsoleLogging")), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block9Bytes, _wl_block9);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf( res.getMessage(loc, "text.pickup.dimensions.length") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block10Bytes, _wl_block10);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf( res.getMessage(loc, "text.pickup.dimensions.width") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block11Bytes, _wl_block11);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf( res.getMessage(loc, "text.pickup.dimensions.height") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block12Bytes, _wl_block12);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPrefBillToRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block13Bytes, _wl_block13);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPrefDutyBillToRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block14Bytes, _wl_block14);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPrefAdditionalHandlingRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block15Bytes, _wl_block15);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(billingPrefRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block16Bytes, _wl_block16);
 String csrfToken =  (String) session.getAttribute("csrfToken"); 
            _bw.write(_wl_block17Bytes, _wl_block17);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(csrfToken), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block18Bytes, _wl_block18);
            _bw.write(_wl_block19Bytes, _wl_block19);
            _bw.write(_wl_block20Bytes, _wl_block20);
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
                    _bw.write(_wl_block21Bytes, _wl_block21);

                    if (_jsp__tag1(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block22Bytes, _wl_block22);
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

                    _bw.write(_wl_block23Bytes, _wl_block23);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block24Bytes, _wl_block24);
                    _bw.write(_wl_block25Bytes, _wl_block25);

                    if (_jsp__tag2(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block26Bytes, _wl_block26);

                    if (_jsp__tag3(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block27Bytes, _wl_block27);
 
	WebShipEnvironment webShipEnvironment = WebUtils.getWebShipEnvironment(request);
	Locale locale = webShipEnvironment.getLocale();
	


                    _bw.write(_wl_block28Bytes, _wl_block28);
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
                    _bw.write(_wl_block29Bytes, _wl_block29);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block30Bytes, _wl_block30);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block31Bytes, _wl_block31);
 } else { 
                    _bw.write(_wl_block32Bytes, _wl_block32);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block33Bytes, _wl_block33);
 } 
                    _bw.write(_wl_block34Bytes, _wl_block34);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block35Bytes, _wl_block35);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block36Bytes, _wl_block36);
                    _bw.write(_wl_block37Bytes, _wl_block37);
                     com.fedex.framework.taglib.encode.HtmlTag __tag4 = null ;
                    int __result__tag4 = 0 ;

                    if (__tag4 == null ){
                        __tag4 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag4);
                    }
                    __tag4.setPageContext(pageContext);
                    __tag4.setParent(__tag0);
                    __tag4.setValue(locale.getCountry().toLowerCase()
);
                    _activeTag=__tag4;
                    __result__tag4 = __tag4.doStartTag();

                    if (__result__tag4!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag4== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
                    _bw.write(_wl_block38Bytes, _wl_block38);
                     com.fedex.framework.taglib.encode.HtmlTag __tag5 = null ;
                    int __result__tag5 = 0 ;

                    if (__tag5 == null ){
                        __tag5 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag5);
                    }
                    __tag5.setPageContext(pageContext);
                    __tag5.setParent(__tag0);
                    __tag5.setValue(locale.getLanguage()
);
                    _activeTag=__tag5;
                    __result__tag5 = __tag5.doStartTag();

                    if (__result__tag5!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag5== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag5.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag5);
                        return;
                    }
                    _activeTag=__tag5.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag5);
                    __tag5.release();
                    _bw.write(_wl_block39Bytes, _wl_block39);

	ShipActionForm form =(ShipActionForm)request.getAttribute("shipActionForm");
	boolean isReturnShipment = form.isReturnShipmentBoolean();
	boolean isImportShipment = form.isImportShipmentBoolean();
	boolean isReturnOnly = form.isReturnOnlyBoolean();
	MessageResources resources = (MessageResources)application.getAttribute(Globals.MESSAGES_KEY);

	String helpText = resources.getMessage(locale, "text.help");
	String editText = resources.getMessage(locale, "text.edit");
	String hideText = resources.getMessage(locale, "text.hide");
	String editButton = resources.getMessage(locale, "text.button.edit");
	String confirmButton = resources.getMessage(locale, "text.confirmShipment");
	String shipButton = resources.getMessage(locale, "text.ship");
	String shipmentTitle = resources.getMessage(locale, "app.outboundShip");
	String editShipmentButton = resources.getMessage(locale, "button.editShipment");
	String repeatLastShipmentButton = resources.getMessage(locale, "button.repeatLast");
	String newShipmentButton = resources.getMessage(locale, "button.createNew");
	String cancelShipmentButton = resources.getMessage(locale, "button.cancelShipment");
	String previousButton = resources.getMessage(locale, "text.label.Previous");
	String nextButton = resources.getMessage(locale, "text.label.Next");
	String retrieveBarcodedDocFailed = (String)session.getAttribute(WebConstants.RETRIEVE_PENDING_DOC_FAILED);
	// Added on 02-21-2012 by 838334 ID#874952 ***START
		String viewPendingShipments = resources.getMessage(locale, "text.viewPendingShipment");
	// Added on 02-21-2012 by 838334 ID#874952 ***END
	if(isImportShipment){
		shipmentTitle = resources.getMessage(locale, "app.importShip");
	} else if(isReturnOnly) {
		shipmentTitle = resources.getMessage(locale, "app.returnShip");	
	}	
	
	// Jul18CL-ITG 179944 INET and LITE Terms of Use ID:115878
	String serviceGuideLink = "<a href=\"" + ApplicationPropertyLoader.getInstance().getProperty("ServiceGuideLink") + "\" target=\"_blank\">,</a>";	
	String pagenotesUse = "<a id=\"pagenotes.use\" href=\"javascript:;\" >";
	String pagenotesConditions = "<a id=\"pagenotes.conditions\" href=\"javascript:;\">";	
	String noteStyle = "float:left;width:565px;margin-left:22px;text-align:justify;top:-36px;position:relative;margin: 15px 0px -55px 20px;";
	String withLabel = resources.getMessage(locale, "ada.withlabel"); 

                    _bw.write(_wl_block0Bytes, _wl_block0);
                    com.fedex.fsm.ship.web.view.ShipmentSummaryView shipmentSummaryView= null;{
                        shipmentSummaryView=(com.fedex.fsm.ship.web.view.ShipmentSummaryView)pageContext.getAttribute("shipmentSummaryView",javax.servlet.jsp.PageContext.REQUEST_SCOPE);
                        if(shipmentSummaryView==null){
                            shipmentSummaryView=new com.fedex.fsm.ship.web.view.ShipmentSummaryView();
                            pageContext.setAttribute("shipmentSummaryView",shipmentSummaryView,javax.servlet.jsp.PageContext.REQUEST_SCOPE);

                        }
                    }
                    _bw.write(_wl_block40Bytes, _wl_block40);

                    if (_jsp__tag6(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block41Bytes, _wl_block41);
 if(shipmentSummaryView.isPendingShipment()){ 
                    _bw.write(_wl_block42Bytes, _wl_block42);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag7 = null ;
                    int __result__tag7 = 0 ;

                    if (__tag7 == null ){
                        __tag7 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag7);
                    }
                    __tag7.setPageContext(pageContext);
                    __tag7.setParent(__tag0);
                    __tag7.setValue(shipmentSummaryView.getPendingshipmentId()
);
                    _activeTag=__tag7;
                    __result__tag7 = __tag7.doStartTag();

                    if (__result__tag7!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag7== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag7.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag7);
                        return;
                    }
                    _activeTag=__tag7.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag7);
                    __tag7.release();
                    _bw.write(_wl_block43Bytes, _wl_block43);
 } 
                    _bw.write(_wl_block44Bytes, _wl_block44);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isReturnShipment), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block45Bytes, _wl_block45);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag8 = null ;
                    int __result__tag8 = 0 ;

                    if (__tag8 == null ){
                        __tag8 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag8);
                    }
                    __tag8.setPageContext(pageContext);
                    __tag8.setParent(__tag0);
                    __tag8.setValue(locale.getLanguage()
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
                    _bw.write(_wl_block46Bytes, _wl_block46);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(withLabel), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block47Bytes, _wl_block47);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block48Bytes, _wl_block48);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block49Bytes, _wl_block49);
                     org.apache.struts.taglib.html.FormTag __tag9 = null ;
                    int __result__tag9 = 0 ;

                    if (__tag9 == null ){
                        __tag9 = new  org.apache.struts.taglib.html.FormTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag9);
                    }
                    __tag9.setPageContext(pageContext);
                    __tag9.setParent(__tag0);
                    __tag9.setAction(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("confirmAction", java.lang.String.class,"action"));
                    _activeTag=__tag9;
                    __result__tag9 = __tag9.doStartTag();

                    if (__result__tag9!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag9== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.html.FormTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block50Bytes, _wl_block50);
String appTitle = shipmentSummaryView.getPageTitle(); 
                            _bw.write(_wl_block51Bytes, _wl_block51);
                             org.apache.struts.taglib.bean.MessageTag __tag10 = null ;
                            int __result__tag10 = 0 ;

                            if (__tag10 == null ){
                                __tag10 = new  org.apache.struts.taglib.bean.MessageTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag10);
                            }
                            __tag10.setPageContext(pageContext);
                            __tag10.setParent(__tag9);
                            __tag10.setKey(appTitle
);
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
                                return;
                            }
                            _activeTag=__tag10.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag10);
                            __tag10.release();
                            _bw.write(_wl_block52Bytes, _wl_block52);
                             com.fedex.framework.taglib.ModuleTag __tag11 = null ;
                            int __result__tag11 = 0 ;

                            if (__tag11 == null ){
                                __tag11 = new  com.fedex.framework.taglib.ModuleTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag11);
                            }
                            __tag11.setPageContext(pageContext);
                            __tag11.setParent(__tag9);
                            __tag11.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("module.confirmYourShipment", java.lang.String.class,"id"));
                            __tag11.setType(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("required", java.lang.String.class,"type"));
                            __tag11.setTitle(shipmentTitle
);
                            __tag11.setDefaultMode(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("expanded", java.lang.String.class,"defaultMode"));
                            __tag11.setHelpText(helpText
);
                            __tag11.setCollapsable(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                            __tag11.setEditText(editText
);
                            __tag11.setHideText(hideText
);
                            _activeTag=__tag11;
                            __result__tag11 = __tag11.doStartTag();

                            if (__result__tag11!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag11== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.ModuleTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block53Bytes, _wl_block53);
                                     com.fedex.framework.taglib.ModuleExpandedTag __tag12 = null ;
                                    int __result__tag12 = 0 ;

                                    if (__tag12 == null ){
                                        __tag12 = new  com.fedex.framework.taglib.ModuleExpandedTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag12);
                                    }
                                    __tag12.setPageContext(pageContext);
                                    __tag12.setParent(__tag11);
                                    _activeTag=__tag12;
                                    __result__tag12 = __tag12.doStartTag();

                                    if (__result__tag12!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        if (__result__tag12== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.ModuleExpandedTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                        }
                                        do {
                                            _bw.write(_wl_block54Bytes, _wl_block54);
 if(!isReturnOnly){ 
                                            _bw.write(_wl_block55Bytes, _wl_block55);
                                            {java.lang.String __page ="/jsp/ShipmentDetailsSection.jsp";
                                                java.lang.String[][] __queryParams = {};
                                                java.lang.String __encoding = request.getCharacterEncoding();
                                                if (__encoding == null) __encoding ="ISO-8859-1";

                                                if (__queryParams.length == 0 ) pageContext.include(__page);
                                                 else pageContext.include(weblogic.utils.http.HttpParsing.makeURI(__page, __queryParams, __encoding));
                                            }_bw.write(_wl_block57Bytes, _wl_block57);
} 
                                            _bw.write(_wl_block58Bytes, _wl_block58);
 if(isReturnShipment || isReturnOnly){
                                            _bw.write(_wl_block59Bytes, _wl_block59);
                                            {java.lang.String __page ="/jsp/ReturnsShipmentDetailsSection.jsp";
                                                java.lang.String[][] __queryParams = {};
                                                java.lang.String __encoding = request.getCharacterEncoding();
                                                if (__encoding == null) __encoding ="ISO-8859-1";

                                                if (__queryParams.length == 0 ) pageContext.include(__page);
                                                 else pageContext.include(weblogic.utils.http.HttpParsing.makeURI(__page, __queryParams, __encoding));
                                            }_bw.write(_wl_block57Bytes, _wl_block57);
} 
                                            _bw.write(_wl_block51Bytes, _wl_block51);
                                        } while (__tag12.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    }
                                    if (__tag12.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag12);
                                        return;
                                    }
                                    _activeTag=__tag12.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag12);
                                    __tag12.release();
                                    _bw.write(_wl_block60Bytes, _wl_block60);
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
                            _bw.write(_wl_block61Bytes, _wl_block61);

                            if (_jsp__tag13(request, response, pageContext, _activeTag, __tag9))
                             return;
                            _bw.write(_wl_block62Bytes, _wl_block62);

                            if (_jsp__tag14(request, response, pageContext, _activeTag, __tag9))
                             return;
                            _bw.write(_wl_block63Bytes, _wl_block63);

                            if (_jsp__tag15(request, response, pageContext, _activeTag, __tag9))
                             return;
                            _bw.write(_wl_block64Bytes, _wl_block64);

                            if (_jsp__tag16(request, response, pageContext, _activeTag, __tag9))
                             return;
                            _bw.write(_wl_block63Bytes, _wl_block63);

                            if (_jsp__tag17(request, response, pageContext, _activeTag, __tag9))
                             return;
                            _bw.write(_wl_block65Bytes, _wl_block65);
                             org.apache.struts.taglib.logic.EqualTag __tag18 = null ;
                            int __result__tag18 = 0 ;

                            if (__tag18 == null ){
                                __tag18 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag18);
                            }
                            __tag18.setPageContext(pageContext);
                            __tag18.setParent(__tag9);
                            __tag18.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipmentSummaryView", java.lang.String.class,"name"));
                            __tag18.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("screenNavigation", java.lang.String.class,"property"));
                            __tag18.setValue(WebConstants.PENDING_SHIPMENT_CONFIRMATION_PAGE
);
                            _activeTag=__tag18;
                            __result__tag18 = __tag18.doStartTag();

                            if (__result__tag18!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag18== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block66Bytes, _wl_block66);
 if(DecoupleState.INSTANCE.isBarcodedLabelForPendingShipmentEnabled()){ 
                                    _bw.write(_wl_block67Bytes, _wl_block67);

                                    if (_jsp__tag19(request, response, pageContext, _activeTag, __tag18))
                                     return;
                                    _bw.write(_wl_block68Bytes, _wl_block68);
}
                                    _bw.write(_wl_block69Bytes, _wl_block69);

                                    if (_jsp__tag20(request, response, pageContext, _activeTag, __tag18))
                                     return;
                                    _bw.write(_wl_block70Bytes, _wl_block70);
                                    _bw.write(_wl_block71Bytes, _wl_block71);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(viewPendingShipments), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block72Bytes, _wl_block72);
                                    _bw.write(_wl_block73Bytes, _wl_block73);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(newShipmentButton), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block74Bytes, _wl_block74);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(repeatLastShipmentButton), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block75Bytes, _wl_block75);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(cancelShipmentButton), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block76Bytes, _wl_block76);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(editShipmentButton), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block77Bytes, _wl_block77);
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
                            _bw.write(_wl_block78Bytes, _wl_block78);
                             org.apache.struts.taglib.logic.EqualTag __tag21 = null ;
                            int __result__tag21 = 0 ;

                            if (__tag21 == null ){
                                __tag21 = new  org.apache.struts.taglib.logic.EqualTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag21);
                            }
                            __tag21.setPageContext(pageContext);
                            __tag21.setParent(__tag9);
                            __tag21.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipmentSummaryView", java.lang.String.class,"name"));
                            __tag21.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("screenNavigation", java.lang.String.class,"property"));
                            __tag21.setValue(WebConstants.SHIP_CONFIRMATION_PAGE
);
                            _activeTag=__tag21;
                            __result__tag21 = __tag21.doStartTag();

                            if (__result__tag21!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag21== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.logic.EqualTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block79Bytes, _wl_block79);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(noteStyle), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block80Bytes, _wl_block80);
                                     org.apache.struts.taglib.bean.MessageTag __tag22 = null ;
                                    int __result__tag22 = 0 ;

                                    if (__tag22 == null ){
                                        __tag22 = new  org.apache.struts.taglib.bean.MessageTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag22);
                                    }
                                    __tag22.setPageContext(pageContext);
                                    __tag22.setParent(__tag21);
                                    __tag22.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.shipPageNote2", java.lang.String.class,"key"));
                                    __tag22.setArg0(serviceGuideLink.split(",")[0]
);
                                    __tag22.setArg1(serviceGuideLink.split(",")[1]
);
                                    __tag22.setArg2(pagenotesUse
);
                                    __tag22.setArg3(pagenotesConditions
);
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
                                        return;
                                    }
                                    _activeTag=__tag22.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag22);
                                    __tag22.release();
                                    _bw.write(_wl_block81Bytes, _wl_block81);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(shipButton), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block82Bytes, _wl_block82);
                                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(editButton), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                    _bw.write(_wl_block83Bytes, _wl_block83);
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
                            _bw.write(_wl_block84Bytes, _wl_block84);
                            _bw.write(_wl_block0Bytes, _wl_block0);
                            _bw.write(_wl_block0Bytes, _wl_block0);
                            _bw.write(_wl_block1Bytes, _wl_block1);

	
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

                            _bw.write(_wl_block85Bytes, _wl_block85);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(minifiedJSFileSuffix), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block24Bytes, _wl_block24);
                            _bw.write(_wl_block86Bytes, _wl_block86);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(minifiedFwkFileSuffix), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block87Bytes, _wl_block87);
                            _bw.write(_wl_block66Bytes, _wl_block66);

                            if (_jsp__tag23(request, response, pageContext, _activeTag, __tag9))
                             return;
                            _bw.write(_wl_block0Bytes, _wl_block0);

                            if (_jsp__tag24(request, response, pageContext, _activeTag, __tag9))
                             return;
                            _bw.write(_wl_block88Bytes, _wl_block88);

                            if (_jsp__tag25(request, response, pageContext, _activeTag, __tag9))
                             return;
                            _bw.write(_wl_block66Bytes, _wl_block66);

                            if (_jsp__tag26(request, response, pageContext, _activeTag, __tag9))
                             return;
                            _bw.write(_wl_block66Bytes, _wl_block66);

                            if (_jsp__tag27(request, response, pageContext, _activeTag, __tag9))
                             return;
                            _bw.write(_wl_block89Bytes, _wl_block89);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block90Bytes, _wl_block90);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(DecoupleState.INSTANCE.isBarcodedLabelForPendingShipmentEnabled()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block91Bytes, _wl_block91);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(retrieveBarcodedDocFailed), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block92Bytes, _wl_block92);
                             com.fedex.framework.taglib.encode.JavascriptTag __tag28 = null ;
                            int __result__tag28 = 0 ;

                            if (__tag28 == null ){
                                __tag28 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag28);
                            }
                            __tag28.setPageContext(pageContext);
                            __tag28.setParent(__tag9);
                            __tag28.setValue(utype
);
                            _activeTag=__tag28;
                            __result__tag28 = __tag28.doStartTag();

                            if (__result__tag28!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag28== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                            }
                            if (__tag28.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag28);
                                return;
                            }
                            _activeTag=__tag28.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag28);
                            __tag28.release();
                            _bw.write(_wl_block93Bytes, _wl_block93);
                            {java.lang.String __page ="/jsp/HiddenNav.jsp";
                                java.lang.String[][] __queryParams = {};
                                java.lang.String __encoding = request.getCharacterEncoding();
                                if (__encoding == null) __encoding ="ISO-8859-1";

                                if (__queryParams.length == 0 ) pageContext.include(__page);
                                 else pageContext.include(weblogic.utils.http.HttpParsing.makeURI(__page, __queryParams, __encoding));
                            }_bw.write(_wl_block94Bytes, _wl_block94);
                             com.fedex.framework.taglib.encode.HtmlTag __tag29 = null ;
                            int __result__tag29 = 0 ;

                            if (__tag29 == null ){
                                __tag29 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag29);
                            }
                            __tag29.setPageContext(pageContext);
                            __tag29.setParent(__tag9);
                            __tag29.setValue(request.getAttribute("COMPRESSED_OUTBOUND_SHIP_ACTION_FORM") 
);
                            _activeTag=__tag29;
                            __result__tag29 = __tag29.doStartTag();

                            if (__result__tag29!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag29== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                            }
                            if (__tag29.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag29);
                                return;
                            }
                            _activeTag=__tag29.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag29);
                            __tag29.release();
                            _bw.write(_wl_block95Bytes, _wl_block95);
                            _bw.write(_wl_block96Bytes, _wl_block96);

	WebAnalyticsSelector ws = new WebAnalyticsSelector();
	String webAnalyticsJSFile = ws.getWebAnalyticsTool().getJsFile();

                            _bw.write(_wl_block1Bytes, _wl_block1);
                             com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag30 = null ;
                            int __result__tag30 = 0 ;

                            if (__tag30 == null ){
                                __tag30 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag30);
                            }
                            __tag30.setPageContext(pageContext);
                            __tag30.setParent(__tag9);
                            __tag30.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
                            __tag30.setFile(webAnalyticsJSFile
);
                            __tag30.setMinified(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("false", java.lang.String.class,"minified"));
                            __tag30.setVersioned(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("true", java.lang.String.class,"versioned"));
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
                                return;
                            }
                            _activeTag=__tag30.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag30);
                            __tag30.release();
                            _bw.write(_wl_block0Bytes, _wl_block0);
                            _bw.write(_wl_block66Bytes, _wl_block66);

                            if (_jsp__tag31(request, response, pageContext, _activeTag, __tag9))
                             return;
                            _bw.write(_wl_block97Bytes, _wl_block97);
                             com.fedex.framework.taglib.encode.HtmlTag __tag32 = null ;
                            int __result__tag32 = 0 ;

                            if (__tag32 == null ){
                                __tag32 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag32);
                            }
                            __tag32.setPageContext(pageContext);
                            __tag32.setParent(__tag9);
                            __tag32.setValue(utype
);
                            _activeTag=__tag32;
                            __result__tag32 = __tag32.doStartTag();

                            if (__result__tag32!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag32== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                            }
                            if (__tag32.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag32);
                                return;
                            }
                            _activeTag=__tag32.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag32);
                            __tag32.release();
                            _bw.write(_wl_block98Bytes, _wl_block98);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block99Bytes, _wl_block99);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(shipmentSummaryView.getPendingshipmentId()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block100Bytes, _wl_block100);
                        } while (__tag9.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                    }
                    if (__tag9.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag9);
                        return;
                    }
                    _activeTag=__tag9.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag9);
                    __tag9.release();
                    _bw.write(_wl_block101Bytes, _wl_block101);

                    if (_jsp__tag33(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block102Bytes, _wl_block102);
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

    private boolean _jsp__tag1(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.fsm.ship.web.taglib.page.TransientTag __tag1 = null ;
        int __result__tag1 = 0 ;

        if (__tag1 == null ){
            __tag1 = new  com.fedex.fsm.ship.web.taglib.page.TransientTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag1);
        }
        __tag1.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag1, parent);
        _activeTag=__tag1;
        __result__tag1 = __tag1.doStartTag();

        if (__result__tag1!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag1== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.page.TransientTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
        __tag2.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("app.name", java.lang.String.class,"key"));
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
        __tag3.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("app.title.confirmation", java.lang.String.class,"key"));
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
        __tag6.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.pendingshipment.cancelAlert", java.lang.String.class,"key"));
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
        __tag13.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.alertWithColon", java.lang.String.class,"key"));
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
        __tag14.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ada.cancelbuttonyes", java.lang.String.class,"key"));
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
        __tag15.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("button.yes", java.lang.String.class,"key"));
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
        __tag16.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ada.cancelbuttonno", java.lang.String.class,"key"));
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
        __tag17.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("button.no", java.lang.String.class,"key"));
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
        __tag19.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.printerMessage", java.lang.String.class,"key"));
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
        __tag20.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("button.print", java.lang.String.class,"key"));
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

    private boolean _jsp__tag23(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag23 = null ;
        int __result__tag23 = 0 ;

        if (__tag23 == null ){
            __tag23 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag23);
        }
        __tag23.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag23, parent);
        __tag23.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
        __tag23.setFile(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fsm_common_all.js", java.lang.String.class,"file"));
        __tag23.setLanguage(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("true", java.lang.String.class,"language"));
        _activeTag=__tag23;
        __result__tag23 = __tag23.doStartTag();

        if (__result__tag23!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag23== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.component.ScriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag24 = null ;
        int __result__tag24 = 0 ;

        if (__tag24 == null ){
            __tag24 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag24);
        }
        __tag24.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag24, parent);
        __tag24.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
        __tag24.setFile(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fsm_common_all_intl_langDep.js", java.lang.String.class,"file"));
        __tag24.setMinified(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("false", java.lang.String.class,"minified"));
        __tag24.setLanguage(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("true", java.lang.String.class,"language"));
        _activeTag=__tag24;
        __result__tag24 = __tag24.doStartTag();

        if (__result__tag24!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag24== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.component.ScriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag25 = null ;
        int __result__tag25 = 0 ;

        if (__tag25 == null ){
            __tag25 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag25);
        }
        __tag25.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag25, parent);
        __tag25.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
        __tag25.setFile(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fsm_showHideNonSafari.js", java.lang.String.class,"file"));
        _activeTag=__tag25;
        __result__tag25 = __tag25.doStartTag();

        if (__result__tag25!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag25== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.component.ScriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag26 = null ;
        int __result__tag26 = 0 ;

        if (__tag26 == null ){
            __tag26 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag26);
        }
        __tag26.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag26, parent);
        __tag26.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
        __tag26.setFile(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fsm_confirm.js", java.lang.String.class,"file"));
        __tag26.setMinified(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("false", java.lang.String.class,"minified"));
        _activeTag=__tag26;
        __result__tag26 = __tag26.doStartTag();

        if (__result__tag26!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag26== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.component.ScriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag27 = null ;
        int __result__tag27 = 0 ;

        if (__tag27 == null ){
            __tag27 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag27);
        }
        __tag27.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag27, parent);
        __tag27.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
        __tag27.setFile(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("fsm_util.js", java.lang.String.class,"file"));
        __tag27.setMinified(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("false", java.lang.String.class,"minified"));
        _activeTag=__tag27;
        __result__tag27 = __tag27.doStartTag();

        if (__result__tag27!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag27== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.component.ScriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
        __tag31.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("/css", java.lang.String.class,"dir"));
        __tag31.setFile(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("s_code-min.js", java.lang.String.class,"file"));
        __tag31.setVersioned(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("false", java.lang.String.class,"versioned"));
        __tag31.setMinified(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("false", java.lang.String.class,"minified"));
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

    private boolean _jsp__tag33(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.fsm.ship.web.taglib.page.TransientTag __tag33 = null ;
        int __result__tag33 = 0 ;

        if (__tag33 == null ){
            __tag33 = new  com.fedex.fsm.ship.web.taglib.page.TransientTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag33);
        }
        __tag33.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag33, parent);
        _activeTag=__tag33;
        __result__tag33 = __tag33.doStartTag();

        if (__result__tag33!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag33== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.page.TransientTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
}
