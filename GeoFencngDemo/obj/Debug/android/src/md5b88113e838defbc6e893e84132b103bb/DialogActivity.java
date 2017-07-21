package md5b88113e838defbc6e893e84132b103bb;


public class DialogActivity
	extends md5b88113e838defbc6e893e84132b103bb.FragmentActivity_1
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onRetainCustomNonConfigurationInstance:()Ljava/lang/Object;:GetOnRetainCustomNonConfigurationInstanceHandler\n" +
			"n_finish:()V:GetFinishHandler\n" +
			"";
		mono.android.Runtime.register ("Intersoft.Crosslight.Android.DialogActivity, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", DialogActivity.class, __md_methods);
	}


	public DialogActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == DialogActivity.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.DialogActivity, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "", this, new java.lang.Object[] {  });
	}

	public DialogActivity (int p0, int p1) throws java.lang.Throwable
	{
		super ();
		if (getClass () == DialogActivity.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.DialogActivity, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1 });
	}


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);


	public java.lang.Object onRetainCustomNonConfigurationInstance ()
	{
		return n_onRetainCustomNonConfigurationInstance ();
	}

	private native java.lang.Object n_onRetainCustomNonConfigurationInstance ();


	public void finish ()
	{
		n_finish ();
	}

	private native void n_finish ();

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
