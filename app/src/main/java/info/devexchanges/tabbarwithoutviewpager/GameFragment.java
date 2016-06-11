package info.devexchanges.tabbarwithoutviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GameFragment extends Fragment {

    protected ArrayList<String> strings;
    private ListView listView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        strings = new ArrayList<>();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_content, container, false);
        listView = (ListView) view.findViewById(R.id.list_view);
        setData();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, strings);
        listView.setAdapter(adapter);

        return view;
    }

    protected void setData() {
        strings.add("Hallo 5");
        strings.add("Call of Duty 3");
        strings.add("CS GO");
        strings.add("FIFA 15");
        strings.add("Assassin Creed 3");
        strings.add("Angry Bird");
        strings.add("Dark Soul");
    }
}
