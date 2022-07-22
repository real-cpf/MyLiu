// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package demo.proxies;

public class DemoEntity
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject demoEntityMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Demo.DemoEntity";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		A("A"),
		B("B"),
		DemoEntity_DataWay("Demo.DemoEntity_DataWay");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public DemoEntity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected DemoEntity(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject demoEntityMendixObject)
	{
		if (demoEntityMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, demoEntityMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.demoEntityMendixObject = demoEntityMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DemoEntity.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static demo.proxies.DemoEntity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return demo.proxies.DemoEntity.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static demo.proxies.DemoEntity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new demo.proxies.DemoEntity(context, mendixObject);
	}

	public static demo.proxies.DemoEntity load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return demo.proxies.DemoEntity.initialize(context, mendixObject);
	}

	public static java.util.List<demo.proxies.DemoEntity> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> demo.proxies.DemoEntity.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of A
	 */
	public final java.lang.String getA()
	{
		return getA(getContext());
	}

	/**
	 * @param context
	 * @return value of A
	 */
	public final java.lang.String getA(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.A.toString());
	}

	/**
	 * Set value of A
	 * @param a
	 */
	public final void setA(java.lang.String a)
	{
		setA(getContext(), a);
	}

	/**
	 * Set value of A
	 * @param context
	 * @param a
	 */
	public final void setA(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String a)
	{
		getMendixObject().setValue(context, MemberNames.A.toString(), a);
	}

	/**
	 * @return value of B
	 */
	public final java.lang.String getB()
	{
		return getB(getContext());
	}

	/**
	 * @param context
	 * @return value of B
	 */
	public final java.lang.String getB(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.B.toString());
	}

	/**
	 * Set value of B
	 * @param b
	 */
	public final void setB(java.lang.String b)
	{
		setB(getContext(), b);
	}

	/**
	 * Set value of B
	 * @param context
	 * @param b
	 */
	public final void setB(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String b)
	{
		getMendixObject().setValue(context, MemberNames.B.toString(), b);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of DemoEntity_DataWay
	 */
	public final dataauth.proxies.DataWay getDemoEntity_DataWay() throws com.mendix.core.CoreException
	{
		return getDemoEntity_DataWay(getContext());
	}

	/**
	 * @param context
	 * @return value of DemoEntity_DataWay
	 * @throws com.mendix.core.CoreException
	 */
	public final dataauth.proxies.DataWay getDemoEntity_DataWay(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		dataauth.proxies.DataWay result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DemoEntity_DataWay.toString());
		if (identifier != null) {
			result = dataauth.proxies.DataWay.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of DemoEntity_DataWay
	 * @param demoentity_dataway
	 */
	public final void setDemoEntity_DataWay(dataauth.proxies.DataWay demoentity_dataway)
	{
		setDemoEntity_DataWay(getContext(), demoentity_dataway);
	}

	/**
	 * Set value of DemoEntity_DataWay
	 * @param context
	 * @param demoentity_dataway
	 */
	public final void setDemoEntity_DataWay(com.mendix.systemwideinterfaces.core.IContext context, dataauth.proxies.DataWay demoentity_dataway)
	{
		if (demoentity_dataway == null) {
			getMendixObject().setValue(context, MemberNames.DemoEntity_DataWay.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.DemoEntity_DataWay.toString(), demoentity_dataway.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return demoEntityMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final demo.proxies.DemoEntity that = (demo.proxies.DemoEntity) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
