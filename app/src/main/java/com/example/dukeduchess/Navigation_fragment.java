package com.example.dukeduchess;
import android.os.Bundle;
import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.navigation.NavigationView;
import static com.example.dukeduchess.MainActivity.progressBar;
import static com.example.dukeduchess.MainActivity.progressDialog;
import static com.example.dukeduchess.MainActivity.webView;

public class Navigation_fragment extends BottomSheetDialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_navigation_fragment, container, false);
        NavigationView navigationView=view.findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {

                    case R.id.wow:{
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/wow/");
                        break;
                    }
                    case R.id.tibolli:{
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/tibolli/");
                        break;
                    }
                    case R.id.babycare:{
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/body-care/");
                        break;
                    }
                    case R.id.ricfeel:{
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/richfeel/");
                        break;
                    }
                    case R.id.proarte:{
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/proarte/");
                        break;
                    }
                    case R.id.plum:{
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/plum/");
                        break;
                    }
                    case R.id.oplus:{
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/o3/");
                        break;
                    }
                    case R.id.mocrocaniol:{
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/moroccan-oil/");
                        break;
                    }
                    case R.id.maybeline:{
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/maybelline/");
                        break;
                    }
                    case R.id.mamearth:{
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/mamaearth/");
                        break;
                    }
                    case R.id.lotus:{
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/lotus/");
                        break;
                    }
                    case R.id.Loreal:{
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/loreal/");
                        break;
                    }
                    case R.id.kerylon:{
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/kryolan/");
                        break;
                    }
                    case R.id.jonnnot:{
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/jeannot/");
                        break;
                    }
                    case R.id.ikonic:{
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/ikonic/");
                        break;
                    }
                    case R.id.Gubb: {
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/gubb/");
                        break;
                    }
                    case R.id.profiessinal: {
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/gk/");
                        break;
                    }
                    case R.id.aroma: {
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/aroma/");
                        break;
                    }
                    case R.id.Amzon_series: {
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/brands/amazon/");
                        break;
                    }
                    case R.id.accessories: {
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/accessories/");
                        break;
                    }
                    case R.id.map_up: {
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/make-up/");
                        break;
                    }
                    case R.id.Momandbaby: {
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/mom-baby/");
                        break;
                    }
                    case R.id.skin_care: {
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/skin-care/");
                        break;
                    }
                    case R.id.personal_care: {
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/personal-care/");
                        break;
                    }
                    case R.id.hair_care: {
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/hair-care/");
                        break;
                    }
                    case R.id.ser:
                        {
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/services/");
                        break;
                    }

                    case R.id.pro:
                    {
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/shop/");
                        break;
                    }
                    case R.id.more_pro:
                    {
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/product-category/more-products/");
                        break;
                    }


                    case R.id.contact:
                    {
                        webView.setWebChromeClient(new WebChromeClient(){
                            @Override
                            public void onProgressChanged(WebView view, int newProgress) {
                                progressBar.setVisibility(View.VISIBLE);
                                progressBar.setProgress(newProgress);
                                progressDialog.show();
                                progressDialog.setTitle("Loading...");
                                if (progressBar.getProgress() == 100) {
                                    progressDialog.cancel();
                                    progressBar.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                        webView.loadUrl("https://www.dukenduchess.in/contact-us/");
                        break;
                    }
                    default:
                        throw new IllegalStateException("Unexpected value: " + item.getItemId());
                }
                return true;
            }
        });
        return view;
    }
}