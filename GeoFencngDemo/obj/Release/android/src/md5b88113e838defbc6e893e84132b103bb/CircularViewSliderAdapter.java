package md5b88113e838defbc6e893e84132b103bb;


public class CircularViewSliderAdapter
	extends android.support.v4.view.PagerAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getCount:()I:GetGetCountHandler\n" +
			"n_instantiateItem:(Landroid/view/ViewGroup;I)Ljava/lang/Object;:GetInstantiateItem_Landroid_view_ViewGroup_IHandler\n" +
			"n_destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V:GetDestroyItem_Landroid_view_ViewGroup_ILjava_lang_Object_Handler\n" +
			"n_finishUpdate:(Landroid/view/View;)V:GetFinishUpdate_Landroid_view_View_Handler\n" +
			"n_isViewFromObject:(Landroid/view/View;Ljava/lang/Object;)Z:GetIsViewFromObject_Landroid_view_View_Ljava_lang_Object_Handler\n" +
			"n_restoreState:(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V:GetRestoreState_Landroid_os_Parcelable_Ljava_lang_ClassLoader_Handler\n" +
			"n_saveState:()Landroid/os/Parcelable;:GetSaveStateHandler\n" +
			"n_startUpdate:(Landroid/view/ViewGroup;)V:GetStartUpdate_Landroid_view_ViewGroup_Handler\n" +
			"n_getPageTitle:(I)Ljava/lang/CharSequence;:GetGetPageTitle_IHandler\n" +
			"n_getPageWidth:(I)F:GetGetPageWidth_IHandler\n" +
			"n_setPrimaryItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V:GetSetPrimaryItem_Landroid_view_ViewGroup_ILjava_lang_Object_Handler\n" +
			"n_unregisterDataSetObserver:(Landroid/database/DataSetObserver;)V:GetUnregisterDataSetObserver_Landroid_database_DataSetObserver_Handler\n" +
			"n_registerDataSetObserver:(Landroid/database/DataSetObserver;)V:GetRegisterDataSetObserver_Landroid_database_DataSetObserver_Handler\n" +
			"n_notifyDataSetChanged:()V:GetNotifyDataSetChangedHandler\n" +
			"n_getItemPosition:(Ljava/lang/Object;)I:GetGetItemPosition_Ljava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("Intersoft.Crosslight.Android.CircularViewSliderAdapter, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", CircularViewSliderAdapter.class, __md_methods);
	}


	public CircularViewSliderAdapter () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CircularViewSliderAdapter.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.CircularViewSliderAdapter, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "", this, new java.lang.Object[] {  });
	}

	public CircularViewSliderAdapter (md5b88113e838defbc6e893e84132b103bb.ViewSliderAdapter p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == CircularViewSliderAdapter.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.CircularViewSliderAdapter, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "Intersoft.Crosslight.Android.ViewSliderAdapter, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", this, new java.lang.Object[] { p0 });
	}


	public int getCount ()
	{
		return n_getCount ();
	}

	private native int n_getCount ();


	public java.lang.Object instantiateItem (android.view.ViewGroup p0, int p1)
	{
		return n_instantiateItem (p0, p1);
	}

	private native java.lang.Object n_instantiateItem (android.view.ViewGroup p0, int p1);


	public void destroyItem (android.view.ViewGroup p0, int p1, java.lang.Object p2)
	{
		n_destroyItem (p0, p1, p2);
	}

	private native void n_destroyItem (android.view.ViewGroup p0, int p1, java.lang.Object p2);


	public void finishUpdate (android.view.View p0)
	{
		n_finishUpdate (p0);
	}

	private native void n_finishUpdate (android.view.View p0);


	public boolean isViewFromObject (android.view.View p0, java.lang.Object p1)
	{
		return n_isViewFromObject (p0, p1);
	}

	private native boolean n_isViewFromObject (android.view.View p0, java.lang.Object p1);


	public void restoreState (android.os.Parcelable p0, java.lang.ClassLoader p1)
	{
		n_restoreState (p0, p1);
	}

	private native void n_restoreState (android.os.Parcelable p0, java.lang.ClassLoader p1);


	public android.os.Parcelable saveState ()
	{
		return n_saveState ();
	}

	private native android.os.Parcelable n_saveState ();


	public void startUpdate (android.view.ViewGroup p0)
	{
		n_startUpdate (p0);
	}

	private native void n_startUpdate (android.view.ViewGroup p0);


	public java.lang.CharSequence getPageTitle (int p0)
	{
		return n_getPageTitle (p0);
	}

	private native java.lang.CharSequence n_getPageTitle (int p0);


	public float getPageWidth (int p0)
	{
		return n_getPageWidth (p0);
	}

	private native float n_getPageWidth (int p0);


	public void setPrimaryItem (android.view.ViewGroup p0, int p1, java.lang.Object p2)
	{
		n_setPrimaryItem (p0, p1, p2);
	}

	private native void n_setPrimaryItem (android.view.ViewGroup p0, int p1, java.lang.Object p2);


	public void unregisterDataSetObserver (android.database.DataSetObserver p0)
	{
		n_unregisterDataSetObserver (p0);
	}

	private native void n_unregisterDataSetObserver (android.database.DataSetObserver p0);


	public void registerDataSetObserver (android.database.DataSetObserver p0)
	{
		n_registerDataSetObserver (p0);
	}

	private native void n_registerDataSetObserver (android.database.DataSetObserver p0);


	public void notifyDataSetChanged ()
	{
		n_notifyDataSetChanged ();
	}

	private native void n_notifyDataSetChanged ();


	public int getItemPosition (java.lang.Object p0)
	{
		return n_getItemPosition (p0);
	}

	private native int n_getItemPosition (java.lang.Object p0);

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
