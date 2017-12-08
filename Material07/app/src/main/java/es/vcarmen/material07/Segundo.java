package es.vcarmen.material07;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewFragment;

/**
 * Created by matinal on 17/11/2017.
 */

public class Segundo extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_segundo, container, false);
        WebView navegador = view.findViewById(R.id.webview);
        navegador.setWebViewClient(new WebViewClient());
        navegador.loadUrl("https://twitter.com/angelmillanjaen");
        navegador.getSettings().setJavaScriptEnabled(true);
        navegador.getSettings().setBuiltInZoomControls(true);
        return view;
    }



    public Segundo() {
    }
}
