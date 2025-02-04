/*
 * This file is part of Hopsworks
 * Copyright (C) 2018, Logical Clocks AB. All rights reserved
 *
 * Hopsworks is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * Hopsworks is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.  See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package io.hops.hopsworks.common.featurestore.settings;

import io.hops.hopsworks.common.featurestore.FeaturestoreConstants;
import io.hops.hopsworks.persistence.entity.featurestore.storageconnector.s3.FeaturestoreS3ConnectorEncryptionAlgorithm;

import javax.json.Json;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * DTO containing the feature store client settings (source of truth for JS client, Python Client, Java Client, and
 * Scala Client to the Feature Store
 */
@XmlRootElement
public class FeaturestoreClientSettingsDTO {
  
  private String featurestoreRegex = FeaturestoreConstants.FEATURESTORE_REGEX.toString();
  private int featurestoreEntityNameMaxLength = FeaturestoreConstants.FEATURESTORE_ENTITY_NAME_MAX_LENGTH;
  private int featurestoreEntityDescriptionMaxLength = FeaturestoreConstants.FEATURESTORE_ENTITY_DESCRIPTION_MAX_LENGTH;
  private int onDemandFeaturegroupSqlQueryMaxLength =
    FeaturestoreConstants.ON_DEMAND_FEATUREGROUP_SQL_QUERY_MAX_LENGTH;
  private int storageConnectorNameMaxLength = FeaturestoreConstants.STORAGE_CONNECTOR_NAME_MAX_LENGTH;
  private int storageConnectorDescriptionMaxLength =
    FeaturestoreConstants.STORAGE_CONNECTOR_DESCRIPTION_MAX_LENGTH;
  private int jdbcStorageConnectorConnectionstringMaxLength =
    FeaturestoreConstants.JDBC_STORAGE_CONNECTOR_CONNECTIONSTRING_MAX_LENGTH;
  private int jdbcStorageConnectorArgumentsMaxLength =
    FeaturestoreConstants.STORAGE_CONNECTOR_ARGUMENTS_MAX_LENGTH;
  private int s3StorageConnectorBucketMaxLength =
    FeaturestoreConstants.S3_STORAGE_CONNECTOR_BUCKET_MAX_LENGTH;
  private int s3StorageConnectorAccesskeyMaxLength =
    FeaturestoreConstants.S3_STORAGE_CONNECTOR_ACCESSKEY_MAX_LENGTH;
  private int s3StorageConnectorSecretkeyMaxLength =
    FeaturestoreConstants.S3_STORAGE_CONNECTOR_SECRETKEY_MAX_LENGTH;
  private int s3StorageServerEncryptionKeyMaxLength =
    FeaturestoreConstants.S3_STORAGE_SERVER_ENCRYPTION_KEY_MAX_LENGTH;
  private boolean s3IAMRole = false;
  private List<String> trainingDatasetDataFormats = FeaturestoreConstants.TRAINING_DATASET_DATA_FORMATS;
  private String jdbcConnectorType = FeaturestoreConstants.JDBC_CONNECTOR_TYPE;
  private String redshiftConnectorType = FeaturestoreConstants.REDSHIFT_CONNECTOR_TYPE;
  private String hopsfsConnectorType = FeaturestoreConstants.HOPSFS_CONNECTOR_TYPE;
  private String s3ConnectorType = FeaturestoreConstants.S3_CONNECTOR_TYPE;
  private String cachedFeaturegroupDtoType = FeaturestoreConstants.CACHED_FEATUREGROUP_DTO_TYPE;
  private String onDemandFeaturegroupDtoType = FeaturestoreConstants.ON_DEMAND_FEATUREGROUP_DTO_TYPE;
  private String hopsfsTrainingDatasetType = FeaturestoreConstants.HOPSFS_TRAINING_DATASET_TYPE;
  private String externalTrainingDatasetType = FeaturestoreConstants.EXTERNAL_TRAINING_DATASET_TYPE;
  private String s3ConnectorDtoType = FeaturestoreConstants.S3_CONNECTOR_DTO_TYPE;
  private String jdbcConnectorDtoType = FeaturestoreConstants.JDBC_CONNECTOR_DTO_TYPE;
  private String redshiftConnectorDtoType = FeaturestoreConstants.REDSHIFT_CONNECTOR_DTO_TYPE;
  private String hopsfsConnectorDtoType = FeaturestoreConstants.HOPSFS_CONNECTOR_DTO_TYPE;
  private String featuregroupType = FeaturestoreConstants.FEATUREGROUP_TYPE;
  private String trainingDatasetType = FeaturestoreConstants.TRAINING_DATASET_TYPE;
  private List<String> suggestedHiveFeatureTypes = FeaturestoreConstants.SUGGESTED_HIVE_FEATURE_TYPES;
  private String s3BucketTrainingDatasetsFolder = FeaturestoreConstants.S3_BUCKET_TRAINING_DATASETS_FOLDER;
  private List<String> featureImportConnectors = FeaturestoreConstants.FEATURE_IMPORT_CONNECTORS;
  private Boolean onlineFeaturestoreEnabled = false;
  private List<String> suggestedMysqlFeatureTypes = FeaturestoreConstants.SUGGESTED_MYSQL_DATA_TYPES;
  private List<String> s3ServerEncryptionAlgorithms;
  
