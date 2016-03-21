package ro.pub.cs.systems.eim.lab04.contactsmanage;

import java.util.ArrayList;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ContactsManagerActivity extends Activity {

	EditText edtName, edtEmail,edtPhone, edtAddress, edtTitle, edtCompany, edtWebsite,edtIM;
	Button btnHide,btnSave,btnCancel;
	LinearLayout linear;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contacts_manager);
		Toast.makeText(getApplicationContext(), "aici1", Toast.LENGTH_LONG).show();
		Intent intent = getIntent();
		if(intent==null)
		{
			Toast.makeText(getApplicationContext(), "asa", Toast.LENGTH_LONG).show();
		}
		if (intent != null) {
			
		  String phone = intent.getStringExtra("ro.pub.cs.systems.eim.lab04.contactsmanager.PHONE_NUMBER_KEY");
		  Toast.makeText(getApplicationContext(), "aici2" + phone, Toast.LENGTH_LONG).show();
		  /*if (phone != null) {
		    edtPhone.setText(phone);
		  } else {
		    Toast.makeText(this, "Eroare la deschiderea aplicatiei", Toast.LENGTH_LONG).show();
		  }*/
		}
		
		/*
		btnHide = (Button)findViewById(R.id.idButton);
		btnSave = (Button)findViewById(R.id.idSave);
		btnCancel = (Button)findViewById(R.id.idCancel);
		
		btnHide.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				linear = (LinearLayout)findViewById(R.id.idLinearSecond);
				if(linear.getVisibility()== View.VISIBLE)
				{
					linear.setVisibility(View.GONE);
				}
				else
				{
					linear.setVisibility(View.VISIBLE);
				}
			}
		});
		
		btnSave.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
				intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
				if (edtAddress != null) {
				  intent.putExtra(ContactsContract.Intents.Insert.NAME, edtAddress.getText().toString());
				}
				if (edtPhone != null) {
				  intent.putExtra(ContactsContract.Intents.Insert.PHONE, edtPhone.getText().toString());
				}
				if (edtEmail != null) {
				  intent.putExtra(ContactsContract.Intents.Insert.EMAIL, edtEmail.getText().toString());
				}
				if (edtAddress != null) {
				  intent.putExtra(ContactsContract.Intents.Insert.POSTAL, edtAddress.getText().toString());
				}
				if (edtTitle != null) {
				  intent.putExtra(ContactsContract.Intents.Insert.JOB_TITLE, edtTitle.getText().toString());
				}
				if (edtCompany != null) {
				  intent.putExtra(ContactsContract.Intents.Insert.COMPANY, edtCompany.getText().toString());
				}
				ArrayList<ContentValues> contactData = new ArrayList<ContentValues>();
				
				if (edtWebsite != null) {
				  ContentValues websiteRow = new ContentValues();
				  websiteRow.put(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Website.CONTENT_ITEM_TYPE);
				  websiteRow.put(ContactsContract.CommonDataKinds.Website.URL, edtWebsite.getText().toString());
				  contactData.add(websiteRow);
				}
				if (edtIM != null) {
				  ContentValues imRow = new ContentValues();
				  imRow.put(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Im.CONTENT_ITEM_TYPE);
				  imRow.put(ContactsContract.CommonDataKinds.Im.DATA, edtIM.getText().toString());
				  contactData.add(imRow);
				}
				intent.putParcelableArrayListExtra(ContactsContract.Intents.Insert.DATA, contactData);
				startActivityForResult(intent, 0);
				
			}
		});
		
		btnCancel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				setResult(Activity.RESULT_CANCELED, new Intent());
				
			}
		});
		*/
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contacts_manager, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	/*public void onActivityResult(int requestCode, int resultCode, Intent intent) {
		switch(requestCode) {
		  case 0:
		    setResult(resultCode, new Intent());
		    finish();
		    break;
		  }
		}*/
}
