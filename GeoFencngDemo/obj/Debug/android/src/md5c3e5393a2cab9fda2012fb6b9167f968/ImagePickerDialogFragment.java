package md5c3e5393a2cab9fda2012fb6b9167f968;


public class ImagePickerDialogFragment
	extends md5b88113e838defbc6e893e84132b103bb.DialogFragmentBase
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateDialog:(Landroid/os/Bundle;)Landroid/app/Dialog;:GetOnCreateDialog_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Intersoft.Crosslight.Android.Views.ImagePickerDialogFragment, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", ImagePickerDialogFragment.class, __md_methods);
	}


	public ImagePickerDialogFragment () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ImagePickerDialogFragment.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.Views.ImagePickerDialogFragment, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "", this, new java.lang.Object[] {  });
	}


	public android.app.Dialog onCreateDialog (android.os.Bundle p0)
	{
		return n_onCreateDialog (p0);
	}

	private native android.app.Dialog n_onCreateDialog (android.os.Bundle p0);

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
