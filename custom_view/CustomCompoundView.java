import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.TextView;

public class CustomCompoundView extends LinearLayout {

    private TextView textView;
    private Button btn;

    public CustomCompoundView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_custom_compound, this, true);
        textView = findViewById(R.id.textView);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(v -> {
            // Handle button click
            textView.setText("Button Clicked!");
        });
    }

    // Custom method to set text
    public void setText(String text) {
        textView.setText(text);
    }
}
