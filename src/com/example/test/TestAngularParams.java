package com.example.test;

public class TestAngularParams {

	
/**
 * @param paths  数组格式， 引用的js文件路径+名称  ，按照文件的引用放入数组
 * @param params JSON字符串形式，需要的传入js文件的参数,
 * @return 返回字符串形式的js会传到文件进行初始化
 * 
 *	String[] paths = {"scripts/libs/angular.min.js", "scripts/test.js" };
 *	String params = "{'key':'value','key':'value'}";
 *	birthJSByFilePathName(paths,params)
 *	
 *	webView.setWebViewClient(new WebViewClient() {
 *	    @Override
 *      public void onPageStarted(WebView view, String url, Bitmap favicon) {
 *          Log.d("TAG", "ddd");
 *  		String str = new TestAngularParams().birthJSByFilePathName(paths,params);
 *  		view.loadUrl(str); 
 *      }
 *	});
 */
	public String birthJSByFilePathName(String[] paths,String params) {
		StringBuffer str = new StringBuffer("javascript:var devicePara=");
		str.append(params);
		str.append(";(function() {");
		for (int i = 0; i < paths.length; i++) {
			str.append("var scr = document.createElement('script');scr.type = 'text/javascript';scr.src = '");
			str.append(paths[i]);
			str.append("';document.getElementsByTagName('head')[0].appendChild(scr);");
		}
		str.append("})();");
		return str.toString();
	}
}
