package co.sdslabs.mdg.sankalp_14;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateEvent extends Activity {

	Button submit;
	EditText title,descr,date,tags;
	String uri= "http://sankalp.host56.com/create_events.php";
	private static String TAG_TITLE = "title";
	private static String TAG_DESCR = "description";
	private static String TAG_DATE = "date";
	private static String TAG_TAGS = "tags";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_event);
		submit = (Button) findViewById(R.id.btSubmit);
		title = (EditText) findViewById(R.id.etTitle);
		descr = (EditText) findViewById(R.id.etDescription);
		date = (EditText) findViewById(R.id.etDate);
		tags = (EditText) findViewById(R.id.etTags);
		
		submit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
					  nameValuePairs.add(new BasicNameValuePair(TAG_TITLE, title.getText().toString()));
					  nameValuePairs.add(new BasicNameValuePair(TAG_DESCR, descr.getText().toString()));
					  nameValuePairs.add(new BasicNameValuePair(TAG_DATE, date.getText().toString()));
					  nameValuePairs.add(new BasicNameValuePair(TAG_TAGS, tags.getText().toString()));
				InternetData id= new InternetData();

				id.postData(uri, nameValuePairs);
				
				title.setText("");
				descr.setText("");
				date.setText("");
				tags.setText("");
				
			}
		});
		
				
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create_event, menu);
		return true;
	}

}
