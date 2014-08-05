package com.alorma.github.ui.fragment.base;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alorma.github.R;

/**
 * Created by Bernat on 05/08/2014.
 */
public abstract class LoadingListFragment extends ListFragment implements SwipeRefreshLayout.OnRefreshListener {

    protected TextView emptyText;
    protected ImageView emptyIcon;
    protected View emptyLy;
    protected SwipeRefreshLayout swipe;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(R.layout.list_fragment, null, false);

        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        swipe = (SwipeRefreshLayout) view.findViewById(R.id.swipe);
        emptyIcon = (ImageView) view.findViewById(R.id.emptyIcon);
        emptyText = (TextView) view.findViewById(R.id.emptyText);
        emptyLy = view.findViewById(R.id.emptyLayout);

        swipe.setColorSchemeResources(R.color.accentDark,
                R.color.complementary,
                R.color.accentDark,
                R.color.gray_github_dark);
        swipe.setOnRefreshListener(this);

    }
}