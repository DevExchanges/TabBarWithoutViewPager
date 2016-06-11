package info.devexchanges.tabbarwithoutviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BookFragment extends GameFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    protected void setData() {
        strings.add("Gone with the wind");
        strings.add("Kafka on the shore");
        strings.add("Gone girl");
        strings.add("Coffin dancer");
        strings.add("Hannibal rising");
        strings.add("A Study In Scarlet");
        strings.add("Innocent in Death");
        strings.add("Sense And Sensibility");
        strings.add("Revenge Wears Prada");
    }
}
