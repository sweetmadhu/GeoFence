package md5b88113e838defbc6e893e84132b103bb;


public abstract class ViewPagerActivity_1
	extends md5b88113e838defbc6e893e84132b103bb.FragmentActivity_1
	implements
		mono.android.IGCUserPeer,
		android.support.v4.view.ViewPager.OnPageChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRetainCustomNonConfigurationInstance:()Ljava/lang/Object;:GetOnRetainCustomNonConfigurationInstanceHandler\n" +
			"n_onPageScrollStateChanged:(I)V:GetOnPageScrollStateChanged_IHandler:Android.Support.V4.View.ViewPager/IOnPageChangeListenerInvoker, Xamarin.Android.Support.v4\n" +
			"n_onPageScrolled:(IFI)V:GetOnPageScrolled_IFIHandler:Android.Support.V4.View.ViewPager/IOnPageChangeListenerInvoker, Xamarin.Android.Support.v4\n" +
			"n_onPageSelected:(I)V:GetOnPageSelected_IHandler:Android.Support.V4.View.ViewPager/IOnPageChangeListenerInvoker, Xamarin.Android.Support.v4\n" +
			"";
		mono.android.Runtime.register ("Intersoft.Crosslight.Android.ViewPagerActivity`1, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", ViewPagerActivity_1.class, __md_methods);
	}


	public ViewPagerActivity_1 () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ViewPagerActivity_1.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.ViewPagerActivity`1, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "", this, new java.lang.Object[] {  });
	}

	public ViewPagerActivity_1 (int p0, int p1) throws java.lang.Throwable
	{
		super ();
		if (getClass () == ViewPagerActivity_1.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.ViewPagerActivity`1, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1 });
	}


	public java.lang.Object onRetainCustomNonConfigurationInstance ()
	{
		return n_onRetainCustomNonConfigurationInstance ();
	}

	private native java.lang.Object n_onRetainCustomNonConfigurationInstance ();


	public void onPageScrollStateChanged (int p0)
	{
		n_onPageScrollStateChanged (p0);
	}

	private native void n_onPageScrollStateChanged (int p0);


	public void onPageScrolled (int p0, float p1, int p2)
	{
		n_onPageScrolled (p0, p1, p2);
	}

	private native void n_onPageScrolled (int p0, float p1, int p2);


	public void onPageSelected (int p0)
	{
		n_onPageSelected (p0);
	}

	private native void n_onPageSelected (int p0);

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
