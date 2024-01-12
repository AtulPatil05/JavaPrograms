package com.prowings.complexCollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UsingMap {

	static Map<String, HashSet<Long>> contactDetails = new HashMap<>();
	static HashSet<Long> ramsPhoneNumbers = new HashSet<>();
	static HashSet<Long> shamsPhoneNumbers = new HashSet<>();

	public static void main(String[] args) {

		ramsPhoneNumbers.add(111122224444l);
		ramsPhoneNumbers.add(555566668888l);
		ramsPhoneNumbers.add(999977773333l);

		shamsPhoneNumbers.add(12121212l);
		shamsPhoneNumbers.add(23232323l);
		shamsPhoneNumbers.add(45454545l);

		contactDetails.put("Ram", ramsPhoneNumbers);
		contactDetails.put("Sham", shamsPhoneNumbers);
		contactDetails.put("Sham", shamsPhoneNumbers);

		Long mobileNum = 45454545l;
		System.out.println(searchContactNameByMobile(mobileNum));
	}

	public static String searchContactNameByMobile(Long mobileNum) {

		System.out.println(mobileNum);
		String key = "";

		Set<Map.Entry<String, HashSet<Long>>> entries = contactDetails.entrySet();

		first: for (Entry<String, HashSet<Long>> entry : entries) {
			HashSet<Long> hsl = entry.getValue();

			for (Long phoneNumber : hsl) {

				if (phoneNumber.equals(mobileNum)) {

					key = entry.getKey() + "'s Mobile Number";
					break first;
				} else
					key = "Invalid Mobile Number";
			}

		}
		return key;
	}
}