  public FeaturestoreClientSettingsDTO() {
    //For JAXB
  }
  
  @XmlElement
  public String getFeaturestoreRegex() {
    return featurestoreRegex;
  }
  
  public void setFeaturestoreRegex(String featurestoreRegex) {
    this.featurestoreRegex = featurestoreRegex;
  }
  
  @XmlElement
  public int getFeaturestoreEntityNameMaxLength() {
    return featurestoreEntityNameMaxLength;
  }
  
  public void setFeaturestoreEntityNameMaxLength(int featurestoreEntityNameMaxLength) {
    this.featurestoreEntityNameMaxLength = featurestoreEntityNameMaxLength;
  }
  
  @XmlElement
  public int getFeaturestoreEntityDescriptionMaxLength() {
    return featurestoreEntityDescriptionMaxLength;
  }
  
  public void setFeaturestoreEntityDescriptionMaxLength(int featurestoreEntityDescriptionMaxLength) {
    this.featurestoreEntityDescriptionMaxLength = featurestoreEntityDescriptionMaxLength;
  }
  
  @XmlElement
  public int getOnDemandFeaturegroupSqlQueryMaxLength() {
    return onDemandFeaturegroupSqlQueryMaxLength;
  }
  
  public void setOnDemandFeaturegroupSqlQueryMaxLength(int onDemandFeaturegroupSqlQueryMaxLength) {
    this.onDemandFeaturegroupSqlQueryMaxLength = onDemandFeaturegroupSqlQueryMaxLength;
  }
  
  @XmlElement
  public int getStorageConnectorNameMaxLength() {
    return storageConnectorNameMaxLength;
  }
  
  public void setStorageConnectorNameMaxLength(int storageConnectorNameMaxLength) {
    this.storageConnectorNameMaxLength = storageConnectorNameMaxLength;
  }
  
  @XmlElement
  public int getStorageConnectorDescriptionMaxLength() {
    return storageConnectorDescriptionMaxLength;
  }
  
  public void setStorageConnectorDescriptionMaxLength(int storageConnectorDescriptionMaxLength) {
    this.storageConnectorDescriptionMaxLength = storageConnectorDescriptionMaxLength;
  }
  
  @XmlElement
  public int getJdbcStorageConnectorConnectionstringMaxLength() {
    return jdbcStorageConnectorConnectionstringMaxLength;
  }
  
  public void setJdbcStorageConnectorConnectionstringMaxLength(int jdbcStorageConnectorConnectionstringMaxLength) {
    this.jdbcStorageConnectorConnectionstringMaxLength = jdbcStorageConnectorConnectionstringMaxLength;
  }
  
  @XmlElement
  public int getJdbcStorageConnectorArgumentsMaxLength() {
    return jdbcStorageConnectorArgumentsMaxLength;
  }
  
  public void setJdbcStorageConnectorArgumentsMaxLength(int jdbcStorageConnectorArgumentsMaxLength) {
    this.jdbcStorageConnectorArgumentsMaxLength = jdbcStorageConnectorArgumentsMaxLength;
  }

