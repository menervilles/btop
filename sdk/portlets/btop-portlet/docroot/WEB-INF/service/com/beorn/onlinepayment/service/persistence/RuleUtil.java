/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.beorn.onlinepayment.service.persistence;

import com.beorn.onlinepayment.model.Rule;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the rule service. This utility wraps {@link RulePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sebastien Meunier
 * @see RulePersistence
 * @see RulePersistenceImpl
 * @generated
 */
public class RuleUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Rule rule) {
		getPersistence().clearCache(rule);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Rule> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Rule> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Rule> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Rule update(Rule rule, boolean merge)
		throws SystemException {
		return getPersistence().update(rule, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Rule update(Rule rule, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(rule, merge, serviceContext);
	}

	/**
	* Caches the rule in the entity cache if it is enabled.
	*
	* @param rule the rule
	*/
	public static void cacheResult(com.beorn.onlinepayment.model.Rule rule) {
		getPersistence().cacheResult(rule);
	}

	/**
	* Caches the rules in the entity cache if it is enabled.
	*
	* @param rules the rules
	*/
	public static void cacheResult(
		java.util.List<com.beorn.onlinepayment.model.Rule> rules) {
		getPersistence().cacheResult(rules);
	}

	/**
	* Creates a new rule with the primary key. Does not add the rule to the database.
	*
	* @param ruleId the primary key for the new rule
	* @return the new rule
	*/
	public static com.beorn.onlinepayment.model.Rule create(long ruleId) {
		return getPersistence().create(ruleId);
	}

	/**
	* Removes the rule with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ruleId the primary key of the rule
	* @return the rule that was removed
	* @throws com.beorn.onlinepayment.NoSuchRuleException if a rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule remove(long ruleId)
		throws com.beorn.onlinepayment.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(ruleId);
	}

	public static com.beorn.onlinepayment.model.Rule updateImpl(
		com.beorn.onlinepayment.model.Rule rule, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(rule, merge);
	}

	/**
	* Returns the rule with the primary key or throws a {@link com.beorn.onlinepayment.NoSuchRuleException} if it could not be found.
	*
	* @param ruleId the primary key of the rule
	* @return the rule
	* @throws com.beorn.onlinepayment.NoSuchRuleException if a rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule findByPrimaryKey(
		long ruleId)
		throws com.beorn.onlinepayment.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(ruleId);
	}

	/**
	* Returns the rule with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ruleId the primary key of the rule
	* @return the rule, or <code>null</code> if a rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule fetchByPrimaryKey(
		long ruleId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ruleId);
	}

	/**
	* Returns all the rules where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching rules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.beorn.onlinepayment.model.Rule> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the rules where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of rules
	* @param end the upper bound of the range of rules (not inclusive)
	* @return the range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.beorn.onlinepayment.model.Rule> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the rules where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of rules
	* @param end the upper bound of the range of rules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.beorn.onlinepayment.model.Rule> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first rule in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rule
	* @throws com.beorn.onlinepayment.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.beorn.onlinepayment.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first rule in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rule, or <code>null</code> if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last rule in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rule
	* @throws com.beorn.onlinepayment.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.beorn.onlinepayment.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last rule in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rule, or <code>null</code> if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the rules before and after the current rule in the ordered set where uuid = &#63;.
	*
	* @param ruleId the primary key of the current rule
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rule
	* @throws com.beorn.onlinepayment.NoSuchRuleException if a rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule[] findByUuid_PrevAndNext(
		long ruleId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.beorn.onlinepayment.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_PrevAndNext(ruleId, uuid, orderByComparator);
	}

	/**
	* Returns the rule where uuid = &#63; and groupId = &#63; or throws a {@link com.beorn.onlinepayment.NoSuchRuleException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching rule
	* @throws com.beorn.onlinepayment.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.beorn.onlinepayment.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the rule where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching rule, or <code>null</code> if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the rule where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching rule, or <code>null</code> if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Returns all the rules where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching rules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.beorn.onlinepayment.model.Rule> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the rules where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of rules
	* @param end the upper bound of the range of rules (not inclusive)
	* @return the range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.beorn.onlinepayment.model.Rule> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the rules where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of rules
	* @param end the upper bound of the range of rules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.beorn.onlinepayment.model.Rule> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first rule in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rule
	* @throws com.beorn.onlinepayment.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.beorn.onlinepayment.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first rule in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rule, or <code>null</code> if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last rule in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rule
	* @throws com.beorn.onlinepayment.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.beorn.onlinepayment.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last rule in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rule, or <code>null</code> if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the rules before and after the current rule in the ordered set where companyId = &#63;.
	*
	* @param ruleId the primary key of the current rule
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rule
	* @throws com.beorn.onlinepayment.NoSuchRuleException if a rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule[] findByCompanyId_PrevAndNext(
		long ruleId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.beorn.onlinepayment.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(ruleId, companyId,
			orderByComparator);
	}

	/**
	* Returns all the rules where paymentPluginConfigId = &#63;.
	*
	* @param paymentPluginConfigId the payment plugin config ID
	* @return the matching rules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.beorn.onlinepayment.model.Rule> findByPaymentPluginConfigIdId(
		long paymentPluginConfigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPaymentPluginConfigIdId(paymentPluginConfigId);
	}

	/**
	* Returns a range of all the rules where paymentPluginConfigId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param paymentPluginConfigId the payment plugin config ID
	* @param start the lower bound of the range of rules
	* @param end the upper bound of the range of rules (not inclusive)
	* @return the range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.beorn.onlinepayment.model.Rule> findByPaymentPluginConfigIdId(
		long paymentPluginConfigId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPaymentPluginConfigIdId(paymentPluginConfigId, start,
			end);
	}

	/**
	* Returns an ordered range of all the rules where paymentPluginConfigId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param paymentPluginConfigId the payment plugin config ID
	* @param start the lower bound of the range of rules
	* @param end the upper bound of the range of rules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.beorn.onlinepayment.model.Rule> findByPaymentPluginConfigIdId(
		long paymentPluginConfigId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPaymentPluginConfigIdId(paymentPluginConfigId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first rule in the ordered set where paymentPluginConfigId = &#63;.
	*
	* @param paymentPluginConfigId the payment plugin config ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rule
	* @throws com.beorn.onlinepayment.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule findByPaymentPluginConfigIdId_First(
		long paymentPluginConfigId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.beorn.onlinepayment.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPaymentPluginConfigIdId_First(paymentPluginConfigId,
			orderByComparator);
	}

	/**
	* Returns the first rule in the ordered set where paymentPluginConfigId = &#63;.
	*
	* @param paymentPluginConfigId the payment plugin config ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rule, or <code>null</code> if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule fetchByPaymentPluginConfigIdId_First(
		long paymentPluginConfigId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPaymentPluginConfigIdId_First(paymentPluginConfigId,
			orderByComparator);
	}

	/**
	* Returns the last rule in the ordered set where paymentPluginConfigId = &#63;.
	*
	* @param paymentPluginConfigId the payment plugin config ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rule
	* @throws com.beorn.onlinepayment.NoSuchRuleException if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule findByPaymentPluginConfigIdId_Last(
		long paymentPluginConfigId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.beorn.onlinepayment.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPaymentPluginConfigIdId_Last(paymentPluginConfigId,
			orderByComparator);
	}

	/**
	* Returns the last rule in the ordered set where paymentPluginConfigId = &#63;.
	*
	* @param paymentPluginConfigId the payment plugin config ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rule, or <code>null</code> if a matching rule could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule fetchByPaymentPluginConfigIdId_Last(
		long paymentPluginConfigId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPaymentPluginConfigIdId_Last(paymentPluginConfigId,
			orderByComparator);
	}

	/**
	* Returns the rules before and after the current rule in the ordered set where paymentPluginConfigId = &#63;.
	*
	* @param ruleId the primary key of the current rule
	* @param paymentPluginConfigId the payment plugin config ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rule
	* @throws com.beorn.onlinepayment.NoSuchRuleException if a rule with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule[] findByPaymentPluginConfigIdId_PrevAndNext(
		long ruleId, long paymentPluginConfigId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.beorn.onlinepayment.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPaymentPluginConfigIdId_PrevAndNext(ruleId,
			paymentPluginConfigId, orderByComparator);
	}

	/**
	* Returns all the rules.
	*
	* @return the rules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.beorn.onlinepayment.model.Rule> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the rules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of rules
	* @param end the upper bound of the range of rules (not inclusive)
	* @return the range of rules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.beorn.onlinepayment.model.Rule> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the rules.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of rules
	* @param end the upper bound of the range of rules (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of rules
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.beorn.onlinepayment.model.Rule> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the rules where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Removes the rule where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the rule that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.beorn.onlinepayment.model.Rule removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.beorn.onlinepayment.NoSuchRuleException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Removes all the rules where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Removes all the rules where paymentPluginConfigId = &#63; from the database.
	*
	* @param paymentPluginConfigId the payment plugin config ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPaymentPluginConfigIdId(
		long paymentPluginConfigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPaymentPluginConfigIdId(paymentPluginConfigId);
	}

	/**
	* Removes all the rules from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of rules where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the number of rules where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of rules where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns the number of rules where paymentPluginConfigId = &#63;.
	*
	* @param paymentPluginConfigId the payment plugin config ID
	* @return the number of matching rules
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPaymentPluginConfigIdId(long paymentPluginConfigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPaymentPluginConfigIdId(paymentPluginConfigId);
	}

	/**
	* Returns the number of rules.
	*
	* @return the number of rules
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RulePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RulePersistence)PortletBeanLocatorUtil.locate(com.beorn.onlinepayment.service.ClpSerializer.getServletContextName(),
					RulePersistence.class.getName());

			ReferenceRegistry.registerReference(RuleUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(RulePersistence persistence) {
	}

	private static RulePersistence _persistence;
}