# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.OAuth2ConsentSessionExpiresAt do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :access_token,
    :authorize_code,
    :id_token,
    :par_context,
    :refresh_token
  ]

  @type t :: %__MODULE__{
    :access_token => DateTime.t | nil,
    :authorize_code => DateTime.t | nil,
    :id_token => DateTime.t | nil,
    :par_context => DateTime.t | nil,
    :refresh_token => DateTime.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.OAuth2ConsentSessionExpiresAt do
  def decode(value, _options) do
    value
  end
end

