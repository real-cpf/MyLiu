// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package dataauth.proxies;

public class Group
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject groupMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DataAuth.Group";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Description("Description"),
		Name("Name"),
		Code("Code"),
		Telnet_Group("DataAuth.Telnet_Group"),
		Group_DataWay("DataAuth.Group_DataWay");

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

	public Group(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Group(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject groupMendixObject)
	{
		if (groupMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, groupMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.groupMendixObject = groupMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Group.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static dataauth.proxies.Group initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return dataauth.proxies.Group.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static dataauth.proxies.Group initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new dataauth.proxies.Group(context, mendixObject);
	}

	public static dataauth.proxies.Group load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return dataauth.proxies.Group.initialize(context, mendixObject);
	}

	public static java.util.List<dataauth.proxies.Group> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> dataauth.proxies.Group.initialize(context, obj))
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
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Code
	 */
	public final java.lang.String getCode()
	{
		return getCode(getContext());
	}

	/**
	 * @param context
	 * @return value of Code
	 */
	public final java.lang.String getCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Code.toString());
	}

	/**
	 * Set value of Code
	 * @param code
	 */
	public final void setCode(java.lang.String code)
	{
		setCode(getContext(), code);
	}

	/**
	 * Set value of Code
	 * @param context
	 * @param code
	 */
	public final void setCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String code)
	{
		getMendixObject().setValue(context, MemberNames.Code.toString(), code);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Telnet_Group
	 */
	public final java.util.List<dataauth.proxies.Telnet> getTelnet_Group() throws com.mendix.core.CoreException
	{
		return getTelnet_Group(getContext());
	}

	/**
	 * @param context
	 * @return value of Telnet_Group
	 * @throws com.mendix.core.CoreException
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<dataauth.proxies.Telnet> getTelnet_Group(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<dataauth.proxies.Telnet> result = new java.util.ArrayList<>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Telnet_Group.toString());
		if (valueObject == null) {
			return result;
		}
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject)) {
			result.add(dataauth.proxies.Telnet.initialize(context, mendixObject));
		}
		return result;
	}

	/**
	 * Set value of Telnet_Group
	 * @param telnet_group
	 */
	public final void setTelnet_Group(java.util.List<dataauth.proxies.Telnet> telnet_group)
	{
		setTelnet_Group(getContext(), telnet_group);
	}

	/**
	 * Set value of Telnet_Group
	 * @param context
	 * @param telnet_group
	 */
	public final void setTelnet_Group(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<dataauth.proxies.Telnet> telnet_group)
	{
		var identifiers = telnet_group
			.stream()
			.map(proxyObject -> proxyObject.getMendixObject().getId())
			.collect(java.util.stream.Collectors.toList());
		
		getMendixObject().setValue(context, MemberNames.Telnet_Group.toString(), identifiers);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Group_DataWay
	 */
	public final java.util.List<dataauth.proxies.DataWay> getGroup_DataWay() throws com.mendix.core.CoreException
	{
		return getGroup_DataWay(getContext());
	}

	/**
	 * @param context
	 * @return value of Group_DataWay
	 * @throws com.mendix.core.CoreException
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<dataauth.proxies.DataWay> getGroup_DataWay(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<dataauth.proxies.DataWay> result = new java.util.ArrayList<>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Group_DataWay.toString());
		if (valueObject == null) {
			return result;
		}
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject)) {
			result.add(dataauth.proxies.DataWay.initialize(context, mendixObject));
		}
		return result;
	}

	/**
	 * Set value of Group_DataWay
	 * @param group_dataway
	 */
	public final void setGroup_DataWay(java.util.List<dataauth.proxies.DataWay> group_dataway)
	{
		setGroup_DataWay(getContext(), group_dataway);
	}

	/**
	 * Set value of Group_DataWay
	 * @param context
	 * @param group_dataway
	 */
	public final void setGroup_DataWay(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<dataauth.proxies.DataWay> group_dataway)
	{
		var identifiers = group_dataway
			.stream()
			.map(proxyObject -> proxyObject.getMendixObject().getId())
			.collect(java.util.stream.Collectors.toList());
		
		getMendixObject().setValue(context, MemberNames.Group_DataWay.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return groupMendixObject;
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
			final dataauth.proxies.Group that = (dataauth.proxies.Group) obj;
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
