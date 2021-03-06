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

package com.beorn.onlinepayment.model.impl;

import com.beorn.onlinepayment.model.PaymentMethod;
import com.beorn.onlinepayment.model.PaymentMethodModel;
import com.beorn.onlinepayment.model.PaymentMethodSoap;

import com.liferay.portal.LocaleException;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * The base model implementation for the PaymentMethod service. Represents a row in the &quot;Payment_PaymentMethod&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.beorn.onlinepayment.model.PaymentMethodModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PaymentMethodImpl}.
 * </p>
 *
 * @author Sebastien Meunier
 * @see PaymentMethodImpl
 * @see com.beorn.onlinepayment.model.PaymentMethod
 * @see com.beorn.onlinepayment.model.PaymentMethodModel
 * @generated
 */
@JSON(strict = true)
public class PaymentMethodModelImpl extends BaseModelImpl<PaymentMethod>
	implements PaymentMethodModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a payment method model instance should use the {@link com.beorn.onlinepayment.model.PaymentMethod} interface instead.
	 */
	public static final String TABLE_NAME = "Payment_PaymentMethod";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "paymentMethodId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "key_", Types.VARCHAR },
			{ "name", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Payment_PaymentMethod (uuid_ VARCHAR(75) null,companyId LONG,groupId LONG,userId LONG,paymentMethodId LONG not null primary key,createDate DATE null,modifiedDate DATE null,key_ VARCHAR(75) null,name STRING null)";
	public static final String TABLE_SQL_DROP = "drop table Payment_PaymentMethod";
	public static final String ORDER_BY_JPQL = " ORDER BY paymentMethod.modifiedDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY Payment_PaymentMethod.modifiedDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.beorn.onlinepayment.model.PaymentMethod"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.beorn.onlinepayment.model.PaymentMethod"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.beorn.onlinepayment.model.PaymentMethod"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long KEY_COLUMN_BITMASK = 4L;
	public static long UUID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static PaymentMethod toModel(PaymentMethodSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		PaymentMethod model = new PaymentMethodImpl();

		model.setUuid(soapModel.getUuid());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setPaymentMethodId(soapModel.getPaymentMethodId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setKey(soapModel.getKey());
		model.setName(soapModel.getName());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<PaymentMethod> toModels(PaymentMethodSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<PaymentMethod> models = new ArrayList<PaymentMethod>(soapModels.length);

		for (PaymentMethodSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final String MAPPING_TABLE_PAYMENT_PAYMENTPLUGIN_PAYMENTMETHOD_NAME =
		"Payment_PaymentPlugin_PaymentMethod";
	public static final Object[][] MAPPING_TABLE_PAYMENT_PAYMENTPLUGIN_PAYMENTMETHOD_COLUMNS =
		{
			{ "paymentPluginId", Types.BIGINT },
			{ "paymentMethodId", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_PAYMENT_PAYMENTPLUGIN_PAYMENTMETHOD_SQL_CREATE =
		"create table Payment_PaymentPlugin_PaymentMethod (paymentPluginId LONG not null,paymentMethodId LONG not null,primary key (paymentPluginId, paymentMethodId))";
	public static final boolean FINDER_CACHE_ENABLED_PAYMENT_PAYMENTPLUGIN_PAYMENTMETHOD =
		GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.Payment_PaymentPlugin_PaymentMethod"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.beorn.onlinepayment.model.PaymentMethod"));

	public PaymentMethodModelImpl() {
	}

	public long getPrimaryKey() {
		return _paymentMethodId;
	}

	public void setPrimaryKey(long primaryKey) {
		setPaymentMethodId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_paymentMethodId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return PaymentMethod.class;
	}

	public String getModelClassName() {
		return PaymentMethod.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("paymentMethodId", getPaymentMethodId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("key", getKey());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long paymentMethodId = (Long)attributes.get("paymentMethodId");

		if (paymentMethodId != null) {
			setPaymentMethodId(paymentMethodId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String key = (String)attributes.get("key");

		if (key != null) {
			setKey(key);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@JSON
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	public long getPaymentMethodId() {
		return _paymentMethodId;
	}

	public void setPaymentMethodId(long paymentMethodId) {
		_paymentMethodId = paymentMethodId;
	}

	@JSON
	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_columnBitmask = -1L;

		_modifiedDate = modifiedDate;
	}

	@JSON
	public String getKey() {
		if (_key == null) {
			return StringPool.BLANK;
		}
		else {
			return _key;
		}
	}

	public void setKey(String key) {
		_columnBitmask |= KEY_COLUMN_BITMASK;

		if (_originalKey == null) {
			_originalKey = _key;
		}

		_key = key;
	}

	public String getOriginalKey() {
		return GetterUtil.getString(_originalKey);
	}

	@JSON
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public String getName(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getName(languageId);
	}

	public String getName(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getName(languageId, useDefault);
	}

	public String getName(String languageId) {
		return LocalizationUtil.getLocalization(getName(), languageId);
	}

	public String getName(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(getName(), languageId,
			useDefault);
	}

	public String getNameCurrentLanguageId() {
		return _nameCurrentLanguageId;
	}

	@JSON
	public String getNameCurrentValue() {
		Locale locale = getLocale(_nameCurrentLanguageId);

		return getName(locale);
	}

	public Map<Locale, String> getNameMap() {
		return LocalizationUtil.getLocalizationMap(getName());
	}

	public void setName(String name) {
		_name = name;
	}

	public void setName(String name, Locale locale) {
		setName(name, locale, LocaleUtil.getDefault());
	}

	public void setName(String name, Locale locale, Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(name)) {
			setName(LocalizationUtil.updateLocalization(getName(), "Name",
					name, languageId, defaultLanguageId));
		}
		else {
			setName(LocalizationUtil.removeLocalization(getName(), "Name",
					languageId));
		}
	}

	public void setNameCurrentLanguageId(String languageId) {
		_nameCurrentLanguageId = languageId;
	}

	public void setNameMap(Map<Locale, String> nameMap) {
		setNameMap(nameMap, LocaleUtil.getDefault());
	}

	public void setNameMap(Map<Locale, String> nameMap, Locale defaultLocale) {
		if (nameMap == null) {
			return;
		}

		Locale[] locales = LanguageUtil.getAvailableLocales();

		for (Locale locale : locales) {
			String name = nameMap.get(locale);

			setName(name, locale, defaultLocale);
		}
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			PaymentMethod.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@SuppressWarnings("unused")
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException {
		setName(getName(defaultImportLocale), defaultImportLocale,
			defaultImportLocale);
	}

	@Override
	public PaymentMethod toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (PaymentMethod)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		PaymentMethodImpl paymentMethodImpl = new PaymentMethodImpl();

		paymentMethodImpl.setUuid(getUuid());
		paymentMethodImpl.setCompanyId(getCompanyId());
		paymentMethodImpl.setGroupId(getGroupId());
		paymentMethodImpl.setUserId(getUserId());
		paymentMethodImpl.setPaymentMethodId(getPaymentMethodId());
		paymentMethodImpl.setCreateDate(getCreateDate());
		paymentMethodImpl.setModifiedDate(getModifiedDate());
		paymentMethodImpl.setKey(getKey());
		paymentMethodImpl.setName(getName());

		paymentMethodImpl.resetOriginalValues();

		return paymentMethodImpl;
	}

	public int compareTo(PaymentMethod paymentMethod) {
		int value = 0;

		value = DateUtil.compareTo(getModifiedDate(),
				paymentMethod.getModifiedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		PaymentMethod paymentMethod = null;

		try {
			paymentMethod = (PaymentMethod)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = paymentMethod.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		PaymentMethodModelImpl paymentMethodModelImpl = this;

		paymentMethodModelImpl._originalUuid = paymentMethodModelImpl._uuid;

		paymentMethodModelImpl._originalCompanyId = paymentMethodModelImpl._companyId;

		paymentMethodModelImpl._setOriginalCompanyId = false;

		paymentMethodModelImpl._originalGroupId = paymentMethodModelImpl._groupId;

		paymentMethodModelImpl._setOriginalGroupId = false;

		paymentMethodModelImpl._originalKey = paymentMethodModelImpl._key;

		paymentMethodModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<PaymentMethod> toCacheModel() {
		PaymentMethodCacheModel paymentMethodCacheModel = new PaymentMethodCacheModel();

		paymentMethodCacheModel.uuid = getUuid();

		String uuid = paymentMethodCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			paymentMethodCacheModel.uuid = null;
		}

		paymentMethodCacheModel.companyId = getCompanyId();

		paymentMethodCacheModel.groupId = getGroupId();

		paymentMethodCacheModel.userId = getUserId();

		paymentMethodCacheModel.paymentMethodId = getPaymentMethodId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			paymentMethodCacheModel.createDate = createDate.getTime();
		}
		else {
			paymentMethodCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			paymentMethodCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			paymentMethodCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		paymentMethodCacheModel.key = getKey();

		String key = paymentMethodCacheModel.key;

		if ((key != null) && (key.length() == 0)) {
			paymentMethodCacheModel.key = null;
		}

		paymentMethodCacheModel.name = getName();

		String name = paymentMethodCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			paymentMethodCacheModel.name = null;
		}

		return paymentMethodCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", paymentMethodId=");
		sb.append(getPaymentMethodId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", key=");
		sb.append(getKey());
		sb.append(", name=");
		sb.append(getName());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.beorn.onlinepayment.model.PaymentMethod");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>paymentMethodId</column-name><column-value><![CDATA[");
		sb.append(getPaymentMethodId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>key</column-name><column-value><![CDATA[");
		sb.append(getKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = PaymentMethod.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			PaymentMethod.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private String _userUuid;
	private long _paymentMethodId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _key;
	private String _originalKey;
	private String _name;
	private String _nameCurrentLanguageId;
	private long _columnBitmask;
	private PaymentMethod _escapedModelProxy;
}