  @XmlElement
  public boolean isS3IAMRole() {
    return s3IAMRole;
  }

  public void setS3IAMRole(boolean s3IAMRole) {
    this.s3IAMRole = s3IAMRole;
  }

  @XmlElement
  public int getS3StorageConnectorBucketMaxLength() {
    return s3StorageConnectorBucketMaxLength;
  }
  
  public void setS3StorageConnectorBucketMaxLength(int s3StorageConnectorBucketMaxLength) {
    this.s3StorageConnectorBucketMaxLength = s3StorageConnectorBucketMaxLength;
  }
  
  @XmlElement
  public int getS3StorageConnectorAccesskeyMaxLength() {
    return s3StorageConnectorAccesskeyMaxLength;
  }
  
  public void setS3StorageConnectorAccesskeyMaxLength(int s3StorageConnectorAccesskeyMaxLength) {
    this.s3StorageConnectorAccesskeyMaxLength = s3StorageConnectorAccesskeyMaxLength;
  }
  
  @XmlElement
  public int getS3StorageConnectorSecretkeyMaxLength() {
    return s3StorageConnectorSecretkeyMaxLength;
  }
  
  public void setS3StorageConnectorSecretkeyMaxLength(int s3StorageConnectorSecretkeyMaxLength) {
    this.s3StorageConnectorSecretkeyMaxLength = s3StorageConnectorSecretkeyMaxLength;
  }
  
  @XmlElement
  public List<String> getTrainingDatasetDataFormats() {
    return trainingDatasetDataFormats;
  }
  
  public void setTrainingDatasetDataFormats(List<String> trainingDatasetDataFormats) {
    this.trainingDatasetDataFormats = trainingDatasetDataFormats;
  }
  
  @XmlElement
  public String getJdbcConnectorType() {
    return jdbcConnectorType;
  }
  
  public void setJdbcConnectorType(String jdbcConnectorType) {
    this.jdbcConnectorType = jdbcConnectorType;
  }
  
  @XmlElement
  public String getRedshiftConnectorType() {
    return redshiftConnectorType;
  }

  public void setRedshiftConnectorType(String redshiftConnectorType) {
    this.redshiftConnectorType = redshiftConnectorType;
  }

  @XmlElement
  public String getHopsfsConnectorType() {
    return hopsfsConnectorType;
  }
  
  public void setHopsfsConnectorType(String hopsfsConnectorType) {
    this.hopsfsConnectorType = hopsfsConnectorType;
  }
  
  @XmlElement
  public String getS3ConnectorType() {
    return s3ConnectorType;
  }
  
  public void setS3ConnectorType(String s3ConnectorType) {
    this.s3ConnectorType = s3ConnectorType;
  }
  
  @XmlElement
  public String getCachedFeaturegroupDtoType() {
    return cachedFeaturegroupDtoType;
  }
  
  public void setCachedFeaturegroupDtoType(String cachedFeaturegroupDtoType) {
    this.cachedFeaturegroupDtoType = cachedFeaturegroupDtoType;
  }
  
  @XmlElement
  public String getOnDemandFeaturegroupDtoType() {
    return onDemandFeaturegroupDtoType;
  }
  
  public void setOnDemandFeaturegroupDtoType(String onDemandFeaturegroupDtoType) {
    this.onDemandFeaturegroupDtoType = onDemandFeaturegroupDtoType;
  }
  
  @XmlElement
  public String getHopsfsTrainingDatasetType() {
    return hopsfsTrainingDatasetType;
  }
  
  public void setHopsfsTrainingDatasetType(String hopsfsTrainingDatasetType) {
    this.hopsfsTrainingDatasetType = hopsfsTrainingDatasetType;
  }
  
  @XmlElement
  public String getExternalTrainingDatasetType() {
    return externalTrainingDatasetType;
  }
  
  public void setExternalTrainingDatasetType(String externalTrainingDatasetType) {
    this.externalTrainingDatasetType = externalTrainingDatasetType;
  }

  @XmlElement
  public String getS3ConnectorDtoType() {
    return s3ConnectorDtoType;
  }
  
