package md5b88113e838defbc6e893e84132b103bb;


public class AsyncUtility_b_2
	extends android.os.AsyncTask
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_doInBackground:([Ljava/lang/Object;)Ljava/lang/Object;:GetDoInBackground_arrayLjava_lang_Object_Handler\n" +
			"n_onPostExecute:(Ljava/lang/Object;)V:GetOnPostExecute_Ljava_lang_Object_Handler\n" +
			"n_onCancelled:(Ljava/lang/Object;)V:GetOnCancelled_Ljava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("Intersoft.Crosslight.Android.AsyncUtility+b`2, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", AsyncUtility_b_2.class, __md_methods);
	}


	public AsyncUtility_b_2 () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AsyncUtility_b_2.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.AsyncUtility+b`2, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "", this, new java.lang.Object[] {  });
	}


	public java.lang.Object doInBackground (java.lang.Object[] p0)
	{
		return n_doInBackground (p0);
	}

	private native java.lang.Object n_doInBackground (java.lang.Object[] p0);


	public void onPostExecute (java.lang.Object p0)
	{
		n_onPostExecute (p0);
	}

	private native void n_onPostExecute (java.lang.Object p0);


	public void onCancelled (java.lang.Object p0)
	{
		n_onCancelled (p0);
	}

	private native void n_onCancelled (java.lang.Object p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
