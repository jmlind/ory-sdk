"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v0.0.1-alpha.176
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import unittest

import ory_client
from ory_client.api.read_api import ReadApi  # noqa: E501


class TestReadApi(unittest.TestCase):
    """ReadApi unit test stubs"""

    def setUp(self):
        self.api = ReadApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_check(self):
        """Test case for get_check

        Check a relation tuple  # noqa: E501
        """
        pass

    def test_get_expand(self):
        """Test case for get_expand

        Expand a Relation Tuple  # noqa: E501
        """
        pass

    def test_get_relation_tuples(self):
        """Test case for get_relation_tuples

        Query relation tuples  # noqa: E501
        """
        pass

    def test_post_check(self):
        """Test case for post_check

        Check a relation tuple  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
