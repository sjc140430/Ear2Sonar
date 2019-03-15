package jsp_servlet._jsp;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fedex.fsm.ship.common.vo.user.UserProfileVO;
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.web.constants.AppIntegrationConstants;
import com.fedex.fsm.ship.web.util.ApplicationPropertyLoader;
import com.fedex.fsm.ship.web.util.WebUtils;
import com.fedex.fsm.ship.web.util.WebShipEnvironment;
import com.fedex.fsm.ship.web.util.VulnerabilityHandler;
import java.util.*;
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.web.util.LoggerFactory;
import com.fedex.fsm.ship.web.util.ApplicationPropertyLoader;

public final class __referencetab extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/ReferenceTab.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/FrameworkJSInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/MinifyInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        return false;
    }
    private weblogic.servlet.jsp.ExpressionInterceptor _jsp_expressionInterceptor = weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.getNonOperExpressionInterceptor();

    private static boolean _WL_ENCODED_BYTES_OK = true;
    private static final java.lang.String _WL_ORIGINAL_ENCODING = "UTF-8".intern();

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

    private static java.lang.String  _wl_block2 ="\r\n\r\n<script>\r\nvar minifiedJSFileSuffix = \"";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\";\r\n</script>";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private static java.lang.String  _wl_block4 ="\r\n<script type=\"text/javascript\" charset=\"utf-8\" src=\"/framework/js/framework";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private static java.lang.String  _wl_block5 =".js\"></script>\r\n";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private static java.lang.String  _wl_block6 ="\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private static java.lang.String  _wl_block7 ="\r\n\t<head>\r\n\t\t<!-- Defect 447104 - Document mode of IE set to the highest supported document mode of the browser -->\r\n\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n\t  \t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">  \r\n\t\r\n\t  \t<link rel=\"stylesheet\" type=\"text/css\" href=\"//images.fedex.com/css/t1/global-wrapper-min.css\" >\r\n\t\t<script>\r\n\t\t\t// for dev stealconfig.js re-mapping\r\n\t\t\tvar steal = {\r\n\t\t\t\tmap: {\r\n\t\t\t\t\t\"*\": {\r\n\t\t\t\t\t\t\"stealconfig.js\": \"/templates/components/apps/contentim/stealconfig.js\"\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\t//env: \"production\",\r\n\t\t\t};\r\n\t\t</script>\r\n\t\t<!-- use the following for actual implmentation -->\r\n\t\t<script src=\"//images.fedex.com/templates/components/libraries/1.2/steal/3.3/steal/steal.production.js\"></script>\r\n\t\t<!-- replace with the following from the above for development  / or debugging purpose due to WADM bugs -->\r\n\t\t<!-- <script src=\"//images.fedex.com/templates/components/libraries/1.2/steal/3.3/steal/steal.js\"></script>-->\r\n\t\t<!-- <script src=\"//images.fedex.com/templates/components/libraries/1.2/steal/3.3/steal/dev/dev.js\"></script>-->\r\n\t\t<!-- if errors on modal try not to proactively load jmvc.js -->\r\n\t\t<!-- <script src=\"//images.fedex.com/templates/components/libraries/1.2/can/1.1.6/can/jmvc.js\"></script> -->\r\n\t\t\r\n\t\t<script type=\"text/javascript\" charset=\"utf-8\">\t\r\n\t\t\tdocument.domain = \"fedex.com\";\r\n\t\t\tvar companyId = \"";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private static java.lang.String  _wl_block8 ="\";\r\n\t\t\tvar cxs_host = \"";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

    private static java.lang.String  _wl_block9 ="\";\r\n\t\t\tvar type = \"";
    private final static byte[]  _wl_block9Bytes = _getBytes( _wl_block9 );

    private static java.lang.String  _wl_block10 ="\";\r\n\t\t\tvar selectionType = \"";
    private final static byte[]  _wl_block10Bytes = _getBytes( _wl_block10 );

    private static java.lang.String  _wl_block11 ="\";\r\n\t\t\tvar refListKey = \"";
    private final static byte[]  _wl_block11Bytes = _getBytes( _wl_block11 );

    private static java.lang.String  _wl_block12 ="\";\r\n\t\t\t\r\n\t\t\t/*** dev version ***/\r\n\t\t\t/* ****** workaround for local vars\r\n\t\t\t\tL2 Login Credential:- testcompanyadmin\r\n\t\t\t\tL2 AdminUUID: g0g0ggolta\r\n\t\t\t\tL2 CompanyId: 9eaef8052d0840ed933565fbcf3ea322\r\n\t\t\t\tL3 Login Credential:- testcompanyadmin\r\n\t\t\t\tL3 AdminUUID: gw0g0h0dai\r\n\t\t\t\tL3 CompanyId: ecd1015b8f224e6c8c33667706936ff9\r\n\t\t\t*/\r\n\t\t\t\r\n\t\t\t/*\r\n\t\t\t//steal(\'stealconfig.js\');\r\n\t\t\tsteal.config({\r\n\t\t\t\tmap: {\r\n\t\t\t\t\t\"*\": {\r\n\t\t\t\t\t\t \"stealconfig.js\": \"/templates/components/apps/contentim/stealconfig.js\",\r\n\t\t\t\t\t\t \"steal/dev/dev.js\": \"/templates/components/libraries/1.2/steal/3.3/steal/dev/dev.js\",\r\n\t                     \"can\": \"/templates/components/libraries/1.2/can/1.1.6/can\",\r\n\t                     \"jquerypp\": \"/templates/components/libraries/1.2/jquerypp/1.0.1/jquerypp\",\r\n\t                     \"jquery/jquery.js\": \"/templates/components/libraries/1.2/can/1.1.6/can/lib/jquery.1.9.1.js\",\r\n\t                     \"wcon\": \"/wcon\",\r\n\t                     \"wdrp\": \"/locate\",\r\n\t                     \"rates\": \"/rates\",\r\n\t                     \"rates/production.css\": \"rates/production.hprm.css\",\r\n\t                     \"wdrp/temp/production.css\": \"/locate/production.wdrp.lite.css\",\r\n\t                     \"onlineclaims\": \"/onlineclaims\",\r\n\t                     \"shipadmin\": \"/shipadmin\",\r\n\t                     \"modalWindow/modalWindow.js\": \"/templates/components/libraries/1.1/plugins/modalWindow/1.0/jquery.modalWindow.min.js\",\r\n\t         \t\t\t \"hinter\": \"/templates/components/libraries/1.1/plugins/modalWindow/1.0/jquery.modalWindow.min.js\",\r\n\t         \t\t\t \"dateInput\": \"/templates/components/libraries/1.2/dateinput/1.3.0/jquery.dateinput.js\"\r\n\t\t\t\t\t}\r\n\t\t\t\t},\r\n\t\t\t\tshim: {\r\n\t\t\t\t\tjquery: {\r\n\t\t\t\t\t\texports: \"jQuery\"\r\n\t\t\t\t\t},\r\n\t\t\t\t\t\"modalWindow\" :{\r\n\t\t\t\t\t\tdeps: [\"jquery/jquery.js\"]\r\n\t\t\t\t\t},\r\n\t\t\t\t\t\"/templates/components/libraries/1.1/plugins/modalWindow/1.0/jquery.modalWindow.min.js\" :{\r\n\t\t\t\t\t\tdeps: [\"jquery/jquery.js\"]\r\n\t\t\t\t\t}//,\r\n\t\t\t\t\t//\"referencetabs/referencetabs.js\" : { deps: [ \'can/jmvc.js\' ] }\r\n\t\t\t\t},\r\n\t\t\t\text: {\r\n\t\t              js: \"js\",\r\n\t\t              css: \"css\",\r\n\t\t              ejs: \"can/view/ejs\",\r\n\t\t              mustache: \"can/view/mustache\"\r\n\t\t       }\r\n\t\t\t});\r\n\t\t\tsteal.config(\'root\').path = \'/\';\r\n\t\t\tsteal.config(\'root\').host = \"hkitpahq791707w.corp.ds.fedex.com\";\r\n\t\t\t*/\r\n\t\t\t\r\n\t\t\tvar complete_cxs_host = \"https://\"+cxs_host+\"/\";\r\n\t\t\tsteal.config(\"root\",complete_cxs_host);\r\n\t\t\tsteal(\"/shipadmin/refpackage/production.js\", function(rt) {\r\n\t\t\t\tnew ReferenceTabs(\"#referenceTabs\",{\r\n                    clientId: \"INET\",\r\n                    companyId: companyId,\r\n                    refListKey:refListKey,\r\n                    selectionType:selectionType,\r\n                    returnCallback: function( id ) {\r\n                    \twindow.opener.document.getElementById(type).value = id;\r\n                    \twindow.close();\r\n                    },\r\n                    cancelCallback: function() {}\r\n\t\t\t\t});\r\n\t\t\t});\r\n\t\t</script>\r\n\t</head>\r\n\t<body>\r\n\t\t<div id=\"referenceTabs\"></div>\r\n\t</body>\r\n";
    private final static byte[]  _wl_block12Bytes = _getBytes( _wl_block12 );

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
        response.setHeader("Content-Type", "text/html; charset=UTF-8");
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter)out;
        _bw.setInitCharacterEncoding(_WL_ORIGINAL_ENCODING, _WL_ENCODED_BYTES_OK);
        javax.servlet.jsp.JspWriter _originalOut = out;
        javax.servlet.http.HttpSession session = request.getSession( true );
        try {;
            response.setContentType("text/html; charset=UTF-8");
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
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

            _bw.write(_wl_block2Bytes, _wl_block2);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(minifiedJSFileSuffix), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block3Bytes, _wl_block3);
            _bw.write(_wl_block4Bytes, _wl_block4);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(minifiedFwkFileSuffix), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block5Bytes, _wl_block5);
            _bw.write(_wl_block0Bytes, _wl_block0);
  
	WebShipEnvironment webShipEnvironment = WebUtils.getWebShipEnvironment(request);
	//UserProfileVO userProfileVO = (UserProfileVO) session.getAttribute(WebConstants.SESSION_USER_PROFILE);
	//UserProfileVO userProfileVO = webShipEnvironment.getUserProfileAdapter().getUserProfileVO();
	//String companyId = "9eaef8052d0840ed933565fbcf3ea322";
	String companyId = request.getParameter("companyId");
	String type = request.getParameter("type");
	String selectionType = request.getParameter("selectionType");
	String refListKey = request.getParameter("referenceListKey");
	//String companyId = webShipEnvironment.getUserIdentity().getCompanyId();
	//String wadmReftabsURL = ApplicationPropertyLoader.getInstance().getProperty("WADM_REFTAB_URL");
	String cxs_host = ApplicationPropertyLoader.getInstance().getProperty(AppIntegrationConstants.WCCL_CONTENT_URL);
	
	// if any scripts included - we are just trying to suppress the angle brackets
	// so that script tags will be ignored
	companyId = VulnerabilityHandler.escapeAngleBrackets(companyId);
	type = VulnerabilityHandler.escapeAngleBrackets(type);
	selectionType = VulnerabilityHandler.escapeAngleBrackets(selectionType);
	refListKey = VulnerabilityHandler.escapeAngleBrackets(refListKey);	
	

            _bw.write(_wl_block6Bytes, _wl_block6);
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
                    _bw.write(_wl_block7Bytes, _wl_block7);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(companyId ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block8Bytes, _wl_block8);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(cxs_host), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block9Bytes, _wl_block9);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(type), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block10Bytes, _wl_block10);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(selectionType), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block11Bytes, _wl_block11);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(refListKey), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block12Bytes, _wl_block12);
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
}
