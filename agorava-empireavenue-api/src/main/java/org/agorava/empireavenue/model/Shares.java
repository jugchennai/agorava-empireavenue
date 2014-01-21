/*
 * Copyright 2014 Agorava.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.agorava.empireavenue.model;

/**
 * @author Karthikeyan Annamalai  
 * @since 0.7.0
 */
public class Shares {

    private float commission;
    private boolean success; // buying status
    private int sharesOwned;
    private float bankBalance;
    private float totalCharged;
    private float totalEarned;




    public Shares() {
    }



    public int getSharesOwned() {
        return sharesOwned;
    }

    public void setSharesOwned(int sharesOwned) {
        this.sharesOwned = sharesOwned;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public float getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(float bankBalance) {
        this.bankBalance = bankBalance;
    }

    public float getTotalCharged() {
        return totalCharged;
    }

    public void setTotalCharged(float totalCharged) {
        this.totalCharged = totalCharged;
    }


    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public float getTotalEarned() {
        return totalEarned;
    }

    public void setTotalEarned(float totalEarned) {
        this.totalEarned = totalEarned;
    }


    @Override
    public String toString() {
        return  new StringBuffer().append("Shares [ commission :") .append(commission).append("%").toString();
    }
}