  public void setS3ConnectorDtoType(String s3ConnectorDtoType) {
    this.s3ConnectorDtoType = s3ConnectorDtoType;
  }
  
  @XmlElement
  public String getJdbcConnectorDtoType() {
    return jdbcConnectorDtoType;
  }
  
  public void setJdbcConnectorDtoType(String jdbcConnectorDtoType) {
    this.jdbcConnectorDtoType = jdbcConnectorDtoType;
  }
  
  @XmlElement
  public String getRedshiftConnectorDtoType() {
    return redshiftConnectorDtoType;
  }

  public void setRedshiftConnectorDtoType(String redshiftConnectorDtoType) {
    this.redshiftConnectorDtoType = redshiftConnectorDtoType;
  }

  @XmlElement
  public String getHopsfsConnectorDtoType() {
    return hopsfsConnectorDtoType;
  }
  
  public void setHopsfsConnectorDtoType(String hopsfsConnectorDtoType) {
    this.hopsfsConnectorDtoType = hopsfsConnectorDtoType;
  }
  
  @XmlElement
  public String getFeaturegroupType() {
    return featuregroupType;
  }
  
  public void setFeaturegroupType(String featuregroupType) {
    this.featuregroupType = featuregroupType;
  }
  
  @XmlElement
  public String getTrainingDatasetType() {
    return trainingDatasetType;
  }
  
  public void setTrainingDatasetType(String trainingDatasetType) {
    this.trainingDatasetType = trainingDatasetType;
  }
  
  @XmlElement
  public List<String> getSuggestedHiveFeatureTypes() {
    return suggestedHiveFeatureTypes;
  }
  
  public void setSuggestedHiveFeatureTypes(List<String> suggestedHiveFeatureTypes) {
    this.suggestedHiveFeatureTypes = suggestedHiveFeatureTypes;
  }
  
  @XmlElement
  public String getS3BucketTrainingDatasetsFolder() {
    return s3BucketTrainingDatasetsFolder;
  }
  
  public void setS3BucketTrainingDatasetsFolder(String s3BucketTrainingDatasetsFolder) {
    this.s3BucketTrainingDatasetsFolder = s3BucketTrainingDatasetsFolder;
  }
  
  @XmlElement
  public List<String> getFeatureImportConnectors() {
    return featureImportConnectors;
  }
  
  public void setFeatureImportConnectors(List<String> featureImportConnectors) {
    this.featureImportConnectors = featureImportConnectors;
  }
  
  @XmlElement
  public Boolean getOnlineFeaturestoreEnabled() {
    return onlineFeaturestoreEnabled;
  }
  
  public void setOnlineFeaturestoreEnabled(Boolean onlineFeaturestoreEnabled) {
    this.onlineFeaturestoreEnabled = onlineFeaturestoreEnabled;
  }
  
  @XmlElement
  public List<String> getSuggestedMysqlFeatureTypes() {
    return suggestedMysqlFeatureTypes;
  }
  
  public void setSuggestedMysqlFeatureTypes(List<String> suggestedMysqlFeatureTypes) {
    this.suggestedMysqlFeatureTypes = suggestedMysqlFeatureTypes;
  }
  
  @XmlElement
  public int getS3StorageServerEncryptionKeyMaxLength() {
    return s3StorageServerEncryptionKeyMaxLength;
  }
  
  public void setS3StorageServerEncryptionKeyMaxLength(int s3StorageServerEncryptionKeyMaxLength) {
    this.s3StorageServerEncryptionKeyMaxLength = s3StorageServerEncryptionKeyMaxLength;
  }
  
  @XmlElement
  public List<String> getS3ServerEncryptionAlgorithms() {
    List<String> encryptionAlgorithms = new ArrayList<>();
    Arrays.asList(FeaturestoreS3ConnectorEncryptionAlgorithm.values()).stream().forEach(algorithm -> {
      String jsonString = Json.createObjectBuilder()
        .add("algorithm", algorithm.getAlgorithm())
        .add("description", algorithm.getDescription())
        .add("requiresKey", algorithm.isRequiresKey())
        .build().toString();
      encryptionAlgorithms.add(jsonString);
    });
    return encryptionAlgorithms;
  }
}
