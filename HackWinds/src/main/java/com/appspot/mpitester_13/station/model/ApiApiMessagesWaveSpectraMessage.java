/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2017-11-07 19:12:12 UTC)
 * on 2017-11-12 at 01:28:45 UTC 
 * Modify at your own risk.
 */

package com.appspot.mpitester_13.station.model;

/**
 * Model definition for ApiApiMessagesWaveSpectraMessage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the station. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApiApiMessagesWaveSpectraMessage extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Double> angle;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Double> energy;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Double> frequency;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("seperation_frequency")
  private java.lang.Double seperationFrequency;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Double> getAngle() {
    return angle;
  }

  /**
   * @param angle angle or {@code null} for none
   */
  public ApiApiMessagesWaveSpectraMessage setAngle(java.util.List<java.lang.Double> angle) {
    this.angle = angle;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Double> getEnergy() {
    return energy;
  }

  /**
   * @param energy energy or {@code null} for none
   */
  public ApiApiMessagesWaveSpectraMessage setEnergy(java.util.List<java.lang.Double> energy) {
    this.energy = energy;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Double> getFrequency() {
    return frequency;
  }

  /**
   * @param frequency frequency or {@code null} for none
   */
  public ApiApiMessagesWaveSpectraMessage setFrequency(java.util.List<java.lang.Double> frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getSeperationFrequency() {
    return seperationFrequency;
  }

  /**
   * @param seperationFrequency seperationFrequency or {@code null} for none
   */
  public ApiApiMessagesWaveSpectraMessage setSeperationFrequency(java.lang.Double seperationFrequency) {
    this.seperationFrequency = seperationFrequency;
    return this;
  }

  @Override
  public ApiApiMessagesWaveSpectraMessage set(String fieldName, Object value) {
    return (ApiApiMessagesWaveSpectraMessage) super.set(fieldName, value);
  }

  @Override
  public ApiApiMessagesWaveSpectraMessage clone() {
    return (ApiApiMessagesWaveSpectraMessage) super.clone();
  }

}
