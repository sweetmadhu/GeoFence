package md552200800bc0bca8540a56d51e80a52b8;


public class StripPageIndicator_a
	extends android.view.View.BaseSavedState
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_writeToParcel:(Landroid/os/Parcel;I)V:GetWriteToParcel_Landroid_os_Parcel_IHandler\n" +
			"";
		mono.android.Runtime.register ("Intersoft.Crosslight.Android.Controls.StripPageIndicator+a, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", StripPageIndicator_a.class, __md_methods);
	}


	public StripPageIndicator_a (android.os.Parcel p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == StripPageIndicator_a.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.Controls.StripPageIndicator+a, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "Android.OS.Parcel, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public StripPageIndicator_a (android.os.Parcelable p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == StripPageIndicator_a.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.Controls.StripPageIndicator+a, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "Android.OS.IParcelable, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public void writeToParcel (android.os.Parcel p0, int p1)
	{
		n_writeToParcel (p0, p1);
	}

	private native void n_writeToParcel (android.os.Parcel p0, int p1);

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
