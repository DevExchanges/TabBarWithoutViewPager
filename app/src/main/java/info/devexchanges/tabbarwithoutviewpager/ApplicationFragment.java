package info.devexchanges.tabbarwithoutviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ApplicationFragment extends GameFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void setData() {
        strings.add("Job Search");
        strings.add("Action Launcher 3");
        strings.add("7 Minutes Workout");
        strings.add("Hulu");
        strings.add("Camera 360");
        strings.add("Here");
        strings.add("VLC");
        strings.add("Khan Academy");
        strings.add("Dasher Messenger");
        strings.add("Next Lock Screen");
        strings.add("Google Drive");
    }
}
