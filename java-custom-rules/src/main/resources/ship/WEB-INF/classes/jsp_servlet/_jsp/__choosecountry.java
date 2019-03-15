package jsp_servlet._jsp;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.web.util.LoggerFactory;
import com.fedex.fsm.ship.web.util.ApplicationPropertyLoader;
import com.fedex.fsm.ship.web.util.CookieHandler;
import com.fedex.fsm.ship.web.decouple.DecoupleState;

public final class __choosecountry extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/ChooseCountry.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block1 ="\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\r\n<HEAD>\r\n<TITLE>FedEx | Ship Manager | Choose Country</TITLE>\r\n<META http-equiv=Content-Type content=\"text/html; charset=windows-1252\">\r\n<LINK REL=\"stylesheet\" HREF=\"https://www.fedex.com/css/fedexmain.css\" TYPE=\"text/css\">\r\n";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\r\n<style id=\"antiClickjack\">body{display:none !important;}</style>\r\n<script language=\"JavaScript\">\r\n\r\nif (self === top) {\r\n\tvar antiClickjack = document.getElementById(\"antiClickjack\");\r\n\tantiClickjack.parentNode.removeChild(antiClickjack);\r\n} else {\r\n\ttop.location = self.location;\r\n}\r\n\r\nfunction submitForm(languageSelected)\r\n{\r\n\tvar form = document.forms[0];\r\n\tform.action = \"";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private static java.lang.String  _wl_block4 ="/shipEntryAction.do?method=doEntry\";\r\n\tform.urlparams.value = form.selectedCountryEN.value;\r\n\tform.submit();\r\n}\r\n\r\n</script></head>\r\n<BODY vLink=#660099 aLink=#ff9933 link=#cc3300 bgColor=#ffffff leftMargin=0 topMargin=0 MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\">\r\n  ";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private static java.lang.String  _wl_block5 ="\r\n    ";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private static java.lang.String  _wl_block6 ="\r\n    <img width=\"5\" height=\"7\" border=\"0\" src=\"";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private static java.lang.String  _wl_block7 ="/images/shared/shared_dot_clear.gif\" alt=\"\"/>\r\n    <META NAME=\"wsstitle\" id=\"wsstitle\" CONTENT=\"choose country\">\r\n    <META NAME=\"wssmlc\" id=\"wssmlc\" CONTENT=\"/fedex/inet\">\r\n    <TABLE cellSpacing=0 cellPadding=0 width=740 border=0>\r\n      <TR vAlign=bottom>\r\n        <TD width=132>\r\n          <img width=\"132\" height=\"50\" border=\"0\" src=\"";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private static java.lang.String  _wl_block8 ="/images/en/fedex_logo.gif\" alt=\"FedEx Corporation Logo\"/>\r\n        </TD>\r\n        <TD width=570>\r\n          <P align=right>\r\n            <img width=\"164\" height=\"43\" src=\"";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

    private static java.lang.String  _wl_block9 ="/images/en/SM_fedex_com.gif\" alt=\"\" border=\"0\"/>\r\n          </P>\r\n        </TD>\r\n      </TR>\r\n      <TR vAlign=top>\r\n        <TD vAlign=bottom width=740 colSpan=2>\r\n          <img width=\"630\" height=\"1\" border=\"0\" alt=\"\" src=\"";
    private final static byte[]  _wl_block9Bytes = _getBytes( _wl_block9 );

    private static java.lang.String  _wl_block10 ="/images/shared/shared_dot_gray.gif\"/>\r\n        </TD>\r\n      </TR>\r\n    </TABLE>\r\n    ";
    private final static byte[]  _wl_block10Bytes = _getBytes( _wl_block10 );

    private static java.lang.String  _wl_block11 ="\r\n    <TABLE cellSpacing=0 cellPadding=0 width=700 border=0>\r\n      <TR>\r\n        <TD class=content vAlign=top align=right width=60>&nbsp;&nbsp;&nbsp;&nbsp;</TD>\r\n        <TD class=contentsmall vAlign=top align=left width=500>\r\n          <BR>\r\n          <H2>Shipping</H2>\r\n          <TABLE border=0>\r\n            <TR>\r\n              <TD class=contentsmall vAlign=center>\r\n                <P>\r\n                  ";
    private final static byte[]  _wl_block11Bytes = _getBytes( _wl_block11 );

    private static java.lang.String  _wl_block12 ="\r\n                 \t";
    private final static byte[]  _wl_block12Bytes = _getBytes( _wl_block12 );

    private static java.lang.String  _wl_block13 =" \r\n                  \t";
    private final static byte[]  _wl_block13Bytes = _getBytes( _wl_block13 );

    private static java.lang.String  _wl_block14 ="\r\n                  ";
    private final static byte[]  _wl_block14Bytes = _getBytes( _wl_block14 );

    private static java.lang.String  _wl_block15 ="\r\n                </P>\r\n              </TD>\r\n              <TD class=contentsmall>\r\n                <P>                </P>\r\n              </TD>\r\n            </TR>\r\n          </TABLE>\r\n    ";
    private final static byte[]  _wl_block15Bytes = _getBytes( _wl_block15 );

    private static java.lang.String  _wl_block16 ="\r\n    <input type=hidden name=\"utype\" value=\"";
    private final static byte[]  _wl_block16Bytes = _getBytes( _wl_block16 );

    private static java.lang.String  _wl_block17 ="\"/>  \t\r\n  ";
    private final static byte[]  _wl_block17Bytes = _getBytes( _wl_block17 );

    private static java.lang.String  _wl_block18 ="\r\n</BODY>\r\n";
    private final static byte[]  _wl_block18Bytes = _getBytes( _wl_block18 );

    private static java.lang.String  _wl_block19 ="\r\n";
    private final static byte[]  _wl_block19Bytes = _getBytes( _wl_block19 );

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
        response.setHeader("Content-Type", "text/html");
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter)out;
        _bw.setInitCharacterEncoding(_WL_ORIGINAL_ENCODING, _WL_ENCODED_BYTES_OK);
        javax.servlet.jsp.JspWriter _originalOut = out;
        javax.servlet.http.HttpSession session = request.getSession( true );
        try {;
            _bw.write(_wl_block0Bytes, _wl_block0);

String contextRoot = request.getContextPath();

            _bw.write(_wl_block1Bytes, _wl_block1);
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
                    _bw.write(_wl_block2Bytes, _wl_block2);
 String locallang = (String) request.getAttribute("locallang"); 
	String useSimulator = request.getParameter("useSimulator");
	String utype =  request.getParameter(WebConstants.USER_TYPE);
	if("Y".equals(useSimulator)){
		session.setAttribute("useSimulator","Y");
	} else if("C".equals(useSimulator)){
		session.setAttribute("useSimulator","C");
	}
	// ITG 135778
	// ITG # 163023 - File:inetAppConfig.properties, Key:LACANSplitEnabled
	// As part of cleanup isLACANSplitEnabled() is no longer exists in DecoupleState.java
    String useNonMinified = request.getParameter(WebConstants.JTYPE);
	String cookieName = WebConstants.JTYPE;
	
	if(WebConstants.Y.equals(useNonMinified)){
	//write cookie
	  CookieHandler.createCookieInResponse(response, cookieName,WebConstants.Y);
	
	}

                    _bw.write(_wl_block3Bytes, _wl_block3);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(request.getContextPath()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block4Bytes, _wl_block4);
                     org.apache.struts.taglib.html.FormTag __tag1 = null ;
                    int __result__tag1 = 0 ;

                    if (__tag1 == null ){
                        __tag1 = new  org.apache.struts.taglib.html.FormTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag1);
                    }
                    __tag1.setPageContext(pageContext);
                    __tag1.setParent(__tag0);
                    __tag1.setAction(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipEntryAction", java.lang.String.class,"action"));
                    _activeTag=__tag1;
                    __result__tag1 = __tag1.doStartTag();

                    if (__result__tag1!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag1== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.html.FormTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block5Bytes, _wl_block5);

                            if (_jsp__tag2(request, response, pageContext, _activeTag, __tag1))
                             return;
                            _bw.write(_wl_block6Bytes, _wl_block6);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextRoot), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block7Bytes, _wl_block7);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextRoot), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block8Bytes, _wl_block8);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextRoot), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block9Bytes, _wl_block9);
                            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextRoot), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                            _bw.write(_wl_block10Bytes, _wl_block10);
                            _bw.write(_wl_block5Bytes, _wl_block5);
                            _bw.write(_wl_block11Bytes, _wl_block11);

                            if (_jsp__tag3(request, response, pageContext, _activeTag, __tag1))
                             return;
                            _bw.write(_wl_block15Bytes, _wl_block15);
                            _bw.write(_wl_block16Bytes, _wl_block16);
                             com.fedex.framework.taglib.encode.HtmlTag __tag4 = null ;
                            int __result__tag4 = 0 ;

                            if (__tag4 == null ){
                                __tag4 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag4);
                            }
                            __tag4.setPageContext(pageContext);
                            __tag4.setParent(__tag1);
                            __tag4.setValue(utype 
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
                            _bw.write(_wl_block17Bytes, _wl_block17);
                        } while (__tag1.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                    }
                    if (__tag1.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag1);
                        return;
                    }
                    _activeTag=__tag1.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag1);
                    __tag1.release();
                    _bw.write(_wl_block18Bytes, _wl_block18);
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
            _bw.write(_wl_block19Bytes, _wl_block19);
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
         org.apache.struts.taglib.html.HiddenTag __tag2 = null ;
        int __result__tag2 = 0 ;

        if (__tag2 == null ){
            __tag2 = new  org.apache.struts.taglib.html.HiddenTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag2);
        }
        __tag2.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag2, parent);
        __tag2.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("", java.lang.String.class,"value"));
        __tag2.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("urlparams", java.lang.String.class,"property"));
        _activeTag=__tag2;
        __result__tag2 = __tag2.doStartTag();

        if (__result__tag2!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag2== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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
         org.apache.struts.taglib.html.SelectTag __tag3 = null ;
        int __result__tag3 = 0 ;

        if (__tag3 == null ){
            __tag3 = new  org.apache.struts.taglib.html.SelectTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag3);
        }
        __tag3.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag3, parent);
        __tag3.setStyleClass(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("contentsmall", java.lang.String.class,"styleClass"));
        __tag3.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("chooseCountryActionForm", java.lang.String.class,"name"));
        __tag3.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("selectedCountryEN", java.lang.String.class,"property"));
        __tag3.setOnchange(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("submitForm()", java.lang.String.class,"onchange"));
        _activeTag=__tag3;
        __result__tag3 = __tag3.doStartTag();

        if (__result__tag3!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag3== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag3.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag3.doInitBody();
                }
                do {
                    _bw.write(_wl_block12Bytes, _wl_block12);
                    _bw.write(_wl_block13Bytes, _wl_block13);
                    {java.lang.String __page ="/html/en/login_countries.html";
                        java.lang.String[][] __queryParams = {};
                        java.lang.String __encoding = request.getCharacterEncoding();
                        if (__encoding == null) __encoding ="ISO-8859-1";

                        if (__queryParams.length == 0 ) pageContext.include(__page, true );
                         else pageContext.include(weblogic.utils.http.HttpParsing.makeURI(__page, __queryParams, __encoding), true );
                    }_bw.write(_wl_block14Bytes, _wl_block14);
                } while (__tag3.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag3== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
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
}
