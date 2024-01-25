package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SampleTest {
	@Nested
	class getColor {
		@Test
		void succes() {
			assertEquals("赤", Sample.getColor(1));
			assertEquals("緑", Sample.getColor(2));
			assertEquals("青", Sample.getColor(3));
		}

		@Test
		@DisplayName("引数エラー")

		void 引数エラー() {
			assertThrows(IllegalArgumentException.class, () -> {
				Sample.getColor(99);
			});
		}
	}

}
