package md5b88113e838defbc6e893e84132b103bb;


public class NonScrollableListView_GlobalLayoutListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnGlobalLayoutListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGlobalLayout:()V:GetOnGlobalLayoutHandler:Android.Views.ViewTreeObserver/IOnGlobalLayoutListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Intersoft.Crosslight.Android.NonScrollableListView+GlobalLayoutListener, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", NonScrollableListView_GlobalLayoutListener.class, __md_methods);
	}


	public NonScrollableListView_GlobalLayoutListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == NonScrollableListView_GlobalLayoutListener.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.NonScrollableListView+GlobalLayoutListener, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "", this, new java.lang.Object[] {  });
	}

	public NonScrollableListView_GlobalLayoutListener (md5b88113e838defbc6e893e84132b103bb.NonScrollableListView p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == NonScrollableListView_GlobalLayoutListener.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.NonScrollableListView+GlobalLayoutListener, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "Intersoft.Crosslight.Android.NonScrollableListView, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", this, new java.lang.Object[] { p0 });
	}


	public void onGlobalLayout ()
	{
		n_onGlobalLayout ();
	}

	private native void n_onGlobalLayout ();

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
