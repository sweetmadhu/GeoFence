package md5b88113e838defbc6e893e84132b103bb;


public class FileCacheObserver
	extends android.os.FileObserver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEvent:(ILjava/lang/String;)V:GetOnEvent_ILjava_lang_String_Handler\n" +
			"";
		mono.android.Runtime.register ("Intersoft.Crosslight.Android.FileCacheObserver, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", FileCacheObserver.class, __md_methods);
	}


	public FileCacheObserver (java.lang.String p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == FileCacheObserver.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.FileCacheObserver, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "System.String, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0 });
	}


	public FileCacheObserver (java.lang.String p0, int p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == FileCacheObserver.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.FileCacheObserver, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "System.String, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:Android.OS.FileObserverEvents, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public void onEvent (int p0, java.lang.String p1)
	{
		n_onEvent (p0, p1);
	}

	private native void n_onEvent (int p0, java.lang.String p1);

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
