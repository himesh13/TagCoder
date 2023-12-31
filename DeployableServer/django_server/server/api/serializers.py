from unittest.util import _MAX_LENGTH
from rest_framework import serializers


class TextInputSerializer(serializers.Serializer):
    file = serializers.CharField(max_length=800, required=True)
    isClass = serializers.CharField(max_length=800, required=True)
    qaulifiedName = serializers.CharField(max_length=800, required=True)
    className = serializers.CharField(max_length=800, required=True)
    typeName = serializers.CharField(max_length=800, required=True)
    

class UploadFileSerializer(serializers.Serializer):
    file = serializers.FileField(required=True)



class CollectFeedbackSerializer(serializers.Serializer):
    file = serializers.CharField(max_length=800, required=True)
    smell = serializers.CharField(max_length=800, required=True)
    isSmell = serializers.CharField(max_length=800, required=True)