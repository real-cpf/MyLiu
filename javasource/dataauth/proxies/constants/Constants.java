// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package dataauth.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	/**
	 * @deprecated
	 * The default constructor of the Constants class should not be used.
	 * Use the static get methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Constants() {}

	// These are the constants for the DataAuth module

	public static java.lang.String getAuth_End_Str()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("DataAuth.Auth_End_Str");
	}
}