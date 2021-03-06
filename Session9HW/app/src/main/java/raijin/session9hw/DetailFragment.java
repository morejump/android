package raijin.session9hw;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {


    public DetailFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        Bundle bundle = this.getArguments();
        TextView nameText = (TextView)view.findViewById(R.id.fr_nametext);
        TextView ageText = (TextView)view.findViewById(R.id.fr_agetext);
        TextView phoneText = (TextView)view.findViewById(R.id.fr_phonetext);
        TextView addressText = (TextView)view.findViewById(R.id.fr_addresstext);
        TextView genderText = (TextView)view.findViewById(R.id.fr_gendertext);
        nameText.setText("Name: " + bundle.getString("name"));
        ageText.setText("Age: " + bundle.getString("age"));
        phoneText.setText("Phone: " + bundle.getString("phone"));
        addressText.setText("Address: " + bundle.getString("address"));
        genderText.setText("Gender: " + bundle.getString("gender"));
        return view;
    }

}
