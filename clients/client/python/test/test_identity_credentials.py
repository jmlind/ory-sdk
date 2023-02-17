"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v1.1.16
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_client
from ory_client.model.identity_credentials_type import IdentityCredentialsType
globals()['IdentityCredentialsType'] = IdentityCredentialsType
from ory_client.model.identity_credentials import IdentityCredentials


class TestIdentityCredentials(unittest.TestCase):
    """IdentityCredentials unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testIdentityCredentials(self):
        """Test IdentityCredentials"""
        # FIXME: construct object with mandatory attributes with example values
        # model = IdentityCredentials()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
