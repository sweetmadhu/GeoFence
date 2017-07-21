package md565a00a452ad3f063894ba63d1bc51119;


public class StickyViewPager
	extends android.support.v4.view.ViewPager
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnInterceptTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onInterceptHoverEvent:(Landroid/view/MotionEvent;)Z:GetOnInterceptHoverEvent_Landroid_view_MotionEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("com.refractored.monodroidtoolkit.StickyViewPager, com.refractored.monodroidtoolkit, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", StickyViewPager.class, __md_methods);
	}


	public StickyViewPager (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == StickyViewPager.class)
			mono.android.TypeManager.Activate ("com.refractored.monodroidtoolkit.StickyViewPager, com.refractored.monodroidtoolkit, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public StickyViewPager (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == StickyViewPager.class)
			mono.android.TypeManager.Activate ("com.refractored.monodroidtoolkit.StickyViewPager, com.refractored.monodroidtoolkit, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public boolean onInterceptTouchEvent (android.view.MotionEvent p0)
	{
		return n_onInterceptTouchEvent (p0);
	}

	private native boolean n_onInterceptTouchEvent (android.view.MotionEvent p0);


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);


	public boolean onInterceptHoverEvent (android.view.MotionEvent p0)
	{
		return n_onInterceptHoverEvent (p0);
	}

	private native boolean n_onInterceptHoverEvent (android.view.MotionEvent p0);

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
