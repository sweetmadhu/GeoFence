package md5b88113e838defbc6e893e84132b103bb;


public class AnimationDrawable
	extends android.graphics.drawable.TransitionDrawable
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Intersoft.Crosslight.Android.AnimationDrawable, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", AnimationDrawable.class, __md_methods);
	}


	public AnimationDrawable (android.graphics.drawable.Drawable[] p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == AnimationDrawable.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.AnimationDrawable, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "Android.Graphics.Drawables.Drawable[], Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}

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
