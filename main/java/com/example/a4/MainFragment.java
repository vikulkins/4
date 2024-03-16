package com.example.a4;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
public class MainFragment extends Fragment {
    Button button_choreo, button_style;
    public MainFragment() {
        super(R.layout.fragment_main);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button_choreo = (Button) getActivity().findViewById(R.id.button_choreo);
        button_style = (Button) getActivity().findViewById(R.id.button_style);

        button_choreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragment_main_container_view,
                                SecondFragment.class, null, "Second Fragment")
                        .commit();
            }
        });

        button_style.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragment_main_container_view,
                                ThirdFragment.class, null, "Third Fragment")
                        .commit();
            }
        });
    }
}